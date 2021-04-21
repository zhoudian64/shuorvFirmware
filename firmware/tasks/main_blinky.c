#include "FreeRTOS.h"
#include "task.h"
#include "queue.h"

#define mainQUEUE_RECEIVE_TASK_PRIORITY (tskIDLE_PRIORITY + 2)
#define mainQUEUE_SEND_TASK_PRIORITY (tskIDLE_PRIORITY + 1)

// #ifdef SIMULATION
#define mainQUEUE_SEND_FREQUENCY_MS			pdMS_TO_TICKS( 2 )
// #else
// #define mainQUEUE_SEND_FREQUENCY_MS			pdMS_TO_TICKS( 1000 )
// #endif

#define mainQUEUE_LENGTH (1)

void main_blinky(void);

static void prvQueueReceiveTask(void *pvParameters);
static void prvQueueSendTask(void *pvParameters);

static QueueHandle_t xQueue = NULL;

void main_blinky(void)
{
    xQueue = xQueueCreate(mainQUEUE_LENGTH, sizeof(uint32_t));

    if (xQueue != NULL)
    {
        xTaskCreate(prvQueueReceiveTask,
                    "Rx",
                    configMINIMAL_STACK_SIZE,
                    NULL,
                    mainQUEUE_RECEIVE_TASK_PRIORITY,
                    NULL);
        xTaskCreate(prvQueueSendTask,
                    "TX",
                    configMINIMAL_STACK_SIZE,
                    NULL,
                    mainQUEUE_SEND_TASK_PRIORITY,
                    NULL);
        vTaskStartScheduler();
    }
    for (;;);
}

static void prvQueueSendTask( void *pvParameters )
{
    TickType_t xNextWakeTime;
    const unsigned long ulValueToSend = 100UL;
    BaseType_t xReturned;
    xNextWakeTime = xTaskGetTickCount();
    for ( ;; )
    {
        vTaskDelayUntil( &xNextWakeTime, mainQUEUE_SEND_FREQUENCY_MS);
        xReturned = xQueueSend( xQueue, &ulValueToSend, 0U );
        configASSERT( xReturned == pdPASS );
    }

}

#ifndef portMAX_DELAY
#define portMAX_DELAY ( TickType_t ) 0xffffffffUL
#endif

static void prvQueueReceiveTask( void *pvParameters )
{
    unsigned long ulReceivedValue;
    const unsigned long ulExpectedValue = 100UL;
    extern void vToggleLED( void );

    for ( ;; )
    {
        xQueueReceive( xQueue, &ulReceivedValue, portMAX_DELAY);

        if( ulReceivedValue == ulExpectedValue )
        {
            vToggleLED();
            ulReceivedValue = 0U;
        }
    }

}

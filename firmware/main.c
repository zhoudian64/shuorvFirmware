#include <FreeRTOS.h>
#include <task.h>

#include "../include/gpio.h"

extern void main_blinky(void);

void vApplicationMallocFailedHook(void);
void vApplicationIdleHook(void);
void vApplicationStackOverflowHook(TaskHandle_t pxTask, char *pcTaskName);
void vApplicationTickHook(void);

int main(void)
{
#ifdef SIMULATION
    asm("li x26, 0x02");
#endif
    main_blinky();
}

void vToggleLED(void)
{
// #ifdef SIMULATION
    // asm("li x27, 0x01");
    // asm("addi x26, x26, 0x01");
// #else
    asm("li x27, 0xff");
    GPIO_REG(GPIO_BASE) ^= 0x1;
// #endif
}

void vApplicationMallocFailedHook(void)
{
    taskDISABLE_INTERRUPTS();
    for (;;)
        ;
}

void vApplicationIdleHook(void)
{
}

void vApplicationStackOverflowHook(TaskHandle_t pxTask, char *pcTaskName)
{
    (void)pcTaskName;
    (void)pxTask;

    taskDISABLE_INTERRUPTS();
    for (;;)
        ;
}

void vApplicationTickHook(void)
{
}

void vAssertCalled(void)
{
    volatile uint32_t ul;
    const uint32_t ulNullLoopDelay = 0x1ffffUL;
    taskDISABLE_INTERRUPTS();
    for (;;)
    {
        for (ul = 0; ul < ulNullLoopDelay; ul++)
        {
            __asm volatile("nop");
            GPIO_REG(GPIO_BASE) ^= 0x1;
        }
    }
}

void *malloc(size_t xSize)
{
    return NULL;
}
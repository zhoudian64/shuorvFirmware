#include <stdint.h>

#include "../include/gpio.h"
#include "../include/utils.h"


int main()
{
    int counter = 0;
    int gpio_out = 0;
    while (1) {
        GPIO_REG(GPIO_BASE) = gpio_out;
        counter++;
        #ifdef SIMULATION
        if (counter > 50) {
        #else
        if (counter > 2000000) {
        #endif
            counter = 0;
            gpio_out ++;
        }   
    }
}

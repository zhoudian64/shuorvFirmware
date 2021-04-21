#ifndef _GPIO_H_
#define _GPIO_H_

#define GPIO_BASE      (0x10012000)
#define GPIO_REG(addr) (*((volatile uint32_t *)addr))
/*
    GPIO_REG(GPIO_BASE) = 1; // is ok
*/

#endif

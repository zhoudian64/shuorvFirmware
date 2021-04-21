
    .section .init;
    .globl _start;
    .type _start,@function


_start:
.option push
.option norelax
	la gp, __global_pointer$
.option pop
	la sp, _sp
#ifdef SIMULATION
    li x26, 0x00
    li x27, 0x00
#endif

/* Load data section */
    la a0, __data_lma
    la a1, _data
    la a2, _edata
    bgeu a1, a2, clear_bss_section
    /* skip if no data section */
load_store_loop:
    lw t0, (a0)
    sw t0, (a1)
    /* store all words from __data_lma to _data */
    /* until reach _edata (edata means end of data?) */
    addi a0, a0, 4
    addi a1, a1, 4
    bltu a1, a2, load_store_loop 

clear_bss_section:
    la a0, __bss_start
    la a1, _end
    bgeu a0, a1, done
    /* skip if no bss section */
store_zero_loop:
    sw zero, (a0)
    addi a0, a0, 4
    bltu a0, a1, store_zero_loop
done:
    call _init
    call main

#ifdef SIMULATION
    li x26, 0x01
#endif

loop:
    j loop

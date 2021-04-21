#include <stdint.h>

#include "include/utils.h"


extern void trap_entry();


void _init()
{
    write_csr(mtvec, &trap_entry);
    // MIE = 1, MPIE = 1, MPP = 11
    write_csr(mstatus, 0x1888);
}

//<_start>:
"h00021197".U(32.W),	//auipc	x3,0x21
"h91018193".U(32.W),	//addi	x3,x3,-1776 # //<__global_pointer$>
"h00022117".U(32.W),	//auipc	x2,0x22
"hff810113".U(32.W),	//addi	x2,x2,-8 # //<__freertos_irq_stack_top>
"h00000d13".U(32.W),	//addi	x26,x0,0
"h00000d93".U(32.W),	//addi	x27,x0,0
"h00002517".U(32.W),	//auipc	x10,0x2
"h27450513".U(32.W),	//addi	x10,x10,628 # //<__data_lma>
"h00020597".U(32.W),	//auipc	x11,0x20
"hfe058593".U(32.W),	//addi	x11,x11,-32 # //<_data>
"h00020617".U(32.W),	//auipc	x12,0x20
"h0f860613".U(32.W),	//addi	x12,x12,248 # //<pxCurrentTCB>
"h00c5fc63".U(32.W),	//bgeu	x11,x12,//<clear_bss_section>
//<load_store_loop>:
"h00052283".U(32.W),	//lw	x5,0(x10)
"h0055a023".U(32.W),	//sw	x5,0(x11)
"h00450513".U(32.W),	//addi	x10,x10,4
"h00458593".U(32.W),	//addi	x11,x11,4
"hfec5e8e3".U(32.W),	//bltu	x11,x12,//<load_store_loop>
//<clear_bss_section>:
"h00020517".U(32.W),	//auipc	x10,0x20
"h0d850513".U(32.W),	//addi	x10,x10,216 # //<pxCurrentTCB>
"h99818593".U(32.W),	//addi	x11,x3,-1640 # //<_end>
"h00b57863".U(32.W),	//bgeu	x10,x11,//<done>
//<store_zero_loop>:
"h00052023".U(32.W),	//sw	x0,0(x10)
"h00450513".U(32.W),	//addi	x10,x10,4
"hfeb56ce3".U(32.W),	//bltu	x10,x11,//<store_zero_loop>
//<done>:
"h6a9010ef".U(32.W),	//jal	x1,//<_init>
"h098000ef".U(32.W),	//jal	x1,//<main>
"h00100d13".U(32.W),	//addi	x26,x0,1
//<loop>:
"h0000006f".U(32.W),	//jal	x0,//<loop>
//<main>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00112623".U(32.W),	//sw	x1,12(x2)
"h00200d13".U(32.W),	//addi	x26,x0,2
"h58d010ef".U(32.W),	//jal	x1,//<main_blinky>
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h00000513".U(32.W),	//addi	x10,x0,0
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<freertos_risc_v_trap_handler>:
"hf8810113".U(32.W),	//addi	x2,x2,-120
"h00112223".U(32.W),	//sw	x1,4(x2)
"h00512423".U(32.W),	//sw	x5,8(x2)
"h00612623".U(32.W),	//sw	x6,12(x2)
"h00712823".U(32.W),	//sw	x7,16(x2)
"h00812a23".U(32.W),	//sw	x8,20(x2)
"h00912c23".U(32.W),	//sw	x9,24(x2)
"h00a12e23".U(32.W),	//sw	x10,28(x2)
"h02b12023".U(32.W),	//sw	x11,32(x2)
"h02c12223".U(32.W),	//sw	x12,36(x2)
"h02d12423".U(32.W),	//sw	x13,40(x2)
"h02e12623".U(32.W),	//sw	x14,44(x2)
"h02f12823".U(32.W),	//sw	x15,48(x2)
"h03012a23".U(32.W),	//sw	x16,52(x2)
"h03112c23".U(32.W),	//sw	x17,56(x2)
"h03212e23".U(32.W),	//sw	x18,60(x2)
"h05312023".U(32.W),	//sw	x19,64(x2)
"h05412223".U(32.W),	//sw	x20,68(x2)
"h05512423".U(32.W),	//sw	x21,72(x2)
"h05612623".U(32.W),	//sw	x22,76(x2)
"h05712823".U(32.W),	//sw	x23,80(x2)
"h05812a23".U(32.W),	//sw	x24,84(x2)
"h05912c23".U(32.W),	//sw	x25,88(x2)
"h05a12e23".U(32.W),	//sw	x26,92(x2)
"h07b12023".U(32.W),	//sw	x27,96(x2)
"h07c12223".U(32.W),	//sw	x28,100(x2)
"h07d12423".U(32.W),	//sw	x29,104(x2)
"h07e12623".U(32.W),	//sw	x30,108(x2)
"h07f12823".U(32.W),	//sw	x31,112(x2)
"h300022f3".U(32.W),	//csrrs	x5,mstatus,x0
"h06512a23".U(32.W),	//sw	x5,116(x2)
"h00020297".U(32.W),	//auipc	x5,0x20
"hea42a283".U(32.W),	//lw	x5,-348(x5) # //<pxCurrentTCB>
"h0022a023".U(32.W),	//sw	x2,0(x5)
"h34202573".U(32.W),	//csrrs	x10,mcause,x0
"h341025f3".U(32.W),	//csrrs	x11,mepc,x0
//<test_if_asynchronous>:
"h01f55613".U(32.W),	//srli	x12,x10,0x1f
"h06060e63".U(32.W),	//beq	x12,x0,//<handle_synchronous>
"h00b12023".U(32.W),	//sw	x11,0(x2)
//<handle_asynchronous>:
"h00100293".U(32.W),	//addi	x5,x0,1
"h01f29293".U(32.W),	//slli	x5,x5,0x1f
"h00728313".U(32.W),	//addi	x6,x5,7
"h04651c63".U(32.W),	//bne	x10,x6,//<test_if_external_interrupt>
"h00020297".U(32.W),	//auipc	x5,0x20
"heb02a283".U(32.W),	//lw	x5,-336(x5) # //<pullMachineTimerCompareRegister>
"h00020317".U(32.W),	//auipc	x6,0x20
"he6032303".U(32.W),	//lw	x6,-416(x6) # //<pullNextTime>
"hfff00e93".U(32.W),	//addi	x29,x0,-1
"h00032383".U(32.W),	//lw	x7,0(x6)
"h00432e03".U(32.W),	//lw	x28,4(x6)
"h01d2a023".U(32.W),	//sw	x29,0(x5)
"h01c2a223".U(32.W),	//sw	x28,4(x5)
"h0072a023".U(32.W),	//sw	x7,0(x5)
"h8081a283".U(32.W),	//lw	x5,-2040(x3) # //<uxTimerIncrementsForOneTick>
"h00728eb3".U(32.W),	//add	x29,x5,x7
"h007ebf33".U(32.W),	//sltu	x30,x29,x7
"h01ee0fb3".U(32.W),	//add	x31,x28,x30
"h01d32023".U(32.W),	//sw	x29,0(x6)
"h01f32223".U(32.W),	//sw	x31,4(x6)
"h80c1a103".U(32.W),	//lw	x2,-2036(x3) # //<xISRStackTop>
"h674000ef".U(32.W),	//jal	x1,//<xTaskIncrementTick>
"h04050863".U(32.W),	//beq	x10,x0,//<processed_source>
"h075000ef".U(32.W),	//jal	x1,//<vTaskSwitchContext>
"h0480006f".U(32.W),	//jal	x0,//<processed_source>
//<test_if_external_interrupt>:
"h00430313".U(32.W),	//addi	x6,x6,4
"h02651c63".U(32.W),	//bne	x10,x6,//<as_yet_unhandled>
"h80c1a103".U(32.W),	//lw	x2,-2036(x3) # //<xISRStackTop>
"h0380006f".U(32.W),	//jal	x0,//<processed_source>
//<handle_synchronous>:
"h00458593".U(32.W),	//addi	x11,x11,4
"h00b12023".U(32.W),	//sw	x11,0(x2)
//<test_if_environment_call>:
"h00b00293".U(32.W),	//addi	x5,x0,11
"h00551863".U(32.W),	//bne	x10,x5,//<is_exception>
"h80c1a103".U(32.W),	//lw	x2,-2036(x3) # //<xISRStackTop>
"h049000ef".U(32.W),	//jal	x1,//<vTaskSwitchContext>
"h01c0006f".U(32.W),	//jal	x0,//<processed_source>
//<is_exception>:
"h342022f3".U(32.W),	//csrrs	x5,mcause,x0
"h34102373".U(32.W),	//csrrs	x6,mepc,x0
"h300023f3".U(32.W),	//csrrs	x7,mstatus,x0
"hff5ff06f".U(32.W),	//jal	x0,//<is_exception>
//<as_yet_unhandled>:
"h342022f3".U(32.W),	//csrrs	x5,mcause,x0
"hffdff06f".U(32.W),	//jal	x0,//<as_yet_unhandled>
//<processed_source>:
"h00020317".U(32.W),	//auipc	x6,0x20
"hddc32303".U(32.W),	//lw	x6,-548(x6) # //<pxCurrentTCB>
"h00032103".U(32.W),	//lw	x2,0(x6)
"h00012283".U(32.W),	//lw	x5,0(x2)
"h34129073".U(32.W),	//csrrw	x0,mepc,x5
"h07412283".U(32.W),	//lw	x5,116(x2)
"h30029073".U(32.W),	//csrrw	x0,mstatus,x5
"h00412083".U(32.W),	//lw	x1,4(x2)
"h00812283".U(32.W),	//lw	x5,8(x2)
"h00c12303".U(32.W),	//lw	x6,12(x2)
"h01012383".U(32.W),	//lw	x7,16(x2)
"h01412403".U(32.W),	//lw	x8,20(x2)
"h01812483".U(32.W),	//lw	x9,24(x2)
"h01c12503".U(32.W),	//lw	x10,28(x2)
"h02012583".U(32.W),	//lw	x11,32(x2)
"h02412603".U(32.W),	//lw	x12,36(x2)
"h02812683".U(32.W),	//lw	x13,40(x2)
"h02c12703".U(32.W),	//lw	x14,44(x2)
"h03012783".U(32.W),	//lw	x15,48(x2)
"h03412803".U(32.W),	//lw	x16,52(x2)
"h03812883".U(32.W),	//lw	x17,56(x2)
"h03c12903".U(32.W),	//lw	x18,60(x2)
"h04012983".U(32.W),	//lw	x19,64(x2)
"h04412a03".U(32.W),	//lw	x20,68(x2)
"h04812a83".U(32.W),	//lw	x21,72(x2)
"h04c12b03".U(32.W),	//lw	x22,76(x2)
"h05012b83".U(32.W),	//lw	x23,80(x2)
"h05412c03".U(32.W),	//lw	x24,84(x2)
"h05812c83".U(32.W),	//lw	x25,88(x2)
"h05c12d03".U(32.W),	//lw	x26,92(x2)
"h06012d83".U(32.W),	//lw	x27,96(x2)
"h06412e03".U(32.W),	//lw	x28,100(x2)
"h06812e83".U(32.W),	//lw	x29,104(x2)
"h06c12f03".U(32.W),	//lw	x30,108(x2)
"h07012f83".U(32.W),	//lw	x31,112(x2)
"h07810113".U(32.W),	//addi	x2,x2,120
"h30200073".U(32.W),	//mret
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
//<xPortStartFirstTask>:
"h00000297".U(32.W),	//auipc	x5,0x0
"he0028293".U(32.W),	//addi	x5,x5,-512 # //<freertos_risc_v_trap_handler>
"h30529073".U(32.W),	//csrrw	x0,mtvec,x5
"h00020117".U(32.W),	//auipc	x2,0x20
"hd1412103".U(32.W),	//lw	x2,-748(x2) # //<pxCurrentTCB>
"h00012103".U(32.W),	//lw	x2,0(x2)
"h00012083".U(32.W),	//lw	x1,0(x2)
"h00c12303".U(32.W),	//lw	x6,12(x2)
"h01012383".U(32.W),	//lw	x7,16(x2)
"h01412403".U(32.W),	//lw	x8,20(x2)
"h01812483".U(32.W),	//lw	x9,24(x2)
"h01c12503".U(32.W),	//lw	x10,28(x2)
"h02012583".U(32.W),	//lw	x11,32(x2)
"h02412603".U(32.W),	//lw	x12,36(x2)
"h02812683".U(32.W),	//lw	x13,40(x2)
"h02c12703".U(32.W),	//lw	x14,44(x2)
"h03012783".U(32.W),	//lw	x15,48(x2)
"h03412803".U(32.W),	//lw	x16,52(x2)
"h03812883".U(32.W),	//lw	x17,56(x2)
"h03c12903".U(32.W),	//lw	x18,60(x2)
"h04012983".U(32.W),	//lw	x19,64(x2)
"h04412a03".U(32.W),	//lw	x20,68(x2)
"h04812a83".U(32.W),	//lw	x21,72(x2)
"h04c12b03".U(32.W),	//lw	x22,76(x2)
"h05012b83".U(32.W),	//lw	x23,80(x2)
"h05412c03".U(32.W),	//lw	x24,84(x2)
"h05812c83".U(32.W),	//lw	x25,88(x2)
"h05c12d03".U(32.W),	//lw	x26,92(x2)
"h06012d83".U(32.W),	//lw	x27,96(x2)
"h06412e03".U(32.W),	//lw	x28,100(x2)
"h06812e83".U(32.W),	//lw	x29,104(x2)
"h06c12f03".U(32.W),	//lw	x30,108(x2)
"h07012f83".U(32.W),	//lw	x31,112(x2)
"h07412283".U(32.W),	//lw	x5,116(x2)
"h00828293".U(32.W),	//addi	x5,x5,8
"h30029073".U(32.W),	//csrrw	x0,mstatus,x5
"h00812283".U(32.W),	//lw	x5,8(x2)
"h07810113".U(32.W),	//addi	x2,x2,120
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
"h00000013".U(32.W),	//addi	x0,x0,0
//<pxPortInitialiseStack>:
"h300022f3".U(32.W),	//csrrs	x5,mstatus,x0
"hff72f293".U(32.W),	//andi	x5,x5,-9
"h18800313".U(32.W),	//addi	x6,x0,392
"h00431313".U(32.W),	//slli	x6,x6,0x4
"h0062e2b3".U(32.W),	//or	x5,x5,x6
"hffc50513".U(32.W),	//addi	x10,x10,-4
"h00552023".U(32.W),	//sw	x5,0(x10)
"hfa850513".U(32.W),	//addi	x10,x10,-88
"h00c52023".U(32.W),	//sw	x12,0(x10)
"hfe850513".U(32.W),	//addi	x10,x10,-24
"h00052023".U(32.W),	//sw	x0,0(x10)
"h00000293".U(32.W),	//addi	x5,x0,0
//<chip_specific_stack_frame>:
"h00028a63".U(32.W),	//beq	x5,x0,//<chip_specific_stack_frame+0x14>
"hffc50513".U(32.W),	//addi	x10,x10,-4
"h00052023".U(32.W),	//sw	x0,0(x10)
"hfff28293".U(32.W),	//addi	x5,x5,-1
"hff1ff06f".U(32.W),	//jal	x0,//<chip_specific_stack_frame>
"hffc50513".U(32.W),	//addi	x10,x10,-4
"h00b52023".U(32.W),	//sw	x11,0(x10)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<trap_entry>:
"hf8010113".U(32.W),	//addi	x2,x2,-128
"h00112223".U(32.W),	//sw	x1,4(x2)
"h00212423".U(32.W),	//sw	x2,8(x2)
"h00312623".U(32.W),	//sw	x3,12(x2)
"h00412823".U(32.W),	//sw	x4,16(x2)
"h00512a23".U(32.W),	//sw	x5,20(x2)
"h00612c23".U(32.W),	//sw	x6,24(x2)
"h00712e23".U(32.W),	//sw	x7,28(x2)
"h02812023".U(32.W),	//sw	x8,32(x2)
"h02912223".U(32.W),	//sw	x9,36(x2)
"h02a12423".U(32.W),	//sw	x10,40(x2)
"h02b12623".U(32.W),	//sw	x11,44(x2)
"h02c12823".U(32.W),	//sw	x12,48(x2)
"h02d12a23".U(32.W),	//sw	x13,52(x2)
"h02e12c23".U(32.W),	//sw	x14,56(x2)
"h02f12e23".U(32.W),	//sw	x15,60(x2)
"h05012023".U(32.W),	//sw	x16,64(x2)
"h05112223".U(32.W),	//sw	x17,68(x2)
"h05212423".U(32.W),	//sw	x18,72(x2)
"h05312623".U(32.W),	//sw	x19,76(x2)
"h05412823".U(32.W),	//sw	x20,80(x2)
"h05512a23".U(32.W),	//sw	x21,84(x2)
"h05612c23".U(32.W),	//sw	x22,88(x2)
"h05712e23".U(32.W),	//sw	x23,92(x2)
"h07812023".U(32.W),	//sw	x24,96(x2)
"h07912223".U(32.W),	//sw	x25,100(x2)
"h07c12823".U(32.W),	//sw	x28,112(x2)
"h07d12a23".U(32.W),	//sw	x29,116(x2)
"h07e12c23".U(32.W),	//sw	x30,120(x2)
"h07f12e23".U(32.W),	//sw	x31,124(x2)
"h34202573".U(32.W),	//csrrs	x10,mcause,x0
"h341025f3".U(32.W),	//csrrs	x11,mepc,x0
//<test_if_asynchronous>:
"h01f55613".U(32.W),	//srli	x12,x10,0x1f
"h00060663".U(32.W),	//beq	x12,x0,//<handle_synchronous>
"h08c000ef".U(32.W),	//jal	x1,//<trap_handler>
"h00c0006f".U(32.W),	//jal	x0,//<asynchronous_return>
//<handle_synchronous>:
"h00458593".U(32.W),	//addi	x11,x11,4
"h34159073".U(32.W),	//csrrw	x0,mepc,x11
//<asynchronous_return>:
"h00412083".U(32.W),	//lw	x1,4(x2)
"h00812103".U(32.W),	//lw	x2,8(x2)
"h00c12183".U(32.W),	//lw	x3,12(x2)
"h01012203".U(32.W),	//lw	x4,16(x2)
"h01412283".U(32.W),	//lw	x5,20(x2)
"h01812303".U(32.W),	//lw	x6,24(x2)
"h01c12383".U(32.W),	//lw	x7,28(x2)
"h02012403".U(32.W),	//lw	x8,32(x2)
"h02412483".U(32.W),	//lw	x9,36(x2)
"h02812503".U(32.W),	//lw	x10,40(x2)
"h02c12583".U(32.W),	//lw	x11,44(x2)
"h03012603".U(32.W),	//lw	x12,48(x2)
"h03412683".U(32.W),	//lw	x13,52(x2)
"h03812703".U(32.W),	//lw	x14,56(x2)
"h03c12783".U(32.W),	//lw	x15,60(x2)
"h04012803".U(32.W),	//lw	x16,64(x2)
"h04412883".U(32.W),	//lw	x17,68(x2)
"h04812903".U(32.W),	//lw	x18,72(x2)
"h04c12983".U(32.W),	//lw	x19,76(x2)
"h05012a03".U(32.W),	//lw	x20,80(x2)
"h05412a83".U(32.W),	//lw	x21,84(x2)
"h05812b03".U(32.W),	//lw	x22,88(x2)
"h05c12b83".U(32.W),	//lw	x23,92(x2)
"h06012c03".U(32.W),	//lw	x24,96(x2)
"h06412c83".U(32.W),	//lw	x25,100(x2)
"h07012e03".U(32.W),	//lw	x28,112(x2)
"h07412e83".U(32.W),	//lw	x29,116(x2)
"h07812f03".U(32.W),	//lw	x30,120(x2)
"h07c12f83".U(32.W),	//lw	x31,124(x2)
"h08010113".U(32.W),	//addi	x2,x2,128
"h30200073".U(32.W),	//mret
//<trap_handler>:
"h0000006f".U(32.W),	//jal	x0,//<trap_handler>
//<vToggleLED>:
"h00100d93".U(32.W),	//addi	x27,x0,1
"h001d0d13".U(32.W),	//addi	x26,x26,1
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vApplicationMallocFailedHook>:
"h30047073".U(32.W),	//csrrci	x0,mstatus,8
"h0000006f".U(32.W),	//jal	x0,//<vApplicationMallocFailedHook+0x4>
//<vApplicationStackOverflowHook>:
"h30047073".U(32.W),	//csrrci	x0,mstatus,8
"h0000006f".U(32.W),	//jal	x0,//<vApplicationStackOverflowHook+0x4>
//<vApplicationTickHook>:
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vAssertCalled>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h30047073".U(32.W),	//csrrci	x0,mstatus,8
"h000207b7".U(32.W),	//lui	x15,0x20
"hffe78793".U(32.W),	//addi	x15,x15,-2 # 1fffe <__stack_size+0x1dffe>
"h100126b7".U(32.W),	//lui	x13,0x10012
"h00012623".U(32.W),	//sw	x0,12(x2)
"h00c12703".U(32.W),	//lw	x14,12(x2)
"hfee7ece3".U(32.W),	//bltu	x15,x14,//<vAssertCalled+0x14>
"h00000013".U(32.W),	//addi	x0,x0,0
"h0006a703".U(32.W),	//lw	x14,0(x13) # //<__stack_size+0x10010000>
"h00174713".U(32.W),	//xori	x14,x14,1
"h00e6a023".U(32.W),	//sw	x14,0(x13)
"h00c12703".U(32.W),	//lw	x14,12(x2)
"h00170713".U(32.W),	//addi	x14,x14,1
"h00e12623".U(32.W),	//sw	x14,12(x2)
"hfddff06f".U(32.W),	//jal	x0,//<vAssertCalled+0x18>
//<vListInitialise>:
"h00850793".U(32.W),	//addi	x15,x10,8
"hfff00713".U(32.W),	//addi	x14,x0,-1
"h00f52223".U(32.W),	//sw	x15,4(x10)
"h00e52423".U(32.W),	//sw	x14,8(x10)
"h00f52623".U(32.W),	//sw	x15,12(x10)
"h00f52823".U(32.W),	//sw	x15,16(x10)
"h00052023".U(32.W),	//sw	x0,0(x10)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vListInitialiseItem>:
"h00052823".U(32.W),	//sw	x0,16(x10)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vListInsertEnd>:
"h00452783".U(32.W),	//lw	x15,4(x10)
"h0087a703".U(32.W),	//lw	x14,8(x15)
"h00f5a223".U(32.W),	//sw	x15,4(x11)
"h00e5a423".U(32.W),	//sw	x14,8(x11)
"h0087a703".U(32.W),	//lw	x14,8(x15)
"h00b72223".U(32.W),	//sw	x11,4(x14)
"h00b7a423".U(32.W),	//sw	x11,8(x15)
"h00052783".U(32.W),	//lw	x15,0(x10)
"h00a5a823".U(32.W),	//sw	x10,16(x11)
"h00178793".U(32.W),	//addi	x15,x15,1
"h00f52023".U(32.W),	//sw	x15,0(x10)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vListInsert>:
"h0005a683".U(32.W),	//lw	x13,0(x11)
"hfff00793".U(32.W),	//addi	x15,x0,-1
"h00850713".U(32.W),	//addi	x14,x10,8
"h02f69863".U(32.W),	//bne	x13,x15,//<vListInsert+0x3c>
"h01052783".U(32.W),	//lw	x15,16(x10)
"h0047a703".U(32.W),	//lw	x14,4(x15)
"h00e5a223".U(32.W),	//sw	x14,4(x11)
"h00b72423".U(32.W),	//sw	x11,8(x14)
"h00f5a423".U(32.W),	//sw	x15,8(x11)
"h00b7a223".U(32.W),	//sw	x11,4(x15)
"h00052783".U(32.W),	//lw	x15,0(x10)
"h00a5a823".U(32.W),	//sw	x10,16(x11)
"h00178793".U(32.W),	//addi	x15,x15,1
"h00f52023".U(32.W),	//sw	x15,0(x10)
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00070793".U(32.W),	//addi	x15,x14,0
"h00472703".U(32.W),	//lw	x14,4(x14)
"h00072603".U(32.W),	//lw	x12,0(x14)
"hfec6fae3".U(32.W),	//bgeu	x13,x12,//<vListInsert+0x3c>
"hfc9ff06f".U(32.W),	//jal	x0,//<vListInsert+0x14>
//<uxListRemove>:
"h00452683".U(32.W),	//lw	x13,4(x10)
"h00852703".U(32.W),	//lw	x14,8(x10)
"h01052783".U(32.W),	//lw	x15,16(x10)
"h00e6a423".U(32.W),	//sw	x14,8(x13)
"h00d72223".U(32.W),	//sw	x13,4(x14)
"h0047a683".U(32.W),	//lw	x13,4(x15)
"h00a69463".U(32.W),	//bne	x13,x10,//<uxListRemove+0x20>
"h00e7a223".U(32.W),	//sw	x14,4(x15)
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00052823".U(32.W),	//sw	x0,16(x10)
"hfff70713".U(32.W),	//addi	x14,x14,-1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h0007a503".U(32.W),	//lw	x10,0(x15)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<prvAddCurrentTaskToDelayedList>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00912a23".U(32.W),	//sw	x9,20(x2)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h800204b7".U(32.W),	//lui	x9,0x80020
"h01312623".U(32.W),	//sw	x19,12(x2)
"h1547a983".U(32.W),	//lw	x19,340(x15) # //<__freertos_irq_stack_top+0xffffe154>
"h12048793".U(32.W),	//addi	x15,x9,288 # //<__freertos_irq_stack_top+0xffffe120>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h0007a503".U(32.W),	//lw	x10,0(x15)
"h01212823".U(32.W),	//sw	x18,16(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h04070aa3".U(32.W),	//sb	x0,85(x14)
"h00450513".U(32.W),	//addi	x10,x10,4
"h00058913".U(32.W),	//addi	x18,x11,0
"hf89ff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h12048793".U(32.W),	//addi	x15,x9,288
"h02051663".U(32.W),	//bne	x10,x0,//<prvAddCurrentTaskToDelayedList+0x74>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h800206b7".U(32.W),	//lui	x13,0x80020
"h13c68693".U(32.W),	//addi	x13,x13,316 # //<__freertos_irq_stack_top+0xffffe13c>
"h02c72583".U(32.W),	//lw	x11,44(x14)
"h0006a603".U(32.W),	//lw	x12,0(x13)
"h00100713".U(32.W),	//addi	x14,x0,1
"h00b71733".U(32.W),	//sll	x14,x14,x11
"hfff74713".U(32.W),	//xori	x14,x14,-1
"h00c77733".U(32.W),	//and	x14,x14,x12
"h00e6a023".U(32.W),	//sw	x14,0(x13)
"hfff00713".U(32.W),	//addi	x14,x0,-1
"h02e41863".U(32.W),	//bne	x8,x14,//<prvAddCurrentTaskToDelayedList+0xa8>
"h02090663".U(32.W),	//beq	x18,x0,//<prvAddCurrentTaskToDelayedList+0xa8>
"h0007a583".U(32.W),	//lw	x11,0(x15)
"h01812403".U(32.W),	//lw	x8,24(x2)
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01412483".U(32.W),	//lw	x9,20(x2)
"h01012903".U(32.W),	//lw	x18,16(x2)
"h00c12983".U(32.W),	//lw	x19,12(x2)
"h00458593".U(32.W),	//addi	x11,x11,4
"h92c18513".U(32.W),	//addi	x10,x3,-1748 # //<xSuspendedTaskList>
"h02010113".U(32.W),	//addi	x2,x2,32
"hea5ff06f".U(32.W),	//jal	x0,//<vListInsertEnd>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00898433".U(32.W),	//add	x8,x19,x8
"h00872223".U(32.W),	//sw	x8,4(x14)
"h03347863".U(32.W),	//bgeu	x8,x19,//<prvAddCurrentTaskToDelayedList+0xe4>
"h80020737".U(32.W),	//lui	x14,0x80020
"h12872503".U(32.W),	//lw	x10,296(x14) # //<__freertos_irq_stack_top+0xffffe128>
"h01812403".U(32.W),	//lw	x8,24(x2)
"h0007a583".U(32.W),	//lw	x11,0(x15)
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01412483".U(32.W),	//lw	x9,20(x2)
"h01012903".U(32.W),	//lw	x18,16(x2)
"h00c12983".U(32.W),	//lw	x19,12(x2)
"h00458593".U(32.W),	//addi	x11,x11,4
"h02010113".U(32.W),	//addi	x2,x2,32
"he99ff06f".U(32.W),	//jal	x0,//<vListInsert>
"h80020737".U(32.W),	//lui	x14,0x80020
"h12472503".U(32.W),	//lw	x10,292(x14) # //<__freertos_irq_stack_top+0xffffe124>
"h0007a583".U(32.W),	//lw	x11,0(x15)
"h00458593".U(32.W),	//addi	x11,x11,4
"he85ff0ef".U(32.W),	//jal	x1,//<vListInsert>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14478793".U(32.W),	//addi	x15,x15,324 # //<__freertos_irq_stack_top+0xffffe144>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00e47463".U(32.W),	//bgeu	x8,x14,//<prvAddCurrentTaskToDelayedList+0x10c>
"h0087a023".U(32.W),	//sw	x8,0(x15)
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01812403".U(32.W),	//lw	x8,24(x2)
"h01412483".U(32.W),	//lw	x9,20(x2)
"h01012903".U(32.W),	//lw	x18,16(x2)
"h00c12983".U(32.W),	//lw	x19,12(x2)
"h02010113".U(32.W),	//addi	x2,x2,32
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<prvResetNextTaskUnblockTime>:
"h80020737".U(32.W),	//lui	x14,0x80020
"h12470713".U(32.W),	//addi	x14,x14,292 # //<__freertos_irq_stack_top+0xffffe124>
"h00072783".U(32.W),	//lw	x15,0(x14)
"h0007a683".U(32.W),	//lw	x13,0(x15)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14478793".U(32.W),	//addi	x15,x15,324 # //<__freertos_irq_stack_top+0xffffe144>
"h00069863".U(32.W),	//bne	x13,x0,//<prvResetNextTaskUnblockTime+0x28>
"hfff00713".U(32.W),	//addi	x14,x0,-1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00072703".U(32.W),	//lw	x14,0(x14)
"h00c72703".U(32.W),	//lw	x14,12(x14)
"h00072703".U(32.W),	//lw	x14,0(x14)
"hfedff06f".U(32.W),	//jal	x0,//<prvResetNextTaskUnblockTime+0x20>
//<vTaskSuspendAll>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h13478793".U(32.W),	//addi	x15,x15,308 # //<__freertos_irq_stack_top+0xffffe134>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00170713".U(32.W),	//addi	x14,x14,1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<xTaskGetTickCount>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1547a503".U(32.W),	//lw	x10,340(x15) # //<__freertos_irq_stack_top+0xffffe154>
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<xTaskIncrementTick>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1347a783".U(32.W),	//lw	x15,308(x15) # //<__freertos_irq_stack_top+0xffffe134>
"hfd010113".U(32.W),	//addi	x2,x2,-48
"h02112623".U(32.W),	//sw	x1,44(x2)
"h02812423".U(32.W),	//sw	x8,40(x2)
"h02912223".U(32.W),	//sw	x9,36(x2)
"h03212023".U(32.W),	//sw	x18,32(x2)
"h01312e23".U(32.W),	//sw	x19,28(x2)
"h01412c23".U(32.W),	//sw	x20,24(x2)
"h01512a23".U(32.W),	//sw	x21,20(x2)
"h01612823".U(32.W),	//sw	x22,16(x2)
"h01712623".U(32.W),	//sw	x23,12(x2)
"h01812423".U(32.W),	//sw	x24,8(x2)
"h01912223".U(32.W),	//sw	x25,4(x2)
"h1a079863".U(32.W),	//bne	x15,x0,//<xTaskIncrementTick+0x1e8>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h15478793".U(32.W),	//addi	x15,x15,340 # //<__freertos_irq_stack_top+0xffffe154>
"h0007aa03".U(32.W),	//lw	x20,0(x15)
"h001a0a13".U(32.W),	//addi	x20,x20,1
"h0147a023".U(32.W),	//sw	x20,0(x15)
"h040a1863".U(32.W),	//bne	x20,x0,//<xTaskIncrementTick+0xa0>
"h80020437".U(32.W),	//lui	x8,0x80020
"h12440793".U(32.W),	//addi	x15,x8,292 # //<__freertos_irq_stack_top+0xffffe124>
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h12440413".U(32.W),	//addi	x8,x8,292
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h00078463".U(32.W),	//beq	x15,x0,//<xTaskIncrementTick+0x70>
"hcf1ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h12878793".U(32.W),	//addi	x15,x15,296 # //<__freertos_irq_stack_top+0xffffe128>
"h00042703".U(32.W),	//lw	x14,0(x8)
"h0007a683".U(32.W),	//lw	x13,0(x15)
"h00d42023".U(32.W),	//sw	x13,0(x8)
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14878793".U(32.W),	//addi	x15,x15,328 # //<__freertos_irq_stack_top+0xffffe148>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00170713".U(32.W),	//addi	x14,x14,1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"hf09ff0ef".U(32.W),	//jal	x1,//<prvResetNextTaskUnblockTime>
"h800209b7".U(32.W),	//lui	x19,0x80020
"h14498793".U(32.W),	//addi	x15,x19,324 # //<__freertos_irq_stack_top+0xffffe144>
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h800204b7".U(32.W),	//lui	x9,0x80020
"h80020ab7".U(32.W),	//lui	x21,0x80020
"h14498993".U(32.W),	//addi	x19,x19,324
"h17448493".U(32.W),	//addi	x9,x9,372 # //<__freertos_irq_stack_top+0xffffe174>
"h120a8a93".U(32.W),	//addi	x21,x21,288 # //<__freertos_irq_stack_top+0xffffe120>
"h00000413".U(32.W),	//addi	x8,x0,0
"h08fa7263".U(32.W),	//bgeu	x20,x15,//<xTaskIncrementTick+0x148>
"h000aa783".U(32.W),	//lw	x15,0(x21)
"h02c7a703".U(32.W),	//lw	x14,44(x15)
"h00271793".U(32.W),	//slli	x15,x14,0x2
"h00e787b3".U(32.W),	//add	x15,x15,x14
"h00279793".U(32.W),	//slli	x15,x15,0x2
"h00f487b3".U(32.W),	//add	x15,x9,x15
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00100793".U(32.W),	//addi	x15,x0,1
"h00e7f463".U(32.W),	//bgeu	x15,x14,//<xTaskIncrementTick+0xf0>
"h00100413".U(32.W),	//addi	x8,x0,1
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14c7a783".U(32.W),	//lw	x15,332(x15) # //<__freertos_irq_stack_top+0xffffe14c>
"h00079463".U(32.W),	//bne	x15,x0,//<xTaskIncrementTick+0x100>
"hc5dff0ef".U(32.W),	//jal	x1,//<vApplicationTickHook>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1587a783".U(32.W),	//lw	x15,344(x15) # //<__freertos_irq_stack_top+0xffffe158>
"h00078463".U(32.W),	//beq	x15,x0,//<xTaskIncrementTick+0x110>
"h00100413".U(32.W),	//addi	x8,x0,1
"h02c12083".U(32.W),	//lw	x1,44(x2)
"h00040513".U(32.W),	//addi	x10,x8,0
"h02812403".U(32.W),	//lw	x8,40(x2)
"h02412483".U(32.W),	//lw	x9,36(x2)
"h02012903".U(32.W),	//lw	x18,32(x2)
"h01c12983".U(32.W),	//lw	x19,28(x2)
"h01812a03".U(32.W),	//lw	x20,24(x2)
"h01412a83".U(32.W),	//lw	x21,20(x2)
"h01012b03".U(32.W),	//lw	x22,16(x2)
"h00c12b83".U(32.W),	//lw	x23,12(x2)
"h00812c03".U(32.W),	//lw	x24,8(x2)
"h00412c83".U(32.W),	//lw	x25,4(x2)
"h03010113".U(32.W),	//addi	x2,x2,48
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h80020b37".U(32.W),	//lui	x22,0x80020
"h80020bb7".U(32.W),	//lui	x23,0x80020
"h00100c13".U(32.W),	//addi	x24,x0,1
"h124b0793".U(32.W),	//addi	x15,x22,292 # //<__freertos_irq_stack_top+0xffffe124>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00072703".U(32.W),	//lw	x14,0(x14)
"h00071863".U(32.W),	//bne	x14,x0,//<xTaskIncrementTick+0x170>
"hfff00793".U(32.W),	//addi	x15,x0,-1
"h00f9a023".U(32.W),	//sw	x15,0(x19)
"hf5dff06f".U(32.W),	//jal	x0,//<xTaskIncrementTick+0xc8>
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h00c7a783".U(32.W),	//lw	x15,12(x15)
"h00c7a903".U(32.W),	//lw	x18,12(x15)
"h00492783".U(32.W),	//lw	x15,4(x18)
"hfefa64e3".U(32.W),	//bltu	x20,x15,//<xTaskIncrementTick+0x168>
"h00490c93".U(32.W),	//addi	x25,x18,4
"h000c8513".U(32.W),	//addi	x10,x25,0
"hcb9ff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h02892783".U(32.W),	//lw	x15,40(x18)
"h00078663".U(32.W),	//beq	x15,x0,//<xTaskIncrementTick+0x1a0>
"h01890513".U(32.W),	//addi	x10,x18,24
"hca9ff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h02c92783".U(32.W),	//lw	x15,44(x18)
"h13cb8693".U(32.W),	//addi	x13,x23,316 # //<__freertos_irq_stack_top+0xffffe13c>
"h0006a603".U(32.W),	//lw	x12,0(x13)
"h00279513".U(32.W),	//slli	x10,x15,0x2
"h00f50533".U(32.W),	//add	x10,x10,x15
"h00fc1733".U(32.W),	//sll	x14,x24,x15
"h00251513".U(32.W),	//slli	x10,x10,0x2
"h00c76733".U(32.W),	//or	x14,x14,x12
"h000c8593".U(32.W),	//addi	x11,x25,0
"h00a48533".U(32.W),	//add	x10,x9,x10
"h00e6a023".U(32.W),	//sw	x14,0(x13)
"hbf9ff0ef".U(32.W),	//jal	x1,//<vListInsertEnd>
"h000aa783".U(32.W),	//lw	x15,0(x21)
"h02c92703".U(32.W),	//lw	x14,44(x18)
"h02c7a783".U(32.W),	//lw	x15,44(x15)
"hf6f76ce3".U(32.W),	//bltu	x14,x15,//<xTaskIncrementTick+0x154>
"h00100413".U(32.W),	//addi	x8,x0,1
"hf71ff06f".U(32.W),	//jal	x0,//<xTaskIncrementTick+0x154>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14c78793".U(32.W),	//addi	x15,x15,332 # //<__freertos_irq_stack_top+0xffffe14c>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00000413".U(32.W),	//addi	x8,x0,0
"h00170713".U(32.W),	//addi	x14,x14,1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"hb59ff0ef".U(32.W),	//jal	x1,//<vApplicationTickHook>
"hf0dff06f".U(32.W),	//jal	x0,//<xTaskIncrementTick+0x110>
//<vTaskSwitchContext>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1347a703".U(32.W),	//lw	x14,308(x15) # //<__freertos_irq_stack_top+0xffffe134>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h15878793".U(32.W),	//addi	x15,x15,344 # //<__freertos_irq_stack_top+0xffffe158>
"h00070863".U(32.W),	//beq	x14,x0,//<vTaskSwitchContext+0x20>
"h00100713".U(32.W),	//addi	x14,x0,1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h00008067".U(32.W),	//jalr	x0,0(x1)
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h01212823".U(32.W),	//sw	x18,16(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h80020937".U(32.W),	//lui	x18,0x80020
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00912a23".U(32.W),	//sw	x9,20(x2)
"h01312623".U(32.W),	//sw	x19,12(x2)
"h0007a023".U(32.W),	//sw	x0,0(x15)
"h12090793".U(32.W),	//addi	x15,x18,288 # //<__freertos_irq_stack_top+0xffffe120>
"h0007a783".U(32.W),	//lw	x15,0(x15)
"ha5a5a737".U(32.W),	//lui	x14,0xa5a5a
"h5a570713".U(32.W),	//addi	x14,x14,1445 # //<__freertos_irq_stack_top+0x25a385a5>
"h0307a783".U(32.W),	//lw	x15,48(x15)
"h12090913".U(32.W),	//addi	x18,x18,288
"h0007a603".U(32.W),	//lw	x12,0(x15)
"h00e61e63".U(32.W),	//bne	x12,x14,//<vTaskSwitchContext+0x78>
"h0047a683".U(32.W),	//lw	x13,4(x15)
"h00c69a63".U(32.W),	//bne	x13,x12,//<vTaskSwitchContext+0x78>
"h0087a703".U(32.W),	//lw	x14,8(x15)
"h00d71663".U(32.W),	//bne	x14,x13,//<vTaskSwitchContext+0x78>
"h00c7a783".U(32.W),	//lw	x15,12(x15)
"h00e78a63".U(32.W),	//beq	x15,x14,//<vTaskSwitchContext+0x88>
"h00092503".U(32.W),	//lw	x10,0(x18)
"h00092583".U(32.W),	//lw	x11,0(x18)
"h03458593".U(32.W),	//addi	x11,x11,52
"hac5ff0ef".U(32.W),	//jal	x1,//<vApplicationStackOverflowHook>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h13c7a503".U(32.W),	//lw	x10,316(x15) # //<__freertos_irq_stack_top+0xffffe13c>
"h01f00493".U(32.W),	//addi	x9,x0,31
"h80020437".U(32.W),	//lui	x8,0x80020
"h324010ef".U(32.W),	//jal	x1,//<__clzsi2>
"h40a489b3".U(32.W),	//sub	x19,x9,x10
"h00299493".U(32.W),	//slli	x9,x19,0x2
"h01348733".U(32.W),	//add	x14,x9,x19
"h17440793".U(32.W),	//addi	x15,x8,372 # //<__freertos_irq_stack_top+0xffffe174>
"h00271713".U(32.W),	//slli	x14,x14,0x2
"h00e787b3".U(32.W),	//add	x15,x15,x14
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h17440413".U(32.W),	//addi	x8,x8,372
"h00079463".U(32.W),	//bne	x15,x0,//<vTaskSwitchContext+0xc4>
"ha95ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h013487b3".U(32.W),	//add	x15,x9,x19
"h00279793".U(32.W),	//slli	x15,x15,0x2
"h00f40733".U(32.W),	//add	x14,x8,x15
"h00472683".U(32.W),	//lw	x13,4(x14)
"h00878793".U(32.W),	//addi	x15,x15,8
"h00f407b3".U(32.W),	//add	x15,x8,x15
"h0046a683".U(32.W),	//lw	x13,4(x13)
"h00d72223".U(32.W),	//sw	x13,4(x14)
"h00f69663".U(32.W),	//bne	x13,x15,//<vTaskSwitchContext+0xf0>
"h0046a783".U(32.W),	//lw	x15,4(x13)
"h00f72223".U(32.W),	//sw	x15,4(x14)
"h013484b3".U(32.W),	//add	x9,x9,x19
"h00249493".U(32.W),	//slli	x9,x9,0x2
"h00940433".U(32.W),	//add	x8,x8,x9
"h00442783".U(32.W),	//lw	x15,4(x8)
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01812403".U(32.W),	//lw	x8,24(x2)
"h00c7a783".U(32.W),	//lw	x15,12(x15)
"h01412483".U(32.W),	//lw	x9,20(x2)
"h00c12983".U(32.W),	//lw	x19,12(x2)
"h00f92023".U(32.W),	//sw	x15,0(x18)
"h01012903".U(32.W),	//lw	x18,16(x2)
"h02010113".U(32.W),	//addi	x2,x2,32
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vTaskPlaceOnEventList>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00058413".U(32.W),	//addi	x8,x11,0
"h00051863".U(32.W),	//bne	x10,x0,//<vTaskPlaceOnEventList+0x20>
"h00a12623".U(32.W),	//sw	x10,12(x2)
"ha19ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00c12503".U(32.W),	//lw	x10,12(x2)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1207a583".U(32.W),	//lw	x11,288(x15) # //<__freertos_irq_stack_top+0xffffe120>
"h01858593".U(32.W),	//addi	x11,x11,24
"ha9dff0ef".U(32.W),	//jal	x1,//<vListInsert>
"h00040513".U(32.W),	//addi	x10,x8,0
"h01812403".U(32.W),	//lw	x8,24(x2)
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h00100593".U(32.W),	//addi	x11,x0,1
"h02010113".U(32.W),	//addi	x2,x2,32
"hb0dff06f".U(32.W),	//jal	x0,//<prvAddCurrentTaskToDelayedList>
//<xTaskRemoveFromEventList>:
"h00c52783".U(32.W),	//lw	x15,12(x10)
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00c7a403".U(32.W),	//lw	x8,12(x15)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00041463".U(32.W),	//bne	x8,x0,//<xTaskRemoveFromEventList+0x1c>
"h9d1ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h01840593".U(32.W),	//addi	x11,x8,24
"h00058513".U(32.W),	//addi	x10,x11,0
"h00b12623".U(32.W),	//sw	x11,12(x2)
"haa9ff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1347a783".U(32.W),	//lw	x15,308(x15) # //<__freertos_irq_stack_top+0xffffe134>
"h00c12583".U(32.W),	//lw	x11,12(x2)
"h08079663".U(32.W),	//bne	x15,x0,//<xTaskRemoveFromEventList+0xc4>
"h00440593".U(32.W),	//addi	x11,x8,4
"h00058513".U(32.W),	//addi	x10,x11,0
"h00b12623".U(32.W),	//sw	x11,12(x2)
"ha89ff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h800206b7".U(32.W),	//lui	x13,0x80020
"h02c42503".U(32.W),	//lw	x10,44(x8)
"h13c68693".U(32.W),	//addi	x13,x13,316 # //<__freertos_irq_stack_top+0xffffe13c>
"h0006a783".U(32.W),	//lw	x15,0(x13)
"h00100713".U(32.W),	//addi	x14,x0,1
"h00a71733".U(32.W),	//sll	x14,x14,x10
"h00f76733".U(32.W),	//or	x14,x14,x15
"h00251793".U(32.W),	//slli	x15,x10,0x2
"h00a787b3".U(32.W),	//add	x15,x15,x10
"h00c12583".U(32.W),	//lw	x11,12(x2)
"h80020537".U(32.W),	//lui	x10,0x80020
"h00279793".U(32.W),	//slli	x15,x15,0x2
"h17450513".U(32.W),	//addi	x10,x10,372 # //<__freertos_irq_stack_top+0xffffe174>
"h00e6a023".U(32.W),	//sw	x14,0(x13)
"h00f50533".U(32.W),	//add	x10,x10,x15
"h9c9ff0ef".U(32.W),	//jal	x1,//<vListInsertEnd>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1207a783".U(32.W),	//lw	x15,288(x15) # //<__freertos_irq_stack_top+0xffffe120>
"h02c42703".U(32.W),	//lw	x14,44(x8)
"h00000513".U(32.W),	//addi	x10,x0,0
"h02c7a783".U(32.W),	//lw	x15,44(x15)
"h00e7fa63".U(32.W),	//bgeu	x15,x14,//<xTaskRemoveFromEventList+0xb4>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h00100713".U(32.W),	//addi	x14,x0,1
"h14e7ac23".U(32.W),	//sw	x14,344(x15) # //<__freertos_irq_stack_top+0xffffe158>
"h00100513".U(32.W),	//addi	x10,x0,1
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01812403".U(32.W),	//lw	x8,24(x2)
"h02010113".U(32.W),	//addi	x2,x2,32
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h91818513".U(32.W),	//addi	x10,x3,-1768 # //<xPendingReadyList>
"hfc1ff06f".U(32.W),	//jal	x0,//<xTaskRemoveFromEventList+0x88>
//<vTaskInternalSetTimeOutState>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1487a783".U(32.W),	//lw	x15,328(x15) # //<__freertos_irq_stack_top+0xffffe148>
"h00f52023".U(32.W),	//sw	x15,0(x10)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1547a783".U(32.W),	//lw	x15,340(x15) # //<__freertos_irq_stack_top+0xffffe154>
"h00f52223".U(32.W),	//sw	x15,4(x10)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vTaskMissedYield>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h00100713".U(32.W),	//addi	x14,x0,1
"h14e7ac23".U(32.W),	//sw	x14,344(x15) # //<__freertos_irq_stack_top+0xffffe158>
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<xTaskPriorityDisinherit>:
"h02051063".U(32.W),	//bne	x10,x0,//<xTaskPriorityDisinherit+0x20>
"h00000513".U(32.W),	//addi	x10,x0,0
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00000513".U(32.W),	//addi	x10,x0,0
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01812403".U(32.W),	//lw	x8,24(x2)
"h02010113".U(32.W),	//addi	x2,x2,32
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1207a783".U(32.W),	//lw	x15,288(x15) # //<__freertos_irq_stack_top+0xffffe120>
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h00a78463".U(32.W),	//beq	x15,x10,//<xTaskPriorityDisinherit+0x40>
"h8b5ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h04c42783".U(32.W),	//lw	x15,76(x8)
"h00079463".U(32.W),	//bne	x15,x0,//<xTaskPriorityDisinherit+0x4c>
"h8a9ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h04c42783".U(32.W),	//lw	x15,76(x8)
"h02c42683".U(32.W),	//lw	x13,44(x8)
"h04842703".U(32.W),	//lw	x14,72(x8)
"hfff78793".U(32.W),	//addi	x15,x15,-1
"h04f42623".U(32.W),	//sw	x15,76(x8)
"hfae686e3".U(32.W),	//beq	x13,x14,//<xTaskPriorityDisinherit+0xc>
"hfa0794e3".U(32.W),	//bne	x15,x0,//<xTaskPriorityDisinherit+0xc>
"h00440593".U(32.W),	//addi	x11,x8,4
"h00058513".U(32.W),	//addi	x10,x11,0
"h00b12623".U(32.W),	//sw	x11,12(x2)
"h965ff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h80020737".U(32.W),	//lui	x14,0x80020
"h00c12583".U(32.W),	//lw	x11,12(x2)
"h13c70713".U(32.W),	//addi	x14,x14,316 # //<__freertos_irq_stack_top+0xffffe13c>
"h02051063".U(32.W),	//bne	x10,x0,//<xTaskPriorityDisinherit+0xa4>
"h02c42603".U(32.W),	//lw	x12,44(x8)
"h00072683".U(32.W),	//lw	x13,0(x14)
"h00100793".U(32.W),	//addi	x15,x0,1
"h00c797b3".U(32.W),	//sll	x15,x15,x12
"hfff7c793".U(32.W),	//xori	x15,x15,-1
"h00d7f7b3".U(32.W),	//and	x15,x15,x13
"h00f72023".U(32.W),	//sw	x15,0(x14)
"h04842503".U(32.W),	//lw	x10,72(x8)
"h00700793".U(32.W),	//addi	x15,x0,7
"h00072683".U(32.W),	//lw	x13,0(x14)
"h40a787b3".U(32.W),	//sub	x15,x15,x10
"h00f42c23".U(32.W),	//sw	x15,24(x8)
"h00100793".U(32.W),	//addi	x15,x0,1
"h00a797b3".U(32.W),	//sll	x15,x15,x10
"h00d7e7b3".U(32.W),	//or	x15,x15,x13
"h00f72023".U(32.W),	//sw	x15,0(x14)
"h00251793".U(32.W),	//slli	x15,x10,0x2
"h02a42623".U(32.W),	//sw	x10,44(x8)
"h00a787b3".U(32.W),	//add	x15,x15,x10
"h80020537".U(32.W),	//lui	x10,0x80020
"h00279793".U(32.W),	//slli	x15,x15,0x2
"h17450513".U(32.W),	//addi	x10,x10,372 # //<__freertos_irq_stack_top+0xffffe174>
"h00f50533".U(32.W),	//add	x10,x10,x15
"h875ff0ef".U(32.W),	//jal	x1,//<vListInsertEnd>
"h00100513".U(32.W),	//addi	x10,x0,1
"hf25ff06f".U(32.W),	//jal	x0,//<xTaskPriorityDisinherit+0x10>
//<vTaskEnterCritical>:
"h30047073".U(32.W),	//csrrci	x0,mstatus,8
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1507a783".U(32.W),	//lw	x15,336(x15) # //<__freertos_irq_stack_top+0xffffe150>
"h02078063".U(32.W),	//beq	x15,x0,//<vTaskEnterCritical+0x2c>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h12078793".U(32.W),	//addi	x15,x15,288 # //<__freertos_irq_stack_top+0xffffe120>
"h0007a683".U(32.W),	//lw	x13,0(x15)
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h0446a703".U(32.W),	//lw	x14,68(x13)
"h00170713".U(32.W),	//addi	x14,x14,1
"h04e6a223".U(32.W),	//sw	x14,68(x13)
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vTaskExitCritical>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1507a783".U(32.W),	//lw	x15,336(x15) # //<__freertos_irq_stack_top+0xffffe150>
"h02078c63".U(32.W),	//beq	x15,x0,//<vTaskExitCritical+0x40>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h12078793".U(32.W),	//addi	x15,x15,288 # //<__freertos_irq_stack_top+0xffffe120>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h04472703".U(32.W),	//lw	x14,68(x14)
"h02070263".U(32.W),	//beq	x14,x0,//<vTaskExitCritical+0x40>
"h0007a683".U(32.W),	//lw	x13,0(x15)
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h0446a703".U(32.W),	//lw	x14,68(x13)
"hfff70713".U(32.W),	//addi	x14,x14,-1
"h04e6a223".U(32.W),	//sw	x14,68(x13)
"h0447a783".U(32.W),	//lw	x15,68(x15)
"h00079463".U(32.W),	//bne	x15,x0,//<vTaskExitCritical+0x40>
"h30046073".U(32.W),	//csrrsi	x0,mstatus,8
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<xTaskCreate>:
"hfd010113".U(32.W),	//addi	x2,x2,-48
"h01312e23".U(32.W),	//sw	x19,28(x2)
"h00261993".U(32.W),	//slli	x19,x12,0x2
"h01612823".U(32.W),	//sw	x22,16(x2)
"h00050b13".U(32.W),	//addi	x22,x10,0
"h00098513".U(32.W),	//addi	x10,x19,0
"h02912223".U(32.W),	//sw	x9,36(x2)
"h03212023".U(32.W),	//sw	x18,32(x2)
"h01512a23".U(32.W),	//sw	x21,20(x2)
"h01712623".U(32.W),	//sw	x23,12(x2)
"h02112623".U(32.W),	//sw	x1,44(x2)
"h02812423".U(32.W),	//sw	x8,40(x2)
"h01412c23".U(32.W),	//sw	x20,24(x2)
"h01812423".U(32.W),	//sw	x24,8(x2)
"h00058913".U(32.W),	//addi	x18,x11,0
"h00068b93".U(32.W),	//addi	x23,x13,0
"h00070493".U(32.W),	//addi	x9,x14,0
"h00078a93".U(32.W),	//addi	x21,x15,0
"h5d1000ef".U(32.W),	//jal	x1,//<pvPortMalloc>
"h04050263".U(32.W),	//beq	x10,x0,//<xTaskCreate+0x90>
"h00050a13".U(32.W),	//addi	x20,x10,0
"h05800513".U(32.W),	//addi	x10,x0,88
"h5c1000ef".U(32.W),	//jal	x1,//<pvPortMalloc>
"h00050413".U(32.W),	//addi	x8,x10,0
"h02050463".U(32.W),	//beq	x10,x0,//<xTaskCreate+0x88>
"h03452823".U(32.W),	//sw	x20,48(x10)
"h00098613".U(32.W),	//addi	x12,x19,0
"h0a500593".U(32.W),	//addi	x11,x0,165
"h000a0513".U(32.W),	//addi	x10,x20,0
"h208010ef".U(32.W),	//jal	x1,//<memset>
"h03042c03".U(32.W),	//lw	x24,48(x8)
"h00091e63".U(32.W),	//bne	x18,x0,//<xTaskCreate+0x98>
"h02040a23".U(32.W),	//sb	x0,52(x8)
"h03c0006f".U(32.W),	//jal	x0,//<xTaskCreate+0xc0>
"h000a0513".U(32.W),	//addi	x10,x20,0
"h63d000ef".U(32.W),	//jal	x1,//<vPortFree>
"hfff00513".U(32.W),	//addi	x10,x0,-1
"h1cc0006f".U(32.W),	//jal	x0,//<xTaskCreate+0x260>
"h00090713".U(32.W),	//addi	x14,x18,0
"h03440793".U(32.W),	//addi	x15,x8,52
"h01090613".U(32.W),	//addi	x12,x18,16
"h00074683".U(32.W),	//lbu	x13,0(x14)
"h00d78023".U(32.W),	//sb	x13,0(x15)
"h00068863".U(32.W),	//beq	x13,x0,//<xTaskCreate+0xbc>
"h00170713".U(32.W),	//addi	x14,x14,1
"h00178793".U(32.W),	//addi	x15,x15,1
"hfec716e3".U(32.W),	//bne	x14,x12,//<xTaskCreate+0xa4>
"h040401a3".U(32.W),	//sb	x0,67(x8)
"h00600793".U(32.W),	//addi	x15,x0,6
"h0097f463".U(32.W),	//bgeu	x15,x9,//<xTaskCreate+0xcc>
"hec4ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00600793".U(32.W),	//addi	x15,x0,6
"h0097f463".U(32.W),	//bgeu	x15,x9,//<xTaskCreate+0xd8>
"h00600493".U(32.W),	//addi	x9,x0,6
"h00440a13".U(32.W),	//addi	x20,x8,4
"h02942623".U(32.W),	//sw	x9,44(x8)
"h04942423".U(32.W),	//sw	x9,72(x8)
"h000a0513".U(32.W),	//addi	x10,x20,0
"h04042623".U(32.W),	//sw	x0,76(x8)
"hf00ff0ef".U(32.W),	//jal	x1,//<vListInitialiseItem>
"h01840513".U(32.W),	//addi	x10,x8,24
"hef8ff0ef".U(32.W),	//jal	x1,//<vListInitialiseItem>
"h00700713".U(32.W),	//addi	x14,x0,7
"hffc98993".U(32.W),	//addi	x19,x19,-4
"h409704b3".U(32.W),	//sub	x9,x14,x9
"h013c09b3".U(32.W),	//add	x19,x24,x19
"h00842823".U(32.W),	//sw	x8,16(x8)
"h00942c23".U(32.W),	//sw	x9,24(x8)
"h02842223".U(32.W),	//sw	x8,36(x8)
"h04042223".U(32.W),	//sw	x0,68(x8)
"h04040823".U(32.W),	//sb	x0,80(x8)
"h040408a3".U(32.W),	//sb	x0,81(x8)
"h04040923".U(32.W),	//sb	x0,82(x8)
"h040409a3".U(32.W),	//sb	x0,83(x8)
"h04040a23".U(32.W),	//sb	x0,84(x8)
"h04040aa3".U(32.W),	//sb	x0,85(x8)
"h000b8613".U(32.W),	//addi	x12,x23,0
"h000b0593".U(32.W),	//addi	x11,x22,0
"hff09f513".U(32.W),	//andi	x10,x19,-16
"hc90ff0ef".U(32.W),	//jal	x1,//<pxPortInitialiseStack>
"h00a42023".U(32.W),	//sw	x10,0(x8)
"h000a8463".U(32.W),	//beq	x21,x0,//<xTaskCreate+0x14c>
"h008aa023".U(32.W),	//sw	x8,0(x21)
"he41ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h12c78793".U(32.W),	//addi	x15,x15,300 # //<__freertos_irq_stack_top+0xffffe12c>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h800204b7".U(32.W),	//lui	x9,0x80020
"h80020937".U(32.W),	//lui	x18,0x80020
"h00170713".U(32.W),	//addi	x14,x14,1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h12048713".U(32.W),	//addi	x14,x9,288 # //<__freertos_irq_stack_top+0xffffe120>
"h00072703".U(32.W),	//lw	x14,0(x14)
"h12048493".U(32.W),	//addi	x9,x9,288
"h17490993".U(32.W),	//addi	x19,x18,372 # //<__freertos_irq_stack_top+0xffffe174>
"h10071a63".U(32.W),	//bne	x14,x0,//<xTaskCreate+0x290>
"h0084a023".U(32.W),	//sw	x8,0(x9)
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00100793".U(32.W),	//addi	x15,x0,1
"h06f71063".U(32.W),	//bne	x14,x15,//<xTaskCreate+0x1ec>
"h17490913".U(32.W),	//addi	x18,x18,372
"h08c98a93".U(32.W),	//addi	x21,x19,140
"h00090513".U(32.W),	//addi	x10,x18,0
"h01490913".U(32.W),	//addi	x18,x18,20
"he2cff0ef".U(32.W),	//jal	x1,//<vListInitialise>
"hff2a9ae3".U(32.W),	//bne	x21,x18,//<xTaskCreate+0x198>
"h80020537".U(32.W),	//lui	x10,0x80020
"h20050a93".U(32.W),	//addi	x21,x10,512 # //<__freertos_irq_stack_top+0xffffe200>
"h20050513".U(32.W),	//addi	x10,x10,512
"he18ff0ef".U(32.W),	//jal	x1,//<vListInitialise>
"h90418913".U(32.W),	//addi	x18,x3,-1788 # //<xDelayedTaskList2>
"h90418513".U(32.W),	//addi	x10,x3,-1788 # //<xDelayedTaskList2>
"he0cff0ef".U(32.W),	//jal	x1,//<vListInitialise>
"h91818513".U(32.W),	//addi	x10,x3,-1768 # //<xPendingReadyList>
"he04ff0ef".U(32.W),	//jal	x1,//<vListInitialise>
"h94018513".U(32.W),	//addi	x10,x3,-1728 # //<xTasksWaitingTermination>
"hdfcff0ef".U(32.W),	//jal	x1,//<vListInitialise>
"h92c18513".U(32.W),	//addi	x10,x3,-1748 # //<xSuspendedTaskList>
"hdf4ff0ef".U(32.W),	//jal	x1,//<vListInitialise>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1357a223".U(32.W),	//sw	x21,292(x15) # //<__freertos_irq_stack_top+0xffffe124>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1327a423".U(32.W),	//sw	x18,296(x15) # //<__freertos_irq_stack_top+0xffffe128>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h13878793".U(32.W),	//addi	x15,x15,312 # //<__freertos_irq_stack_top+0xffffe138>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h02c42683".U(32.W),	//lw	x13,44(x8)
"h000a0593".U(32.W),	//addi	x11,x20,0
"h00170713".U(32.W),	//addi	x14,x14,1
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h80020737".U(32.W),	//lui	x14,0x80020
"h13c70713".U(32.W),	//addi	x14,x14,316 # //<__freertos_irq_stack_top+0xffffe13c>
"h00072603".U(32.W),	//lw	x12,0(x14)
"h00269513".U(32.W),	//slli	x10,x13,0x2
"h00d50533".U(32.W),	//add	x10,x10,x13
"h00100793".U(32.W),	//addi	x15,x0,1
"h00d797b3".U(32.W),	//sll	x15,x15,x13
"h00251513".U(32.W),	//slli	x10,x10,0x2
"h00c7e7b3".U(32.W),	//or	x15,x15,x12
"h00a98533".U(32.W),	//add	x10,x19,x10
"h00f72023".U(32.W),	//sw	x15,0(x14)
"hdc0ff0ef".U(32.W),	//jal	x1,//<vListInsertEnd>
"hd85ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1507a783".U(32.W),	//lw	x15,336(x15) # //<__freertos_irq_stack_top+0xffffe150>
"h00100513".U(32.W),	//addi	x10,x0,1
"h00078c63".U(32.W),	//beq	x15,x0,//<xTaskCreate+0x260>
"h0004a783".U(32.W),	//lw	x15,0(x9)
"h02c7a703".U(32.W),	//lw	x14,44(x15)
"h02c42783".U(32.W),	//lw	x15,44(x8)
"h00f77463".U(32.W),	//bgeu	x14,x15,//<xTaskCreate+0x260>
"h00000073".U(32.W),	//ecall
"h02c12083".U(32.W),	//lw	x1,44(x2)
"h02812403".U(32.W),	//lw	x8,40(x2)
"h02412483".U(32.W),	//lw	x9,36(x2)
"h02012903".U(32.W),	//lw	x18,32(x2)
"h01c12983".U(32.W),	//lw	x19,28(x2)
"h01812a03".U(32.W),	//lw	x20,24(x2)
"h01412a83".U(32.W),	//lw	x21,20(x2)
"h01012b03".U(32.W),	//lw	x22,16(x2)
"h00c12b83".U(32.W),	//lw	x23,12(x2)
"h00812c03".U(32.W),	//lw	x24,8(x2)
"h03010113".U(32.W),	//addi	x2,x2,48
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1507a783".U(32.W),	//lw	x15,336(x15) # //<__freertos_irq_stack_top+0xffffe150>
"hf4079ae3".U(32.W),	//bne	x15,x0,//<xTaskCreate+0x1ec>
"h0004a783".U(32.W),	//lw	x15,0(x9)
"h02c42703".U(32.W),	//lw	x14,44(x8)
"h02c7a783".U(32.W),	//lw	x15,44(x15)
"hf4f762e3".U(32.W),	//bltu	x14,x15,//<xTaskCreate+0x1ec>
"h0084a023".U(32.W),	//sw	x8,0(x9)
"hf3dff06f".U(32.W),	//jal	x0,//<xTaskCreate+0x1ec>
//<vTaskStartScheduler>:
"h800207b7".U(32.W),	//lui	x15,0x80020
"h800205b7".U(32.W),	//lui	x11,0x80020
"h80001537".U(32.W),	//lui	x10,0x80001
"hff010113".U(32.W),	//addi	x2,x2,-16
"h14078793".U(32.W),	//addi	x15,x15,320 # //<__freertos_irq_stack_top+0xffffe140>
"h00000713".U(32.W),	//addi	x14,x0,0
"h00000693".U(32.W),	//addi	x13,x0,0
"h04000613".U(32.W),	//addi	x12,x0,64
"h00058593".U(32.W),	//addi	x11,x11,0 # //<__freertos_irq_stack_top+0xffffe000>
"h26850513".U(32.W),	//addi	x10,x10,616 # //<__freertos_irq_stack_top+0xfffdf268>
"h00112623".U(32.W),	//sw	x1,12(x2)
"hd21ff0ef".U(32.W),	//jal	x1,//<xTaskCreate>
"h00100793".U(32.W),	//addi	x15,x0,1
"h02f51e63".U(32.W),	//bne	x10,x15,//<vTaskStartScheduler+0x70>
"h30047073".U(32.W),	//csrrci	x0,mstatus,8
"h800207b7".U(32.W),	//lui	x15,0x80020
"hfff00713".U(32.W),	//addi	x14,x0,-1
"h14e7a223".U(32.W),	//sw	x14,324(x15) # //<__freertos_irq_stack_top+0xffffe144>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14a7a823".U(32.W),	//sw	x10,336(x15) # //<__freertos_irq_stack_top+0xffffe150>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1407aa23".U(32.W),	//sw	x0,340(x15) # //<__freertos_irq_stack_top+0xffffe154>
"h2b1000ef".U(32.W),	//jal	x1,//<xPortStartScheduler>
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1107a783".U(32.W),	//lw	x15,272(x15) # //<__freertos_irq_stack_top+0xffffe110>
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
"hfff00793".U(32.W),	//addi	x15,x0,-1
"hfef514e3".U(32.W),	//bne	x10,x15,//<vTaskStartScheduler+0x5c>
"hc60ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"hfe1ff06f".U(32.W),	//jal	x0,//<vTaskStartScheduler+0x5c>
//<prvIdleTask>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h01312623".U(32.W),	//sw	x19,12(x2)
"h01412423".U(32.W),	//sw	x20,8(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00912a23".U(32.W),	//sw	x9,20(x2)
"h01212823".U(32.W),	//sw	x18,16(x2)
"h800209b7".U(32.W),	//lui	x19,0x80020
"h94018413".U(32.W),	//addi	x8,x3,-1728 # //<xTasksWaitingTermination>
"h80020a37".U(32.W),	//lui	x20,0x80020
"h13098493".U(32.W),	//addi	x9,x19,304 # //<__freertos_irq_stack_top+0xffffe130>
"h0004a783".U(32.W),	//lw	x15,0(x9)
"hfe078ce3".U(32.W),	//beq	x15,x0,//<prvIdleTask+0x28>
"hc25ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h00c42783".U(32.W),	//lw	x15,12(x8)
"h00c7a903".U(32.W),	//lw	x18,12(x15)
"h00490513".U(32.W),	//addi	x10,x18,4
"hcfcff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h12ca0713".U(32.W),	//addi	x14,x20,300 # //<__freertos_irq_stack_top+0xffffe12c>
"h00072783".U(32.W),	//lw	x15,0(x14)
"hfff78793".U(32.W),	//addi	x15,x15,-1
"h00f72023".U(32.W),	//sw	x15,0(x14)
"h0004a783".U(32.W),	//lw	x15,0(x9)
"hfff78793".U(32.W),	//addi	x15,x15,-1
"h00f4a023".U(32.W),	//sw	x15,0(x9)
"hc25ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h03092503".U(32.W),	//lw	x10,48(x18)
"h329000ef".U(32.W),	//jal	x1,//<vPortFree>
"h00090513".U(32.W),	//addi	x10,x18,0
"h321000ef".U(32.W),	//jal	x1,//<vPortFree>
"hfb1ff06f".U(32.W),	//jal	x0,//<prvIdleTask+0x28>
//<xTaskResumeAll>:
"hfd010113".U(32.W),	//addi	x2,x2,-48
"h02812423".U(32.W),	//sw	x8,40(x2)
"h80020437".U(32.W),	//lui	x8,0x80020
"h13440793".U(32.W),	//addi	x15,x8,308 # //<__freertos_irq_stack_top+0xffffe134>
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h02112623".U(32.W),	//sw	x1,44(x2)
"h02912223".U(32.W),	//sw	x9,36(x2)
"h03212023".U(32.W),	//sw	x18,32(x2)
"h01312e23".U(32.W),	//sw	x19,28(x2)
"h01412c23".U(32.W),	//sw	x20,24(x2)
"h01512a23".U(32.W),	//sw	x21,20(x2)
"h01612823".U(32.W),	//sw	x22,16(x2)
"h13440413".U(32.W),	//addi	x8,x8,308
"h00079463".U(32.W),	//bne	x15,x0,//<xTaskResumeAll+0x3c>
"hba4ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"hba1ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h00042783".U(32.W),	//lw	x15,0(x8)
"hfff78793".U(32.W),	//addi	x15,x15,-1
"h00f42023".U(32.W),	//sw	x15,0(x8)
"h00042783".U(32.W),	//lw	x15,0(x8)
"h02078e63".U(32.W),	//beq	x15,x0,//<xTaskResumeAll+0x8c>
"h00000513".U(32.W),	//addi	x10,x0,0
"h00a12623".U(32.W),	//sw	x10,12(x2)
"hbb1ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h02c12083".U(32.W),	//lw	x1,44(x2)
"h02812403".U(32.W),	//lw	x8,40(x2)
"h00c12503".U(32.W),	//lw	x10,12(x2)
"h02412483".U(32.W),	//lw	x9,36(x2)
"h02012903".U(32.W),	//lw	x18,32(x2)
"h01c12983".U(32.W),	//lw	x19,28(x2)
"h01812a03".U(32.W),	//lw	x20,24(x2)
"h01412a83".U(32.W),	//lw	x21,20(x2)
"h01012b03".U(32.W),	//lw	x22,16(x2)
"h03010113".U(32.W),	//addi	x2,x2,48
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h12c7a783".U(32.W),	//lw	x15,300(x15) # //<__freertos_irq_stack_top+0xffffe12c>
"hfc0780e3".U(32.W),	//beq	x15,x0,//<xTaskResumeAll+0x54>
"h80020937".U(32.W),	//lui	x18,0x80020
"h00000413".U(32.W),	//addi	x8,x0,0
"h91818493".U(32.W),	//addi	x9,x3,-1768 # //<xPendingReadyList>
"h80020a37".U(32.W),	//lui	x20,0x80020
"h00100993".U(32.W),	//addi	x19,x0,1
"h17490913".U(32.W),	//addi	x18,x18,372 # //<__freertos_irq_stack_top+0xffffe174>
"h80020ab7".U(32.W),	//lui	x21,0x80020
"h80020b37".U(32.W),	//lui	x22,0x80020
"h0700006f".U(32.W),	//jal	x0,//<xTaskResumeAll+0x128>
"h00c4a783".U(32.W),	//lw	x15,12(x9)
"h00c7a403".U(32.W),	//lw	x8,12(x15)
"h01840513".U(32.W),	//addi	x10,x8,24
"hbfcff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h00440593".U(32.W),	//addi	x11,x8,4
"h00058513".U(32.W),	//addi	x10,x11,0
"h00b12623".U(32.W),	//sw	x11,12(x2)
"hbecff0ef".U(32.W),	//jal	x1,//<uxListRemove>
"h02c42783".U(32.W),	//lw	x15,44(x8)
"h13ca0693".U(32.W),	//addi	x13,x20,316 # //<__freertos_irq_stack_top+0xffffe13c>
"h0006a603".U(32.W),	//lw	x12,0(x13)
"h00279513".U(32.W),	//slli	x10,x15,0x2
"h00f50533".U(32.W),	//add	x10,x10,x15
"h00c12583".U(32.W),	//lw	x11,12(x2)
"h00f99733".U(32.W),	//sll	x14,x19,x15
"h00251513".U(32.W),	//slli	x10,x10,0x2
"h00c76733".U(32.W),	//or	x14,x14,x12
"h00a90533".U(32.W),	//add	x10,x18,x10
"h00e6a023".U(32.W),	//sw	x14,0(x13)
"hb3cff0ef".U(32.W),	//jal	x1,//<vListInsertEnd>
"h120a8793".U(32.W),	//addi	x15,x21,288 # //<__freertos_irq_stack_top+0xffffe120>
"h0007a783".U(32.W),	//lw	x15,0(x15)
"h02c42703".U(32.W),	//lw	x14,44(x8)
"h02c7a783".U(32.W),	//lw	x15,44(x15)
"h00f76663".U(32.W),	//bltu	x14,x15,//<xTaskResumeAll+0x128>
"h158b0793".U(32.W),	//addi	x15,x22,344 # //<__freertos_irq_stack_top+0xffffe158>
"h0137a023".U(32.W),	//sw	x19,0(x15)
"h0004a783".U(32.W),	//lw	x15,0(x9)
"hf80798e3".U(32.W),	//bne	x15,x0,//<xTaskResumeAll+0xbc>
"h00040463".U(32.W),	//beq	x8,x0,//<xTaskResumeAll+0x138>
"hcf0ff0ef".U(32.W),	//jal	x1,//<prvResetNextTaskUnblockTime>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14c78713".U(32.W),	//addi	x14,x15,332 # //<__freertos_irq_stack_top+0xffffe14c>
"h00072483".U(32.W),	//lw	x9,0(x14)
"h14c78413".U(32.W),	//addi	x8,x15,332
"h02048463".U(32.W),	//beq	x9,x0,//<xTaskResumeAll+0x170>
"h80020937".U(32.W),	//lui	x18,0x80020
"h00100993".U(32.W),	//addi	x19,x0,1
"hd2cff0ef".U(32.W),	//jal	x1,//<xTaskIncrementTick>
"h00050663".U(32.W),	//beq	x10,x0,//<xTaskResumeAll+0x164>
"h15890793".U(32.W),	//addi	x15,x18,344 # //<__freertos_irq_stack_top+0xffffe158>
"h0137a023".U(32.W),	//sw	x19,0(x15)
"hfff48493".U(32.W),	//addi	x9,x9,-1
"hfe0496e3".U(32.W),	//bne	x9,x0,//<xTaskResumeAll+0x154>
"h00042023".U(32.W),	//sw	x0,0(x8)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1587a783".U(32.W),	//lw	x15,344(x15) # //<__freertos_irq_stack_top+0xffffe158>
"hec078ee3".U(32.W),	//beq	x15,x0,//<xTaskResumeAll+0x54>
"h00000073".U(32.W),	//ecall
"h00100513".U(32.W),	//addi	x10,x0,1
"hed5ff06f".U(32.W),	//jal	x0,//<xTaskResumeAll+0x58>
//<xTaskDelayUntil>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00812423".U(32.W),	//sw	x8,8(x2)
"h00912223".U(32.W),	//sw	x9,4(x2)
"h00112623".U(32.W),	//sw	x1,12(x2)
"h00050493".U(32.W),	//addi	x9,x10,0
"h00058413".U(32.W),	//addi	x8,x11,0
"h00051463".U(32.W),	//bne	x10,x0,//<xTaskDelayUntil+0x20>
"ha38ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00041463".U(32.W),	//bne	x8,x0,//<xTaskDelayUntil+0x28>
"ha30ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1347a783".U(32.W),	//lw	x15,308(x15) # //<__freertos_irq_stack_top+0xffffe134>
"h00078463".U(32.W),	//beq	x15,x0,//<xTaskDelayUntil+0x38>
"ha20ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"hc9cff0ef".U(32.W),	//jal	x1,//<vTaskSuspendAll>
"h0004a703".U(32.W),	//lw	x14,0(x9)
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1547a503".U(32.W),	//lw	x10,340(x15) # //<__freertos_irq_stack_top+0xffffe154>
"h00870433".U(32.W),	//add	x8,x14,x8
"h0084a023".U(32.W),	//sw	x8,0(x9)
"h02e57863".U(32.W),	//bgeu	x10,x14,//<xTaskDelayUntil+0x80>
"h02e46863".U(32.W),	//bltu	x8,x14,//<xTaskDelayUntil+0x84>
"h00000413".U(32.W),	//addi	x8,x0,0
"he1dff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"h00051463".U(32.W),	//bne	x10,x0,//<xTaskDelayUntil+0x68>
"h00000073".U(32.W),	//ecall
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h00040513".U(32.W),	//addi	x10,x8,0
"h00812403".U(32.W),	//lw	x8,8(x2)
"h00412483".U(32.W),	//lw	x9,4(x2)
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00e46463".U(32.W),	//bltu	x8,x14,//<xTaskDelayUntil+0x88>
"hfc857ae3".U(32.W),	//bgeu	x10,x8,//<xTaskDelayUntil+0x58>
"h40a40533".U(32.W),	//sub	x10,x8,x10
"h00000593".U(32.W),	//addi	x11,x0,0
"hae4ff0ef".U(32.W),	//jal	x1,//<prvAddCurrentTaskToDelayedList>
"h00100413".U(32.W),	//addi	x8,x0,1
"hfc5ff06f".U(32.W),	//jal	x0,//<xTaskDelayUntil+0x5c>
//<xTaskCheckForTimeOut>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00912a23".U(32.W),	//sw	x9,20(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h00058493".U(32.W),	//addi	x9,x11,0
"h00051463".U(32.W),	//bne	x10,x0,//<xTaskCheckForTimeOut+0x20>
"h99cff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00049463".U(32.W),	//bne	x9,x0,//<xTaskCheckForTimeOut+0x28>
"h994ff0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h991ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h80020737".U(32.W),	//lui	x14,0x80020
"h800207b7".U(32.W),	//lui	x15,0x80020
"h12070713".U(32.W),	//addi	x14,x14,288 # //<__freertos_irq_stack_top+0xffffe120>
"h1547a683".U(32.W),	//lw	x13,340(x15) # //<__freertos_irq_stack_top+0xffffe154>
"h00072783".U(32.W),	//lw	x15,0(x14)
"h0557c783".U(32.W),	//lbu	x15,85(x15)
"h02078863".U(32.W),	//beq	x15,x0,//<xTaskCheckForTimeOut+0x74>
"h00072783".U(32.W),	//lw	x15,0(x14)
"h04078aa3".U(32.W),	//sb	x0,85(x15)
"h00100513".U(32.W),	//addi	x10,x0,1
"h00a12623".U(32.W),	//sw	x10,12(x2)
"h991ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01812403".U(32.W),	//lw	x8,24(x2)
"h00c12503".U(32.W),	//lw	x10,12(x2)
"h01412483".U(32.W),	//lw	x9,20(x2)
"h02010113".U(32.W),	//addi	x2,x2,32
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h0004a783".U(32.W),	//lw	x15,0(x9)
"hfff00713".U(32.W),	//addi	x14,x0,-1
"h00000513".U(32.W),	//addi	x10,x0,0
"hfce78ae3".U(32.W),	//beq	x15,x14,//<xTaskCheckForTimeOut+0x54>
"h80020637".U(32.W),	//lui	x12,0x80020
"h14862603".U(32.W),	//lw	x12,328(x12) # //<__freertos_irq_stack_top+0xffffe148>
"h00042583".U(32.W),	//lw	x11,0(x8)
"h00442703".U(32.W),	//lw	x14,4(x8)
"h00c58863".U(32.W),	//beq	x11,x12,//<xTaskCheckForTimeOut+0xa4>
"h00e6e663".U(32.W),	//bltu	x13,x14,//<xTaskCheckForTimeOut+0xa4>
"h0004a023".U(32.W),	//sw	x0,0(x9)
"hfb1ff06f".U(32.W),	//jal	x0,//<xTaskCheckForTimeOut+0x50>
"h40e68633".U(32.W),	//sub	x12,x13,x14
"hfef67ae3".U(32.W),	//bgeu	x12,x15,//<xTaskCheckForTimeOut+0x9c>
"h40d787b3".U(32.W),	//sub	x15,x15,x13
"h00e787b3".U(32.W),	//add	x15,x15,x14
"h00040513".U(32.W),	//addi	x10,x8,0
"h00f4a023".U(32.W),	//sw	x15,0(x9)
"hfe0ff0ef".U(32.W),	//jal	x1,//<vTaskInternalSetTimeOutState>
"h00000513".U(32.W),	//addi	x10,x0,0
"hf91ff06f".U(32.W),	//jal	x0,//<xTaskCheckForTimeOut+0x54>
//<prvIsQueueEmpty>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00812423".U(32.W),	//sw	x8,8(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h00112623".U(32.W),	//sw	x1,12(x2)
"h8e1ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h03842403".U(32.W),	//lw	x8,56(x8)
"h909ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h00143513".U(32.W),	//sltiu	x10,x8,1
"h00812403".U(32.W),	//lw	x8,8(x2)
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<prvCopyDataToQueue>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00912223".U(32.W),	//sw	x9,4(x2)
"h00060493".U(32.W),	//addi	x9,x12,0
"h04052603".U(32.W),	//lw	x12,64(x10)
"h01212023".U(32.W),	//sw	x18,0(x2)
"h03852903".U(32.W),	//lw	x18,56(x10)
"h00812423".U(32.W),	//sw	x8,8(x2)
"h00112623".U(32.W),	//sw	x1,12(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h04061263".U(32.W),	//bne	x12,x0,//<prvCopyDataToQueue+0x68>
"h00052783".U(32.W),	//lw	x15,0(x10)
"h00000493".U(32.W),	//addi	x9,x0,0
"h00079a63".U(32.W),	//bne	x15,x0,//<prvCopyDataToQueue+0x44>
"h00852503".U(32.W),	//lw	x10,8(x10)
"hf98ff0ef".U(32.W),	//jal	x1,//<xTaskPriorityDisinherit>
"h00050493".U(32.W),	//addi	x9,x10,0
"h00042423".U(32.W),	//sw	x0,8(x8)
"h00190913".U(32.W),	//addi	x18,x18,1
"h03242c23".U(32.W),	//sw	x18,56(x8)
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h00812403".U(32.W),	//lw	x8,8(x2)
"h00012903".U(32.W),	//lw	x18,0(x2)
"h00048513".U(32.W),	//addi	x10,x9,0
"h00412483".U(32.W),	//lw	x9,4(x2)
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h02049863".U(32.W),	//bne	x9,x0,//<prvCopyDataToQueue+0x98>
"h00452503".U(32.W),	//lw	x10,4(x10)
"h225000ef".U(32.W),	//jal	x1,//<memcpy>
"h00442783".U(32.W),	//lw	x15,4(x8)
"h04042703".U(32.W),	//lw	x14,64(x8)
"h00e787b3".U(32.W),	//add	x15,x15,x14
"h00842703".U(32.W),	//lw	x14,8(x8)
"h00f42223".U(32.W),	//sw	x15,4(x8)
"hfae7eee3".U(32.W),	//bltu	x15,x14,//<prvCopyDataToQueue+0x44>
"h00042783".U(32.W),	//lw	x15,0(x8)
"h00f42223".U(32.W),	//sw	x15,4(x8)
"hfb1ff06f".U(32.W),	//jal	x0,//<prvCopyDataToQueue+0x44>
"h00c52503".U(32.W),	//lw	x10,12(x10)
"h1f9000ef".U(32.W),	//jal	x1,//<memcpy>
"h04042703".U(32.W),	//lw	x14,64(x8)
"h00c42783".U(32.W),	//lw	x15,12(x8)
"h40e006b3".U(32.W),	//sub	x13,x0,x14
"h40e787b3".U(32.W),	//sub	x15,x15,x14
"h00042703".U(32.W),	//lw	x14,0(x8)
"h00f42623".U(32.W),	//sw	x15,12(x8)
"h00e7f863".U(32.W),	//bgeu	x15,x14,//<prvCopyDataToQueue+0xc8>
"h00842783".U(32.W),	//lw	x15,8(x8)
"h00d787b3".U(32.W),	//add	x15,x15,x13
"h00f42623".U(32.W),	//sw	x15,12(x8)
"h00200793".U(32.W),	//addi	x15,x0,2
"h00f49a63".U(32.W),	//bne	x9,x15,//<prvCopyDataToQueue+0xe0>
"h00000493".U(32.W),	//addi	x9,x0,0
"hf60908e3".U(32.W),	//beq	x18,x0,//<prvCopyDataToQueue+0x44>
"hfff90913".U(32.W),	//addi	x18,x18,-1
"hf69ff06f".U(32.W),	//jal	x0,//<prvCopyDataToQueue+0x44>
"h00000493".U(32.W),	//addi	x9,x0,0
"hf61ff06f".U(32.W),	//jal	x0,//<prvCopyDataToQueue+0x44>
//<prvCopyDataFromQueue>:
"h00050793".U(32.W),	//addi	x15,x10,0
"h0407a603".U(32.W),	//lw	x12,64(x15)
"h00058513".U(32.W),	//addi	x10,x11,0
"h02060463".U(32.W),	//beq	x12,x0,//<prvCopyDataFromQueue+0x34>
"h00c7a703".U(32.W),	//lw	x14,12(x15)
"h0087a683".U(32.W),	//lw	x13,8(x15)
"h00c70733".U(32.W),	//add	x14,x14,x12
"h00e7a623".U(32.W),	//sw	x14,12(x15)
"h00d76663".U(32.W),	//bltu	x14,x13,//<prvCopyDataFromQueue+0x2c>
"h0007a703".U(32.W),	//lw	x14,0(x15)
"h00e7a623".U(32.W),	//sw	x14,12(x15)
"h00c7a583".U(32.W),	//lw	x11,12(x15)
"h17d0006f".U(32.W),	//jal	x0,//<memcpy>
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<prvUnlockQueue>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00812423".U(32.W),	//sw	x8,8(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h00912223".U(32.W),	//sw	x9,4(x2)
"h01212023".U(32.W),	//sw	x18,0(x2)
"h00112623".U(32.W),	//sw	x1,12(x2)
"hf88ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h04544483".U(32.W),	//lbu	x9,69(x8)
"h02440913".U(32.W),	//addi	x18,x8,36
"h01849493".U(32.W),	//slli	x9,x9,0x18
"h4184d493".U(32.W),	//srai	x9,x9,0x18
"h04904463".U(32.W),	//blt	x0,x9,//<prvUnlockQueue+0x74>
"hfff00793".U(32.W),	//addi	x15,x0,-1
"h04f402a3".U(32.W),	//sb	x15,69(x8)
"hf98ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"hf64ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h04444483".U(32.W),	//lbu	x9,68(x8)
"h01040913".U(32.W),	//addi	x18,x8,16
"h01849493".U(32.W),	//slli	x9,x9,0x18
"h4184d493".U(32.W),	//srai	x9,x9,0x18
"h04904663".U(32.W),	//blt	x0,x9,//<prvUnlockQueue+0x9c>
"hfff00793".U(32.W),	//addi	x15,x0,-1
"h04f40223".U(32.W),	//sb	x15,68(x8)
"h00812403".U(32.W),	//lw	x8,8(x2)
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h00412483".U(32.W),	//lw	x9,4(x2)
"h00012903".U(32.W),	//lw	x18,0(x2)
"h01010113".U(32.W),	//addi	x2,x2,16
"hf60ff06f".U(32.W),	//jal	x0,//<vTaskExitCritical>
"h02442783".U(32.W),	//lw	x15,36(x8)
"hfa078ce3".U(32.W),	//beq	x15,x0,//<prvUnlockQueue+0x30>
"h00090513".U(32.W),	//addi	x10,x18,0
"hd38ff0ef".U(32.W),	//jal	x1,//<xTaskRemoveFromEventList>
"h00050463".U(32.W),	//beq	x10,x0,//<prvUnlockQueue+0x8c>
"he18ff0ef".U(32.W),	//jal	x1,//<vTaskMissedYield>
"hfff48493".U(32.W),	//addi	x9,x9,-1
"h01849493".U(32.W),	//slli	x9,x9,0x18
"h4184d493".U(32.W),	//srai	x9,x9,0x18
"hf95ff06f".U(32.W),	//jal	x0,//<prvUnlockQueue+0x2c>
"h01042783".U(32.W),	//lw	x15,16(x8)
"hfa078ae3".U(32.W),	//beq	x15,x0,//<prvUnlockQueue+0x54>
"h00090513".U(32.W),	//addi	x10,x18,0
"hd10ff0ef".U(32.W),	//jal	x1,//<xTaskRemoveFromEventList>
"h00050463".U(32.W),	//beq	x10,x0,//<prvUnlockQueue+0xb4>
"hdf0ff0ef".U(32.W),	//jal	x1,//<vTaskMissedYield>
"hfff48493".U(32.W),	//addi	x9,x9,-1
"h01849493".U(32.W),	//slli	x9,x9,0x18
"h4184d493".U(32.W),	//srai	x9,x9,0x18
"hf91ff06f".U(32.W),	//jal	x0,//<prvUnlockQueue+0x50>
//<xQueueGenericReset>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h01212823".U(32.W),	//sw	x18,16(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00912a23".U(32.W),	//sw	x9,20(x2)
"h01312623".U(32.W),	//sw	x19,12(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h00058913".U(32.W),	//addi	x18,x11,0
"h00051463".U(32.W),	//bne	x10,x0,//<xQueueGenericReset+0x28>
"heb9fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"heb4ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h04042983".U(32.W),	//lw	x19,64(x8)
"h03c42583".U(32.W),	//lw	x11,60(x8)
"h00042483".U(32.W),	//lw	x9,0(x8)
"h00098513".U(32.W),	//addi	x10,x19,0
"h79c000ef".U(32.W),	//jal	x1,//<__mulsi3>
"h00a487b3".U(32.W),	//add	x15,x9,x10
"h02042c23".U(32.W),	//sw	x0,56(x8)
"h00f42423".U(32.W),	//sw	x15,8(x8)
"h41350533".U(32.W),	//sub	x10,x10,x19
"hfff00793".U(32.W),	//addi	x15,x0,-1
"h00a48533".U(32.W),	//add	x10,x9,x10
"h04f40223".U(32.W),	//sb	x15,68(x8)
"h00942223".U(32.W),	//sw	x9,4(x8)
"h00a42623".U(32.W),	//sw	x10,12(x8)
"h04f402a3".U(32.W),	//sb	x15,69(x8)
"h04091063".U(32.W),	//bne	x18,x0,//<xQueueGenericReset+0xa8>
"h01042783".U(32.W),	//lw	x15,16(x8)
"h00078a63".U(32.W),	//beq	x15,x0,//<xQueueGenericReset+0x84>
"h01040513".U(32.W),	//addi	x10,x8,16
"hc7cff0ef".U(32.W),	//jal	x1,//<xTaskRemoveFromEventList>
"h00050463".U(32.W),	//beq	x10,x0,//<xQueueGenericReset+0x84>
"h00000073".U(32.W),	//ecall
"he88ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h01812403".U(32.W),	//lw	x8,24(x2)
"h01412483".U(32.W),	//lw	x9,20(x2)
"h01012903".U(32.W),	//lw	x18,16(x2)
"h00c12983".U(32.W),	//lw	x19,12(x2)
"h00100513".U(32.W),	//addi	x10,x0,1
"h02010113".U(32.W),	//addi	x2,x2,32
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h01040513".U(32.W),	//addi	x10,x8,16
"he71fe0ef".U(32.W),	//jal	x1,//<vListInitialise>
"h02440513".U(32.W),	//addi	x10,x8,36
"he69fe0ef".U(32.W),	//jal	x1,//<vListInitialise>
"hfcdff06f".U(32.W),	//jal	x0,//<xQueueGenericReset+0x84>
//<xQueueGenericCreate>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00912223".U(32.W),	//sw	x9,4(x2)
"h01212023".U(32.W),	//sw	x18,0(x2)
"h00112623".U(32.W),	//sw	x1,12(x2)
"h00812423".U(32.W),	//sw	x8,8(x2)
"h00050913".U(32.W),	//addi	x18,x10,0
"h00058493".U(32.W),	//addi	x9,x11,0
"h00051463".U(32.W),	//bne	x10,x0,//<xQueueGenericCreate+0x24>
"he01fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00048593".U(32.W),	//addi	x11,x9,0
"h00090513".U(32.W),	//addi	x10,x18,0
"h6f0000ef".U(32.W),	//jal	x1,//<__mulsi3>
"h00050413".U(32.W),	//addi	x8,x10,0
"h02048063".U(32.W),	//beq	x9,x0,//<xQueueGenericCreate+0x54>
"h00048593".U(32.W),	//addi	x11,x9,0
"h70c000ef".U(32.W),	//jal	x1,//<__udivsi3>
"h01250463".U(32.W),	//beq	x10,x18,//<xQueueGenericCreate+0x48>
"hdddfe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"hfb700793".U(32.W),	//addi	x15,x0,-73
"h0087f463".U(32.W),	//bgeu	x15,x8,//<xQueueGenericCreate+0x54>
"hdd1fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h04840513".U(32.W),	//addi	x10,x8,72
"h454000ef".U(32.W),	//jal	x1,//<pvPortMalloc>
"h00050413".U(32.W),	//addi	x8,x10,0
"h02050463".U(32.W),	//beq	x10,x0,//<xQueueGenericCreate+0x88>
"h00050793".U(32.W),	//addi	x15,x10,0
"h00048463".U(32.W),	//beq	x9,x0,//<xQueueGenericCreate+0x70>
"h04850793".U(32.W),	//addi	x15,x10,72
"h00f42023".U(32.W),	//sw	x15,0(x8)
"h03242e23".U(32.W),	//sw	x18,60(x8)
"h04942023".U(32.W),	//sw	x9,64(x8)
"h00100593".U(32.W),	//addi	x11,x0,1
"h00040513".U(32.W),	//addi	x10,x8,0
"hec1ff0ef".U(32.W),	//jal	x1,//<xQueueGenericReset>
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h00040513".U(32.W),	//addi	x10,x8,0
"h00812403".U(32.W),	//lw	x8,8(x2)
"h00412483".U(32.W),	//lw	x9,4(x2)
"h00012903".U(32.W),	//lw	x18,0(x2)
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<xQueueGenericSend>:
"hfc010113".U(32.W),	//addi	x2,x2,-64
"h02812c23".U(32.W),	//sw	x8,56(x2)
"h02912a23".U(32.W),	//sw	x9,52(x2)
"h03212823".U(32.W),	//sw	x18,48(x2)
"h02112e23".U(32.W),	//sw	x1,60(x2)
"h03312623".U(32.W),	//sw	x19,44(x2)
"h03412423".U(32.W),	//sw	x20,40(x2)
"h03512223".U(32.W),	//sw	x21,36(x2)
"h03612023".U(32.W),	//sw	x22,32(x2)
"h00c12623".U(32.W),	//sw	x12,12(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h00058913".U(32.W),	//addi	x18,x11,0
"h00068493".U(32.W),	//addi	x9,x13,0
"h00051463".U(32.W),	//bne	x10,x0,//<xQueueGenericSend+0x3c>
"hd45fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00091863".U(32.W),	//bne	x18,x0,//<xQueueGenericSend+0x4c>
"h04042783".U(32.W),	//lw	x15,64(x8)
"h00078463".U(32.W),	//beq	x15,x0,//<xQueueGenericSend+0x4c>
"hd35fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00200793".U(32.W),	//addi	x15,x0,2
"h00f49a63".U(32.W),	//bne	x9,x15,//<xQueueGenericSend+0x64>
"h03c42703".U(32.W),	//lw	x14,60(x8)
"h00100793".U(32.W),	//addi	x15,x0,1
"h00f70463".U(32.W),	//beq	x14,x15,//<xQueueGenericSend+0x64>
"hd1dfe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00000a13".U(32.W),	//addi	x20,x0,0
"h00200a93".U(32.W),	//addi	x21,x0,2
"hfff00993".U(32.W),	//addi	x19,x0,-1
"h01040b13".U(32.W),	//addi	x22,x8,16
"hd08ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h03842703".U(32.W),	//lw	x14,56(x8)
"h03c42783".U(32.W),	//lw	x15,60(x8)
"h00f76463".U(32.W),	//bltu	x14,x15,//<xQueueGenericSend+0x88>
"h05549e63".U(32.W),	//bne	x9,x21,//<xQueueGenericSend+0xe0>
"h00048613".U(32.W),	//addi	x12,x9,0
"h00090593".U(32.W),	//addi	x11,x18,0
"h00040513".U(32.W),	//addi	x10,x8,0
"hc29ff0ef".U(32.W),	//jal	x1,//<prvCopyDataToQueue>
"h02442783".U(32.W),	//lw	x15,36(x8)
"h00078663".U(32.W),	//beq	x15,x0,//<xQueueGenericSend+0xa8>
"h02440513".U(32.W),	//addi	x10,x8,36
"haf0ff0ef".U(32.W),	//jal	x1,//<xTaskRemoveFromEventList>
"h00050463".U(32.W),	//beq	x10,x0,//<xQueueGenericSend+0xb0>
"h00000073".U(32.W),	//ecall
"hcfcff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00100513".U(32.W),	//addi	x10,x0,1
"h03c12083".U(32.W),	//lw	x1,60(x2)
"h03812403".U(32.W),	//lw	x8,56(x2)
"h03412483".U(32.W),	//lw	x9,52(x2)
"h03012903".U(32.W),	//lw	x18,48(x2)
"h02c12983".U(32.W),	//lw	x19,44(x2)
"h02812a03".U(32.W),	//lw	x20,40(x2)
"h02412a83".U(32.W),	//lw	x21,36(x2)
"h02012b03".U(32.W),	//lw	x22,32(x2)
"h04010113".U(32.W),	//addi	x2,x2,64
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00c12783".U(32.W),	//lw	x15,12(x2)
"h00079863".U(32.W),	//bne	x15,x0,//<xQueueGenericSend+0xf4>
"hcc4ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00000513".U(32.W),	//addi	x10,x0,0
"hfc9ff06f".U(32.W),	//jal	x0,//<xQueueGenericSend+0xb8>
"h000a1663".U(32.W),	//bne	x20,x0,//<xQueueGenericSend+0x100>
"h01810513".U(32.W),	//addi	x10,x2,24
"hb64ff0ef".U(32.W),	//jal	x1,//<vTaskInternalSetTimeOutState>
"hcacff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"hef9fe0ef".U(32.W),	//jal	x1,//<vTaskSuspendAll>
"hc74ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h04444783".U(32.W),	//lbu	x15,68(x8)
"h01879793".U(32.W),	//slli	x15,x15,0x18
"h4187d793".U(32.W),	//srai	x15,x15,0x18
"h01379463".U(32.W),	//bne	x15,x19,//<xQueueGenericSend+0x120>
"h04040223".U(32.W),	//sb	x0,68(x8)
"h04544783".U(32.W),	//lbu	x15,69(x8)
"h01879793".U(32.W),	//slli	x15,x15,0x18
"h4187d793".U(32.W),	//srai	x15,x15,0x18
"h01379463".U(32.W),	//bne	x15,x19,//<xQueueGenericSend+0x134>
"h040402a3".U(32.W),	//sb	x0,69(x8)
"hc78ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00c10593".U(32.W),	//addi	x11,x2,12
"h01810513".U(32.W),	//addi	x10,x2,24
"ha85ff0ef".U(32.W),	//jal	x1,//<xTaskCheckForTimeOut>
"h04051c63".U(32.W),	//bne	x10,x0,//<xQueueGenericSend+0x19c>
"hc34ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h03842703".U(32.W),	//lw	x14,56(x8)
"h03c42783".U(32.W),	//lw	x15,60(x8)
"h02f71663".U(32.W),	//bne	x14,x15,//<xQueueGenericSend+0x180>
"hc54ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00c12583".U(32.W),	//lw	x11,12(x2)
"h000b0513".U(32.W),	//addi	x10,x22,0
"h9e8ff0ef".U(32.W),	//jal	x1,//<vTaskPlaceOnEventList>
"h00040513".U(32.W),	//addi	x10,x8,0
"hc71ff0ef".U(32.W),	//jal	x1,//<prvUnlockQueue>
"h831ff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"h02050063".U(32.W),	//beq	x10,x0,//<xQueueGenericSend+0x194>
"h00100a13".U(32.W),	//addi	x20,x0,1
"hef9ff06f".U(32.W),	//jal	x0,//<xQueueGenericSend+0x74>
"hc2cff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00040513".U(32.W),	//addi	x10,x8,0
"hc55ff0ef".U(32.W),	//jal	x1,//<prvUnlockQueue>
"h815ff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"hfe9ff06f".U(32.W),	//jal	x0,//<xQueueGenericSend+0x178>
"h00000073".U(32.W),	//ecall
"hfe1ff06f".U(32.W),	//jal	x0,//<xQueueGenericSend+0x178>
"h00040513".U(32.W),	//addi	x10,x8,0
"hc3dff0ef".U(32.W),	//jal	x1,//<prvUnlockQueue>
"hffcff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"hf45ff06f".U(32.W),	//jal	x0,//<xQueueGenericSend+0xec>
//<xQueueReceive>:
"hfc010113".U(32.W),	//addi	x2,x2,-64
"h02812c23".U(32.W),	//sw	x8,56(x2)
"h02912a23".U(32.W),	//sw	x9,52(x2)
"h02112e23".U(32.W),	//sw	x1,60(x2)
"h03212823".U(32.W),	//sw	x18,48(x2)
"h03312623".U(32.W),	//sw	x19,44(x2)
"h03412423".U(32.W),	//sw	x20,40(x2)
"h03512223".U(32.W),	//sw	x21,36(x2)
"h00c12623".U(32.W),	//sw	x12,12(x2)
"h00050413".U(32.W),	//addi	x8,x10,0
"h00058493".U(32.W),	//addi	x9,x11,0
"h00051463".U(32.W),	//bne	x10,x0,//<xQueueReceive+0x34>
"hba1fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00049863".U(32.W),	//bne	x9,x0,//<xQueueReceive+0x44>
"h04042783".U(32.W),	//lw	x15,64(x8)
"h00078463".U(32.W),	//beq	x15,x0,//<xQueueReceive+0x44>
"hb91fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h00000a13".U(32.W),	//addi	x20,x0,0
"hfff00993".U(32.W),	//addi	x19,x0,-1
"h02440a93".U(32.W),	//addi	x21,x8,36
"hb80ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h03842903".U(32.W),	//lw	x18,56(x8)
"h04090e63".U(32.W),	//beq	x18,x0,//<xQueueReceive+0xb4>
"h00048593".U(32.W),	//addi	x11,x9,0
"h00040513".U(32.W),	//addi	x10,x8,0
"hfff90913".U(32.W),	//addi	x18,x18,-1
"hb91ff0ef".U(32.W),	//jal	x1,//<prvCopyDataFromQueue>
"h03242c23".U(32.W),	//sw	x18,56(x8)
"h01042783".U(32.W),	//lw	x15,16(x8)
"h00078a63".U(32.W),	//beq	x15,x0,//<xQueueReceive+0x88>
"h01040513".U(32.W),	//addi	x10,x8,16
"h96cff0ef".U(32.W),	//jal	x1,//<xTaskRemoveFromEventList>
"h00050463".U(32.W),	//beq	x10,x0,//<xQueueReceive+0x88>
"h00000073".U(32.W),	//ecall
"hb78ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00100513".U(32.W),	//addi	x10,x0,1
"h03c12083".U(32.W),	//lw	x1,60(x2)
"h03812403".U(32.W),	//lw	x8,56(x2)
"h03412483".U(32.W),	//lw	x9,52(x2)
"h03012903".U(32.W),	//lw	x18,48(x2)
"h02c12983".U(32.W),	//lw	x19,44(x2)
"h02812a03".U(32.W),	//lw	x20,40(x2)
"h02412a83".U(32.W),	//lw	x21,36(x2)
"h04010113".U(32.W),	//addi	x2,x2,64
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00c12783".U(32.W),	//lw	x15,12(x2)
"h00079863".U(32.W),	//bne	x15,x0,//<xQueueReceive+0xc8>
"hb44ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00000513".U(32.W),	//addi	x10,x0,0
"hfcdff06f".U(32.W),	//jal	x0,//<xQueueReceive+0x90>
"h000a1663".U(32.W),	//bne	x20,x0,//<xQueueReceive+0xd4>
"h01810513".U(32.W),	//addi	x10,x2,24
"h9e4ff0ef".U(32.W),	//jal	x1,//<vTaskInternalSetTimeOutState>
"hb2cff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"hd79fe0ef".U(32.W),	//jal	x1,//<vTaskSuspendAll>
"haf4ff0ef".U(32.W),	//jal	x1,//<vTaskEnterCritical>
"h04444783".U(32.W),	//lbu	x15,68(x8)
"h01879793".U(32.W),	//slli	x15,x15,0x18
"h4187d793".U(32.W),	//srai	x15,x15,0x18
"h01379463".U(32.W),	//bne	x15,x19,//<xQueueReceive+0xf4>
"h04040223".U(32.W),	//sb	x0,68(x8)
"h04544783".U(32.W),	//lbu	x15,69(x8)
"h01879793".U(32.W),	//slli	x15,x15,0x18
"h4187d793".U(32.W),	//srai	x15,x15,0x18
"h01379463".U(32.W),	//bne	x15,x19,//<xQueueReceive+0x108>
"h040402a3".U(32.W),	//sb	x0,69(x8)
"haf8ff0ef".U(32.W),	//jal	x1,//<vTaskExitCritical>
"h00c10593".U(32.W),	//addi	x11,x2,12
"h01810513".U(32.W),	//addi	x10,x2,24
"h905ff0ef".U(32.W),	//jal	x1,//<xTaskCheckForTimeOut>
"h04051463".U(32.W),	//bne	x10,x0,//<xQueueReceive+0x160>
"h00040513".U(32.W),	//addi	x10,x8,0
"h9c1ff0ef".U(32.W),	//jal	x1,//<prvIsQueueEmpty>
"h02050663".U(32.W),	//beq	x10,x0,//<xQueueReceive+0x150>
"h00c12583".U(32.W),	//lw	x11,12(x2)
"h000a8513".U(32.W),	//addi	x10,x21,0
"h870ff0ef".U(32.W),	//jal	x1,//<vTaskPlaceOnEventList>
"h00040513".U(32.W),	//addi	x10,x8,0
"haf9ff0ef".U(32.W),	//jal	x1,//<prvUnlockQueue>
"heb8ff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"h00051463".U(32.W),	//bne	x10,x0,//<xQueueReceive+0x148>
"h00000073".U(32.W),	//ecall
"h00100a13".U(32.W),	//addi	x20,x0,1
"hf05ff06f".U(32.W),	//jal	x0,//<xQueueReceive+0x50>
"h00040513".U(32.W),	//addi	x10,x8,0
"haddff0ef".U(32.W),	//jal	x1,//<prvUnlockQueue>
"he9cff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"hfedff06f".U(32.W),	//jal	x0,//<xQueueReceive+0x148>
"h00040513".U(32.W),	//addi	x10,x8,0
"hacdff0ef".U(32.W),	//jal	x1,//<prvUnlockQueue>
"he8cff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"h00040513".U(32.W),	//addi	x10,x8,0
"h971ff0ef".U(32.W),	//jal	x1,//<prvIsQueueEmpty>
"hfc050ae3".U(32.W),	//beq	x10,x0,//<xQueueReceive+0x148>
"hf49ff06f".U(32.W),	//jal	x0,//<xQueueReceive+0xc0>
//<vPortSetupTimerInterrupt>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"hf14027f3".U(32.W),	//csrrs	x15,mhartid,x0
"h00f12623".U(32.W),	//sw	x15,12(x2)
"h00c12703".U(32.W),	//lw	x14,12(x2)
"h004017b7".U(32.W),	//lui	x15,0x401
"h80078793".U(32.W),	//addi	x15,x15,-2048 # 400800 <__stack_size+0x3fe800>
"h00f70733".U(32.W),	//add	x14,x14,x15
"h00371713".U(32.W),	//slli	x14,x14,0x3
"h800207b7".U(32.W),	//lui	x15,0x80020
"h14e7ae23".U(32.W),	//sw	x14,348(x15) # //<__freertos_irq_stack_top+0xffffe15c>
"h0200c6b7".U(32.W),	//lui	x13,0x200c
"hffc6a583".U(32.W),	//lw	x11,-4(x13) # 200bffc <__stack_size+0x2009ffc>
"hff86a783".U(32.W),	//lw	x15,-8(x13)
"hffc6a603".U(32.W),	//lw	x12,-4(x13)
"hfeb61ae3".U(32.W),	//bne	x12,x11,//<vPortSetupTimerInterrupt+0x2c>
"h0000c6b7".U(32.W),	//lui	x13,0xc
"h35068693".U(32.W),	//addi	x13,x13,848 # c350 <__stack_size+0xa350>
"h00d786b3".U(32.W),	//add	x13,x15,x13
"h00f6b833".U(32.W),	//sltu	x16,x13,x15
"h00d72023".U(32.W),	//sw	x13,0(x14)
"h00c805b3".U(32.W),	//add	x11,x16,x12
"h00b72223".U(32.W),	//sw	x11,4(x14)
"h00018737".U(32.W),	//lui	x14,0x18
"h6a070713".U(32.W),	//addi	x14,x14,1696 # 186a0 <__stack_size+0x166a0>
"h00e78733".U(32.W),	//add	x14,x15,x14
"h800206b7".U(32.W),	//lui	x13,0x80020
"h00f737b3".U(32.W),	//sltu	x15,x14,x15
"h16068693".U(32.W),	//addi	x13,x13,352 # //<__freertos_irq_stack_top+0xffffe160>
"h00c787b3".U(32.W),	//add	x15,x15,x12
"h00e6a023".U(32.W),	//sw	x14,0(x13)
"h00f6a223".U(32.W),	//sw	x15,4(x13)
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<xPortStartScheduler>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00012623".U(32.W),	//sw	x0,12(x2)
"h305027f3".U(32.W),	//csrrs	x15,mtvec,x0
"h00f12623".U(32.W),	//sw	x15,12(x2)
"h00c12783".U(32.W),	//lw	x15,12(x2)
"h0037f793".U(32.W),	//andi	x15,x15,3
"h00078463".U(32.W),	//beq	x15,x0,//<xPortStartScheduler+0x24>
"h9b1fe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"h800227b7".U(32.W),	//lui	x15,0x80022
"h00078793".U(32.W),	//addi	x15,x15,0 # //<__freertos_irq_stack_top+0x0>
"h00f7f793".U(32.W),	//andi	x15,x15,15
"h00078463".U(32.W),	//beq	x15,x0,//<xPortStartScheduler+0x38>
"h99dfe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"hf45ff0ef".U(32.W),	//jal	x1,//<vPortSetupTimerInterrupt>
"h000017b7".U(32.W),	//lui	x15,0x1
"h88078793".U(32.W),	//addi	x15,x15,-1920 # 880 <__stack_size-0x1780>
"h3047a073".U(32.W),	//csrrs	x0,mie,x15
"hec8fe0ef".U(32.W),	//jal	x1,//<xPortStartFirstTask>
"h01c12083".U(32.W),	//lw	x1,28(x2)
"h00000513".U(32.W),	//addi	x10,x0,0
"h02010113".U(32.W),	//addi	x2,x2,32
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<pvPortMalloc>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00812423".U(32.W),	//sw	x8,8(x2)
"h00112623".U(32.W),	//sw	x1,12(x2)
"h00912223".U(32.W),	//sw	x9,4(x2)
"h00f57793".U(32.W),	//andi	x15,x10,15
"h00050413".U(32.W),	//addi	x8,x10,0
"h00078a63".U(32.W),	//beq	x15,x0,//<pvPortMalloc+0x2c>
"hff057793".U(32.W),	//andi	x15,x10,-16
"h01078793".U(32.W),	//addi	x15,x15,16
"h02f57e63".U(32.W),	//bgeu	x10,x15,//<pvPortMalloc+0x60>
"h00078413".U(32.W),	//addi	x8,x15,0
"hbc9fe0ef".U(32.W),	//jal	x1,//<vTaskSuspendAll>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h1687a703".U(32.W),	//lw	x14,360(x15) # //<__freertos_irq_stack_top+0xffffe168>
"h16878793".U(32.W),	//addi	x15,x15,360
"h00071863".U(32.W),	//bne	x14,x0,//<pvPortMalloc+0x4c>
"h96418713".U(32.W),	//addi	x14,x3,-1692 # //<ucHeap+0x10>
"hff077713".U(32.W),	//andi	x14,x14,-16
"h00e7a023".U(32.W),	//sw	x14,0(x15)
"h00041e63".U(32.W),	//bne	x8,x0,//<pvPortMalloc+0x68>
"hd48ff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"h90dfe0ef".U(32.W),	//jal	x1,//<vApplicationMallocFailedHook>
"h00000493".U(32.W),	//addi	x9,x0,0
"h03c0006f".U(32.W),	//jal	x0,//<pvPortMalloc+0x98>
"h00000413".U(32.W),	//addi	x8,x0,0
"hfc9ff06f".U(32.W),	//jal	x0,//<pvPortMalloc+0x2c>
"h80020737".U(32.W),	//lui	x14,0x80020
"h16c70713".U(32.W),	//addi	x14,x14,364 # //<__freertos_irq_stack_top+0xffffe16c>
"h00072683".U(32.W),	//lw	x13,0(x14)
"h02f00613".U(32.W),	//addi	x12,x0,47
"h00868433".U(32.W),	//add	x8,x13,x8
"hfc866ae3".U(32.W),	//bltu	x12,x8,//<pvPortMalloc+0x50>
"hfc86f8e3".U(32.W),	//bgeu	x13,x8,//<pvPortMalloc+0x50>
"h0007a483".U(32.W),	//lw	x9,0(x15)
"h00872023".U(32.W),	//sw	x8,0(x14)
"h00d484b3".U(32.W),	//add	x9,x9,x13
"hd08ff0ef".U(32.W),	//jal	x1,//<xTaskResumeAll>
"hfc0480e3".U(32.W),	//beq	x9,x0,//<pvPortMalloc+0x54>
"h00c12083".U(32.W),	//lw	x1,12(x2)
"h00812403".U(32.W),	//lw	x8,8(x2)
"h00048513".U(32.W),	//addi	x10,x9,0
"h00412483".U(32.W),	//lw	x9,4(x2)
"h01010113".U(32.W),	//addi	x2,x2,16
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<vPortFree>:
"h00050463".U(32.W),	//beq	x10,x0,//<vPortFree+0x8>
"h8c1fe06f".U(32.W),	//jal	x0,//<vAssertCalled>
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<prvQueueSendTask>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h06400793".U(32.W),	//addi	x15,x0,100
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00912a23".U(32.W),	//sw	x9,20(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h00f12623".U(32.W),	//sw	x15,12(x2)
"hb39fe0ef".U(32.W),	//jal	x1,//<xTaskGetTickCount>
"h00a12423".U(32.W),	//sw	x10,8(x2)
"h80020437".U(32.W),	//lui	x8,0x80020
"h00100493".U(32.W),	//addi	x9,x0,1
"h01400593".U(32.W),	//addi	x11,x0,20
"h00810513".U(32.W),	//addi	x10,x2,8
"he34ff0ef".U(32.W),	//jal	x1,//<xTaskDelayUntil>
"h17042503".U(32.W),	//lw	x10,368(x8) # //<__freertos_irq_stack_top+0xffffe170>
"h00000693".U(32.W),	//addi	x13,x0,0
"h00000613".U(32.W),	//addi	x12,x0,0
"h00c10593".U(32.W),	//addi	x11,x2,12
"haf9ff0ef".U(32.W),	//jal	x1,//<xQueueGenericSend>
"hfe9500e3".U(32.W),	//beq	x10,x9,//<prvQueueSendTask+0x28>
"h86dfe0ef".U(32.W),	//jal	x1,//<vAssertCalled>
"hfd9ff06f".U(32.W),	//jal	x0,//<prvQueueSendTask+0x28>
//<prvQueueReceiveTask>:
"hfe010113".U(32.W),	//addi	x2,x2,-32
"h00812c23".U(32.W),	//sw	x8,24(x2)
"h00912a23".U(32.W),	//sw	x9,20(x2)
"h00112e23".U(32.W),	//sw	x1,28(x2)
"h80020437".U(32.W),	//lui	x8,0x80020
"h06400493".U(32.W),	//addi	x9,x0,100
"h17042503".U(32.W),	//lw	x10,368(x8) # //<__freertos_irq_stack_top+0xffffe170>
"hfff00613".U(32.W),	//addi	x12,x0,-1
"h00c10593".U(32.W),	//addi	x11,x2,12
"hc71ff0ef".U(32.W),	//jal	x1,//<xQueueReceive>
"h00c12783".U(32.W),	//lw	x15,12(x2)
"hfe9796e3".U(32.W),	//bne	x15,x9,//<prvQueueReceiveTask+0x18>
"h815fe0ef".U(32.W),	//jal	x1,//<vToggleLED>
"h00012623".U(32.W),	//sw	x0,12(x2)
"hfe1ff06f".U(32.W),	//jal	x0,//<prvQueueReceiveTask+0x18>
//<main_blinky>:
"hff010113".U(32.W),	//addi	x2,x2,-16
"h00000613".U(32.W),	//addi	x12,x0,0
"h00400593".U(32.W),	//addi	x11,x0,4
"h00100513".U(32.W),	//addi	x10,x0,1
"h00112623".U(32.W),	//sw	x1,12(x2)
"h9f5ff0ef".U(32.W),	//jal	x1,//<xQueueGenericCreate>
"h800207b7".U(32.W),	//lui	x15,0x80020
"h16a7a823".U(32.W),	//sw	x10,368(x15) # //<__freertos_irq_stack_top+0xffffe170>
"h04050863".U(32.W),	//beq	x10,x0,//<main_blinky+0x70>
"h800205b7".U(32.W),	//lui	x11,0x80020
"h80002537".U(32.W),	//lui	x10,0x80002
"h00000793".U(32.W),	//addi	x15,x0,0
"h00200713".U(32.W),	//addi	x14,x0,2
"h00000693".U(32.W),	//addi	x13,x0,0
"h04000613".U(32.W),	//addi	x12,x0,64
"h00858593".U(32.W),	//addi	x11,x11,8 # //<__freertos_irq_stack_top+0xffffe008>
"he5c50513".U(32.W),	//addi	x10,x10,-420 # //<__freertos_irq_stack_top+0xfffdfe5c>
"h858ff0ef".U(32.W),	//jal	x1,//<xTaskCreate>
"h800205b7".U(32.W),	//lui	x11,0x80020
"h80002537".U(32.W),	//lui	x10,0x80002
"h00000793".U(32.W),	//addi	x15,x0,0
"h00100713".U(32.W),	//addi	x14,x0,1
"h00000693".U(32.W),	//addi	x13,x0,0
"h04000613".U(32.W),	//addi	x12,x0,64
"h00c58593".U(32.W),	//addi	x11,x11,12 # //<__freertos_irq_stack_top+0xffffe00c>
"he0850513".U(32.W),	//addi	x10,x10,-504 # //<__freertos_irq_stack_top+0xfffdfe08>
"h834ff0ef".U(32.W),	//jal	x1,//<xTaskCreate>
"hae4ff0ef".U(32.W),	//jal	x1,//<vTaskStartScheduler>
"h0000006f".U(32.W),	//jal	x0,//<main_blinky+0x70>
//<_init>:
"h800007b7".U(32.W),	//lui	x15,0x80000
"h58878793".U(32.W),	//addi	x15,x15,1416 # //<__freertos_irq_stack_top+0xfffde588>
"h30579073".U(32.W),	//csrrw	x0,mtvec,x15
"h000027b7".U(32.W),	//lui	x15,0x2
"h88878793".U(32.W),	//addi	x15,x15,-1912 # 1888 <__stack_size-0x778>
"h30079073".U(32.W),	//csrrw	x0,mstatus,x15
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<__clzsi2>:
"h000107b7".U(32.W),	//lui	x15,0x10
"h02f57463".U(32.W),	//bgeu	x10,x15,//<__clzsi2+0x2c>
"h0ff00793".U(32.W),	//addi	x15,x0,255
"h02000713".U(32.W),	//addi	x14,x0,32
"h06a7e263".U(32.W),	//bltu	x15,x10,//<__clzsi2+0x74>
"h0001e797".U(32.W),	//auipc	x15,0x1e
"h0d478793".U(32.W),	//addi	x15,x15,212 # //<__clz_tab>
"h00a78533".U(32.W),	//add	x10,x15,x10
"h00054503".U(32.W),	//lbu	x10,0(x10)
"h40a70533".U(32.W),	//sub	x10,x14,x10
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h010007b7".U(32.W),	//lui	x15,0x1000
"h02f57263".U(32.W),	//bgeu	x10,x15,//<__clzsi2+0x54>
"h0001e797".U(32.W),	//auipc	x15,0x1e
"h0b478793".U(32.W),	//addi	x15,x15,180 # //<__clz_tab>
"h01055513".U(32.W),	//srli	x10,x10,0x10
"h00a78533".U(32.W),	//add	x10,x15,x10
"h00054503".U(32.W),	//lbu	x10,0(x10)
"h01000713".U(32.W),	//addi	x14,x0,16
"h40a70533".U(32.W),	//sub	x10,x14,x10
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h0001e797".U(32.W),	//auipc	x15,0x1e
"h09478793".U(32.W),	//addi	x15,x15,148 # //<__clz_tab>
"h01855513".U(32.W),	//srli	x10,x10,0x18
"h00a78533".U(32.W),	//add	x10,x15,x10
"h00054503".U(32.W),	//lbu	x10,0(x10)
"h00800713".U(32.W),	//addi	x14,x0,8
"h40a70533".U(32.W),	//sub	x10,x14,x10
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h0001e797".U(32.W),	//auipc	x15,0x1e
"h07478793".U(32.W),	//addi	x15,x15,116 # //<__clz_tab>
"h00855513".U(32.W),	//srli	x10,x10,0x8
"h00a78533".U(32.W),	//add	x10,x15,x10
"h00054503".U(32.W),	//lbu	x10,0(x10)
"h01800713".U(32.W),	//addi	x14,x0,24
"h40a70533".U(32.W),	//sub	x10,x14,x10
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<__mulsi3>:
"h00050613".U(32.W),	//addi	x12,x10,0
"h00000513".U(32.W),	//addi	x10,x0,0
"h0015f693".U(32.W),	//andi	x13,x11,1
"h00068463".U(32.W),	//beq	x13,x0,//<__mulsi3+0x14>
"h00c50533".U(32.W),	//add	x10,x10,x12
"h0015d593".U(32.W),	//srli	x11,x11,0x1
"h00161613".U(32.W),	//slli	x12,x12,0x1
"hfe0596e3".U(32.W),	//bne	x11,x0,//<__mulsi3+0x8>
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<__divsi3>:
"h06054063".U(32.W),	//blt	x10,x0,//<__umodsi3+0x10>
"h0605c663".U(32.W),	//blt	x11,x0,//<__umodsi3+0x20>
//<__udivsi3>:
"h00058613".U(32.W),	//addi	x12,x11,0
"h00050593".U(32.W),	//addi	x11,x10,0
"hfff00513".U(32.W),	//addi	x10,x0,-1
"h02060c63".U(32.W),	//beq	x12,x0,//<__udivsi3+0x44>
"h00100693".U(32.W),	//addi	x13,x0,1
"h00b67a63".U(32.W),	//bgeu	x12,x11,//<__udivsi3+0x28>
"h00c05863".U(32.W),	//bge	x0,x12,//<__udivsi3+0x28>
"h00161613".U(32.W),	//slli	x12,x12,0x1
"h00169693".U(32.W),	//slli	x13,x13,0x1
"hfeb66ae3".U(32.W),	//bltu	x12,x11,//<__udivsi3+0x18>
"h00000513".U(32.W),	//addi	x10,x0,0
"h00c5e663".U(32.W),	//bltu	x11,x12,//<__udivsi3+0x38>
"h40c585b3".U(32.W),	//sub	x11,x11,x12
"h00d56533".U(32.W),	//or	x10,x10,x13
"h0016d693".U(32.W),	//srli	x13,x13,0x1
"h00165613".U(32.W),	//srli	x12,x12,0x1
"hfe0696e3".U(32.W),	//bne	x13,x0,//<__udivsi3+0x2c>
"h00008067".U(32.W),	//jalr	x0,0(x1)
//<__umodsi3>:
"h00008293".U(32.W),	//addi	x5,x1,0
"hfb5ff0ef".U(32.W),	//jal	x1,//<__udivsi3>
"h00058513".U(32.W),	//addi	x10,x11,0
"h00028067".U(32.W),	//jalr	x0,0(x5)
"h40a00533".U(32.W),	//sub	x10,x0,x10
"h00b04863".U(32.W),	//blt	x0,x11,//<__umodsi3+0x24>
"h40b005b3".U(32.W),	//sub	x11,x0,x11
"hf9dff06f".U(32.W),	//jal	x0,//<__udivsi3>
"h40b005b3".U(32.W),	//sub	x11,x0,x11
"h00008293".U(32.W),	//addi	x5,x1,0
"hf91ff0ef".U(32.W),	//jal	x1,//<__udivsi3>
"h40a00533".U(32.W),	//sub	x10,x0,x10
"h00028067".U(32.W),	//jalr	x0,0(x5)
//<__modsi3>:
"h00008293".U(32.W),	//addi	x5,x1,0
"h0005ca63".U(32.W),	//blt	x11,x0,//<__modsi3+0x18>
"h00054c63".U(32.W),	//blt	x10,x0,//<__modsi3+0x20>
"hf79ff0ef".U(32.W),	//jal	x1,//<__udivsi3>
"h00058513".U(32.W),	//addi	x10,x11,0
"h00028067".U(32.W),	//jalr	x0,0(x5)
"h40b005b3".U(32.W),	//sub	x11,x0,x11
"hfe0558e3".U(32.W),	//bge	x10,x0,//<__modsi3+0xc>
"h40a00533".U(32.W),	//sub	x10,x0,x10
"hf61ff0ef".U(32.W),	//jal	x1,//<__udivsi3>
"h40b00533".U(32.W),	//sub	x10,x0,x11
"h00028067".U(32.W),	//jalr	x0,0(x5)
//<memcpy>:
"h00a5c7b3".U(32.W),	//xor	x15,x11,x10
"h0037f793".U(32.W),	//andi	x15,x15,3
"h00c508b3".U(32.W),	//add	x17,x10,x12
"h06079263".U(32.W),	//bne	x15,x0,//<memcpy+0x70>
"h00300793".U(32.W),	//addi	x15,x0,3
"h04c7fe63".U(32.W),	//bgeu	x15,x12,//<memcpy+0x70>
"h00357793".U(32.W),	//andi	x15,x10,3
"h00050713".U(32.W),	//addi	x14,x10,0
"h06079863".U(32.W),	//bne	x15,x0,//<memcpy+0x90>
"hffc8f613".U(32.W),	//andi	x12,x17,-4
"hfe060793".U(32.W),	//addi	x15,x12,-32
"h08f76c63".U(32.W),	//bltu	x14,x15,//<memcpy+0xc4>
"h02c77c63".U(32.W),	//bgeu	x14,x12,//<memcpy+0x68>
"h00058693".U(32.W),	//addi	x13,x11,0
"h00070793".U(32.W),	//addi	x15,x14,0
"h0006a803".U(32.W),	//lw	x16,0(x13)
"h00478793".U(32.W),	//addi	x15,x15,4
"h00468693".U(32.W),	//addi	x13,x13,4
"hff07ae23".U(32.W),	//sw	x16,-4(x15)
"hfec7e8e3".U(32.W),	//bltu	x15,x12,//<memcpy+0x3c>
"hfff60793".U(32.W),	//addi	x15,x12,-1
"h40e787b3".U(32.W),	//sub	x15,x15,x14
"hffc7f793".U(32.W),	//andi	x15,x15,-4
"h00478793".U(32.W),	//addi	x15,x15,4
"h00f70733".U(32.W),	//add	x14,x14,x15
"h00f585b3".U(32.W),	//add	x11,x11,x15
"h01176863".U(32.W),	//bltu	x14,x17,//<memcpy+0x78>
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h00050713".U(32.W),	//addi	x14,x10,0
"hff157ce3".U(32.W),	//bgeu	x10,x17,//<memcpy+0x6c>
"h0005c783".U(32.W),	//lbu	x15,0(x11)
"h00170713".U(32.W),	//addi	x14,x14,1
"h00158593".U(32.W),	//addi	x11,x11,1
"hfef70fa3".U(32.W),	//sb	x15,-1(x14)
"hff1768e3".U(32.W),	//bltu	x14,x17,//<memcpy+0x78>
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h0005c683".U(32.W),	//lbu	x13,0(x11)
"h00170713".U(32.W),	//addi	x14,x14,1
"h00377793".U(32.W),	//andi	x15,x14,3
"hfed70fa3".U(32.W),	//sb	x13,-1(x14)
"h00158593".U(32.W),	//addi	x11,x11,1
"hf80780e3".U(32.W),	//beq	x15,x0,//<memcpy+0x24>
"h0005c683".U(32.W),	//lbu	x13,0(x11)
"h00170713".U(32.W),	//addi	x14,x14,1
"h00377793".U(32.W),	//andi	x15,x14,3
"hfed70fa3".U(32.W),	//sb	x13,-1(x14)
"h00158593".U(32.W),	//addi	x11,x11,1
"hfc079ae3".U(32.W),	//bne	x15,x0,//<memcpy+0x90>
"hf65ff06f".U(32.W),	//jal	x0,//<memcpy+0x24>
"h0045a683".U(32.W),	//lw	x13,4(x11)
"h0005a283".U(32.W),	//lw	x5,0(x11)
"h0085af83".U(32.W),	//lw	x31,8(x11)
"h00c5af03".U(32.W),	//lw	x30,12(x11)
"h0105ae83".U(32.W),	//lw	x29,16(x11)
"h0145ae03".U(32.W),	//lw	x28,20(x11)
"h0185a303".U(32.W),	//lw	x6,24(x11)
"h01c5a803".U(32.W),	//lw	x16,28(x11)
"h00d72223".U(32.W),	//sw	x13,4(x14)
"h0205a683".U(32.W),	//lw	x13,32(x11)
"h00572023".U(32.W),	//sw	x5,0(x14)
"h01f72423".U(32.W),	//sw	x31,8(x14)
"h01e72623".U(32.W),	//sw	x30,12(x14)
"h01d72823".U(32.W),	//sw	x29,16(x14)
"h01c72a23".U(32.W),	//sw	x28,20(x14)
"h00672c23".U(32.W),	//sw	x6,24(x14)
"h01072e23".U(32.W),	//sw	x16,28(x14)
"h02d72023".U(32.W),	//sw	x13,32(x14)
"h02470713".U(32.W),	//addi	x14,x14,36
"h02458593".U(32.W),	//addi	x11,x11,36
"hfaf768e3".U(32.W),	//bltu	x14,x15,//<memcpy+0xc4>
"hf19ff06f".U(32.W),	//jal	x0,//<memcpy+0x30>
//<memset>:
"h00f00313".U(32.W),	//addi	x6,x0,15
"h00050713".U(32.W),	//addi	x14,x10,0
"h02c37e63".U(32.W),	//bgeu	x6,x12,//<memset+0x44>
"h00f77793".U(32.W),	//andi	x15,x14,15
"h0a079063".U(32.W),	//bne	x15,x0,//<memset+0xb0>
"h08059263".U(32.W),	//bne	x11,x0,//<memset+0x98>
"hff067693".U(32.W),	//andi	x13,x12,-16
"h00f67613".U(32.W),	//andi	x12,x12,15
"h00e686b3".U(32.W),	//add	x13,x13,x14
"h00b72023".U(32.W),	//sw	x11,0(x14)
"h00b72223".U(32.W),	//sw	x11,4(x14)
"h00b72423".U(32.W),	//sw	x11,8(x14)
"h00b72623".U(32.W),	//sw	x11,12(x14)
"h01070713".U(32.W),	//addi	x14,x14,16
"hfed766e3".U(32.W),	//bltu	x14,x13,//<memset+0x24>
"h00061463".U(32.W),	//bne	x12,x0,//<memset+0x44>
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h40c306b3".U(32.W),	//sub	x13,x6,x12
"h00269693".U(32.W),	//slli	x13,x13,0x2
"h00000297".U(32.W),	//auipc	x5,0x0
"h005686b3".U(32.W),	//add	x13,x13,x5
"h00c68067".U(32.W),	//jalr	x0,12(x13)
"h00b70723".U(32.W),	//sb	x11,14(x14)
"h00b706a3".U(32.W),	//sb	x11,13(x14)
"h00b70623".U(32.W),	//sb	x11,12(x14)
"h00b705a3".U(32.W),	//sb	x11,11(x14)
"h00b70523".U(32.W),	//sb	x11,10(x14)
"h00b704a3".U(32.W),	//sb	x11,9(x14)
"h00b70423".U(32.W),	//sb	x11,8(x14)
"h00b703a3".U(32.W),	//sb	x11,7(x14)
"h00b70323".U(32.W),	//sb	x11,6(x14)
"h00b702a3".U(32.W),	//sb	x11,5(x14)
"h00b70223".U(32.W),	//sb	x11,4(x14)
"h00b701a3".U(32.W),	//sb	x11,3(x14)
"h00b70123".U(32.W),	//sb	x11,2(x14)
"h00b700a3".U(32.W),	//sb	x11,1(x14)
"h00b70023".U(32.W),	//sb	x11,0(x14)
"h00008067".U(32.W),	//jalr	x0,0(x1)
"h0ff5f593".U(32.W),	//andi	x11,x11,255
"h00859693".U(32.W),	//slli	x13,x11,0x8
"h00d5e5b3".U(32.W),	//or	x11,x11,x13
"h01059693".U(32.W),	//slli	x13,x11,0x10
"h00d5e5b3".U(32.W),	//or	x11,x11,x13
"hf6dff06f".U(32.W),	//jal	x0,//<memset+0x18>
"h00279693".U(32.W),	//slli	x13,x15,0x2
"h00000297".U(32.W),	//auipc	x5,0x0
"h005686b3".U(32.W),	//add	x13,x13,x5
"h00008293".U(32.W),	//addi	x5,x1,0
"hfa0680e7".U(32.W),	//jalr	x1,-96(x13)
"h00028093".U(32.W),	//addi	x1,x5,0 # //<memset+0xb4>
"hff078793".U(32.W),	//addi	x15,x15,-16
"h40f70733".U(32.W),	//sub	x14,x14,x15
"h00f60633".U(32.W),	//add	x12,x12,x15
"hf6c378e3".U(32.W),	//bgeu	x6,x12,//<memset+0x44>
"hf3dff06f".U(32.W),	//jal	x0,//<memset+0x14>
//<__clz_tab-0x10>:
//<__clz_tab>:
"h03030303".U(32.W),	//lb	x6,48(x6)
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
"h07070707".U(32.W),	//0x7070707
//<uxTopUsedPriority>:
//<pullNextTime>:
//<uxTimerIncrementsForOneTick>:
//<xISRStackTop>:
//<pxCurrentTCB>:
//<pxDelayedTaskList>:
//<pxOverflowDelayedTaskList>:
//<uxCurrentNumberOfTasks>:
//<uxDeletedTasksWaitingCleanUp>:
//<uxSchedulerSuspended>:
//<uxTaskNumber>:
//<uxTopReadyPriority>:
//<xIdleTaskHandle>:
//<xNextTaskUnblockTime>:
//<xNumOfOverflows>:
//<xPendedTicks>:
//<xSchedulerRunning>:
//<xTickCount>:
//<xYieldPending>:
//<pullMachineTimerCompareRegister>:
//<ullNextTime>:
//<pucAlignedHeap.0>:
//<xNextFreeByte>:
//<xQueue>:
//<pxReadyTasksLists>:
//<xDelayedTaskList1>:
//<xDelayedTaskList2>:
//<xPendingReadyList>:
//<xSuspendedTaskList>:
//<xTasksWaitingTermination>:
//<ucHeap>:
//<__freertos_irq_stack_top-0x2000>:
//<.comment>:
//<.debug_frame>:

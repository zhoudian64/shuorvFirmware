RISCV_ARCH := rv32i
RISCV_ABI := ilp32
RISCV_MCMODEL := medlow


TARGET = firmware


CFLAGS += -DSIMULATION
CFLAGS += -Os
ASM_SRCS += ../Kernel/portable/GCC/RISC-V/portASM.S
#LDFLAGS +=
INCLUDES += -I. -I../Kernel/portable/GCC/RISC-V -I../Kernel/include
INCLUDES += -I./include

C_SRCS := \
	main.c \
	../Kernel/list.c \
	../Kernel/tasks.c \
	../Kernel/queue.c \
	../Kernel/portable/GCC/RISC-V/port.c \
	../Kernel/portable/MemMang/heap_1.c \
	./tasks/main_blinky.c \


COMMON_DIR = ..
include ../init.mk

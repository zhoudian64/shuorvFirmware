f = open("firmware/firmware.bin", "rb")
rom = open("rom.scala", "w")
last_inst_address = 0x80002298
byte = f.read(1)
count = 0
make_word = 0
word = ""
while byte and count <= last_inst_address:
    if make_word == 4:
        rom.write("\"h" + word + "\".U(32.W),\n")
        make_word = 0
        word = ""
    word = byte.hex() + word
    byte = f.read(1)
    count += 1
    make_word += 1
f.close()
rom.close()
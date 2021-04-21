import re

if __name__ == "__main__":
    dump = open("firmware/firmware.dump", "r")
    output = open("firmware/firmware.scala", "w")
    line_number = 0
    while True:
        line_number += 1
        line = dump.readline()
        code = re.findall("[0-9a-f]{8}:\t[0-9a-f]{8}\s.*|[0-9a-f]{8}\s<.*>:", line)
        if len(code):
            code = re.sub("[0-9a-f]{8}\s<", "//<",code[0])
            code = re.sub("[0-9a-f]{8}:\t", "\"h", code)
            code = re.sub("\s+\t", '\".U(32.W),\t//', code)
            # print(code)
            code = code + '\n'
            output.write(code)
        if not line:
            break
    dump.close()
    output.close()
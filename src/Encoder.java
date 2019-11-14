// Encoder class for the LC-3 assembler
// converts the human-readable instruction
// into its machine language equivalent

import java.util.*;

public class Encoder {

    // initialize opcode map
    public static Map<String, Integer> OP_MAP;
    static{
        Map<String, Integer> tmp = new HashMap<>();
        tmp.put("ADD",  0b0001);
        tmp.put("AND",  0b0101);
        tmp.put("BR",   0b0000);
        tmp.put("JMP",  0b1100);
        tmp.put("JSR",  0b0100);
        tmp.put("LD",   0b0010);
        tmp.put("LDI",  0b1010);
        tmp.put("LDR",  0b0110);
        tmp.put("LEA",  0b1110);
        tmp.put("NOT",  0b1001);
        tmp.put("RET",  0b1100);
        tmp.put("RTI",  0b1000);
        tmp.put("ST",   0b0011);
        tmp.put("STI",  0b1011);
        tmp.put("STR",  0b0111);
        tmp.put("TRAP", 0b1111);
        OP_MAP = Collections.unmodifiableMap(tmp);
    }
}

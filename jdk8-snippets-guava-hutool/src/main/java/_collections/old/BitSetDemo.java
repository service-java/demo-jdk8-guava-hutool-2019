package _collections.old;

import cn.hutool.core.lang.Console;

import java.util.BitSet;

public class BitSetDemo {

    public static void main(String args[]) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // datatype.set some bits
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        Console.log("bits1 -> {} \nbits2 -> {}", bits1, bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("bits2 AND bits1: " + bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("bits2 OR bits1: " + bits2);

        // XOR bits 异或
        bits2.xor(bits1);
        System.out.println("bits2 XOR bits1: " + bits2);
    }
}

package _bai.file_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tmp {


    private static Scanner input;
    private static Scanner in;

    public static void main(String[] args) throws FileNotFoundException {
        input = new Scanner(System.in);
        String n1 = input.nextLine();
        String n2 = input.nextLine();
        in = new Scanner(new File(n1));
        String s1 = in.nextLine();
        String s2 = s1.toUpperCase();//转成大写
        PrintWriter output = new PrintWriter(n2);
        output.println(s2);
        output.close();
    }

}

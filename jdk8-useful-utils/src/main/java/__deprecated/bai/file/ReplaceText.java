package __deprecated.bai.file;
/**
 * 骆金参
 * 附加题
 * 参考 http://wenku.baidu.com/link?url=I1gcFiUnG2_DX-gkEbYuOuoDIf55QJRhzFGjLW0hOLsyjJ8XfuIt-zUGFq6iAAnnSqWTxy7f9ZH-XXej827Xitev3NL-NbZutaeCtEpjzZK
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText "
                    + "sourceFile targetFile oldStr newStr");
            System.exit(0);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(0);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(0);
        }

        // Create input and output files
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);
        while (input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(args[2], args[3]);
            output.println(s2);
        }
        input.close();
        output.close();
    }
}


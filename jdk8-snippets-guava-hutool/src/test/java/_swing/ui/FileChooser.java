package _swing.ui;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileChooser {
    public static void main(String[] args) throws IOException {

        JFileChooser fileChooser = new JFileChooser();
        //fileChooser.setCurrentDirectory(new File("D:\\"));

        int status = fileChooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile =
                    fileChooser.getSelectedFile();
            String filename = selectedFile.getPath();
            JOptionPane.showMessageDialog(null,
                    "You selected " + filename);
            //Desktop.getDesktop().open(new File(filename));
        }


    }

}

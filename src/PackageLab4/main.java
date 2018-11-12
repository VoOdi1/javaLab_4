package PackageLab4;

import java.io.*;
import static PackageLab4.copyFile.*;

class main {

    public static void main(String[] args) throws IOException {

        File f0 = new File("D:\\File.txt");
        File f1 = new File("D:\\newFile.txt");
        copyFile result = copyFileUsingStream(f0,f1);
        System.out.println("NanoTime:" +result.getTime());
        System.out.println("Speed:"+ result.getSpeed());
    }
}
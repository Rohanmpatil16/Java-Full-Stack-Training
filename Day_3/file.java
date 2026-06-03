package Day_3;

import java.io.*;
import java.util.Scanner;

public class file {

    public static void main(String[] args) throws IOException {

        File f = new File("student.txt");

//        f.createNewFile();

        FileWriter fw = new FileWriter("student.txt");

        fw.write("this is the student file..");

        fw.close();

        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {

            String data = sc.nextLine();

            System.out.println(data);
        }

        sc.close();
    }
}
/**
 Assignment 12-1
 Student Number : 109504501
 Course : CE1004-B
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.io.*;
public class A12_1_109504501 {
    public static void main(String[] args) throws IOException {
        String url_string = "https://www.csie.ncu.edu.tw/\n";

        // 創建文件
        File file = new File("A12_1_109504501.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        try{
            java.net.URL url = new java.net.URL(url_string);
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext()){
                String line = input.nextLine();
                writer.write(line + "\n");
            }
        }
        catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        }
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}


/**
 Practice 2
 Student Number : 109504501
 Course : CE1004-B
 */

import java.io.*;

public class P2_109504501 {
    public static void main(String[] args) throws IOException{


        // 讀取檔案
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        line = br.readLine();

        // 創建文件
        File file = new File("109504501.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        while(line != null){
            // 向文件寫入內容
            writer.write(line + "\n");
            line = br.readLine();
        }
        writer.flush();
        writer.close();
    }
}


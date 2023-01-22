/**
 Practice 6
 Student Number : 109504501
 Course : CE1004-B
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P6_109504501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> shelf = new ArrayList<String>(10);
        int n = 1;
        while(n != 0){
            String book = sc.nextLine();

            // exit
            if(book.equals("exit")){
                System.out.println(shelf);
                n = 0;
                break;
            }
            String[] split = book.split(" ");
            // 放書
            if(split[0].equals("1")){
                shelf.add(Integer.parseInt(split[1])-1, split[2]);
            }
            // 取書
            else if(split[0].equals("2")){
                int i = Integer.parseInt(split[1]) -1;
                shelf.remove(i);
            }
        }
    }
}

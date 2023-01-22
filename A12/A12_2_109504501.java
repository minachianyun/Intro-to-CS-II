/**
 Assignment 12-2
 Student Number : 109504501
 Course : CE1004-B
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class A12_2_109504501 {
    public static void main(String[] args){
        try{
            //從URL加載文檔，使用Jsoup.connect()方法從URL加載HTML。
            Document document = Jsoup.connect("https://www.csie.ncu.edu.tw/").get();
            List<String> myList = new ArrayList<String>();
            //儲存我們所要的標籤的數量
            int length = document.select("div.item-title").size();
            for(int i=0 ; i<length ; i++){
                myList.add(document.select("div.item-time").get(i).text() +"    "+document.select("div.item-title").get(i).text());
            }
            Collections.sort(myList, Collections.reverseOrder());
            for(int k = 0; k < length; k++){
                System.out.println(myList.get(k));
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


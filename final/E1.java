/**
 Exam 1
 Student Number : 109504501
 Course : CE1004-B
 */
package stu_109504501;

import java.io.IOException;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) throws IOException {
        int r = 1;
        while(r==1){
            Scanner sc = new Scanner(System.in);
            String input1 = sc.nextLine();
            if(input1.equals("0")){
                r = 0;
                break;
            }
            else{
                String input2 = sc.nextLine();
                String one[] = input1.split(" ");
                int year1 = Integer.parseInt(one[2]);
                int date1 = Integer.parseInt(one[1].replace(",",""));
                String two[] = input2.split(" ");
                int year2 = Integer.parseInt(two[2]);
                int date2 = Integer.parseInt(two[1].replace(",",""));

                int month1 = 0;
                if(one[0].equals("January")){
                    month1 = 1;
                }
                else if(one[0].equals("February")){
                    month1 = 2;
                }
                else if(one[0].equals("March")){
                    month1 = 3;
                }
                else if(one[0].equals("April")){
                    month1 = 4;
                }
                else if(one[0].equals("May")){
                    month1 = 5;
                }
                else if(one[0].equals("June")){
                    month1 = 6;
                }
                else if(one[0].equals("July")){
                    month1 = 7;
                }
                else if(one[0].equals("August")){
                    month1 = 8;
                }
                else if(one[0].equals("September")){
                    month1 = 9;
                }
                else if(one[0].equals("October")){
                    month1 = 10;
                }
                else if(one[0].equals("November")){
                    month1 = 11;
                }
                else if(one[0].equals("December")){
                    month1 = 12;
                }

                int month2 = 0;
                if(two[0].equals("January")){
                    month2 = 1;
                }
                else if(two[0].equals("February")){
                    month2 = 2;
                }
                else if(two[0].equals("March")){
                    month2 = 3;
                }
                else if(two[0].equals("April")){
                    month2 = 4;
                }
                else if(two[0].equals("May")){
                    month2 = 5;
                }
                else if(two[0].equals("June")){
                    month2 = 6;
                }
                else if(two[0].equals("July")){
                    month2 = 7;
                }
                else if(two[0].equals("August")){
                    month2 = 8;
                }
                else if(two[0].equals("September")){
                    month2 = 9;
                }
                else if(two[0].equals("October")){
                    month2 = 10;
                }
                else if(two[0].equals("November")){
                    month2 = 11;
                }
                else if(two[0].equals("December")){
                    month2 = 12;
                }

                int sum1 = 0;
                int sum2 = 0;

                for (int i = 1; i <= year1; i++){
                    if ((i%400) == 0){
                        sum1++;
                    }
                    else if ((i%4) == 0 && (i%100) != 0){
                        sum1++;
                    }
                    else{
                        continue;
                    }
                }
                if(month1 > 2){
                    sum1 = sum1 - 1;
                }

                for (int i = 1; i <= year2; i++){
                    if ((i%400) == 0){
                        sum2++;
                    }
                    else if ((i%4) == 0 && (i%100) != 0){
                        sum2++;
                    }
                    else{
                        continue;
                    }
                }
                if(month2 == 1){
                    sum2 = sum2 - 1;
                }
                else if(month2 == 2 && date2 < 29){
                    sum2 = sum2 - 1;
                }

                int l1 = 0;
                if ((year1%400) == 0){
                    l1 = 1;
                }
                else if ((year1%4) == 0 && (year1%100) != 0){
                    l1 = 1;
                }

                int l2 = 0;
                if ((year2%400) == 0){
                    l2 = 1;
                }
                else if ((year2%4) == 0 && (year2%100) != 0){
                    l2 = 1;
                }

                if(l1 == 1 && l2 == 1){
                    System.out.println(sum2-sum1 + 1);
                }
                else{
                    System.out.println(sum2-sum1 - 1);
                }
            }
        }
    }
}

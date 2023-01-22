/**
 Assignment 10
 Student Number : 109504501
 Course : CE1004-B
 */

import java.util.*;

public class A10_109504501_1 {
    static float div(float a, float b){
        if(b == 0){
            throw new IllegalArgumentException("分母不能為0");
        }
        else if(a!=(int)a || b!=(int)b){
            throw new IllegalArgumentException("輸入為非整數");
        }
        else if(a<0 || b<0){
            throw new IllegalArgumentException("分子或分母為負數了");
        }
        else{
            return a/b;
        }
    }
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            try{
                System.out.println(div(a, b));
                break;
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

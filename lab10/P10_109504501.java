/**
 Practice 10
 Student Number : 109504501
 Course : CE1004-B
 */
import java.util.Scanner;

class drink{
    public int amount;
    public int order;
    public drink(){
        this.amount = 0;
        this.order = 0;
    }
}

public class P10_109504501 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        // 選擇功能
        int c;
        // 選擇飲料
        int cd;
        // 飲料數量
        int n;
        int b = 0;
        drink cola = new drink();
        drink green = new drink();
        drink lemon = new drink();
        drink mineral = new drink();
        while(true){
            System.out.println("(1)choose drinks (2)list (3)pay (4)exit");
            c = input.nextInt();
            // 1. choose drinks: 選擇飲料的品項和數量
            // 輸出以下提示
            // “choose drinks (drinks / amount)
            // (1)Cola (2)Green Tea (3)Lemon Tea (4)Mineral Water”
            if(c == 1){
                System.out.println("choose drinks (drinks / amount)\n(1)Cola (2)Green Tea (3)Lemon Tea (4)Mineral Water");
                // 接著輸入品項編號與數量 (中間有空格)
                // 若輸入 1 - 4 以外的品項編號，需輸出錯誤提示“invalid input”
                cd = input.nextInt(); // 選擇飲料
                n = input.nextInt();  // 飲料數量

                // cola
                if(cd == 1){
                    cola.amount += n;
                    if(cola.order==0){
                        if(green.order + lemon.order + mineral.order == 0){
                            cola.order = 1;
                        }else if(green.order + lemon.order + mineral.order == 1){
                            cola.order = 2;
                        }else if(green.order + lemon.order + mineral.order == 3){
                            cola.order = 3;
                        }else{
                            cola.order = 4;
                        }
                    }
                }
                // green tea
                else if(cd == 2){
                    green.amount += n;
                    if(green.order==0){
                        if(cola.order + lemon.order + mineral.order == 0){
                            green.order = 1;
                        }else if(cola.order + lemon.order + mineral.order == 1){
                            green.order = 2;
                        }else if(cola.order + lemon.order + mineral.order == 3){
                            green.order = 3;
                        }else{
                            green.order = 4;
                        }
                    }
                }
                // lemon tea
                else if(cd == 3){
                    lemon.amount += n;
                    if(lemon.order == 0){
                        if(green.order + cola.order + mineral.order == 0){
                            lemon.order = 1;
                        }else if(green.order + cola.order + mineral.order == 1){
                            lemon.order = 2;
                        }else if(green.order + cola.order + mineral.order == 3){
                            lemon.order = 3;
                        }else{
                            lemon.order = 4;
                        }
                    }
                }
                // mineral water
                else if(cd == 4){
                    mineral.amount += n;
                    if(mineral.order == 0){
                        if(green.order + lemon.order + cola.order == 0){
                            mineral.order = 1;
                        }else if(green.order + lemon.order + cola.order == 1){
                            mineral.order = 2;
                        }else if(green.order + lemon.order + cola.order == 3){
                            mineral.order = 3;
                        }else{
                            mineral.order = 4;
                        }
                    }
                }
                // invalid input
                else{
                    System.out.println("invalid input");
                }
            }
            // 2. list: 列出目前所選擇的所有品項和數量
            // 列出的排序方式是添加的順序
            // (先添加的品項在上，後添加的品項在下)
            // 重複添加的品項，依然會保持在原本的順位，而數量會疊加
            else if(c == 2){
                for(int i = 1; i <= 4; i++){
                    if(cola.order == i){
                        System.out.println("Cola " + cola.amount);
                    }
                    if(green.order == i){
                        System.out.println("Green Tea " + green.amount);
                    }
                    if(lemon.order == i){
                        System.out.println("Lemon Tea " + lemon.amount);
                    }
                    if(mineral.order == i){
                        System.out.println("Mineral Water " + mineral.amount);
                    }
                }
            }
            // 3. pay: 顯示總價，接著付費，最後顯示找零金額
            else if(c == 3){
                int sum = 0;
                int p; // 付的錢
                sum += cola.amount*30 + green.amount*25 + lemon.amount*29 + mineral.amount*20;
                System.out.println("total cost: " + sum + "\nplease pay: ");
                p = input.nextInt(); // 付的錢
                // 找完零錢後，輸出“thank you”，並結束程式
                if(p - sum >= 0){   // 找的錢
                    System.out.println("money change: " + (p - sum));
                    System.out.println("thank you");
                    b = 1;
                }
                // 若付費金額少於加總價格，需輸出錯誤提示“money not enough”
                else{
                    System.out.println("money not enough");
                }
                if(b == 1){
                    break;
                }
            }
            // 4. exit: 退出程式
            // 輸出提示“exit”，並結束程式
            else if(c == 4){
                System.out.println("exit");
                break;
            }
            // 若輸入1-4以外的功能選項,需輸出錯誤提示“invalid input”。
            else{
                System.out.println("invalid input");
            }
        }
    }
}
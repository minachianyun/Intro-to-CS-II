/**
 E1
 Student Number : 109504501
 Course : CE1004-B
 */
import java.util.ArrayList;
import java.util.Scanner;

public class E1{
    static private void outln( Object obj ) {
        System.out.println( obj.toString());

    }
    static private void out( Object obj ) {
        System.out.println( obj.toString());
    }

    static class ITEM {
        public int id ;
        public  String name ;
        public  int price;
        public  int count ;

        public ITEM( Scanner sc ) {
            out( "請輸入商品編號：" );
            id = getMath( sc , 1 , 9 );
            out( "請輸入商品名稱：" );
            while( true ) {
                name = sc.nextLine();
                if( name.length() > 0 )
                    if( name.length() <= 10 )
                        break ;
                out( "輸入錯誤，請重新輸入：" );
            }
            out( "請輸入商品價格：" );
            price = getMath( sc , 1 , 1000 );
            out( "請輸入購買數量：" );
            count = getMath( sc , 1 , 1000 );

            outln( "您的商品："+ name +"已添加到購物車" );

        }

        public String toString() {
            return "" + id + "\t\t\t" +
                    name + "\t\t\t" +
                    price + "\t\t\t" +
                    count ;
        }
    }

    static int getMath(  Scanner sc , int min , int max ) {
        while( true ) {
            try {
                String str = sc.nextLine() ;
                int ret = Integer.parseInt( str );
                if( ret >= min )
                    if(ret <= max )
                        return ret ;
            }
            catch( Exception e ) {
            }
            out( "輸入錯誤，請重新輸入：" );
        }
    }

    static ArrayList<ITEM> shopping = new ArrayList<>();

    // add
    static void Add(  Scanner sc ) {
        try {
            shopping.add( new ITEM( sc ));
            return ;
        }
        catch( Exception e ) {
        }
        out( "輸入錯誤，請重新輸入：" );
    }


    // query
    private static void Query( Scanner sc ) {
        int i ;
        outln( "  ============== 購物車內容如下 ============= " );
        outln( "  編號    名稱     價格       數量     " );
        for( i = 0 ; i < shopping.size(); ++i )
        {
            outln( shopping.get(i).toString());
        }
    }

    // update
    private static void Update( Scanner sc ) {
        out( "請輸入需要修改的商品編號：" );
        int id = getMath( sc , 0 , 9999999 );
        int i ;
        for( ITEM item : shopping ) {
            if(item.id == id ) {
                out( "請輸入數量：" ) ;
                int pp = getMath( sc , 1 , 1000 );
                item.count = pp ;
                Query( sc );
                return ;
            }
        }
        outln( "無此商品" );
    }

    // pay
    private static void Pay( Scanner sc ) {
        Query( sc );
        int total = 0 ;
        for( ITEM item : shopping )
            total += item.count * item.price ;
        outln( "訂單總金額" + total );
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        while( true ){
            outln( "選擇一指令：\n"
                    + "添加商品:add \n"
                    + "查詢購物車商品:query \n"
                    + "修改商品數量：update\n"
                    + "結算金額：pay");

            String sel = sc.nextLine();
            if( sel.compareTo( "exit" ) == 0 )
                break ;
            if( sel.compareTo( "add" ) == 0 )
                Add( sc ) ;
            else if( sel.compareTo( "query" ) == 0 )
                Query( sc ) ;
            else if( sel.compareTo( "update" ) == 0 )
                Update( sc ) ;
            else if( sel.compareTo( "pay" ) == 0 )
                Pay( sc ) ;
            else{
                System.out.println("沒有該功能！");
            }
        }
    }
}

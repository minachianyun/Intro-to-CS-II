/**
 E2
 Student Number : 109504501
 Course : CE1004-B
 */

public class E2 {
    static private void outln( Object obj ) {
        System.out.println( obj.toString());
    }
    static private void out( Object obj ) {
        System.out.print( obj.toString());
    }


    static class PP // 點
    {
        public int x ;
        public int y ;
        public PP( int ix , int iy )
        {
            x = ix ;
            y = iy ;
        }
    }

    static class RR // 圓
    {
        public PP pos  ;
        public int R ;
        public RR( int x , int y , int r )
        {
            pos = new PP( x , y );
            R = r ;
        }

        public int In( PP pp )
        {
            // len
            int dx = pos.x - pp.x ;
            int dy = pos.y - pp.y ;

            int len = ( dx * dx + dy * dy );
            return ( R * R ) - len ;
        }
    }

    public static void main( String[] args ) {

        /*
        [[1,1],[2,2],[3,3],[4,4],[5,5]]
        [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]
        [[0,1,0]]
         */
        int i , k ;
        int ret ;
        int a , b , c ;
        int count ;
        PP[] pBuf= new PP[5] ;
        pBuf[0] = new PP( 1 , 1 );
        pBuf[1] = new PP( 2 , 2 );
        pBuf[2] = new PP( 3 , 3 );
        pBuf[3] = new PP( 4 , 4 );
        pBuf[4] = new PP( 5 , 5 );

        RR [] rBuf = new RR[4] ;

        rBuf[0] = new RR( 1,2,2);
        rBuf[1] = new RR( 2,2,2 );
        rBuf[2] = new RR( 4,3,2 );
        rBuf[3] = new RR( 4,3,3 );

        count = 0 ;
        for( i = 0 ; i < rBuf.length ; ++ i ) {
            count = 0 ;
            a = b = c = 0 ;
            for( k = 0 ; k < pBuf.length ;++k )
            {
                ret = rBuf[i].In( pBuf[k] ) ;
                if( ret > 0 )
                    a ++ ;

            }
            out( "" + a + " " );
        }
        a = 0 ;
        b = 1 ;
        c = 0 ;
        // 相切tangency : 線與圓有一個交點
        // 相交intersect : 線與圓有兩個交點
        // 不相交disjoint : 線與圓有零個交點
        for( i = 0 ; i < rBuf.length ; ++ i ) {
            RR rr = rBuf[i] ;
            ret =  a * rr.pos.x + b * rr.pos.y + c  ;
            ret = rr.R - ret ;
            if( ret == 0 ){
                out( "tangency " ) ;
                //    a++ ;
            }else if( ret > 0 )
            {
                out( "intersect " ) ;
                //    b ++ ;
            } else if(ret < 0 )
            {
                out( "disjoint " ) ;
                //  c ++ ;
            }
        }
    }
}

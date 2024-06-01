public class Test02 {
    public static void main(String[] args) {
        int i = 10 ;
        System.out.println( i++ );//10  ,11  ,10
        System.out.println( ++i );//12  ,11  ,12
        System.out.println( --i );//11  ,9   ,11
        System.out.println( i-- );//11  ,9   ,11
        System.out.println( i );  //10  ,10  ,10
        System.out.println("----------------------");

        int j = 10 ;
        int x = j++ + ++j ;
        System.out.println( x );
        System.out.println("++++++++++++++++++++++");

        int b = 1 ;
        b = b++ ;
        System.out.println( b );//2
        //System.out.println( c );//1

        int q = 10 ;
        int w = 12 ;
                            //"q + w = 1012"
        System.out.println( "q + w = " + (q + w) );

        boolean lo = true ;
        //字符串不是8个基本数据类型之一
        //如果需要将任何数据类型转换成字符串类型,可以直接拼接一个空字符串
        String str = lo + "";
        System.out.println( str );

        System.out.println("5-5="+(5-5));//输出5-5=55
                           //"5-5=5"-5

        System.out.println( "2 * 10 = " + 2 * 10);

    }
}

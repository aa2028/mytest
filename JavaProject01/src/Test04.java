public class Test04 {

    public static void main(String[] args) {
        //短路与[&&] 真真为真 , 真假为假 , 假真为假 , 假假为假
        //1. 两边都是true，结果是true
        //2. 一边是false，结果是false
        System.out.println( 1 == 1 && 3 > 2 ); //true
        System.out.println( 10 != 10 && 100 == 100 );//false
        System.out.println( 9>=9 && 7>8 );//false
        System.out.println( 10 == 8 &&  9 >= 19 );//false
    
        boolean b = 19 > 19 && 38 < 45;
        System.out.println("b = " + b);

        //短路特点：符号左边是false，右边不再运算

        int x = 10 ;
        int y = 10 ;
        System.out.println( x != 10 && ++y == 10 );
        System.out.println("y = " + y);

    }
}

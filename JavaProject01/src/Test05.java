public class Test05 {
    public static void main(String[] args) {
        //短路或[||]: 真真为真 , 真假为真 , 假真为真 , 假假为假
        //1. 两边都是false，结果是false
        //2. 一边是true，结果是true

        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println(true || false);//true
        System.out.println(true || true );//true

        //短路特点： 符号左边是true，右边不再运算
        int a = 10 ;
        System.out.println( false || --a > 100  );

        System.out.println( a );

    }
}

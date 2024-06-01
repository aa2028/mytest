public class Test21 {
    public static void main(String[] args) {
        /*
 *****
 ****
 ***
 **
 *
        */
        //外层循环是打印行
        for (int i = 0; i < 5; i++) {
            //内层循环打印列
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 5-i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印九九乘法表

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print( j + " * " + i + " = " + i*j +"\t");
            }
            System.out.println();
        }
    }
}

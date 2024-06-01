public class Test20 {
    public static void main(String[] args) {
        //练习：使用嵌套循环，打印5*8的矩形
        //外层循环,循环5次
        for (int i = 0; i < 5; i++) {
            //内层循环, 循环8次
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();//打印一个换行符
        }

        int i = 0 ;
        while( i < 5 ){
            int j = 0 ;
            while(j < 8){
                System.out.print("*");
                j++;
            }
            System.out.println();//打印换行符
            i++;
        }


    }
}

public class Test17 {
    public static void main(String[] args) {

        /*int i = 0 ;
        int sum = 0 ;
        while( i <= 100 ){
            sum += i;
            //sum = sum + i ;
            i++;
        }
        System.out.println("sum = " + sum);*/


        //1 ~ 100累加求和 : 5050

        for(int i = 0;i < 10 ;i++){
            System.out.println("hello world" + i);

        }

        /*for (;;) {
            System.out.println("效率最高的无限循环");
        }*/
        System.out.println("------------------------------");
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}

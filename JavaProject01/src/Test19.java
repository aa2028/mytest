public class Test19 {
    public static void main(String[] args) {

        /*int a = 0 ;
        for (;;) {
            if(a == 6){
                break;
            }
            System.out.println("haha"+a);
            a++;
        }*/


        for (int i = 0; i < 10; i++) {
            if( i == 3 ){
                //break;//结束当前循环语句
                //continue;//结束本次循环,继续下一次的循环
                //return ;
            }
            System.out.println("hello"+i);
        }

        System.out.println("我是main方法的最后一句代码");
    }
}

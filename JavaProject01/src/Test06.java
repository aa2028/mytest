public class Test06 {
    public static void main(String[] args) {
        //1. ! true 结果是false
        //2. ! false结果是true

        //非真即假, 非假即真
        System.out.println( !(100 == 100) );
        //System.out.println(!false);

        //真取: 左边值, 假取: 右边值
        int i = !(1==2) ? 100 : 200;

        System.out.println(i);

        int j = 3<=4 ? 500 : 600;
        System.out.println(j);

        int a = 10 ;
        int b = 15 ;
        int max = a > b ? a : b ;
        System.out.println("max = " + max);

        int x = 10 ;
        int y = 20 ;
        int z = 30 ;
        
        int u = (x > y ? x : y) > z ?  (x > y ? x : y) : z ;
        System.out.println("u = " + u);
    }
}

public class Test01 {
    public static void main(String[] args) {
        int i = 10 ;
        ++i ;
        //i = i + 1 ;
        System.out.println(i);
        System.out.println("-------------------");
        int a = 1;
        int b = a++;
        System.out.println(a);//计算结果是2
        System.out.println(b);//计算结果是1

    }
}

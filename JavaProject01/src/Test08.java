public class Test08 {
    public static void main(String[] args) {
        short s = 32767 ;
        //s = (short)(s + 1) ;
        s += 1 ;
        System.out.println(s);

        char c = 'A' ;
        System.out.println((int)c);

        int i = 97;
        System.out.println( (char) i );

        System.out.println( (int)'裴');
        //chat : 0 ~ 65535      2个字节
        //short:-32768 ~ 32767  2个字


        byte b1=1;
        byte b2=2;
        byte b3=1 + 2;
        //byte b4=b1 + b2;
        System.out.println(b3);
        //System.out.println(b4);

        int a = 10 ;

        while(a==10){
            System.out.println("haha");
        }

        System.out.println("我是while后面的代码");
    }
}

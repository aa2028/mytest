public class Test07 {

    public static void pei() {
        System.out.println("hello");
    }

    public static void myPrint(){
        System.out.println("打印myPrint");
    }
    public static void showName(){
        System.out.println("打印showName");
    }

    public static void methodName(){
        System.out.println("打印methodName");
    }

    public static void operator(){
        int a = 1 < 2 ? 500 : 600 ;
        System.out.println( a );
    }

    public static void main(String[] args) {
        showName();
        methodName();
        myPrint();
        operator();

    }

}




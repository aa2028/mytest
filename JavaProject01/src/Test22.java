public class Test22 {
    public static void main(String[] args) {
        /*1. 定义类 Test5
        2. 定义 main方法
        3. 定义变量jj为20,a为0,b为0
        4. 使用for循环,初始化值ii为0,当`ii<jj` 时进入循环,步进表达式为ii+=2,jj自减
        5. 循环内,使用if判断ii被3整除,ii赋值给a,并输出ii拼接"Hello"
        6. 不被3整除,ii赋值给b,并输出ii拼接"World"
        7. 循环外,按照格式,打印a与b的乘积*/


        int jj = 20;
        int a = 0;
        int b = 0;

        for (int ii = 0; ii < jj; ii+=2,jj--) {
            if(ii % 3 == 0){
                a = ii ;
                System.out.println(ii + "hello");
            }else{
                b = jj ;
                System.out.println(ii + "  world");
            }
        }

        System.out.println( a +"*"+ b + "=" + a*b );
    }
}


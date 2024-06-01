public class Test12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //定义变量，保存a和b的较大值
        int c;
        /*if(a > b) {
            c = a;
        } else {
            c = b;
        }*/

        //可以上述功能改写为三元运算符形式
        c = a > b ? a:b;

        System.out.println(c);
    }

}

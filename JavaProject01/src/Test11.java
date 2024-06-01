public class Test11 {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x >= -1 && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println("y的值是：" + y);

        int score = -1;
        if (score < 0 || score > 100) {
            System.out.println("你的成绩是错误的");
        } else if (score >= 90 && score <= 100) {
            System.out.println("你的成绩属于优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("你的成绩属于好");
        } else if (score >= 70 && score < 80) {
            System.out.println("你的成绩属于良");
        } else if (score >= 60 && score < 70) {
            System.out.println("你的成绩属于及格");
        } else {
            System.out.println("你的成绩属于不及格");
        }

        //季节 3 ~ 5 春天 6 ~ 8 夏天 9 ~ 11 季天 12 ~ 2 冬天  如果季节不是1 ~ 12之间.提示季节错误
        int i = 50;
        if (i >= 1 && i <= 12) {
            if (i >= 3 && i <= 5) {
                System.out.println("春天");
            } else if (i >= 6 && i <= 8) {
                System.out.println("夏天");
            } else if (i >= 9 && i <= 11) {
                System.out.println("秋天");
            } else {
                System.out.println("冬天");
            }
        } else {
            System.out.println("季节有误!");
        }

        if(1==1){
            if(2==3){

            }else{

            }
        }else{
            if(true){

            }else{

            }
        }
    }
}

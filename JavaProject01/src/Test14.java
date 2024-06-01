public class Test14 {
    public static void main(String[] args) {
        int score = 88;
        switch (score/10){
            case 9:
                System.out.println("你的成绩属于优秀");
                break;
            case 8:
                System.out.println("你的成绩属于好");
                break;
            case 7:
                System.out.println("你的成绩属于良");
                break;
            case 6:
                System.out.println("你的成绩属于极格");
                break;
            default:
                System.out.println("你的成绩属于不极格");
        }
    }
}

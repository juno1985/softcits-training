
public class ProgramSeason {
    public static void main(String[] args) {
        int month = 4; // 声明上演的月份变量
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("这是一部冬季剧");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("这是一部春季剧");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是一部夏季剧");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是一部秋季剧");
                break;
            default:
                System.out.println("这个是什么时候演的啊？");
                break;
        }
    }
}

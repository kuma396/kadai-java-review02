
public class Clock {

    public static void main(String[] args) {
        //
        int result = getSeconds(18, 32, 47);
        System.out.println("経過秒数：" + result + "秒");

    }

    public static int getSeconds(int hour, int minute, int second) {
        int result = (hour * 60 * 60) + (minute * 60) + second;
        return result;
    }

}

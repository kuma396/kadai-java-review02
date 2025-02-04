
public class Triangle {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int a = 5;
        int b = 9;
        int c = 9;

        if (a == b && a == c) {
            System.out.println("正三角形");
        } else if (b == c || a == c || a == b) {
                System.out.println("二等辺三角形");
            } else {
                System.out.println("不等辺三角形");
                }
            }
    }


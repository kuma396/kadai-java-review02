
public class Review01 {

    public static void main(String[] args) {
        int p = 1500;
        double tax = tax(p);
        System.out.println(p + "円の商品の税込価格は" + (int)(p + tax) + "円（消費税は" + (int)tax + "円）です。");

    }

    public static double tax(int p) {
        double tax = p * 0.1;
        return tax;
    }

}

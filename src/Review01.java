
public class Review01 {

    public static void main(String[] args) {
        int p = 1500;
        int tax = tax(p);
        System.out.println(p + "円の商品の税込価格は" + (p + tax) + "円（消費税は" + tax + "円）です。");

    }

    public static int tax(int p) {
        int tax = (int)(p * 0.1);
        return tax;
    }

}

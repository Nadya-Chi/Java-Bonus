public class Main {
    public static void main(String[] args) {
        int score = 10000;
        int transfer = 110000;
        int amount = transfer>10000 ? 1 : 0;
//        int amount;
//        if (transfer>10000) {
//            amount = 1;
//        } else {
//            amount = 0;
//        }
        int bonus = (amount * (transfer/100))/100;
        int sum = bonus + (score + transfer)/100;
        System.out.println(bonus);
        System.out.println(sum);
    }
}
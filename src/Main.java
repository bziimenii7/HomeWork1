public class Main {
    public static void main(String[] args) {
        int price = 200;

        int bonus;
        if (price > 20) {
            bonus = price / 20;
        } else {
            bonus = 0;
        }

        System.out.println("Куплен билет за: " + price + " рублей" + " (Начислено бонусов: " + bonus + ")");

    }
}

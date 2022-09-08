public class Main {
    public static void main(String[] args) {
        int ticket = 50000; // стоимость билета

        int mileCost = 20; // стоимость 1 мили

        int bonus = ticket / mileCost;

        System.out.println("Количество начисленных миль за купленный билет:" + bonus);
    }
}
public class Main {
    public static void main(String[] args) {
        int price = 50_000;
        int rubles_mile = 20;

        int bonus_mile = price / rubles_mile;
        System.out.println("Количество начисленных миль за купленный билет: " + bonus_mile);
        
    }
}
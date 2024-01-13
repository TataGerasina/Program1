public class Main {
    public static void main(String[] args) {
        int price = 50_000;
        int rublesMile = 20;

        int bonusMile = price / rublesMile;
        System.out.println("Количество начисленных миль за купленный билет: " + bonusMile);

    }
}
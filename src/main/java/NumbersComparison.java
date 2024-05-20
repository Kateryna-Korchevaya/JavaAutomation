public class NumbersComparison {
    public static void main(String[] args) {
        int number1 = 33;
        int number2 = 14;
        int number3 = 8;
        int number4 = 23;

        int sum1 = number1 + number2;
        int sum2 = number3 + number4;
        System.out.println("Перше порівняння: " + (sum1 > sum2));
        sum1++;
        sum2 -= 2;
        System.out.println("Друге порівняння: " + (sum1 > sum2));

        boolean isAnySumMultipleOfTwo = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println("Хоча б одна сума кратна 2: " + isAnySumMultipleOfTwo);


    }
}

package src;

public class Dividers {
    public static int getDividersSum(int number) {
        int dividersSum = 0;
        while (--number > 2) {
            if (number % 3 == 0 || number % 5 == 0) {
                dividersSum += number;
            }
        }
        return dividersSum;
    }
}
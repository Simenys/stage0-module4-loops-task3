package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (Math.min(first, second) == 0) {
            System.out.println(Math.max(first, second));
        }
        for (int i = Math.min(first, second); i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

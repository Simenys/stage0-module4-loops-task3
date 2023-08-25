package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String nine = "9";
        int answer = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            answer += Integer.parseInt(nine);
            nine += "9";

        } System.out.println(answer);
    }
}

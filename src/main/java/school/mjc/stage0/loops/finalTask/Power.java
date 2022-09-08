package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int res = numberToPrint;
        for (int i = 0; i < power - 1; i++){
            res *= numberToPrint;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}

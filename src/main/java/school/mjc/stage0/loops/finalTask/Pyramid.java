package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++){
            for (int j = 0; j < cathetusLength - i - 1; j++){
                System.out.print(" ");
            }
            String str = "";
            for (int j = i + 1; j > 1; j--){
                str += j;
            }
            System.out.print(str);
            System.out.print(1);
            System.out.println(new StringBuilder(str).reverse());


        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

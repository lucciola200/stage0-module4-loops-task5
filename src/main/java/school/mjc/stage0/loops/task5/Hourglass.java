package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            int backD = height - i + 1;
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == height || (j >= i && j <= backD) || (j >= backD && j <= i)) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

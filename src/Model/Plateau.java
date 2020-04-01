package Model;


public class Plateau {

    public static int[][]CaseMorp;

    public Plateau() {
        CaseMorp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {

                CaseMorp[i][y] = 0;
            }
        }

    }
}

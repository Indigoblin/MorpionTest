package Model;


public class Plateau {

    public static int[][][]CaseMorp;

    public Plateau() {
        CaseMorp = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    CaseMorp[i][j][k] = 0;
                }

            }
        }
    }
}

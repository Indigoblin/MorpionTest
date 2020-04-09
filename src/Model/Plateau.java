package Model;


public class Plateau {
    public static int[][]CaseMorp;

    public Plateau() {
        CaseMorp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CaseMorp[i][j] = 0;
            }
        }
    }

    public int returnCase(int i, int i1) {
        return i+i1;
    }
}

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


    // Personne sur le net semble expliquer comment on remplit un int avec deux arrays list, une seule oui mais deux, aucune mention

    //public int populateCase(int c1, int c2, int c3, int c4, int c5, int c6, int c7, int c8, int c9){
    //    CaseMorp = new int[][] {4,5,6,7,8};
    //}

    public int returnCase(int i, int i1) {
        return i+i1;
    }

    //public boolean checkPositionVert(boolean vertical){
    //
    //}
}

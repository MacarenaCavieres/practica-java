public class Arrays_tres {
    public static void main(String[] args) {
        int[][] array_bi = new int[3][4];
        array_bi[0][0] = 15;
        array_bi[0][1] = 18;
        array_bi[0][2] = 34;
        array_bi[0][3] = 54;

        array_bi[1][0] = 12;
        array_bi[1][1] = 76;
        array_bi[1][2] = 45;
        array_bi[1][3] = 75;

        array_bi[2][0] = 5;
        array_bi[2][1] = 72;
        array_bi[2][2] = 55;
        array_bi[2][3] = 6;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array_bi[i][j] + " ");

            }
            System.out.println();
        }

    }
}

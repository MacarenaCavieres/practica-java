public class Arrays_cuatro {
    public static void main(String[] args) {
        int[][] matriz = {
                { 10, 15, 12, 34 },
                { 23, 65, 28, 36 },
                { 18, 42, 21, 68 },
        };

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(matriz[i][j] + " ");
        // }
        // System.out.println();
        // }

        for (int[] row : matriz) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

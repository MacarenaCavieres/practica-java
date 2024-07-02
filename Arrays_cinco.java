public class Arrays_cinco {
    public static void main(String[] args) {
        double acc;
        double interes = 0.10;

        double[][] array_saldo = new double[6][5];

        for (int i = 0; i < 6; i++) {
            array_saldo[i][0] = 10000;
            acc = 10000;

            for (int j = 1; j < 5; j++) {
                acc += (acc * interes);
                array_saldo[i][j] = acc;
            }

            interes += 0.01;
        }
        for (int z = 0; z < 6; z++) {
            for (int x = 0; x < 5; x++) {
                System.out.printf("%1.2f", array_saldo[z][x]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

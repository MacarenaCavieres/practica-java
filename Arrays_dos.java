// import javax.swing.JOptionPane;

public class Arrays_dos {
    public static void main(String[] args) {
        // String paises[] = { "Chile", "Jamaica", "Canada", "Australlia", "Peru",
        // "Brasil", "Costa Rica", "Mexico" };

        // String[] paises = new String[8];
        // for (int i = 0; i < 8; i++) {
        // paises[i] = JOptionPane.showInputDialog("Ingresa un pais " + (i + 1));
        // }

        // for (String item : paises) {
        // System.out.println(item);
        // }

        int[] aleatorios = new int[150];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) Math.round(Math.random() * 100);
        }

        for (int num : aleatorios) {
            System.out.print(num + " - ");
        }
    }
}

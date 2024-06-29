import javax.swing.JOptionPane;

public class Bucles_cuatro {
    public static void main(String[] args) {
        String genero = "";
        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        int peso_ideal = 0;

        if (genero.equalsIgnoreCase("H")) {
            peso_ideal = altura - 110;
        } else {
            peso_ideal = altura - 120;
        }
        System.out.println("Tu peso ideal es " + peso_ideal + " kg");

    }
}

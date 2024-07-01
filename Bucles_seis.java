import javax.swing.JOptionPane;

public class Bucles_seis {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("El factorial de " + num + " es " + result);
    }
}

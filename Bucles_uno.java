import javax.swing.JOptionPane;

public class Bucles_uno {
    public static void main(String[] args) {
        String clave = "password";
        String password = "";

        while (!clave.equals(password)) {
            password = JOptionPane.showInputDialog("Introduce la contraseña");
            if (!clave.equals(password)) {
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta, acceso permitido");

    }
}

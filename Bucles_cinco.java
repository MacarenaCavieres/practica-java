import javax.swing.JOptionPane;

public class Bucles_cinco {
    public static void main(String[] args) {

        boolean arroba = false;
        String mail = JOptionPane.showInputDialog("Ingresa tu mail");
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
            }
        }

        if (arroba) {
            System.out.println("Mail correcto");
        } else {
            System.out.println("Mail incorrecto");
        }

    }

}

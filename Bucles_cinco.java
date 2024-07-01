import javax.swing.JOptionPane;

public class Bucles_cinco {
    public static void main(String[] args) {

        boolean arroba = false;
        int count = 0;
        boolean punto = false;
        String mail = JOptionPane.showInputDialog("Ingresa tu mail");
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
                count++;
            }

            if (mail.charAt(i) == '.') {
                punto = true;
            }

        }

        if (arroba && count == 1 && punto) {
            System.out.println("Mail correcto");
        } else {
            System.out.println("Mail incorrecto");
        }

    }

}

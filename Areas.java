import java.util.Scanner;
import javax.swing.JOptionPane;

public class Areas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
                double resultado = Math.pow(lado, 2);
                System.out.println("El area del cuadrado es " + resultado);
                break;
            case 2:
                int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del rectangulo"));
                int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo lado del rectangulo"));
                int resultado2 = lado1 * lado2;
                System.out.println("El area del rectangulo es " + resultado2);
                break;
            case 3:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
                double resultado3 = base * altura / 2;
                System.out.println("El area del triangulo es " + resultado3);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
                double resultado4 = Math.PI * Math.pow(radio, 2);
                System.out.print("El area del circulo es ");
                System.out.printf("%1.2f", resultado4);
                break;
            default:
                System.out.println("Debes ingresar un número del 1 al 4");
                break;
        }
    }
}

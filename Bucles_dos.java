import java.util.Scanner;

public class Bucles_dos {
    public static void main(String[] args) {
        int num_random = (int) (Math.random() * 10);
        System.out.println(num_random);
        int count = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 10");
        int num_user = entrada.nextInt();

        while (num_random != num_user) {
            if (num_random < num_user) {
                System.out.println("SkyNet eligio un número menor");
            } else if (num_random > num_user) {
                System.out.println("SkyNet eligio un número mayor");
            }
            System.out.println("Ingrese un número entre 0 y 10");
            num_user = entrada.nextInt();
            count++;
        }

        if (count > 1) {
            System.out.println("Correcto, adivinaste en " + count + " intentos");
        } else {
            System.out.println("Correcto, adivinaste en " + count + " intento");
        }

    }
}

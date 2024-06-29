import java.util.Scanner;

public class Bucles_tres {
    public static void main(String[] args) {
        int num_random = (int) (Math.random() * 10 + 1);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 100");
        int num_user = entrada.nextInt();
        int count = 1;

        do {
            count++;
            if (num_random > num_user) {
                System.out.println("SkyNet eligio un numero mayor");
            } else if (num_random < num_user) {
                System.out.println("SkyNet eligio un numero menor");
            }
            System.out.println("Ingrese un numero entre 1 y 100");
            num_user = entrada.nextInt();

        } while (num_random != num_user);

        if (count > 1) {
            System.out.println("Correcto, acertaste en " + count + " intentos");
        } else {
            System.out.println("Correcto, acertaste en " + count + " intento");
        }
    }
}

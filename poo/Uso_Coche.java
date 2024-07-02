package poo;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche Renault = new Coche(); // instanciar una clase
        System.out.println(Renault.get_largo());

        // Renault.color = "Azul";
        Renault.set_color();
        System.out.println(Renault.get_color());

    }
}

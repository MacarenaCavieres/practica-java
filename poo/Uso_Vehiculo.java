package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {
    public static void main(String[] args) {
        // Coche renault = new Coche(); // instanciar una clase
        // System.out.println(renault.get_datos());

        // renault.set_color(JOptionPane.showInputDialog("Ingrese el color"));
        // System.out.println(renault.get_color());

        // renault.set_asientos(JOptionPane.showInputDialog("Tiene asientos de
        // cuero?"));
        // System.out.println(renault.get_asientos());

        // renault.set_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        // System.out.println(renault.get_climatizador());

        // System.out.println(renault.get_peso_final());

        // System.out.println("El precio final del auto es de $" + renault.get_precio()
        // + " de pesos.");

        Coche auto1 = new Coche();
        auto1.set_color("Plateado");

        Furgoneta furgoneta1 = new Furgoneta(20, 40);
        furgoneta1.set_color("blanco");
        furgoneta1.set_asientos("si");
        furgoneta1.set_climatizador("si");
        System.out.println(
                furgoneta1.get_datos() + "\n" + furgoneta1.getDatosFurgoneta() + "\n" + furgoneta1.get_color() + "\n"
                        + furgoneta1.get_asientos());

    }

}

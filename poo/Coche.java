package poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    String color;
    int peso_final;
    boolean asientos;
    boolean climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String get_largo() {
        return "El largo del auto es de " + largo + " cm";
    }

    public void set_color() {
        color = "rojo";
    }

    public String get_color() {
        return "El color del auto es " + color;
    }

}

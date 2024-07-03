package poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_final;
    private boolean asientos;
    private boolean climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String get_datos() {
        return "El vehiculo tiene " + ruedas + " ruedas." + " Mide " + largo / 1000
                + " metros de largo, con un ancho de " + ancho
                + " cm y un peso base de " + peso_plataforma + " kg. Tiene un motor de " + motor + " cm cubicos";
    }

    public void set_color(String color_auto) {
        color = color_auto;
    }

    public String get_color() {
        return "El color del auto es " + color;
    }

    public void set_asientos(String asientos) {
        if (asientos.equalsIgnoreCase("si")) {
            this.asientos = true;
        } else {
            this.asientos = false;
        }
    }

    public String get_asientos() {
        if (asientos) {
            return "El auto tiene asientos de cuero";
        } else {
            return "El auto no tiene asientos de cuero";
        }
    }

    public void set_climatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String get_climatizador() {
        if (climatizador) {
            return "El auto tiene climatizador";
        } else {
            return "El auto tiene aire acondicionado";
        }
    }

    public String get_peso_final() {
        int peso_carroceria = 500;
        peso_final = peso_plataforma + peso_carroceria;

        if (asientos) {
            peso_final += 50;
        }

        if (climatizador) {
            peso_final += 20;
        }

        return "El peso del auto es " + peso_final + " kg.";

    }

    public int get_precio() {
        int precio_final = 10_000_000;

        if (asientos) {
            precio_final += 2_000_000;
        }

        if (climatizador) {
            precio_final += 1_000_000;
        }

        return precio_final;
    }

}

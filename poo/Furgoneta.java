package poo;

public class Furgoneta extends Coche {
    private int capacidad_carga;
    private int espacio_extra;

    public Furgoneta(int espacio_extra, int capacidad_carga) {
        super(); // llamar al constructor de la clase padre
        this.capacidad_carga = capacidad_carga;
        this.espacio_extra = espacio_extra;
    }

    public String getDatosFurgoneta() {
        return "La capacidad de carga es " + capacidad_carga + ". El espacio extra es " + espacio_extra;
    }
}

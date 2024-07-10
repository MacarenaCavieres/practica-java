package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

    public static void main(String[] args) {
        Persona[] lasPeople = new Persona[2];
        lasPeople[0] = new Empleado2("Anita Maria Muñoz", 2_000_000, 2020, 3, 17);
        lasPeople[1] = new Alumno("Jose Alcaino", "Programación");
        for (Persona p : lasPeople) {
            System.out.println("Nombre: " + p.getNombre() + " y " + p.getDescripcion());
        }
    }

}

abstract class Persona {
    public Persona(String nom) {
        nombre = nom;

    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion();

    private String nombre;

}

class Empleado2 extends Persona {
    public Empleado2(String nom, double sue, int year, int mes, int dia) {
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(year, mes - 1, dia);
        comienzoContrato = calendario.getTime();
        id = idSgte;
        idSgte++;

    }

    public String getDescripcion() {
        return "Este empleado tiene un ID = " + id + " con un sueldo de " + sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getComienzoContrato() {
        return comienzoContrato;
    }

    public int getId() {
        return id;
    }

    public void setSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

    private double sueldo;
    private Date comienzoContrato;
    private int id;
    private static int idSgte = 1;

}

class Alumno extends Persona {
    public Alumno(String nom, String carrera) {
        super(nom);
        this.carrera = carrera;

    }

    public String getDescripcion() {
        return "Este alumno esta estudiando " + carrera;
    }

    private String carrera;
}
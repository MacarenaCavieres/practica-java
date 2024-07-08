package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {
        // Empleado empleado1 = new Empleado("Angel Diaz", 1000000, 2022, 8, 14);
        // Empleado empleado2 = new Empleado("Marta Gomez", 1300000, 2023, 5, 29);
        // Empleado empleado3 = new Empleado("Maria Bryan", 1400000, 2021, 3, 2);

        // empleado1.setSueldo(5);
        // empleado2.setSueldo(5);
        // empleado3.setSueldo(5);

        // System.out.println("Nombre: " + empleado1.getNombre() + "; Sueldo: " +
        // empleado1.getSueldo()
        // + "; Contratacion: " + empleado1.getComienzoContrato());
        // System.out.println("Nombre: " + empleado2.getNombre() + "; Sueldo: " +
        // empleado2.getSueldo()
        // + "; Contratacion: " + empleado2.getComienzoContrato());
        // System.out.println("Nombre: " + empleado3.getNombre() + "; Sueldo: " +
        // empleado3.getSueldo()
        // + "; Contratacion: " + empleado3.getComienzoContrato());

        Empleado[] losEmpleados = new Empleado[3];
        losEmpleados[0] = new Empleado("Angel Diaz", 1000000, 2022, 8, 14);
        losEmpleados[1] = new Empleado("Marta Gomez", 1300000, 2023, 5, 29);
        losEmpleados[2] = new Empleado("Cindy Bryan", 1400000, 2021, 3, 2);

        for (Empleado empleado : losEmpleados) {
            empleado.setSueldo(5);
            System.out.println("Nombre: " + empleado.getNombre() + "; Sueldo: " + empleado.getSueldo()
                    + "; Contratacion: " + empleado.getComienzoContrato());
        }

    }

}

class Empleado {
    public Empleado(String nom, double sue, int year, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(year, mes - 1, dia);
        comienzoContrato = calendario.getTime();

    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getComienzoContrato() {
        return comienzoContrato;
    }

    public void setSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

    private String nombre;
    private double sueldo;
    private Date comienzoContrato;

}
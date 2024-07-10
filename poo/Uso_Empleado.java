package poo;

import java.util.Arrays;
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

        Jefatura jefe_RRHH = new Jefatura("Carlos Diaz", 2_000_000, 2020, 1, 11);
        jefe_RRHH.setIncentivo(300_000);

        // System.out.println(jefe_RRHH.getSueldo());

        Empleado[] losEmpleados = new Empleado[7];
        losEmpleados[0] = new Empleado("Angel Diaz", 1000000, 2022, 8, 14);
        losEmpleados[1] = new Empleado("Marta Gomez", 1300000, 2023, 5, 29);
        losEmpleados[2] = new Empleado("Cindy Bryan", 1400000, 2021, 3, 2);

        losEmpleados[3] = new Empleado("Esteban Valdebenito");
        losEmpleados[4] = new Empleado("jhonatan cifuentes");

        losEmpleados[5] = jefe_RRHH; // polimorfismo
        losEmpleados[6] = new Jefatura("Maria Fuentes", 2500_000, 2023, 11, 10);

        Jefatura jefa_finanzas = (Jefatura) losEmpleados[6];

        jefa_finanzas.setIncentivo(500000);

        System.out.println(jefa_finanzas.tomar_decisiones("dar mas trabajo"));

        Arrays.sort(losEmpleados);

        Empleado director_comercial = new Jefatura("Ximena Gutierrez", 3_400_000, 2014, 7, 30);
        Comparable ejemplo = new Empleado("Rosario", 2_300_000, 2024, 10, 22);
        if (director_comercial instanceof Empleado) {
            System.out.println("Es de tipo jefatura");
        }
        if (ejemplo instanceof Comparable) {
            System.out.println("Implementa la interfaz comparable");
        }

        for (Empleado empleado : losEmpleados) {
            empleado.setSueldo(5);
            System.out.println("Nombre: " + empleado.getNombre() + " ID: " + empleado.getId() + "; Sueldo: " +
                    empleado.getSueldo()
                    + "; Contratacion: " + empleado.getComienzoContrato());
        }

    }

}

class Empleado implements Comparable {
    public Empleado(String nom, double sue, int year, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(year, mes - 1, dia);
        comienzoContrato = calendario.getTime();
        id = idSgte;
        idSgte++;
    }

    public Empleado(String nom) {
        this(nom, 1000000, 2000, 01, 01);
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

    public int getId() {
        return id;
    }

    public void setSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    public int compareTo(Object miObj) {
        Empleado another = (Empleado) miObj;
        if (this.sueldo < another.sueldo) {
            return -1;
        }
        if (this.sueldo > another.sueldo) {
            return 1;
        }

        return 0;
    }

    private String nombre;
    private double sueldo;
    private Date comienzoContrato;
    private int id;
    private static int idSgte = 1;

}

class Jefatura extends Empleado implements Jefes {
    public Jefatura(String nom, double sue, int year, int mes, int dia) {
        super(nom, sue, year, mes, dia);
    }

    public void setIncentivo(double b) {
        incentivo = b;
    }

    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }

    public String tomar_decisiones(String decision) {
        return "Un miembro de la direccion ha tomado la decision de " + decision;
    }

    private double incentivo;
}

class Director extends Jefatura {
    public Director(String nom, double sue, int year, int mes, int dia) {
        super(nom, sue, year, mes, dia);
    }
}
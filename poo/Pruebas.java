package poo;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Angelo Marambio");
        Empleados trabajador2 = new Empleados("Cristina Soto");
        Empleados trabajador3 = new Empleados("Fabian Rodriguez");

        trabajador1.setSeccion("RRHH");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());
    }
}

class Empleados {

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administracion";
        id = idSgte;
        idSgte++;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDatos() {
        return "Nombre: " + nombre + "; Seccion: " + seccion + "; ID: " + id;
    }

    private final String nombre;
    private String seccion;
    private int id;
    private static int idSgte = 1;
}
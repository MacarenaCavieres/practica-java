package poo;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Angelo Marambio");
        Empleados trabajador2 = new Empleados("Cristina Soto");
        Empleados trabajador3 = new Empleados("Fabian Rodriguez");

        trabajador1.setSeccion("RRHH");

        System.out.println(trabajador1.getDatos() + "\n" + trabajador2.getDatos() + "\n" + trabajador3.getDatos());

        System.out.println(Empleados.getIdSgte());

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

    public static String getIdSgte() {
        return "El ID siguiente es " + idSgte;
    }

    private final String nombre;
    private String seccion;
    private int id;
    private static int idSgte = 1;
}
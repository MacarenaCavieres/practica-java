public class Cadenas_tres {
    public static void main(String[] args) {
        String alumno1 = "Wilson";
        String alumno2 = "wilson";

        boolean result = alumno1.equals(alumno2); //false
        boolean result2 = alumno1.equalsIgnoreCase(alumno2); // true

        System.out.println(result);
        System.out.println(result2);

    }
}

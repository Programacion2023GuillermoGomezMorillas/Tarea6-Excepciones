import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Exception {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(2);
        System.out.println(persona1.getEdad());

        persona1.setNombre("Guillermo Gomez Morillas");
        System.out.println(persona1.getNombre());

        persona1.setDni("74440739C");
        System.out.println(persona1.getDni());



        /*
        double n;
        int posicion=0;
        String cadena ;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        System.out.print("\n\nIntroduce la posición del array a modificar: ");
        cadena = sc.nextLine();
        try {
            posicion = Integer.parseInt(cadena);
            System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
            n = sc.nextDouble();
            valores[posicion] = n;
            System.out.println("\nPosición a modificar " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        }catch (NumberFormatException | InputMismatchException e){
        System.out.println("La posicion tiene que ser un numero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("La posicion del array debe existir");
        }

         */
    }
    public static void exception1(String t1){
        try {
        int aux2 = Integer.parseInt(t1);
            System.out.println(aux2+aux2);
        }catch (NumberFormatException e) {
            System.out.println("No se puede cambiar letras a numeros");
        }
    }

    public static void exception2(int divisor){
        try {
        System.out.println(3 / divisor);
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
    }

}

package Clase_5;

import java.util.Scanner;

public class EdadPerros{
    public void calcularEdad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la Edad de tu perro:");
        int edad = sc.nextInt();
        System.out.println("La edad de tu perro es: "+edad*7);

    }
}

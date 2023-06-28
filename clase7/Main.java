package clase7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numeros[] = new int[5];
        System.out.println("El programa te permite Guardar 5 numero");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Agrega el " + (i+1) + " numero a guardar:");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println("El numero en la posicion " + i + " es: " + numeros[i]);
        }

    }
}

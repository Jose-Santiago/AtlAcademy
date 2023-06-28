package clase7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Integer numeros[] = new Integer[5];
        System.out.println("El programa te permite Guardar 5 numero");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();

        System.out.println("Los numeros guardados son: " + numeros[0] + ", " +
                numeros[1] + ", " + numeros[2] + ", " + numeros[3] + ", " + numeros[4]);
    }
}

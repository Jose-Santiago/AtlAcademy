package clase6;

import java.util.Scanner;

public class SecuenciaNumeros {
    public SecuenciaNumeros(){
        int contador = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este program ate permite ingresar un numero y mostrar los numeros del 0 al número indicado:");
        System.out.println("ingresa un número:");
        num = sc.nextInt();
        while (contador <= num){
            System.out.println(contador);
            contador++;
        }
    }
}

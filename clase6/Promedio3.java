package clase6;

import java.util.Scanner;

public class Promedio3 {
    public Promedio3(){
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float promedio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("El programa te permite agregar 3 numeros para calcular el promedio:");
        System.out.println("Ingresa el primer numero:");
        num1 = sc.nextFloat();
        System.out.println("Ingresa el segundo numero:");
        num2 = sc.nextFloat();
        System.out.println("Ingresa el tercer numero:");
        num3 = sc.nextFloat();

        System.out.println("EL promedio de los numeros " + num1 + ", " + num2 + ", " + num3 + " es:");
        promedio = (num1 + num2 + num3)/3;
        System.out.println(promedio);
    }
}

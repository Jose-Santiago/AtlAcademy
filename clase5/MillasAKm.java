package clase5;

import java.util.Scanner;

public class MillasAKm {
    public void conversorKM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la Distancia en Millas");
        float millas = sc.nextFloat();
        float km = (float) (millas * 1.60934);

        System.out.println("La distancia de " + millas + " millas a KM es: " + km + "KM");
    }
}

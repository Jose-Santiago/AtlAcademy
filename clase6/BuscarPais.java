package clase6;

import java.util.Scanner;

public class BuscarPais {
    public BuscarPais(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del País que quieres encontrar:");
        String pais = sc.next();

        System.out.println("https://www.google.com/maps/search/" + pais);
    }

}

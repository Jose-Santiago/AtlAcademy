package clase5;

import java.util.Scanner;

public class Descuentos {
    public void CalcularDescuentos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto:");
        double precioOri = sc.nextDouble();

        System.out.println("Ingresa el descuento del producto en porcentaje:");
        double descuento = sc.nextDouble();
        double precioFinal = precioOri - (precioOri * (descuento/100));

        System.out.println("EL producto tiene un precio de: " + precioOri + " pesos, menos el descuento del " +
                descuento + ", El precio final es de: " + precioFinal);
    }
}

package clase6;

import java.util.Scanner;

public class JuegoPiedraPapelTijeras {
    public JuegoPiedraPapelTijeras(){
        System.out.println("Para Jugar vs la PC selecciona una opción:");
        System.out.println("1.- Piedra");
        System.out.println("2.- Papel");
        System.out.println("3.- Tijeras");

        Scanner sc =new Scanner(System.in);
        int opcUsuario = sc.nextInt();
        int opcPc = opcAleatoria();
        System.out.println("Numero elegido por Usuario: " + opcUsuario);
        System.out.println("Numero elegido por PC: " + opcPc);

            if (opcUsuario == 1 && opcPc == 2){
                System.out.println("Usuario eligio Piedra");
                System.out.println("Gana PC, eligio PAPEL");
            }else if (opcUsuario == 1 && opcPc == 3){
                System.out.println("Usuario GANA eligio Piedra");
                System.out.println("Pierde PC, eligio Tijeras");
            }

            if (opcUsuario == 2 && opcPc == 1){
                System.out.println("Usuario Gana eligio Papel");
                System.out.println("Pierde PC eligio Piedra");
            }else if (opcUsuario == 2 && opcPc == 3){
                System.out.println("Usuario PIERDE eligio Papel");
                System.out.println("GANA PC eligio Tijeras");
            }

            if (opcUsuario == 3 && opcPc ==1){
                System.out.println("Usuario PIERDE eligio Tijeras");
                System.out.println("GANA PC eligio Piedra");
            }else if (opcUsuario == 3 && opcPc == 2){
                System.out.println("Usuario GANA eligio Tijeras");
                System.out.println("PIERDE PC eligio Papel");
            }


        if (opcUsuario == opcPc){
            System.out.println("Eligieron la misma OPCION es UN empate Inetenta de Nuevo");
        }
    }


    // se obtienen numero aleatorio para opcion del programa
    public int opcAleatoria(){
        int n = (int) (Math.random() * (4 - 1)) + 1;
        return n;
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner leer =new Scanner(System.in);
     String palabra;
        System.out.println("Agregue una palabra: ");
     palabra=leer.nextLine();
        System.out.println("letras que tiene la palabra: ");
        System.out.println(palabra.length());

    }
}
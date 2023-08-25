import java.util.Scanner;

public class EjemplosParaPractica {

    public static void main(String[] args) {
        float x;
        int y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese x:");
        x = entrada.nextFloat();
        System.out.println("Ingrese y:");
        y = entrada.nextInt();
        System.out.println("x elevado a la y: " + Math.pow(x,y));

    }
}

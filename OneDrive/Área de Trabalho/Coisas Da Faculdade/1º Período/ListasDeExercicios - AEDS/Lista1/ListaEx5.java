import java.util.Scanner;
public class ListaEx5 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double i,n,r;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um número positivo e inteiro:");
        n = ent.nextDouble();
        r = 0;
        for(i = 1; i <= n; i++) {
            r = 1/i+r;
        }
        System.out.printf("O resultado é: %.0f", r);


    }
}
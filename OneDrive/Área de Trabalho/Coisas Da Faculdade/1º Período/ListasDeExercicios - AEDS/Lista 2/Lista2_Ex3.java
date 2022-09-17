import java.util.Scanner;

public class Lista2_Ex3 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num, val;
        double resultado, fatorial;
        System.out.println("Digite um número positivo e inteiro");
        num = entrada.nextInt();
        resultado = 1;
        fatorial = 1;
        for(val = 1;val <=num; val++)
        {
            fatorial = fatorial * 1 / val;
            resultado = resultado + fatorial;
        }
        System.out.println("O valor de E é: " + resultado);



    }
}

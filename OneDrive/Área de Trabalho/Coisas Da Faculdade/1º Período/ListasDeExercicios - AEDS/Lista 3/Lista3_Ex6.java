/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022

A função fatorial calcula o fatorial de determinado valor

 */




import java.util.Scanner;
public class Lista3_Ex6 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int val;
        double resultado = 1;
        System.out.println("Digite um valor inteiro e positivo");
        val = entrada.nextInt();
        resultado = fatorial(val);
        System.out.println("O valor de S é: " + resultado);

    }

    public static double fatorial(int val)
    {
        int num = 0;
        double resultado = 1, fatorial = 1;
        for(num = 1;num <=val; num++)
        {
           fatorial = fatorial / num;
           resultado = resultado + fatorial;

        }
         return resultado;
    }
}

/*
Autor: Vinicius Almeida de Avila
Data: 12/05


A função divisao acha a divisão de 2 números subtraindo os dois números

 */


import java.util.Scanner;
public class Lista4_Ex2 {

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numerador, denominador;
        System.out.println("Digite 2 números");
        numerador = entrada.nextInt();
        denominador = entrada.nextInt();
        divisao(numerador, denominador);
        System.out.println(divisao(numerador, denominador));
    }

    public static int divisao(int numerador, int denominador)
    {
        if (numerador < denominador)//se o numerador for menor que o denominador retorna 0
            return 0;
        else
        {//subtrai o numerador pelo denominador, ai quando o numerador for menor que o denominador fica 0, 0 vai somar + 1 pra quantas vezes ele repetiu
            return (divisao(numerador - denominador, denominador) + 1);
        }
    }
}

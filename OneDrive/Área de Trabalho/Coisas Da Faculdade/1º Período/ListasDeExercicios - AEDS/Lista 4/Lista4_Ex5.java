/*
Autor: Vinicius Almeida de Avila
Data: 13/05
 */

import java.util.Scanner;
public class Lista4_Ex5 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double val;
        double resultado = 1;
        System.out.println("Digite um número");
        val = entrada.nextInt();
        resultado = divisao(val);
        System.out.println("O valor de S é: " + resultado);

    }

    public static double fatorial(double n)
    {
        if (n == 1)//se n for igual a 1 retorna 1
        {
            return 1;
        } else {//calcula o fatorial
            return fatorial(n - 1) * n;
        }
    }

    public static double divisao(double n)
    {

        double S = 0 , resultado;
        for (double i = 1; i <= n; i++)//divide o fatorial por 1 ate chegar no 1
        {
            S = S + (1 / fatorial(i));
        }
        resultado = S;
        return resultado;
    }
}
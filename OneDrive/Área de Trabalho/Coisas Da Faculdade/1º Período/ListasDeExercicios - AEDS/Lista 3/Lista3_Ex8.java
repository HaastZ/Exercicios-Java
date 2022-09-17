/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022


A função ValorS calcula a fórmula S = 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... +(n2+1)/(n+3)

 */



import java.util.Scanner;
public class Lista3_Ex8 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;
        double S = 0;
        System.out.println("Digite um valor inteiro e positivo");
        N = entrada.nextInt();
        S = ValorS(N, S);
        System.out.println("O valor de S é: " + S);
    }

    public static double ValorS(int N, double S)
    {
       for(double i = 1;i <=N;i++)
       {
           S =  S + Math.pow(i, 2) + 1;
           S = S / (i + 3);
       }
       return (int) S;
    }
}


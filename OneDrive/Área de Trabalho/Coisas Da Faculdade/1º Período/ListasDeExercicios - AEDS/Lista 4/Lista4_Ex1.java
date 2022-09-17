/*
Autor: Vinicius Almeida de Avila
Data: 12/05

 */


import java.util.Scanner;
public class Lista4_Ex1
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        num = entrada.nextInt();
        SomaDigito(num);
        System.out.println("A soma dos digitos desse número é: " + (SomaDigito(num)));
    }


    public static int SomaDigito(int num)
    {
        if(num % 10 == 0)//se o resto da divisão de num por 10 for igual a 0 retorna o valor de num
            return num;
        else
            return (num % 10) + SomaDigito(num/10);//separa o resto da divisão por 10 e o resultado e soma os dois
    }
}
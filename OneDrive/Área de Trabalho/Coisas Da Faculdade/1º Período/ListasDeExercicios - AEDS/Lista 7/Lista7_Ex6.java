/*
Autor: Vinicius Almeida de Avila
Data: 16/06/2022
 */


import java.io.*;
import java.util.Scanner;
public class Lista7_Ex6 {


    public static void main(String[] args) throws IOException
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        int soma = 0;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        for(int i = 1;i<=num;i++)
        {
            if(num % i == 0)//se o resto da divisão por i(até chegar no numero que o usuario digitou) for igual a 0, ele é um divisor
            {
                System.out.println(i);//está printando todos os numeros que o resto é 0
                soma += i;//está somando todos esses numeros
            }
        }
        File arquivo = new File("C:\\arquivo.txt\\arquivo.txt");//está localizando o arquivo
        FileWriter arq = new FileWriter(arquivo);//está possibilitando escrever no arquivo
        arq.write("A soma dos divisores desse número é: " + Integer.toString(soma));//está convertendo inteiro para string e mostrando no arquivo a soma dos divisores do numero
        arq.close();//salvando o arquivo
        entrada.close();//salvando o arquivo
    }
}
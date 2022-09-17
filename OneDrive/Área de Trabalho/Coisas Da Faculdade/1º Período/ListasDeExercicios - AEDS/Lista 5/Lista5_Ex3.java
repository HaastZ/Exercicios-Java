/*
Autor: Vinicius Almeida de Avila
Data: 25/05/2022
 */

import java.util.Scanner;
public class Lista5_Ex3 {


    public static void main(String[] args)
    {
        int[] vetores;
        int[] vetorX = preecherVetor(10);//chamada da função preencher
        int[] vetorY = preecherVetor(10);// ele chama a função denovo com a mesma quantidade
        vetores = juntar(vetorX, vetorY);//passando dois valores para a função juntar
        imprimir(vetores);//chamada do método imprimir
    }
    public static void imprimir(int[] vetor)//método para imprimir na tela os números pares e impares
    {
        for(int i = 0;i<vetor.length;i++)
        {
            System.out.println(vetor[i]);
        }
    }


    public static int[] preecherVetor(int quantidade)//função para preencher um vetor
    {
        int[] vetorX = new int[quantidade];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os valores do vetor");
        for (int i = 0; i < vetorX.length; i++)
        {
            System.out.println("Digite o " + (i + 1) + "º: ");
            vetorX[i] = entrada.nextInt();
        }
        return vetorX;
    }

    public static int[] juntar(int[] vetor1, int[] vetor2)//função para juntar e somar o tamanho dos 2 vetores
    {
         int[] juntos = new int[vetor1.length + vetor2.length];//está criando o vetor juntos e passando para ele a soma dos dois vetores(20)
         int cont1 = 0;
         int cont2 = 0;
         for(int i = 0;i<juntos.length;i++)//para percorrer o tamanho do vetor juntos
         {
             if(i % 2 == 0)//numeros pares
             {
                 juntos[i] = vetor2[cont2];
                 cont2++;
             }
             else//numeros impares
             {
                 juntos[i] = vetor1[cont1];
                 cont1++;
             }
         }
         return juntos;//vai retornar o tamanho dos vetores juntos

    }
}


/*
Vinicius Almeida de Avila
Data: 28/05/2022
 */

import java.util.Scanner;
public class Lista5_Ex5 {


    public static void main(String[] args)
    {
        int linha = 4, coluna = 6;
        int[][] matrizA = preencher(linha,coluna);//chamada da função preencher passando uma matriz
        int[][] matrizB = preencher(linha,coluna);//chamada da função preencher passando outra matriz
        int[][] soma = soma(matrizA,linha,coluna,matrizB);//matriz para retornar a função soma
        int[][] diferenca = diferenca(matrizA,linha,coluna,matrizB);//matriz para retornar a função diferenca
        imprimir(soma,linha,coluna,diferenca);//chamada do método imprimir
    }

    public static void imprimir(int[][] matriz, int linha, int coluna, int[][] diferenca)//método para imprimir na tela as matrizes
    {
        System.out.println("*******MATRIZ S*******");
        for(int ln = 0;ln<linha;ln++)
        {
            for(int col = 0;col<coluna;col++)
            {
                System.out.println("A soma das matrizes é: " +matriz[ln][col]);
            }
        }
        System.out.println("*******FIM DA MATRIZ S*******\n");
        System.out.println("*******MATRIZ D*******");
        for(int ln = 0;ln<linha;ln++)
        {
            for(int col = 0;col<coluna;col++)
            {
                System.out.println("A diferença das matrizes é: " +diferenca[ln][col]);
            }
        }
        System.out.println("*******FIM DA MATRIZ D*******\n");
    }

    public static int[][] preencher(int linha, int coluna)//função para preencher uma matriz
    {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[linha][coluna];
        for (int ln = 0; ln < linha; ln++)
        {
            for (int col = 0; col < coluna; col++)
            {
                System.out.println("Digite o valor [" + ln + "][" + col + "]");
                matriz[ln][col] = entrada.nextInt();

            }
        }
        System.out.println("****Matriz B****");
        return matriz;
    }

    public static int[][] soma(int[][] matriz1, int linha, int coluna, int[][] matriz2)//função que soma as duas matrizes
    {
         int[][] soma = new int[linha][coluna];
         for(int i = 0;i<linha;i++)
         {
             for(int a = 0;a<coluna;a++)
             {
                 soma[i][a] = matriz1[i][a] + matriz2[i][a];
             }
         }
         return soma;
    }

    public static int[][] diferenca(int[][] matriz1, int linha, int coluna, int[][] matriz2)//função que mostra a diferença das duas matrizes
    {
        int[][] diferenca = new int[linha][coluna];
        for(int i = 0;i<linha;i++)
        {
            for(int a = 0;a<coluna;a++)
            {
                diferenca[i][a] = matriz1[i][a] - matriz2[i][a];
            }
        }
        return diferenca;
    }
}
/*
Autor: Vinicius Almeida de Avila
Data: 27/05/2022
 */

import java.util.Scanner;
public class Lista5_Ex4 {


    public static void main(String[] args)
    {
        int[][] matriz = preencher(5);//chamada da função preencher
        int soma2 = linha4(matriz,5);//variavel para retornar a função linha4
        System.out.println("A soma da linha 4 é " + soma2);//imprimir na tela
        int soma3 = coluna2(matriz,5);//variavel para retornar a função coluna2
        System.out.println("A soma da coluna 2 é " + soma3);//imprimir na tela
        int soma4 = diagonalPrincipal(matriz,5);//variavel para retornar a função diagonalPrincipal
        System.out.println("A soma da diagonal principal é " + soma4);//imprimir na tela
        int soma5 = diagonalSecundaria(matriz,5);//variavel para retornar a função diagonalSecundaria
        System.out.println("A soma da diagonal secundaria é " + soma5);//imprimir na tela
        int soma6 = somaTodos(matriz,5);//variavel para retornar a função somaTodos
        System.out.println("A soma de todos os elementos é " + soma6);//imprimir na tela
    }

    public static int[][] preencher(int tamanho)//função para preencher uma matriz
    {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[tamanho][tamanho];
        for(int ln = 0;ln < tamanho; ln++)
        {
            for(int col = 0;col < tamanho;col++)
            {
                System.out.println("Digite o valor [" + ln + "][" + col + "]");
                matriz[ln][col] = entrada.nextInt();

            }
        }
        return matriz;
    }

    public static int linha4(int[][] matriz,int tamanho)//função para somar os elementos da linha 4
    {
        int soma = 0;
        for(int ln = 0;ln< tamanho;ln++)
        {
            soma += matriz[3][ln];

        }
        return soma;
    }

    public static int coluna2(int[][] matriz,int tamanho)//função para somar os elementos da coluna2
    {
        int soma = 0;
        for(int col = 0;col<tamanho;col++)
        {
            soma += matriz[col][1];
        }

        return soma;
    }

    public static int diagonalPrincipal(int[][] matriz, int tamanho)//função para somar os elementos da diagonalprincipal
    {
        int soma = 0;
        for(int i = 0;i<tamanho;i++)
        {
            soma += matriz[i][i];
        }

        return soma;
    }

    public static int diagonalSecundaria(int[][] matriz,int tamanho)//função para somar os elementos da diagonalsecundaria
    {
        int soma = 0;
        for(int ln = 0;ln<tamanho;ln++)
        {
            for(int col = 0;col<tamanho;col++)
            {
                if(col + ln == 4)
                {
                    soma += matriz[ln][col];
                }
            }
        }
        return soma;
    }

    public static int somaTodos(int[][] matriz,int tamanho)//funçao para somar todos os elementos da matriz
    {
        int soma = 0;
        for(int ln = 0;ln<tamanho;ln++)
        {
            for(int col = 0;col<tamanho;col++)
            {
                soma += matriz[ln][col];
            }
        }
        return soma;

    }
}
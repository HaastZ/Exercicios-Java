/*
Autor: Vinicius Almeida de Avila
Data: 30/05/2022
 */

import java.util.Scanner;
public class Lista5_Ex6 {


    public static void main(String[] args)
    {
          int linha = 10, coluna = 10;
          int[][] matriz = preencher(linha,coluna);//chamada da função preencher
          int[][] linha2e8 = linha2e8(matriz,linha,coluna);//matriz para retornar a função linha2e8
          int[][] diagonal = diagonal(matriz,linha,coluna);//matriz para retornar a função diagonal
          int[][] coluna4e5 = coluna4e10(matriz,linha,coluna);//matriz para retornar a função coluna4e10
          int[][] linha5col10 = linha5coluna10(matriz,linha,coluna);//matriz para retornar a função linha5col10
          imprimir(linha2e8,linha,coluna);//chamada do método imprimir e imprime o retorno da função linha2e8
          imprimir(diagonal,linha,coluna);//chamada do método imprimir e imprime o retorno da função diagonal
          imprimir(coluna4e5,linha,coluna);//chamada do método imprimir e imprime o retorno da função coluna4e5
          imprimir(linha5col10,linha,coluna);//chamada do método imprimir e imprime o retorno da função linha5coluna10
    }

    public static void imprimir(int[][] matriz, int linha, int coluna)//método para imprimir na tela
    {
        System.out.println("****IMPRESSÃO DE MATRIZ****");
        for(int ln = 0;ln < linha;ln++)
        {
            for (int col = 0; col < coluna;col++)
            {
                System.out.println("A posição é  ["+ ln + "][" + col +"] = "  + matriz[ln][col]);
            }
        }
        System.out.println("****FIM DA IMPRESSÃO****\n");
    }

    public static int[][] preencher(int linha, int coluna)//função para preencher uma matriz
    {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[linha][coluna];//criando uma matriz vazia
        for (int ln = 0; ln < linha; ln++)
        {
            for (int col = 0; col < coluna; col++)
            {
                System.out.println("Digite o valor [" + ln + "][" + col + "]");
                matriz[ln][col] = entrada.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] linha2e8(int[][] matriz ,int linha, int coluna)//função está trocando a linha 2 pela linha 8
    {
        int[][] troca = new int[linha][coluna];//criando uma matriz vazia
        for(int i = 0;i<linha;i++)
        {
            for(int j = 0;j<coluna;j++)
            {
                troca[i][j] = matriz[i][j];
            }
        }
        for(int col = 0;col<coluna;col++)
        {
            troca[1][col] = matriz[7][col];
        }
        for(int col = 0;col<coluna;col++)
        {
            troca[7][col] = matriz[1][col];
        }
      return troca;
    }

    public static int[][] diagonal(int[][] matriz, int linha, int coluna)//função está trocando a diagonal principal com a secundaria
    {
        int col = 0, tamanho = linha;
        int[][] diagonal = new int[linha][coluna];//criando uma matriz vazia
        for(int i = 0;i<linha;i++)
        {
            for(int j = 0;j<coluna;j++)
            {
                diagonal[i][j] = matriz[i][j];
            }
        }
        for(int ln = 0; ln < linha;ln++)
        {
            diagonal[ln][col] = matriz[tamanho - 1][col];
            col++;
            tamanho--;
        }
        tamanho = linha;
        col = 0;
        for(int ln = 0;ln < linha;ln++)
        {
            diagonal[tamanho - 1][col] = matriz[ln][col];
            col++;
            tamanho--;
        }
        return diagonal;
    }

    public static int[][] coluna4e10(int[][] matriz, int linha, int coluna)//função está trocando a coluna 4 pela coluna 10
    {
          int[][] coluna4e10 = new int[linha][coluna];//criando uma matriz vazia
          for(int ln = 0;ln < linha;ln++)
          {
              for(int col = 0;col < coluna;col++)
              {
                  coluna4e10[ln][col] = matriz[ln][col];
              }
          }
          for(int ln = 0; ln < linha;ln++)
          {
              coluna4e10[4][ln] = matriz[coluna - 1][ln];
          }
          for(int ln = 0; ln < linha;ln++)
          {
              coluna4e10[coluna - 1][ln] = matriz[3][ln];
          }
          return coluna4e10;
    }


    public static int[][] linha5coluna10(int[][] matriz, int linha, int coluna)//função está trocando a linha 5 com a coluna 10
    {
        int[][] linha5col10 = new int[linha][coluna];//criando uma matriz vazia
        for(int ln = 0;ln < linha;ln++)
        {
            for(int col = 0;col < coluna;col++)
            {
                linha5col10[4][col] = matriz[9][ln];
            }
        }
        for(int i = 0;i < linha;i++)
        {
            for(int j = 0;j < coluna;j++)
            {
                linha5col10[9][i] = matriz[4][j];
            }
        }
        return linha5col10;
    }
}
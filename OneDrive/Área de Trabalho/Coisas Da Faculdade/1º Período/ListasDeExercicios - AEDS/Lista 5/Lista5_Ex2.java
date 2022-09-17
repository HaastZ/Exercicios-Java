/*
Autor: Vinicius Almeida de Avila
Data: 24/05/2022
 */

import java.util.Scanner;
public class Lista5_Ex2 {


    public static void main(String[] args)
    {
        int[] vetor = preecher(10);//chamando a função preencher
        int[] vetorNeg = numNegativos(vetor);//chamando a função numero negativos para retornar a função
        Imprimir(vetorNeg);//chamando o método imprimir
    }
       public static void Imprimir(int[] vetorNeg)//método para imprimir na tela os numeros negativos
       {
       for(int i = 0;i<vetorNeg.length;i++)
       {
        System.out.println("Valor negativo:" + vetorNeg[i]);
       }
       }

      public static int[] numNegativos(int[] vetor)//função para contar quantos numeros negativos tem
      {
          int contador = 0;
             for(int vet = 0; vet < vetor.length; vet++)
             {
                 if(vetor[vet] < 0)

                     contador++;
             }
             int[] vetorNegativo = new int[contador];
             int cont = 0;
             for(int i = 0; i<vetor.length; i++)
             {
                 if(vetor[i] < 0)
                 {
                     vetorNegativo[cont] = vetor[i];
                     cont++;
                 }

             }
             return vetorNegativo;

      }
      public static int[] preecher(int quantidade)//função para preencher um determinado vetor
      {
          int[] valores = new int[quantidade];
          Scanner entrada = new Scanner(System.in);
          System.out.println("Digite os valores");
          for(int i = 0; i <valores.length; i++)
          {
              System.out.println("Digite o " + (i + 1) + "º: ");
              valores[i] = entrada.nextInt();
          }
          entrada.close();
          return valores;

      }
    }

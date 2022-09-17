/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022


O método crescente imprime os numeros em ordem crescente

 */


import java.util.Scanner;
public class Lista3_Ex3 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int val1, val2, val3;
        char parar = 0;
          do {
              System.out.println("Digite 3 valores inteiros");
              val1 = entrada.nextInt();
              val2 = entrada.nextInt();
              val3 = entrada.nextInt();
              System.out.println("Digite (P) para parar e (C) para continuar");
              parar = entrada.next().charAt(0);
              crescente(val1, val2, val3);
          }while(parar != 'P');
    }


    public static void crescente(int val1, int val2, int val3)
    {
        if(val1 < val2 && val1 > val3)
        {
            System.out.println(" " + val3);
            System.out.println(" " + val1);
            System.out.println(" " + val2);
        }
        else if(val2 < val3 && val3 < val1)
        {
            System.out.println(" " + val2);
            System.out.println(" " + val3);
            System.out.println(" " + val1);
        }
        else if(val1 < val2 && val2 > val3)
        {
            System.out.println(" " + val1);
            System.out.println(" " + val3);
            System.out.println(" " + val2);
        }
        else if(val1 > val2 && val2 < val3)
        {
            System.out.println(" " + val2);
            System.out.println(" " + val1);
            System.out.println(" " + val3);
        }
        else if(val1 > val2 && val2 > val3)
        {
            System.out.println(" " + val3);
            System.out.println(" " + val2);
            System.out.println(" " + val1);
        }
        else if(val2 > val1 && val3 < val1)
        {
            System.out.println(" " + val2);
            System.out.println(" " + val1);
            System.out.println(" " + val3);
        }
        else
        {
            System.out.println(" " + val1);
            System.out.println(" " + val2);
            System.out.println(" " + val3);
        }

    }
}
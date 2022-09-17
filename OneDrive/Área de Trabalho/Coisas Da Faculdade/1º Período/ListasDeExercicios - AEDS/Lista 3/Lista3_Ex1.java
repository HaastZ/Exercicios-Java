/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022

O método nota calcula a média aritmetica e a média ponderada das notas dos alunos

*/


import java.util.Scanner;
public class Lista3_Ex1 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3;
        char parar = 0;
        do {
            System.out.println("Escreva a primeira nota do aluno");
            nota1 = entrada.nextInt();
            System.out.println("Escreva a segunda nota do aluno");
            nota2 = entrada.nextInt();
            System.out.println("Escreva a terceira nota do aluno");
            nota3 = entrada.nextInt();
            System.out.println("Digite (P) para parar e (C) para continuar");
            parar = entrada.next().charAt(0);
            nota(nota1, nota2, nota3);
        }while(parar != 'P');
    }


    public static void nota(int nota1, int nota2, int nota3)
    {

          Scanner entrada = new Scanner(System.in);
          int mediaAritmetica, mediaPonderada;
          char letra;
          System.out.println("Digite uma letra \n (A - Aritmética) \n ou \n (P - Ponderada)");
          letra = entrada.next().charAt(0);
          switch (letra)
          {
              case 'A'://Calcular a media aritmetica
                  mediaAritmetica = (nota1 + nota2 + nota3) / 3;
                  System.out.println("A média aritmética das notas dos alunos é: " + mediaAritmetica);
                  break;
              case 'P'://Calcular a media ponderada
                  mediaPonderada = (nota1 * 5) + (nota2 * 3) + (nota3 * 2);
                  mediaPonderada = mediaPonderada / 10;
                  System.out.println("A média ponderada das notas dos alunos é: " + mediaPonderada);
                  break;
          }
    }
}
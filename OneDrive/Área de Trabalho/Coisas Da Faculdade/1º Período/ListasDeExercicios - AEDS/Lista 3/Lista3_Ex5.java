/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022


O método MediaAlunos verifica qual categoria é a média dos alunos


 */

import java.util.Scanner;
public class Lista3_Ex5 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double nota, media = 0;
        char parar = 0;
        do {
            System.out.println("Digite a nota do aluno");
            nota = entrada.nextDouble();
            System.out.println("Digite (P) para parar e (C) para continuar");
            parar = entrada.next().charAt(0);
            MediaAluno(nota, media);
        }while(parar != 'P');
    }

    public static void MediaAluno(double nota, double media)
    {
          media = nota / 2;
          if(nota <=39)
          {
              System.out.println("Conceito F");
          }
          else if(nota >=40 && nota <=59)
          {
              System.out.println("Conceito E");
          }
          else if(nota >=60 && nota <=69)
          {
              System.out.println("Conceito D");
          }
          else if(nota >=70 && nota <= 79)
          {
              System.out.println("Conceito C");
          }
          else if(nota >=80 && nota <= 89)
           {
            System.out.println("Conceito B");
           }
          if(nota >=90)
          {
              System.out.println("Conceito A");
          }
          System.out.println("A média final do aluno é: " + media);
    }
}

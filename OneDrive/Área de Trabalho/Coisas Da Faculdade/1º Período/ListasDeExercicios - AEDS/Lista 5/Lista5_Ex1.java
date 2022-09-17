/*
Autor: Vinicius Almeida de Avila
Data: 24/05/2022
 */

import java.util.Scanner;
public class Lista5_Ex1 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int[] turma = preecher(10);//criando um vetor turma e passando a quantidade 10 para a função preencher
        int media = calculaMedia(turma);//variavel para a função calculaMedia retornar
        System.out.println("A média da turma é: " + media);//imprimir na tela a média
        System.out.println("Fim do programa");//fim do programa
    }


    public static int[] preecher(int quantidade)//função para preencher um determinado vetor
    {
        int[] valores = new int[quantidade];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as notas dos alunos");
        for(int i = 0; i <valores.length; i++)
        {
            System.out.println("Digite a " + (i + 1) + "º: ");
            valores[i] = entrada.nextInt();
        }
        entrada.close();
        return valores;

    }

    public static int calculaMedia(int[] vetor)//função para calcular a média da turma e a quantidade de alunos acima da média
    {
        int soma = 0, media, alunosAcimaMedia = 0;
        for (int ln = 0; ln < vetor.length; ln++)
        {
            soma += vetor[ln];
        }

        media = soma / vetor.length;
        for (int ln = 0; ln < vetor.length; ln++)
        {
            if (vetor[ln] > media)
            {
                alunosAcimaMedia++;
            }

        }
        System.out.println("A quantidade de alunos acima da média é: " + alunosAcimaMedia);
        return media;
    }
}

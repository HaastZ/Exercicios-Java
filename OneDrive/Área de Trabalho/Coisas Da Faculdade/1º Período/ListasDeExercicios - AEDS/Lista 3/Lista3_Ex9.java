/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022


A função MédiaAlunos calcula a média dos alunos aprovados

 */


import java.util.Scanner;
public class Lista3_Ex9 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int nota, i = 0, soma = 0, c = 0, numAlunos, MediaAlunos = 0;
        System.out.println("Digite a quantidade de alunos");
        numAlunos = entrada.nextInt();
        do {
            System.out.println("Digite a nota do aluno");
            nota = entrada.nextInt();
            if (nota >= 6)
            {
                soma += nota;
                c++;
            }
            i++;
        }while(numAlunos > i);
        MediaAlunos = MediaAlunos(soma, c);
        System.out.println("A media dos alunos aprovados é: " + MediaAlunos);

    }


    public static int MediaAlunos(int soma, int numAlunos)
    {
        int MediaAlunos;
        MediaAlunos = soma / numAlunos;
        return MediaAlunos;
    }
}

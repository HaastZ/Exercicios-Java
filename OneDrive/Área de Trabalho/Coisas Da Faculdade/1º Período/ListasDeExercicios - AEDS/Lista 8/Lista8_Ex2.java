/*
Autor: Vinicius Almeida de Avila
Data: 01/07/2022

 */


import java.io.*;
import java.util.Scanner;

public class Lista8_Ex2
{

    public static void main(String[] args) throws IOException
    {
        Scanner entrada = new Scanner(System.in);
        aniversario[] vetor = new aniversario[10];//criando um vetor com 10 espaços
        FileWriter arquivo = new FileWriter("C:\\arquivo\\teste.txt");
        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = new aniversario(entrada);//preenchendo os 10 espaços com as informações
            arquivo.write(" Mes " + vetor[i].getMes() + "\n");//escrevendo o mes no arquivo
            arquivo.write(" Dia " + vetor[i].getDia() + "\n");//escrevendo o dia no arquivo
            arquivo.write(" Nome " + vetor[i].getNome() + "\n");//escrevendo o nome no arquivo
        }
        arquivo.close();
    }
}

class aniversario
{
    private String nome;
    private String mes;
    private int dia;

    public aniversario(Scanner entrada)
    {
        System.out.println("Digite o nome da pessoa:");
        nome = entrada.nextLine();
        System.out.println("Digite o mes de aniversario: ");
        mes = entrada.nextLine();
        System.out.println("Digite o dia do aniversario: ");
        dia = entrada.nextInt();
        entrada.nextLine();

    }

    public String getNome()
    {
        return nome;
    }

    public int getDia()
    {
        return dia;
    }

    public String getMes()
    {
        return mes;
    }
}


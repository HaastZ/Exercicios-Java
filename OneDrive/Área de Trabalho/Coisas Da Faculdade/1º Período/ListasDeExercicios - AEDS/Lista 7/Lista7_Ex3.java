/*
Autor: Vinicius Almeida de Avila
Data: 15/06/2022
 */


import java.io.*;
import java.util.Scanner;
public class Lista7_Ex3 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nome = "texto.txt";
        String texto = "";
        int caracteres = 0;
        try
        {
            PrintWriter escrever = new PrintWriter(nome);
            System.out.println("Escreva algo: ");
            texto = entrada.nextLine();
            for(int i = 0;i<texto.length();i++)//percorrendo todos os caracteres da variavel texto
            {
                caracteres = i;//colocando o valor da variavel i após percorrer a string na variavel caracteres
            }
            escrever.println("O texto escrito foi: " + texto);//mostrando o texto armazenado na variavel texto no arquivo
            System.out.println("O texto tem " + caracteres + " caracteres");//imprimindo a quantidade de caractere na tela
            escrever.close();//salvando o arquivo
        }
        catch (IOException var)
        {
            System.out.println("Erro ao encontrar o arquivo");
        }
    }
}
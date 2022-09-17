/*
Autor: Vinicius Almeida de Avila
Data: 15/06/2022
*/

import java.io.*;
import java.util.Scanner;

public class Lista7_Ex1 {


    public static void main(String[] args) throws IOException
    {
        Scanner entrada = new Scanner(System.in);
        String nome = "vinicius.txt";//criando o nome do arquivo do tipo texto
        try
        {
            PrintWriter escrever = new PrintWriter(nome);//criando um arquivo texto no diretório aonde está a pasta deste projeto
            for(int i = 1;i <=10;i++)//contando até 10
            {
                escrever.println(i);//printando no aquivo os numeros de 1 até 10
            }
            escrever.close();//salvando o arquivo
        }
        catch (IOException var)
        {
            System.out.println("Erro ao encontrar o arquivo");
        }
    }
}
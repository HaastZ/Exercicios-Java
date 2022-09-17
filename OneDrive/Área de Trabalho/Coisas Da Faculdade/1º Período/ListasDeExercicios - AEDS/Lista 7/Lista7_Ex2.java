/*
Autor: Vinicius Almeida de Avila
Data: 15/06/2022
 */

import java.io.*;
import java.util.Scanner;
public class Lista7_Ex2 {


    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner entrada = new Scanner(System.in);
        String nome = "texto.txt";
        String texto = "";
        {
            PrintWriter writer = new PrintWriter(nome);
            System.out.println("Escreva algo: ");
            texto = entrada.nextLine();
            writer.println("O texto escrito foi: " + texto);//mostrando o texto armazenado na variavel texto no arquivo
            writer.close();//salvando o arquivo
        }
    }
}

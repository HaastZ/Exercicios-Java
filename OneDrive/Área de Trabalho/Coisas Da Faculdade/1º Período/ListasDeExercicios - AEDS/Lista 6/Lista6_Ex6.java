/*
Autor: Vinicius Almeida de Avila
Data: 11/06/2022
 */


import java.util.Scanner;
public class Lista6_Ex6 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String palavra;
        String espaço = " ";
        String result;
        System.out.println("Escreva uma palavra");
        palavra = entrada.nextLine();
        String vetor = palavra.substring(0, palavra.length());
        for(int i = 0;i<palavra.length();i++)//esta acessando cada caracter da string palavras
        {
            result = (espaço + espaço) + palavra.charAt(i);//coloca um espaço em cada caracter da string
            System.out.println(result);
        }
        entrada.close();
    }
}
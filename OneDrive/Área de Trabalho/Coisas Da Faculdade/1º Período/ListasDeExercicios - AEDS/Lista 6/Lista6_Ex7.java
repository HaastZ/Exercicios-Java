/*
Autor: Vinicius Almeida de Avila
Data: 11/06/2022
 */
import java.util.Scanner;
public class Lista6_Ex7
{


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String escrita;
        System.out.println("Escreva qualquer coisa");
        escrita = entrada.nextLine();
        escrita = escrita.toUpperCase();//converte todos os caracteres para maiusculo
        System.out.println(escrita);
    }
}
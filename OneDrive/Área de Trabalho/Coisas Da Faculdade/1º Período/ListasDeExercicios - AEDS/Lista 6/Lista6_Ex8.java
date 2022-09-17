/*
Autor: Vinicius Almeida de Avila
Data: 11/06/2022
 */


import java.io.*;
import java.util.Scanner;
public class Lista6_Ex8
{


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char caractere;
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine().trim().toUpperCase();
        StringBuilder criptografar = new StringBuilder(frase);

        for(int i=0; i<frase.length();i++) //está percorrendo toda a frase digitada pelo usuario
        {
            if (frase.charAt(i)>=65&&frase.charAt(i)<=87)
            {
                caractere = frase.charAt(i);
                caractere+=3;
                criptografar.setCharAt(i, caractere);
            }
            else if (frase.charAt(i) ==88)//se o caracter na posição i achar 88
            {
                criptografar.setCharAt(i,'A');//vai trocar pelo A
            }
            else if (frase.charAt(i) ==89)//se o caracter na posição i achar 89
            {
                criptografar.setCharAt(i,'B');//vai trocar pelo B
            }
            else if (frase.charAt(i) ==90)//se o caracter na posição i achar 90
            {
                criptografar.setCharAt(i,'C');//vai trocar pelo C
            }
        }
        System.out.println(criptografar);//mostrar na tela a frase criptografada
        entrada.close();
    }
}

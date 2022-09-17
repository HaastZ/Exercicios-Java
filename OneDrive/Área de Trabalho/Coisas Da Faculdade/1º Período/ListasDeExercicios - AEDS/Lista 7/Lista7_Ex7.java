/*
Autor: Vinicius Almeida de Avila
Data: 17/06/2022
 */

import java.util.Scanner;
import java.io.*;
public class Lista7_Ex7
{

    public static void main(String[] args) throws IOException
    {
        Scanner entrada = new Scanner(System.in);
        String letras = "";
        int num, cont = 0;
        String juntar;
        System.out.println("Digite a quantidade de letras");
        num = Integer.parseInt(entrada.nextLine());
        File arquivo = new File("C:\\arquivo.txt\\arquivo.txt");//localizando o arquivo
        {
            FileWriter arq = new FileWriter("C:\\arquivo.txt\\arquivo.txt");//fazendo com que de para escrever no arquivo
            for(int i = 0;i<num;i++)//pegando a quantidade de letras que o usuario digitou
            {
                System.out.println("Escreva a letra");//pedindo para escrever a letra de acordo com a quantidade que foi digitada
                letras = entrada.nextLine();
                arq.write(letras+"\n");//imprimindo no arquivo e quebrando a linha
            }
            arq.close();//salvando o arquivo
            Scanner ler = new Scanner(arquivo);//lendo o arquivo
            while(ler.hasNextLine())
            {
                juntar = ler.nextLine();//transformando o que estava no arquivo em uma string e passando para a variavel juntar
                if(juntar.contains("a")|| juntar.contains("e")|| juntar.contains("i")|| juntar.contains("o")|| juntar.contains("u"))
                {
                    cont++;//se a letra dentro do arquivo for igual a alguma vogal o contador conta o numero de vogais
                }
            }
            System.out.println("A quantidade de vogais é " + cont);
        }
    }
}
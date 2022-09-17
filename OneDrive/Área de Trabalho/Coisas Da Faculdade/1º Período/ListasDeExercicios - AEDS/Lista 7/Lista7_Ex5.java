/*
Autor: Vinicius Almeida de Avila
Data: 16/06/2022
 */


import java.io.*;
import java.util.Scanner;
public class Lista7_Ex5 {


    public static void main(String[] args) throws IOException
    {
        File ler = new File("C:\\arquivo.txt\\teste.txt");//está localizando o arquivo teste
        File ler2 = new File("C:\\arquivo.txt\\teste2.txt");//está localizando o arquivo teste2
        File ler3 = new File("C:\\arquivo.txt\\juntar.txt");//está localizando o arquivo juntar
        Scanner entrada = new Scanner(ler);//está lendo oque tem dentro do arquivo teste
        Scanner ent = new Scanner(ler2);//está lendo oque tem dentro do arquivo teste2
        FileWriter escrever = new FileWriter(ler3);//está fazendo com oque o arquivo juntar de para escrever nele
        String nome = "";
        while(entrada.hasNextLine())
        {
            nome += (entrada.nextLine()+"\n");//está armazenando oque está escrito no arquivo teste na variavel nome,e quebrando a linha no final
        }
        while(ent.hasNextLine())
        {
            nome += (ent.nextLine()+"\n");//está armazenando oque está escrito no arquivo teste2 na variavel nome, e quebrando a linha ao final
        }
        escrever.write(nome);//está juntando o conteudo dos dois arquivos no arquivo juntar
        entrada.close();//salvando o arquivo
        ent.close();//salvando o arquivo
        escrever.close();//salvando o arquivo
    }
}

/*
Autor: Vinicius Almeida de Avila
Data: 16/06/2022
 */




import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class Lista7_Ex4 {

    public static void main(String[] args) throws FileNotFoundException
    {
        int cont = 0;
        File arq = new File("C:\\arquivo.txt\\teste.txt");//localiza aonde está o arquivo
        Scanner entrada = new Scanner(arq);//lendo o arquivo
        while(entrada.hasNextLine())//enquanto tiver linhas em baixo ele olha
        {
            System.out.println(entrada.nextLine());//está printando todas as linhas na tela
            cont++;//para cada linha soma mais 1 na variavel cont
        }
        System.out.println("A quantidade de linhas é: " + cont);
    }
}

/*
Autor: Vinicius Almeida de Avila
Data: 07/06/2022
*/


import java.util.Scanner;
public class Lista6_Ex1 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite um nome:");
        nome = entrada.nextLine();
        System.out.println("As iniciais do nome é: ");
        String[] vetor = nome.split(" ");//quebrando o vetor em partes: Ex: Vinicius almeida de avila: 4 partes
        for(int i=0; i<vetor.length; i++)
        {
            if(vetor[i].length() > 3)//se o tamanho das letras for maior que 3(a maioria dos conectores tem no maximo 3 letras)
            {
                System.out.print(Character.toUpperCase(vetor[i].charAt(0)));//vai tirar os conectores e vai transformar as letras em maiusculas
            }
        }
        entrada.close();
    }
}
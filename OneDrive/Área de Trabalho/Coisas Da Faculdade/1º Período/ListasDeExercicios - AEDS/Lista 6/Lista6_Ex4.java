/*
Autor: Vinicius Almeida de Avila
Data: 10/06/2022
 */


import java.util.Scanner;
public class Lista6_Ex4 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Escreva uma frase");
        frase = entrada.nextLine();
        for(int i = 0;i<frase.length();i++)
        {
           Character.toUpperCase(frase.charAt(i));//convertendo para minusculo
        }
        String fraseInvertida = new StringBuilder(frase).reverse().toString();//está invertendo a frase
        System.out.println("A Frase invertida é\n" + fraseInvertida);
        if(fraseInvertida.equals(frase))//se a frase invertida for igual a frase ela é palíndromo
        {
            System.out.println("É palíndromo");
        }
        else//senao não é
        {
            System.out.println("Não é palíndromo");
        }
        entrada.close();
    }
}
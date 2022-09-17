/*
Autor: Vinicius Almeida de Avila
Data: 10/06/2022
 */


import java.util.Scanner;
public class Lista6_Ex5 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String numero;
        int num = 9;
        String traco = "-";
        System.out.println("informe seu número");
        numero = entrada.nextLine();
        char[] vetor = new char[10];
        if(numero.length() == 8)//se o tamanho do numero for igual a 8
        {
            numero = num + numero;//coloca o 9 na frente
        }
        System.out.println("O número sem formatação é " + numero);
        for(int i = 0;i<vetor.length;i++)
        {
            if(vetor[i] == 5)
            {
               numero = traco + numero;//coloca o traço na posição 5 do vetor
            }
        }
        System.out.println("O número com formatação é " + numero);
        entrada.close();
    }
}
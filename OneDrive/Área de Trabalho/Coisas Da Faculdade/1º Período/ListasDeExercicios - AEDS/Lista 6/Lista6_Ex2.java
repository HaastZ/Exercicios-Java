/*
Autor: Vinicius Almeida de Avila
Data: 09/06/2022
 */



import java.util.Scanner;
public class Lista6_Ex2 {

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String texto;
        String result = "";
        int espaços = 0;//contador
        System.out.println("Escreva um texto");
        texto = entrada.nextLine();
        for(int i = 0;i<texto.length();i++)//o for está contando todos os caracteres da string na variavel i
        {
            if(texto.charAt(i) != ' ')//se o caracter for diferente de espaço
            {
                result += texto.charAt(i);//adiciona o caracter na variavel result
                espaços = 0;//quando não tiver espaço depois do caracter zera o contador de espaços
            }
            else//senao for diferente de espaço é igual a 0
            {
                if(espaços == 0)//se a quantidade de espaços for igual a 0
                {
                    result += texto.charAt(i);//adiciona os caracteres e os espaços na variavel result
                }
                espaços++;//se tiver mais de 1 espaço consecutivo ele tira e só deixa 1 espaço
                //System.out.println(espaços);
            }
        }
        System.out.println(result);
        entrada.close();
    }
}
















    /*public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int espaços = 0;

        System.out.println("Escreva um texto");
        texto = entrada.nextLine();

        String[] separarador = texto.split("");
        String resultado = "";
        for (int i = 0; i < separarador.length; i++)
        {
            if (separarador[i].trim().isEmpty())
            {
                if (separarador[i - 1].charAt(0) != ' ')
                {
                    resultado += separarador[i];
                }
            }
            else
            {
                resultado += separarador[i];
            }
        }

        System.out.println(resultado);
    }
}*/
//se a quantidade de espaços depois do caractere for maior que 1. tirar todos os epaços e colocar 1 espaço entre eles
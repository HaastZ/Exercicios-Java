/*
Autor: Vinicius Almeida de Avila
Data: 12/05
 */



import java.util.Scanner;
public class Lista4_Ex3 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numerador, denominador;
        System.out.println("Digite 2 números");
        numerador = entrada.nextInt();
        denominador = entrada.nextInt();
        resto(numerador, denominador);
        System.out.println(resto(numerador, denominador));
    }


    public static int resto(int numerador, int denominador)
    {
        if(numerador < denominador)//se o numerador for menor que o denominador retorna o valor do numerador
        {
            return (numerador);
        }
        else//subtrai o numerador pelo denominador ate o numerador ser menor que o denominador, quando o numerador for menor que o denominador, retorna o
        //valor do numerador
            return (resto(numerador - denominador, denominador));
    }
}








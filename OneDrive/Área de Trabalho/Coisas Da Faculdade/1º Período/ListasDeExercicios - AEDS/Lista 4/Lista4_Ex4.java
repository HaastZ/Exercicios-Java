/*
Autor: Vinicius Almeida de Avila
Data: 12/05
 */


import java.util.Scanner;
public class Lista4_Ex4 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        System.out.println("Digite 2 números");
        x = entrada.nextInt();
        y = entrada.nextInt();
        resto(x, y);
        System.out.println(resto(x, y));
    }

    public static int resto(int x, int y)
    {
        if(x < y)//se x for menor do que y vai retornar o valor de x
        {
            return (x);
        }
        else if(x == y)//se x for igual a y vai retornar 0
        {
            return 0;
        }
        else//se x for maior do que y vai subtrair x - y ate o x ser menor que y
            return (resto(x - y, y));
    }
}
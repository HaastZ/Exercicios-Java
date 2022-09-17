/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022


A função Valor verifica se o valor é negativo ou positivo e se o valor lógico é true ou false

 */





import java.util.Scanner;
public class Lista3_Ex7 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean Valorlogico = false;
        char parar= 0;
        do {
            System.out.println("Digite um valor inteiro");
            num = entrada.nextInt();
            Valorlogico = Valor(num, Valorlogico);
            System.out.println(Valorlogico);
            System.out.println("Digite (P) para parar e (C) para continuar");
            parar = entrada.next().charAt(0);
        }while(parar != 'P');
    }

    public static boolean Valor(int num, boolean Valorlogico)
    {
        if(num > 0)
        {
            System.out.println("O valor é positivo");
            Valorlogico = true;
        }
        if(num < 0)
        {
            System.out.println("O valor é negativo");
            Valorlogico = false;
        }
         return (Valorlogico);
    }
}
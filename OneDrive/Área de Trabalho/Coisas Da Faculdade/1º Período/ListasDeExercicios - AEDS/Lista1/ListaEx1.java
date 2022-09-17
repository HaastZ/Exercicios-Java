import java.util.Scanner;
public class ListaEx1 {



    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, adic;
        System.out.println("Digite um número");
        num1 = entrada.nextInt();
        System.out.println("Digite outro número");
        num2 = entrada.nextInt();

        adic = num1 + num2;
        if(adic >=10)
        {
            adic = adic + 5;
        }
        else
        {
            adic = adic +7;
        }
        System.out.println("O resultado é: " + adic);

    }
}
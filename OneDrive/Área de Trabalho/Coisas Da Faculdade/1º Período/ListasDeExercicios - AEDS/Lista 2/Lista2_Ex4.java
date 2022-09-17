import java.util.Scanner;
public class Lista2_Ex4 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System. in);
        int num, num1, num2, num3;
        System.out.println("Digite um número: ( serie Fibonacci)");
        num = entrada.nextInt();
        num1 = 0;
        num2 = 1;
        num3 = num1 + num2;
        while(num > 0)
        {
            System.out.println(" " + (num1 + num2));
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            num--;
        }
    }
}

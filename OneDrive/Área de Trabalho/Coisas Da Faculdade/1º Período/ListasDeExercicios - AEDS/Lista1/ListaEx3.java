import java.util.Scanner;
public class Exemplo
{
    public static void main(String args[])
    {
        int a, b, s; // variáveis locais do método main
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o primeiro número: “);
         a = e.nextInt();
         System.out.println("Digite o segundo número: ");
         b = e.nextInt();
         s = soma(a,b); // chamada do método soma()
         System .out.println("Soma = " + s );
         }
         public static int soma(int a,int b)
         {
         return a + b;
         }
         }
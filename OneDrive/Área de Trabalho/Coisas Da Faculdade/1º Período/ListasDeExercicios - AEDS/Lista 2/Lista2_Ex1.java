import java.util.Scanner;

public class Lista2_Ex1 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num, positivos = 0, negativos = 0, zeros = 0;
        char Parar;
        do {
            System.out.println("Digite um valor");
            num = entrada.nextInt();
            System.out.println("Digite (p) para parar e (c) para continuar");
            Parar = entrada.next().charAt(0);
            if (num > 0)
            {
                positivos++;
            }
            if (num < 0)
            {
                negativos++;
            }
            if(num == 0)
            {
                zeros++;
            }

        } while (Parar != 'p');
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}







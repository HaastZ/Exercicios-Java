import java.util.Scanner;

public class Lista2_Ex2 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num, positivos = 0, negativos = 0, zeros = 0, total = 0;
        char Parar;
        double  porcPositivo = 0, porcNegativo = 0, porcZero = 0;


        do {
            System.out.println("Digite um valor");
            num = entrada.nextInt();
            System.out.println("Digite (p) para parar e (c) para continuar");
            Parar = entrada.next().charAt(0);

            if (num > 0)
            {
                positivos++;
                total++;
                porcPositivo++;
            }
            if (num < 0)
            {
                negativos++;
                total++;
                porcNegativo++;
            }
            if(num == 0)
            {
                zeros++;
                total++;
                porcZero++;
            }
        } while (Parar != 'p');

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
        System.out.printf("O percentual dos  valores positivos é: %.2f \n" , (porcPositivo * 100) / total);
        System.out.printf("O percentual dos valores negativos é: %.2f \n" , (porcNegativo * 100)/ total);
        System.out.printf("O percentual dos valores zero é: %.2f \n" , (porcZero * 100) / total );
    }
    }


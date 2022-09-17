/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022


Método media calcula a média de salário da população

*/




import java.util.Scanner;
public class Lista3_Ex2 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int filhos, pessoas = 0;
        double MediaSalario = 0, salario;
        char parar = 0;
        do {
            System.out.println("Digite a quantidade de filhos");
            filhos = entrada.nextInt();
            System.out.println("Digite o salário");
            salario = entrada.nextDouble();
            System.out.println("Digite (P) para parar e (C) para continuar");
            parar = entrada.next().charAt(0);
            pessoas++;
        }while(parar != 'P');
        MediaSalario = media(filhos, MediaSalario, salario, pessoas);
        System.out.printf("A média de salário da população é: %.2f ", MediaSalario);

    }

    public static int media(int filhos, double MediaSalario, double salario, int pessoas)
    {

        MediaSalario = MediaSalario + salario;
        MediaSalario = MediaSalario / pessoas;

       return (int) MediaSalario;

    }
}
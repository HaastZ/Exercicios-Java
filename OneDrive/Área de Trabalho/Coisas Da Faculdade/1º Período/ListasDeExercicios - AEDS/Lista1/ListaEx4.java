import java.util.Scanner;

public class ListaEx4 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int totalHab = 0,  filhos;
        double salario, somaSalario = 0, maiorSalario = 0, SomaMedia = 0, somaFilhos = 0;

        System.out.println("Digite o valor do salário ");
        salario = entrada.nextDouble();

        while(salario > 0) {

            System.out.println("Digite a quantidade de filhos:");
            filhos = entrada.nextInt();
            somaFilhos += filhos;
            somaSalario += salario;
            totalHab ++;
            if(maiorSalario < salario)
            {
                maiorSalario = salario;
            }
            if(salario <= 100)
                SomaMedia =+ 1;

        }
        System.out.println("A média do salário da população é de: " + (somaSalario / totalHab));
        System.out.println("A média do número de filhos é de: " + (somaFilhos / totalHab));
        System.out.println("O maior salário da população é de: " + maiorSalario);
        System.out.println("O percentual de pessoas com salário até 100R$ é de: " + (SomaMedia / totalHab));
    }
}

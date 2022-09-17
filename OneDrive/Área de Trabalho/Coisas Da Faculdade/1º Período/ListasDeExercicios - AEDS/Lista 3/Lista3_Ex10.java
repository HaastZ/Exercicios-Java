/*
    Autor: Vinicius Almeida de Avila
    Data: 05/05/2022


    A função Idade ve qual é a idade do nadador e retorna sua categoria


 */
import java.util.Scanner;
public class Lista3_Ex10 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do nadador");
        idade = entrada.nextInt();
        Idade(idade);


    }

    public static int Idade(int idade)
    {
        char categoria = 0;
       if(idade > 18)
       {
           categoria = 'A';
           System.out.println("A Categoria do nadador é: " + categoria);
           return (categoria);
       }
       else if(idade == 16 || idade == 17)
       {
           categoria = 'B';
           System.out.println("A Categoria do nadador é: " + categoria);
           return (categoria);
       }
       else if(idade == 14 || idade == 15)
       {
           categoria = 'C';
           System.out.println("A Categoria do nadador é: " + categoria);
           return (categoria);
       }
       else if(idade >= 11 && idade <=13)
       {
           categoria = 'D';
           System.out.println("A Categoria do nadador é: " + categoria);
           return (categoria);
       }
       else if(idade >= 8 && idade <=10)
       {
           categoria = 'E';
           System.out.println("A Categoria do nadador é: " + categoria);
           return (categoria);
       }
       if(idade >=5 && idade <=7)
       {
           categoria = 'F';
           System.out.println("A Categoria do nadador é: " + categoria);
           return (categoria);
       }
       return categoria;
    }
}
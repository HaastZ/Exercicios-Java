import java.util.Scanner;
public class ListaEx2 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.println("Digite sua nota");
        nota = entrada.nextInt();
        if(nota >=8 && nota <=10)
        {
            System.out.println("ótimo");
        }
        else if(nota >=7 && nota <8)
        {
            System.out.println("Bom");
        }
        else if(nota >=5 && nota <7)
        {
            System.out.println("Regular");
        }
        else if(nota <5)
        {
            System.out.println("Insatisfatório");
        }
        else
        {
            System.out.println("Reprovado");
        }

    }
}










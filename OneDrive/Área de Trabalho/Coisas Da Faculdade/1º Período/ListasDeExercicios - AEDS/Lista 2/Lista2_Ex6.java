import java.util.Scanner;
public class Lista2_Ex6 {


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double mercadoria,mercadoriaVenda = 1,mercadoriaCompra = 1,lucro10,Lucro,lucro20;
        double lucroMenor10 = 0,lucroMenor20 = 0,lucroMaior20 = 0,mercadoriaCompraTotal = 0,mercadoriaVendaTotal = 0,lucroTotal = 0;

        while(mercadoriaCompra != 0 || mercadoriaVenda != 0)
        {
            System.out.println("Digite o valor de compra da mercadoria: (Digite 0 para parar)");
            mercadoriaCompra = entrada.nextDouble();
            System.out.println("Digite o valor de venda da mercadoria: (Digite 0 para parar)");
            mercadoriaVenda = entrada.nextDouble();
            mercadoriaCompraTotal = mercadoriaCompraTotal + mercadoriaCompra;
            mercadoriaVendaTotal = mercadoriaVendaTotal + mercadoriaVenda;
            lucroTotal = lucroTotal + (mercadoriaCompra - mercadoriaVenda);

            Lucro = ((mercadoriaVenda - mercadoriaCompra) * 100) / mercadoriaCompra;
            lucro10 = (mercadoriaCompra * 10) / 100;
            lucro20 = (mercadoriaCompra * 20) / 100;

            if(Lucro < lucro10)
            {
                lucroMenor10++;
                System.out.println("A quantidade de mercadoria que fornecem menos que 10% de lucro é: " + lucroMenor10);
            }
             if(Lucro <= lucro20)
            {
                lucroMenor20++;
                System.out.println("A quantidade de mercadoria que fornecem menos que 20% de lucro é: " + lucroMenor20);
            }
             if(Lucro > lucro20)
            {
                lucroMaior20++;
                System.out.println("A quantidade de mercadoria que fornece mais que 20% de lucro é: " + lucroMaior20);
            }

        }
        System.out.println("O valor total de compra foi de: " + mercadoriaCompraTotal);
        System.out.println("O valor total de vendas foi de "+ mercadoriaVendaTotal);
        System.out.println("O valor total de lucro " + lucroTotal);
    }
}

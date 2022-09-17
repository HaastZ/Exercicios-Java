/*
Autor: Vinicius Almeida de Avila
Data: 10/06/2022
 */
import java.util.Scanner;
public class Lista6_Ex3
{


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String[] meses = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        String data;
        String dia,mes, ano;
        System.out.println("Informe sua data de nascimento");
        data = entrada.nextLine();
        dia = data.substring(0, 2);//vai pegar da posição 0 ate a posição 2
        mes = data.substring(3, 5);//vai pegar da posição 3 ate a posição 5
        ano = data.substring(6, 10);//vai pegar da posição 6 ate a posição 9(coloca 10 porque o 9 não pega o ultimo caracter)
        System.out.print("Você nasceu em " + dia + " de " + meses[Integer.parseInt(mes)-1] + " de " + ano);//quando chegar no mes ele pega o vetor
        //meses e transforma em inteiro para acessar as posições no vetor, coloca -1 porque o vetor começa no 0 então fica 1 a mais
        entrada.close();
    }
}
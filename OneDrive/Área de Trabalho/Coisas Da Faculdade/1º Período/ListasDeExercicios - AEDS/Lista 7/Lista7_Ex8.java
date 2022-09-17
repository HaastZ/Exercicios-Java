/*
Autor: Vinicius Almeida de Avila
Data: 17/06/2022
 */


import java.io.*;
import java.util.Scanner;
public class Lista7_Ex8
{


    public static void main(String[] args) throws IOException
    {
        Scanner entrada = new Scanner(System.in);
        int quantVeiculos = 30;
        int aluguelCadaVeiculo = 500, fatMensal;
        double multas;
        double valorMultas, manutencao;
        String arquivos = "";
        File arquivo = new File("C:\\arquivo.txt\\resultado.txt");
        FileWriter arq = new FileWriter("C:\\arquivo.txt\\resultado.txt");
        fatMensal = quantVeiculos / 3 * aluguelCadaVeiculo;//para calcular o faturamento mensal

        //System.out.println("O faturamento mensal é: " +fatMensal);

        System.out.println("O faturamento anual é: " +fatMensal * 12);

        multas = aluguelCadaVeiculo * 0.2;//achando 20% de 500(o valor do aluguel de cada veiculo)
        valorMultas = quantVeiculos / 10 * multas;
        System.out.println("O valor ganho com multas no mês é: " + valorMultas);
        manutencao = quantVeiculos * 0.02 * 600;//2% da quantidade de veiculos vezes 600(valor da manutenção)
        System.out.println("O valor gasto com a manutenção é: " + manutencao);
        arquivos = fatMensal + "\n" + (fatMensal * 12) + "\n" + multas + "\n" + manutencao;//passando todos os valores das variaveis para uma string
        arq.write(arquivos);//mostrando no arquivo o que foi passado para a string
        arq.close();//salvando o arquivo

    }
}
/*
Autor: Vinicius Almeida de Avila
Data: 17/06/2022
 */


import java.io.*;
import java.util.Scanner;
public class Lista7_Ex9
{


    public static void main(String[] args) throws IOException
    {
        String telefone = "";
        String matricula = "";
        int dados, opcao;
        String result = "";
        String dadosArq = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a quantidade de dados");
        dados = Integer.parseInt(entrada.nextLine());
        for(int i = 0;i<dados;i++)//de acordo com a quantidade digitada pelo usuario, vai aparecer na tela
        {
            System.out.println("Escreva sua mátricula");
            matricula = entrada.nextLine();
            System.out.println("Escreva seu telefone");
            telefone = entrada.nextLine();
            result += telefone + "\n" + matricula +"\n";//passando para uma string os conteudos das variaveis
        }

        File arquivo = new File("C:\\arquivo.txt\\alunos.txt");//localizando o arquivo
        FileWriter arq = new FileWriter("C:\\arquivo.txt\\alunos.txt");//fazendo com que de para escrever no arquivo
        System.out.println("Digite qual opção:\n1-Salvar o arquivo\n2-Ler o arquivo");
        opcao = entrada.nextInt();
        switch (opcao)
        {
            case 1://caso a opcao digitada for 1, vai salvar o arquivo
                arq.write(result);
                break;
            case 2://caso a opcao digitada for 2, vai ler oque tem dentro do arquivo e mostrar na tela
                Scanner ler = new Scanner(arquivo);
                System.out.println("Oque está no arquivo é: \n" + result);
                break;
            default://caso não seja nenhum dos dois vai dar mensagem de erro
                System.out.println("Erro");
                break;
        }
        arq.close();//salvando o arquivo
    }
}
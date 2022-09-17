import java.util.Scanner;
public class Lista2_Ex7 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int votos, rogerio = 0, waldir = 0, rodolfo = 0, jorge = 0, VOTOnulo = 0, VOTObranco = 0;
        do {
        System.out.println("Escolha seu candidato:\n (1- Rogério) \n (2- Waldir) \n (3- Rodolfo) \n (4- Jorge) \n (5- Voto nulo) \n (6- Voto em branco) \n (Digite 0 para parar)");
        votos = entrada.nextInt();

                switch (votos) {
                    case 1:
                        rogerio++;
                        break;
                    case 2:
                        waldir++;
                        break;
                    case 3:
                        rodolfo++;
                        break;
                    case 4:
                        jorge++;
                        break;
                    case 5:
                        VOTOnulo++;
                        break;
                    case 6:
                        VOTObranco++;
                        break;

                }
        }while (votos != 0);
        System.out.println("O total de votos para o Rogério é: " + rogerio);
        System.out.println("O total de votos para o Waldir é: " + waldir);
        System.out.println("O total de votos para o Rodolfo é: " + rodolfo);
        System.out.println("O total de votos para o jorge é: " + jorge);
        System.out.println("O total de votos nulos é: " + VOTOnulo);
        System.out.println("O total de votos em branco é : " + VOTObranco);
    }
}
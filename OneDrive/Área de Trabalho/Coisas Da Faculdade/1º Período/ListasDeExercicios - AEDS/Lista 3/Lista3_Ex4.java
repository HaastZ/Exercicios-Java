/*
Autor: Vinicius Almeida de Avila
Data: 05/05/2022


O método triãngulo verifica que tipo de triãngulo vai formar

 */





import java.util.Scanner;
public class Lista3_Ex4 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3;
        char parar = 1;
        do {
            System.out.println("Digite os 3 lados do triãngulo");
            lado1 = entrada.nextInt();
            lado2 = entrada.nextInt();
            lado3 = entrada.nextInt();
            System.out.println("Digite (P) para parar e (C) para continuar");
            parar = entrada.next().charAt(0);
            triangulo(lado1, lado2, lado3);
        }while(parar != 'P');



    }

    public static void triangulo(int lado1, int lado2, int lado3) {

            //formula para ver se é triangulo
            if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2))
            {
                System.out.println("É um triangulo");
            }
            if (lado1 == lado2 && lado1 == lado3)
            {
                System.out.println("É um triãngulo Equilátero");
            }
            else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É um triãngulo isósceles");
            }
            else if (lado1 != lado2 && lado2 != lado3)
            {
                System.out.println("É um triãngulo Escaleno");
            }
            else
            {
                System.out.println("Não forma triãngulo");
            }

        }
    }

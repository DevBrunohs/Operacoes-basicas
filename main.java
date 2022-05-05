import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        int n1,n2;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor de n1: ");
        n1 = ler.nextInt();
        System.out.print("Digite o valor de n2: ");
        n2 = ler.nextInt();

        System.out.println("Valor de n1: " + n1);
        System.out.println("Valor de n2: " + n2);



        int soma, subtracao, mult, divisao;

        soma =  n1 + n2 ;
        System.out.println("Valor de n1 e n2: " + soma);

        subtracao = n1 - n2;
        System.out.println("subtração de n1 e n2: " + subtracao);

        mult = n1 * n2;
        System.out.println("multiplicação de n1 e n2: " + mult);

        divisao = n1 / n2;
        System.out.println("divisão de n1 e n2: " + divisao);







        float f1,f2;

        System.out.print("Digite o valor de f1: ");
        f1 = ler.nextFloat();
        System.out.print("Digite o valor de f2: ");
        f2 = ler.nextFloat();

        System.out.println("Valor de f1: " + f1);
        System.out.println("Valor de f2: " + f2);

        ler.close();

    }



}





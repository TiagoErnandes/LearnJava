package Enum.Exercicios;

import java.util.Scanner;

public class TesteExercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Operacao[] opera = Operacao.values();
        double x;
        double y;
        System.out.println("Digite o primeiro numero para operação");
        x = scan.nextDouble();
        System.out.println("Digite o segundo numero para operação");
        y = scan.nextDouble();

        for(Operacao op : opera){
            System.out.println(x+" "+op+" " +y+" = "+op.executarOperacao(x,y));
        }

    }
}

package Enum;

public class Teste2 {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString()+" "+dia.getValor());


        Data data = new Data(1,4,2000,DiaSemana.DOMINGO);
    }
}

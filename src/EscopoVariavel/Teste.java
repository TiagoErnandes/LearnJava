package EscopoVariavel;

public class Teste {
    public static void main(String[] args) {
        Escopo escopo = new Escopo();
        escopo.setValor(10);

        System.out.println(escopo.getValor());
        System.out.println(escopo.calculaValot(20));
        System.out.println(escopo.getValor());
      //  System.out.println(escopo.);
    }
}

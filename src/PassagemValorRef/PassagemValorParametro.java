package PassagemValorRef;

public class PassagemValorParametro {
    public static void main(String[] args) {

        Contato contato = new Contato("Contato 1","1234-4565","Contato1@gmail.com");
        int valor = 10;
        System.out.println(contato);
        System.out.println(valor);
        System.out.println();
        testePassagemValorReferencia(valor,contato);
        System.out.println(contato);
        System.out.println(valor);
        System.out.println();
        testePassagemValorReferencia2(valor,contato);
        System.out.println(contato);
        System.out.println(valor);


    }


    public static void testePassagemValorReferencia(int valor,Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato2","6453-3211","contato2@gmail.com");

    }


    public static void testePassagemValorReferencia2(int valor,Contato contato){
        int novoValor = valor +10;
        valor = novoValor;

        contato.setNome("Contato "+novoValor);
    }

}

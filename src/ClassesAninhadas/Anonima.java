package ClassesAninhadas;

public class Anonima {
    public void imprimeTexto(){
        System.out.println("Qualquer Texto");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima(){
          public void imprimeTexto(){
              System.out.println("Qualquer Texto que foi sobrescrito");
          }
        };
        anonima.imprimeTexto();
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("Qualquer Texto - interface");
            }
        };
        System.out.println("----------------");
       texto.imprimeTexto();
    }
}

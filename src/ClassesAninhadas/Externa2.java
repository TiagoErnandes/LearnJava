package ClassesAninhadas;

public class Externa2 {
    public void metodoQualquer(){

        class ClasseLocal{

            private String texto = "Texto Classe Local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }
        ClasseLocal local = new ClasseLocal();
        local.imprimeTexto();
    }

    public static void main(String[] args) {
        Externa2 externa2 = new Externa2();
        externa2.metodoQualquer();
    }
}

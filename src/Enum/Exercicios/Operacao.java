package Enum.Exercicios;

   enum Operacao {
       DIVIDIR("/"){
           @Override
           public double executarOperacao(double x, double y) {

               return x/y;
           }
       }, MULTIPLICAR("*") {
           @Override
           public double executarOperacao(double x, double y) {
               return x*y;
           }
       }, SOMAR("+") {
           @Override
           public double executarOperacao(double x, double y) {
               return x+y;
           }
       }, SUBTRAIR("-") {
           @Override
           public double executarOperacao(double x, double y) {
               return x-y;
           }
       };

       private String value;

        Operacao(String value) {
           this.value = value;
       }


       public String getValue() {
           return value;
       }

       public void setValue(String value) {
           this.value = value;
       }

       @Override
       public String toString() {
           return this.value;
       }

       public abstract double executarOperacao(double x, double y);
   }

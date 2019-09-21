package Enum;

 enum TipoDocumento {
    CPF {
        @Override
        public String geraNumeroTeste() {
            return null;
        }
    },CNPJ {
         @Override
         public String geraNumeroTeste() {
             return null;
         }
     };

    public abstract String geraNumeroTeste();
}

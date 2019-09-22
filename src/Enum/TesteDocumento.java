package Enum;

public class TesteDocumento {
    public static void main(String[] args) {

      /*  for(TipoDocumento doc: TipoDocumento.values()){
            System.out.println(doc+" "+doc.geraNumeroTeste() );
        }*/

      Pessoa pessoa = new Pessoa();
      pessoa.setTipoDocumento(Enum.valueOf(TipoDocumento.class,"CPF"));
      pessoa.setNumeroDocumento(pessoa.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoa);

      Pessoa pessoaPj = new Pessoa();
      pessoaPj.setTipoDocumento(Enum.valueOf(TipoDocumento.class,"CNPJ"));
      pessoaPj.setNumeroDocumento(pessoaPj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaPj);

    }
}

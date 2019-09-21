package Enum;

public class TesteEnum {
    public static void main(String[] args) {


        DiaSemana dia;
       //System.out.println(Enum.valueOf(DiaSemana.class,"SEGUNDA"));
        dia = Enum.valueOf(DiaSemana.class, "SABADO");
        System.out.println(dia);


        }
    }


package Varargs;

public class TesteVarargs {
    public static void main(String[] args) {
        System.out.println(soma(5,5));
        System.out.println(soma(7,6,8));
        System.out.println(soma(2,4,6,8,1,3,5,7,9));
        System.out.println(soma("Tiago",1,2,3,4,5));

    }

    static int soma (int a , int b){
        return a+b;
    }

    static int soma(int a,int b ,int c){
        return a+b+c;
    }

    static int soma(Integer... numbers){
        int totNumber = 0;
        for(Integer num : numbers){
          totNumber +=num;
        }
        return totNumber;
    }

    static String soma(String name,Integer... numbers){
        int totNumber = 0;
        for(Integer num : numbers){
            totNumber +=num;
        }
        return name+totNumber;
    }



}

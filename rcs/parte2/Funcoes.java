package rcs.parte2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiro = string -> Integer.valueOf(string);
        //Integer a= Integer.valueOf("20");

        System.out.println(retornaNomeAoContrario.apply("Elizio"));
        System.out.println(converterStringParaInteiro.apply("20"));


        //
        //System.out.println(a);
    }
}

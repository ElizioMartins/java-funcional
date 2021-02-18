package rcs;

//package java;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Aula5 {
    public static void main (String[] args) {
            int valor = 20;
            UnaryOperator<Integer> retonarDobro = v -> v * 2;
            System.out.println(retonarDobro.apply(valor));
            System.out.println(valor);



    }
}

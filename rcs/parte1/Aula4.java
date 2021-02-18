package rcs;

//package java;//package java-funcional;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiPredicate;

public class Aula4 {
    public static void main (String[] args) {
        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(10, 12));
        System.out.println(verificarSeEMaior.test(13, 12));


    }
}

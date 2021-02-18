package rcs;

public class Aula6 {

    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor10 -> "Sr. "+valor10;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));
    }

}
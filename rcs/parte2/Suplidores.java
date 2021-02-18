package rcs.parte2;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> instaciaPessoa = () -> new Pessoa();

        System.out.println(instaciaPessoa.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Elizio";
        idade = 46;
    }

    @Override
    public String toString() {
        return String.format("nome : %s, idade: %d",nome,idade);
    }
}

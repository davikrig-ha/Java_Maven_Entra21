package br.com.conexao.model.entity;

public class Cachorro extends Animal {

    public Cachorro() {
    }

    @Override
    public void som() {

            System.out.println("Latindo");

    }

    @Override
    public boolean isAdulto() {
        if (this.vivo) {
            return this.idade >= 24;

        }
        return false;
    }

    @Override
    public void dormir() {
        if (this.vivo){
        System.out.println("zzzzz");}
    }

    @Override
    public void morrer() {
        System.out.println("Eu morri e nem sei qual foi o mes meto linha 743");
    }

    public Cachorro(String nome,  int idade, String sexo) {
        super(nome, "Cachorro", idade, sexo);


    }
}

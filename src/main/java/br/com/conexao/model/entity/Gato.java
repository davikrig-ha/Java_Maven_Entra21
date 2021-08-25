package br.com.conexao.model.entity;

public class Gato extends Animal {

    public Gato() {
    }

    @Override
    public void som()
 {
            System.out.println("Miando");


    }

    @Override
    public boolean isAdulto() {
        if (this.vivo){
        return this.idade >= 12; }
        return false;
    }

    @Override
    public void dormir() {
        if (this.vivo){
        System.out.println("zzzzz");}
    }

    @Override
    public void morrer() {
        System.out.println("Eu morri e nem sei qual foi o mes metro linha 743");
    }

    public Gato(String nome, int idade, String sexo) {
        super(nome, "Gato", idade, sexo);
    }


}

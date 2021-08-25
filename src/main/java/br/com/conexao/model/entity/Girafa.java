package br.com.conexao.model.entity;

public class Girafa extends Animal{

    public Girafa() {
    }

    @Override
    public void som() {

        System.out.println("Relinchar");
    }

    @Override
    public boolean isAdulto() {
        if (this.vivo) {
            if (this.idade >= 36 && this.sexo.equalsIgnoreCase("femea")) {
                return true;
            }

            if (this.idade >= 60 && this.sexo.equalsIgnoreCase("macho")) {
                return true;
            }

        }
            return false;
        }


    @Override
    public void dormir() {
        if (this.vivo) {
        System.out.println("zzzzz");}
    }

    @Override
    public void morrer() {
        this.vivo = false;
        System.out.println("Eu morri e nem sei qual foi o mes meto linha 743");
    }

    public Girafa(String nome,  int idade, String sexo) {
        super(nome, "Girafa", idade, sexo);
    }




}

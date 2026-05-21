package PetShop.entities;

public class Dono {
    private String nome;

    public Dono(){
    }

    public Dono (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

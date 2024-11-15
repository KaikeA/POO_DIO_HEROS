package dio;

public class Heroi {

    private String nome;
    private int idade;

    public Heroi(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    public void fazerAniversario(){
        System.out.println("Parabéns Heroi " + getNome());
    }

    public void atacar(){
    }



}

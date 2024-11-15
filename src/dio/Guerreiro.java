package dio;

public class Guerreiro extends Heroi {

    public Guerreiro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("O Guerreio " + getNome() + " , atacou usando espada!!");

    }
}

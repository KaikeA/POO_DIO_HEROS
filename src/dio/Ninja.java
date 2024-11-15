package dio;

public class Ninja extends Heroi {
    public Ninja(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("O Ninja " + getNome() + " , atacou usando shuriken!!");
    }
}

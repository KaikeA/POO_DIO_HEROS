package dio;

public class Mago extends Heroi{

    public Mago(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("O Mago " + getNome() + " , atacou usando magia!!");
    }
}

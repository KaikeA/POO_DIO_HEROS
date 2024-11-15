package dio;

public class Monge extends Heroi {

    public Monge(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("O Monge " + getNome() + " , atacou usando artes marciais!!");
    }
}

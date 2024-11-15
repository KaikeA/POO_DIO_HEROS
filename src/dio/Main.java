package dio;

public class Main {
    public static void main(String[] args) {

      Mago mago = new Mago("Mago Verde",39);
      mago.atacar();
      mago.fazerAniversario();

      Guerreiro lancelot = new Guerreiro("Lancelot",40);
      lancelot.atacar();
      lancelot.fazerAniversario();

      Monge miage = new Monge("Miague",90);
      miage.atacar();
      miage.fazerAniversario();

      Ninja sonic = new Ninja("Sonic", 18);
      sonic.atacar();
      sonic.fazerAniversario();

    }
}

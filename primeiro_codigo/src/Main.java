//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Criando um objeto do tipo Personagem Mágico
        personagemmagico mago = new personagemmagico("Gandalf",100,"Magia");

        // Atribuindo valores aos atributos do objeto
        mago.nome = "Gandalf";
        mago.nivelEnergia = 100;
        mago.poderMagico = "Magia";

        // Exibindo valores dos atributos do objeto
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);

        personagemmagico elfo = new personagemmagico("legola",50,"arqueiro");

                elfo.nome="Legolas";
                elfo.nivelEnergia= 50;
                elfo.poderMagico="Arqueiro";

                System.out.println(elfo.nome + " Emergia: " + elfo.nivelEnergia + " poder: " + elfo.poderMagico);



    }
}
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        personagemmagico = new personagemmagico();
        int op;

        do {
            System.out.println("Escolha uma opção: \n 1-Cadastrar Personagem \n 2-Exibir Personagem \n 0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine(); // Consumir o newline deixado pelo nextInt
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o poder do personagem:");
                    String poder = sc.nextLine();
                    System.out.println("Digite o nível de energia:");
                    int energia = sc.nextInt();

                    this.nome = nome;
                    this.nivelEnergia = energia;
                    this.poderMagico = poder;
                    break;

                case 2:
                    System.out.println("Nome: " + personagem.nome +
                            " | Poder: " + personagem.poderMagico +
                            " | Nível de energia: " + personagem.nivelEnergia);
                    break;

                case 0:
                    System.out.println("Finalizando o programa");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 0);

        sc.close();
    }
}
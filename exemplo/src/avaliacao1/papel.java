package avaliacao1;

public class papel {

    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma cor para a parede:");
        System.out.println("1 - Azul");
        System.out.println("2 - Verde");
        System.out.println("3 - Vermelho");
        System.out.println("4 - Amarelo");
        System.out.println("5 - Branco");

        System.out.print("Digite o número da sua escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Azul.");
                break;
            case 2:
                System.out.println("Você escolheu Verde.");
                break;
            case 3:
                System.out.println("Você escolheu Vermelho.");
                break;
            case 4:
                System.out.println("Você escolheu Amarelo.");
                break;
            case 5:
                System.out.println("Você escolheu Branco.");
                break;
            default:
                System.out.println("Escolha inválida!");
        }

        scanner.close();
    }
}
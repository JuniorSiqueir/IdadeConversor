import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int idade, meses, dias;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a sua idade(em anos)?");

        idade = scanner.nextInt();

        System.out.println("O que você deseja ver? \n1 - Ver sua idade em meses \n2 - Ver sua idade em dias");

        int escolha = scanner.nextInt();

        meses = idade * 12;
        dias = idade * 365;

        if (escolha == 1) {
            System.out.println("Voce possui " + meses + " meses de vida");
        } else if (escolha == 2) {
            System.out.println("Voce possui " + dias + " dias de vida");
        } else {
            System.out.println("Opção invalida!");
        }

        scanner.close();
    }
}

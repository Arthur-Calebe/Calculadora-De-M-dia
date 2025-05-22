import java.util.Scanner;

public class ContadorDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota primeiro bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota segundo bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota terceiro bimestre: ");
        double nota3 = scanner.nextDouble();

        double mediaTotal = (nota1 + nota2 + nota3) / 3;

        //System.out.println("Sua média total é: "+mediaTotal);

        if (mediaTotal < 5) {
            System.out.println("Sua média total é: %.2f%n " + mediaTotal + ", Você está REPROVADO.");
        } else {
            System.out.println("Sua média total é: %.2f%n" + mediaTotal + ", você está APROVADO. ");
        }

        scanner.close();
    }
}

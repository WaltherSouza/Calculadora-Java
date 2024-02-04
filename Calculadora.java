import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        double a = sc.nextDouble();
        System.out.println("Insira o segundo valor:");
        double b = sc.nextDouble();
        System.out.println("\nEscolha uma das opções abaixo:\n" + "1 - Somar\n" + "2 - Subtrair\n" + "3 - Dividir\n" + "4 - Multiplicar");
        char operacao;
        do {
            System.out.println("\nEscolha uma das operações matemáticas:" +
                    "\n+ para adição" +
                    "\n- para subtração" +
                    "\n* para multiplicação" +
                    "\n/ para divisão");
            operacao = sc.next().charAt(0);
        } while (!((operacao == '+') || (operacao == '-') || (operacao == '*') || (operacao == '/')));

        switch (operacao) {
            case '+':
                System.out.printf("%f + %f = %.2f\n", a, b, soma(a, b));
                break;
            case '-':
                System.out.printf("%.1f - %.1f = %.2f\n", a, b, subtracao(a, b));
                break;
            case '*':
                System.out.printf("%.1f x %.1f = %.0f\n", a, b, multiplicacao(a, b));
                break;
            case '/':
                if (b != 0) {
                    System.out.printf("%.1f / %.1f = %.2f\n", a, b, divisao(a, b));
                } else {
                    System.err.println("Erro! Não é possível dividir por zero.");
                }
                break;
            default:
                System.err.println("Operação inválida!");
        }
    }

    // Métodos que realizam as operações matemáticas
    private static double soma(double n1, double n2) {
        return n1 + n2;
    }

    private static double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    private static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    private static double divisao(double n1, double n2) {
        return n1 / n2;
    }
    }
    

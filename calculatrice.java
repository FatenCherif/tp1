import java.util.Scanner;

// Classe Calculatrice avec les opérations de base
class Calculatrice {
    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro non autorisée.");
        }
        return a / b;
    }
}

// Classe Test avec la méthode main
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();
        
        System.out.println("Bienvenue dans la calculatrice simple !");
        
        try {
            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le second nombre : ");
            double num2 = scanner.nextDouble();

            System.out.print("Choisissez une opération (+, -, *, /) : ");
            char operation = scanner.next().charAt(0);

            double resultat;
            switch (operation) {
                case '+':
                    resultat = calc.addition(num1, num2);
                    break;
                case '-':
                    resultat = calc.soustraction(num1, num2);
                    break;
                case '*':
                    resultat = calc.multiplication(num1, num2);
                    break;
                case '/':
                    resultat = calc.division(num1, num2);
                    break;
                default:
                    System.out.println("Opération non valide !");
                    return;
            }

            System.out.println("Résultat : " + resultat);
        } catch (Exception e) {
            System.out.println("Erreur : Entrée invalide.");
        } finally {
            scanner.close();
        }
    }
}

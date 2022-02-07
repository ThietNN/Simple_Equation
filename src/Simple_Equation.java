import java.util.Scanner;

public class Simple_Equation {
    public static void main(String[] args) {
        System.out.println("Simple Equation Solver");
        System.out.println("Simple Equation is given as 'a * x + b = c', please enter constants below ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        double a = scanner.nextDouble();

        System.out.println("b:");
        double b = scanner.nextDouble();

        System.out.println("c:");
        double c = scanner.nextDouble();

        if (a != 0 ){
            double x = (c-b)/a;
            System.out.println("x = " + x );
        }
        else{
            if (b == c){
                System.out.println("The solution is all x");
            }
            else{
                System.out.println("No solution");
            }
        }
    }
}

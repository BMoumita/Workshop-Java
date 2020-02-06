package controlstatement;
import java.util.Scanner;

public class SwitchcaseDemo {
    public static void main(String[] args) {
        SwitchcaseDemo switchcaseDemo = new SwitchcaseDemo();
        switchcaseDemo.dosSwitchCase();
    }

    void dosSwitchCase() {
        System.out.print("Enter values of a and b : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Addition : " + (a + b));
                break;
            case 2:
                System.out.println("Sub : " + (a - b));
                break;
            case 3:
                System.out.println("Mul : " + (a * b));
                break;
            case 4:
                System.out.println("Div : " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}



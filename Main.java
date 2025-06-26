import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число 1");

            float n = scanner.nextInt();
            System.out.println("Введите число 2");

            float m = scanner.nextInt();
            System.out.println("Введите операцию");
            String b = scanner.next();
            System.out.println("Введите операцию");


                switch (b) {
                    case "+" -> System.out.println(n + m);
                    case "-" -> System.out.println(n - m);
                    case "*" -> System.out.println(n * m);
                    case "/" -> System.out.println(n / m);
                    default -> System.out.println("Операция не распознана. Повторите ввод.");

                }

        }
















    }

}
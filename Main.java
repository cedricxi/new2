import java.util.Scanner;

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("введите число 1");
            float n = sc.nextInt();
            System.out.println("введите число 2");
            float m = sc.nextInt();
            System.out.println("введите число 3");
            float f = sc.nextInt();

            if (n > m && n > f) {
                System.out.println(n);
            } else if  (n < f && f > m) {
                System.out.println(f);
            }else{
                System.out.println(m);
            }
        }

    }
}
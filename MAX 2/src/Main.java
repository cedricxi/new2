import java.util.Scanner;

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {



            int[] arr = new int[4];
            Scanner sc1 = new Scanner(System.in);

            for(int i = 0; i < arr.length; i=i+1){
                System.out.print("Введите числа: ");
                int value = sc1.nextInt();
                arr[i] =  value;
            }
            int min = arr[0];
            for(int i = 0; i < arr.length; i++){

                if(arr[i] < min){
                    min = arr[i];

                }


            }
        System.out.println("minimal " + min);
    }

}
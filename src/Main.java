import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("наименование товара: ");
        String num = scanner.nextLine();
        System.out.printf("Ваш товар %s \n", num);
        scanner.nextLine();
        System.out.print("введите количество: ");
        int quantity = scanner.nextInt();
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        System.out.print("Input height: ");
        float height = scanner.nextFloat();
        System.out.printf("Ваш заказ принят. Товар: %s Age: %d Height: %.2f \n", name, age, height);
        scanner.close();
    }
}
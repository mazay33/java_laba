import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void displayResult(int daysPassed) {
        System.out.println("Количество дней, прошедших с начала года: " + daysPassed);
    }

    public int getDay() {
        System.out.print("Введите день: ");
        return scanner.nextInt();
    }

    public int getMonth() {
        System.out.print("Введите месяц: ");
        return scanner.nextInt();
    }
}
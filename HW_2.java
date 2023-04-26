import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько посылок вы хотите отправить?:");
        int count = scanner.nextInt();
        System.out.println("Сколько весит одна коробка в кг:");
        double weight = scanner.nextDouble();
        System.out.println("Укажите ваше полное имя:");
        scanner.nextLine(); // stub
        String fullName = scanner.nextLine();
        System.out.println("Укажите адрес отправки:");
        String address = scanner.nextLine();

        double total = count * weight;


        String label = "\nПолучатель: \"" + fullName.toUpperCase() + "\"\n"
                + "Адрес получателя: \"" + address.toUpperCase() + "\"\n"
                + "Вес посылки: " + total + " kg";


        System.out.println(label);

        System.out.println("Все верно да/нет?");
        boolean isCorrect = scanner.nextBoolean();
    }
}

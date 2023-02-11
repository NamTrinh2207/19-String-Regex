import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên lớp: ");
        String name = scanner.nextLine();
        String nameExample = "^[CAP]([0-9]{4})*[GHIKLM]$";
        if (name.matches(nameExample)) {
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }
}
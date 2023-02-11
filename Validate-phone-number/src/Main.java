import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số điện thoại:  ");
        String name = scanner.nextLine();
        String phoneNumber = "^[0-9]{2}-0[0-9]{9}$";
        if (name.matches(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
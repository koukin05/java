
import java.util.Scanner;

public class Bien {

    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = a + b;
        System.out.println("SUM = " + c); //println không hỗ trợ định dạng chuỗi %d(số nguyên),%f(số thực),%s(chuỗi3)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Age is: ");
        int number = scanner.nextInt(); // nhận 1 số nguyên từ bàn phím

        scanner.nextLine(); // Thêm dòng này để bỏ qua ký tự xuống dòng sau khi nhập số nguyên

        System.out.print("Your Name is: ");
        String line = scanner.nextLine(); // nhận 1 chuỗi từ bàn phím

        System.out.print("Your Number is: ");
        double db = scanner.nextDouble(); // nhận 1 số thực từ bàn phím

        System.out.println("My Age: " + number + " My Name: " + line + " My Number: " + db);

        System.out.println("Nhập số thứ 1: ");
        int o = scanner.nextInt();
        System.out.println("Nhập số thứ 2: ");
        int p = scanner.nextInt();
        int k = Math.max(o, p);
        System.out.println("Max = " + k);

        scanner.close(); // Đóng Scanner sau khi sử dụng
    }

}

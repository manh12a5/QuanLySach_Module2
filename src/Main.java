import java.util.Scanner;

public class Main {
    static BookManager bookManager = new BookManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Quản lý sách");
            System.out.println("1. Tạo mới");
            System.out.println("2. Sửa");
            System.out.println("3. Tìm giá lớn nhất");
            System.out.println("4. Tính tổng tiền");
            System.out.println("0. Thoát");
            System.out.print("Choice number: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createNewBook();
                    break;
                case 2:
                    editNewBook();
                    break;
                case 3:
                    System.out.println("Giá tiền lớn nhất là: " + bookManager.getMaxPrice());
                    break;
                case 4:
                    System.out.println("Tổng tiền phải chi: " + bookManager.getSumPrice());
                    break;
            }
        } while (choice != 0);
        System.exit(0);
    }

    private static void createNewBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Nhập giá tiền: ");
        int price = scanner.nextInt();
        System.out.print("Nhập số lượng: ");
        int number = scanner.nextInt();
        System.out.print("Nhập trọng lượng: ");
        double weight = scanner.nextDouble();
        Book book = new Book(name, author, price, number, weight);
        bookManager.addNewBook(book);
    }

    private static void editNewBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí sách muốn sửa: ");
        int index = scanner.nextInt();
        System.out.print("Sửa tên: ");
        String name = scanner.nextLine();
        System.out.print("Sửa tên tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Sửa giá tiền: ");
        int price = scanner.nextInt();
        System.out.print("Sửa số lượng: ");
        int number = scanner.nextInt();
        System.out.print("Sửa trọng lượng: ");
        double weight = scanner.nextDouble();
        Book book = new Book(name, author, price, number, weight);
        bookManager.editBookByIndex(index, book);
    }

}

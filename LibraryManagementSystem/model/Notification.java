package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notification {
    private String borrowerName;  // Tên người mượn
    private String borrowDate;    // Ngày mượn
    private String bookId;        // ID sách
    private String returnDate;    // Ngày hẹn trả
    private int fine;             // Tiền phạt

    private static final String FILE_PATH = "notifications.txt";

    // Constructor
    public Notification(String borrowerName, String borrowDate, String bookId, String returnDate, int fine) {
        this.borrowerName = borrowerName;
        this.borrowDate = borrowDate;
        this.bookId = bookId;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    // toString để lưu vào file
    @Override
    public String toString() {
        return "User: " + borrowerName +
               " | BorrowDate: " + borrowDate +
               " | BookID: " + bookId +
               " | ReturnDate: " + returnDate +
               " | Fine: " + fine;
    }

    // Ghi thông báo vào file
    public static void addNotification(Notification n) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(n.toString());
            bw.newLine();
            System.out.println(" Đã lưu thông báo!");
        } catch (IOException e) {
            System.err.println(" Lỗi khi ghi thông báo: " + e.getMessage());
        }
    }

    // Đọc toàn bộ thông báo từ file
    public static List<String> getNotifications() {
        List<String> notifications = new ArrayList<>();
        try (FileReader fr = new FileReader(FILE_PATH);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                notifications.add(line);
            }
        } catch (IOException e) {
            System.err.println(" Lỗi khi đọc thông báo: " + e.getMessage());
        }
        return notifications;
    }

    // Xóa toàn bộ nội dung file
    public static void clearNotifications() {
        try (FileWriter fw = new FileWriter(FILE_PATH, false)) {
            fw.write("");
            System.out.println(" Đã xóa toàn bộ lịch sử.");
        } catch (IOException e) {
            System.err.println(" Lỗi khi xóa lịch sử: " + e.getMessage());
        }
    }

    // Tra cứu thông báo theo từ khóa
    public static void searchNotifications(String keyword) {
        List<String> notifications = getNotifications();
        boolean found = false;
        System.out.println("\n🔍 Kết quả tra cứu với từ khóa: \"" + keyword + "\"");
        for (int i = 0; i < notifications.size(); i++) {
            if (notifications.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i + 1) + ". " + notifications.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("(Không tìm thấy kết quả)");
        }
    }

    // Menu console sử dụng Scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU LỊCH SỬ MƯỢN SÁCH =====");
            System.out.println("1. Thêm thông báo");
            System.out.println("2. Xem lịch sử");
            System.out.println("3. Xóa toàn bộ lịch sử");
            System.out.println("4. Tra cứu thông báo");
            System.out.println("0. Thoát");
            System.out.print("👉 Chọn: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // tránh trôi lệnh

            switch (choice) {
                case 1:
                    System.out.print("Tên người mượn: ");
                    String name = scanner.nextLine();
                    System.out.print("Ngày mượn (yyyy-MM-dd): ");
                    String borrowDate = scanner.nextLine();
                    System.out.print("ID sách: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Ngày hẹn trả (yyyy-MM-dd): ");
                    String returnDate = scanner.nextLine();
                    System.out.print("Tiền phạt: ");
                    int fine = scanner.nextInt();
                    scanner.nextLine();

                    Notification n = new Notification(name, borrowDate, bookId, returnDate, fine);
                    addNotification(n);
                    break;

                case 2:
                    System.out.println("\n📜 Lịch sử mượn sách:");
                    List<String> history = getNotifications();
                    if (history.isEmpty()) {
                        System.out.println("(Trống)");
                    } else {
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println((i + 1) + ". " + history.get(i));
                        }
                    }
                    break;

                case 3:
                    clearNotifications();
                    break;

                case 4:
                    System.out.print("Nhập từ khóa cần tra cứu (tên, id sách...): ");
                    String keyword = scanner.nextLine();
                    searchNotifications(keyword);
                    break;

                case 0:
                    System.out.println("👋 Thoát chương trình.");
                    break;

                default:
                    System.out.println(" Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }
}

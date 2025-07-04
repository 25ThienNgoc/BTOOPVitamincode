package VanDung4OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementImpl management = new EmployeeManagementImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm phòng ban");
            System.out.println("2. Cập nhật thông tin phòng ban");
            System.out.println("3. Thêm nhân viên");
            System.out.println("4. Cập nhật thông tin nhân viên");
            System.out.println("5. Hiển thị danh sách phòng ban");
            System.out.println("6. Hiển thị danh sách nhân viên theo phòng ban");
            System.out.println("7. Hiển thị danh sách nhân viên toàn công ty");
            System.out.println("8. Hiển thị danh sách phó phòng, trưởng phòng");
            System.out.println("9. Tính tổng lương của từng phòng");
            System.out.println("10. Thoát");

            System.out.print("Chọn chức năng (1-10): ");
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số từ 1 đến 10!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Thêm phòng ban");
                    break;

                case 2:
                    System.out.println("Cập nhật phòng ban");
                    break;

                case 3:
                    System.out.println("Thêm nhân viên");
                    break;

                case 4:
                    System.out.println("Cập nhật nhân viên");
                    break;

                case 5:
                    management.showAllDepartments();
                    break;

                case 6:
                    //management.showEmployeesByDepartment();
                    break;

                case 7:
                    management.showAllEmployees();
                    break;

                case 8:
                    management.showManagersAndViceManagers();
                    break;

                case 9:
                    management.showTotalSalaryByDepartment();
                    break;

                case 10:
                    System.out.println("Thoát chương trình!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
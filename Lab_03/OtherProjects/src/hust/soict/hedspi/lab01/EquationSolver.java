package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU GIAI PHUONG TRINH ---");
            System.out.println("1. Phuong trinh bac nhat 1 an (ax + b = 0)");
            System.out.println("2. He phuong trinh bac nhat 2 an");
            System.out.println("3. Phuong trinh bac hai 1 an (ax^2 + bx + c = 0)");
            System.out.println("0. Thoat");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    solveFirstDegree(sc);
                    break;
                case 2:
                    solveLinearSystem(sc);
                    break;
                case 3:
                    solveSecondDegree(sc);
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
        
        sc.close();
    }

    // 1. Phuong trinh bac nhat: ax + b = 0
    public static void solveFirstDegree(Scanner sc) {
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }
    }

    // 2. He phuong trinh bac nhat 2 an (Dung dinh thuc)
    public static void solveLinearSystem(Scanner sc) {
        System.out.println("Nhap he so cho pt1 (a11*x1 + a12*x2 = b1):");
        double a11 = sc.nextDouble();
        double a12 = sc.nextDouble();
        double b1 = sc.nextDouble();
        
        System.out.println("Nhap he so cho pt2 (a21*x1 + a22*x2 = b2):");
        double a21 = sc.nextDouble();
        double a22 = sc.nextDouble();
        double b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("He co nghiem duy nhat: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He co vo so nghiem.");
            } else {
                System.out.println("He vo nghiem.");
            }
        }
    }

    // 3. Phuong trinh bac hai: ax^2 + bx + c = 0
    public static void solveSecondDegree(Scanner sc) {
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            // Tro thanh phuong trinh bac nhat bx + c = 0
            if (b == 0) {
                if (c == 0) System.out.println("Vo so nghiem.");
                else System.out.println("Vo nghiem.");
            } else {
                System.out.println("Nghiem x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem thuc.");
            }
        }
    }
}

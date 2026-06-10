package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class ArrayProcessor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu n: ");
        int size = input.nextInt();
        double[] numbers = new double[size];
        
        int i = 0;
        while (size > i) {
            System.out.print("Nhap gia tri phan tu: ");
            numbers[i] = input.nextDouble();
            i++;
        }

        for (int a = 0; a < (size - 1); a++) {
            for (int b = a + 1; b < size; b++) {
                if (numbers[a] > numbers[b]) {
                    double swapValue = numbers[a];
                    numbers[a] = numbers[b];
                    numbers[b] = swapValue;
                }
            }
        }

        double total = 0;
        System.out.println("Danh sach sau khi sap xep:");
        for (int k = 0; k < size; k++) {
            System.out.print(numbers[k] + " ");
            total = total + numbers[k];
        }

        double averageValue = total / size;
        
        System.out.print("\nSum of Array is " + total);
        System.out.print("\nAverage of Array is " + averageValue);
        
        input.close();
    }
}

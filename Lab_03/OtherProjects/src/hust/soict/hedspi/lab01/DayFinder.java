package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class DayFinder {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String strMonth;
        int nYear;
        int mIndex;

        do {
            System.out.print("Nhap thang (full name, abbreviation, 3 letters, or number): ");
            strMonth = keyboard.next();
            System.out.print("Nhap nam: ");
            nYear = keyboard.nextInt();

            mIndex = findMonth(strMonth);

            if (nYear < 1000 || mIndex == -1) {
                System.out.println("Cu phap ko hop le, vui long nhap lai");
            }
            
        } while (nYear < 1000 || mIndex == -1);

        int resultDays = calculateMonthDays(mIndex, nYear);
        System.out.print("The number days in " + strMonth + "-" + nYear + " is " + resultDays);
        
        keyboard.close();
    }

    public static int findMonth(String monthInput) {
        String[][] monthNames = {
            {"January", "Jan.", "Jan", "1"},
            {"February", "Feb.", "Feb", "2"},
            {"March", "Mar.", "Mar", "3"},
            {"April", "Apr.", "Apr", "4"},
            {"May", "May", "May", "5"},
            {"June", "June", "Jun", "6"},
            {"July", "July", "Jul", "7"},
            {"August", "Aug.", "Aug", "8"},
            {"September", "Sept.", "Sep", "9"},
            {"October", "Oct.", "Oct", "10"},
            {"November", "Nov.", "Nov", "11"},
            {"December", "Dec.", "Dec", "12"}
        };

        for (int i = 0; i < 12; i++) {
            for (int k = 0; k < 4; k++) {
                if (monthInput.equalsIgnoreCase(monthNames[i][k])) {
                    return (i + 1);
                }
            }
        }
        return -1;
    }

    public static int calculateMonthDays(int m, int y) {
        int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean checkLeap;
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            checkLeap = true;
        } else {
            checkLeap = false;
        }

        if (checkLeap) {
            return leapYear[m - 1];
        } else {
            return normalYear[m - 1];
        }
    }
}

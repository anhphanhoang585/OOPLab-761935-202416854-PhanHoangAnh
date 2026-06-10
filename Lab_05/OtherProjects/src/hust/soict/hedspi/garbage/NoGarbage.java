package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "c:\\Users\\ADMIN\\OOPLab-761935-202416854-PhanHoangAnh\\Lab_03\\OtherProjects\\test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            
            // Sử dụng StringBuilder/StringBuffer chuyên dụng thay vì String (+)
            StringBuilder outputStringBuilder = new StringBuilder();
            
            for (byte b : inputBytes) {
                outputStringBuilder.append((char)b);
            }
            
            endTime = System.currentTimeMillis();
            System.out.println("Processing time (No Garbage - StringBuilder): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            System.err.println("File not found or unreadable: " + filename);
        }
    }
}

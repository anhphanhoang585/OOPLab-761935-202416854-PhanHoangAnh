package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "c:\\Users\\ADMIN\\OOPLab-761935-202416854-PhanHoangAnh\\Lab_03\\OtherProjects\\test.txt"; 
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char)b;
            }
            endTime = System.currentTimeMillis();
            System.out.println("Processing time (String concatenation uses lots of garbage): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            System.err.println("File not found or unreadable: " + filename);
        }
    }
}

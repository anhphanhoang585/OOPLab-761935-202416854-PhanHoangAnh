public class AimsProject {
    public static void main(String[] args) {
        // Lớp này hiện tại dùng để khởi chạy dự án AimsProject
        System.out.println("Chào mừng bạn đến với hệ thống AIMS!");
        
        // Ví dụ thử nghiệm tạo đối tượng DVD từ Task 10
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        System.out.println("DVD vừa tạo: " + dvd1.getTitle() + " - Giá: " + dvd1.getCost() + "$");

        
    }
}
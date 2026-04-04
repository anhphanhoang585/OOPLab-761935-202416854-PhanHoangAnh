public class AimsProject {
    public static void main(String[] args) {
        // Lớp này hiện tại dùng để khởi chạy dự án AimsProject
        System.out.println("Chào mừng bạn đến với hệ thống AIMS!");
        
        // Ví dụ thử nghiệm tạo đối tượng DVD từ Task 10
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        System.out.println("DVD vừa tạo: " + dvd1.getTitle() + " - Giá: " + dvd1.getCost() + "$");

        // 1. Tạo mới một giỏ hàng
        
        Cart anOrder = new Cart();

        // 2. Thêm các DVD vào giỏ hàng (Sử dụng cả dvd1 đã tạo ở trên)
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // 3. Tính tổng tiền lần đầu (Kết quả mong đợi: 19.95 + 24.95 + 18.99 = 63.89)
        System.out.println("\n--- Kiểm tra tổng tiền lần 1 ---");
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // (Tùy chọn) In danh sách để xem cột cho đẹp
        anOrder.printCart();

        // 4. Xóa đĩa dvd2 (Star Wars) khỏi giỏ hàng
        System.out.println("\n--- Thực hiện xóa đĩa: " + dvd2.getTitle() + " ---");
        anOrder.removeDigitalVideoDisc(dvd2);

        // 5. Tính lại tổng tiền sau khi xóa để check logic (Kết quả mong đợi: 63.89 - 24.95 = 38.94)
        System.out.println("\n--- Kiểm tra tổng tiền sau khi xóa ---");
        System.out.print("Total Cost after removal is: ");
        System.out.println(anOrder.totalCost());
        
      
        anOrder.printCart();
    }
}
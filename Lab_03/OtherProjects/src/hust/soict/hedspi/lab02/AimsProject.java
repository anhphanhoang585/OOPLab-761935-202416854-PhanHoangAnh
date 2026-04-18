package hust.soict.hedspi.lab02;
public class AimsProject {
    public static void main(String[] args) {
        System.out.println("ChÃ o má»«ng báº¡n Ä‘áº¿n vá»›i há»‡ thá»‘ng AIMS!");
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        System.out.println("DVD vá»«a táº¡o: " + dvd1.getTitle() + " - GiÃ¡: " + dvd1.getCost() + "$");

        // 1. Táº¡o má»›i má»™t giá» hÃ ng
        Cart anOrder = new Cart();

        // 2. ThÃªm cÃ¡c DVD vÃ o giá» hÃ ng (Sá»­ dá»¥ng cáº£ dvd1 Ä‘Ã£ táº¡o á»Ÿ trÃªn)
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // 3. TÃ­nh tá»•ng tiá»n láº§n Ä‘áº§u (Káº¿t quáº£ mong Ä‘á»£i: 19.95 + 24.95 + 18.99 = 63.89)
        System.out.println("\n--- Kiá»ƒm tra tá»•ng tiá»n láº§n 1 ---");
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // (TÃ¹y chá»n) In danh sÃ¡ch Ä‘á»ƒ xem cá»™t cho Ä‘áº¹p
        anOrder.printCart();

        // 4. XÃ³a Ä‘Ä©a dvd2 (Star Wars) khá»i giá» hÃ ng
        System.out.println("\n--- Thá»±c hiá»‡n xÃ³a Ä‘Ä©a: " + dvd2.getTitle() + " ---");
        anOrder.removeDigitalVideoDisc(dvd2);

        // 5. TÃ­nh láº¡i tá»•ng tiá»n sau khi xÃ³a Ä‘á»ƒ check logic (Káº¿t quáº£ mong Ä‘á»£i: 63.89 - 24.95 = 38.94)
        System.out.println("\n--- Kiá»ƒm tra tá»•ng tiá»n sau khi xÃ³a ---");
        System.out.print("Total Cost after removal is: ");
        System.out.println(anOrder.totalCost());
        
      
        anOrder.printCart();
    }
}

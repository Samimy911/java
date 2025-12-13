public class QuestionB {
    public static void main(String[] args) {

        // === GROUP 1 ===
        int qty1 = 4;
        double price1 = 20_000_000; 
        double discount1 = 0.30;     // 30%

        // === GROUP 2 ===
        int qty2 = 3;
        double price2 = 150_000_000;
        double discount2 = 0.15;     // 15%

        // === GROUP 3 ===
        int qty3 = 3;
        double price3 = 10_000_000;
        double discount3 = 0.40;     // 40%

        // Revenue AFTER discount
        double revenue1 = qty1 * price1 * (1 - discount1);
        double revenue2 = qty2 * price2 * (1 - discount2);
        double revenue3 = qty3 * price3 * (1 - discount3);

        // Total revenue
        double totalRevenue = revenue1 + revenue2 + revenue3;

        // Total value WITHOUT discount
        double totalListValue = (qty1 * price1) + (qty2 * price2) + (qty3 * price3);

        // Total discount amount = loss to company
        double totalDiscount = totalListValue - totalRevenue;

        // === OUTPUT ===
        System.out.println("===== AUCTION SALES REPORT =====");
        System.out.println();

        System.out.println("Group 1: 4 Houses @ 20,000,000 Rwf each, Discount 30%");
        System.out.println("Revenue: " + revenue1);

        System.out.println();
        System.out.println("Group 2: 3 Luxury Apartments @ 150,000,000 Rwf each, Discount 15%");
        System.out.println("Revenue: " + revenue2);

        System.out.println();
        System.out.println("Group 3: 3 Cheap Houses @ 10,000,000 Rwf each, Discount 40%");
        System.out.println("Revenue: " + revenue3);

        System.out.println();
        System.out.println("----- SUMMARY -----");
        System.out.println("Total List Price (No Discounts): " + totalListValue);
        System.out.println("Total Revenue (After Discounts): " + totalRevenue);
        System.out.println("Total Discount / Company Loss: " + totalDiscount);
    }
}

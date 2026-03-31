import java.text.NumberFormat;

public class MonthSalesApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        double[] monthSales = {
            1200.50, 1500.75, 1784.59, 2100.00,
            1950.25, 2200.80, 2500.60, 2700.40,
            3279.62, 2900.10, 3100.55, 5475.85
        };

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            int monthNumber = Console.getInt("Enter month number: ");
            
            if (monthNumber < 1 || monthNumber > 12) {
                Console.displayLine("Invalid month number. Try again.");
                continue;
            }
            
            int index = monthNumber - 1;
            Console.displayLine("Sales for " + monthNames[index] + ": " 
                    + currency.format(monthSales[index]));

            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        double totalSales = 0;
        for (int i = 0; i < monthSales.length; i++) {
            totalSales += monthSales[i];
        }
        
        Console.displayLine("Total sales: " + currency.format(totalSales));
        Console.displayLine();
    }
}
public class ElectronicsReport {

    public static void main(String[] args) {

        // 1. Declare and initialize the single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // 2. Declare and initialize the two-dimensional array for sales data
        // Rows represent cities, Columns represent PS5, XBOX, SWITCH respectively
        int[][] sales = {
                {1000, 2000, 3000}, // Cape Town
                {2000, 3000, 4000}, // Port Elizabeth
                {1500, 1100, 1200}  // Pretoria
        };

        // Variables to track total sales and the city with the most sales
        int maxSales = -1;
        String topCity = "";

        // --- OUTPUT SECTION 1: GAMING CONSOLE REPORT ---
        System.out.println("----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %-8s %-8s %-8s%n", "", "PS5", "XBOX", "SWITCH");

        // Loop through the single-dimensional array to print sales data
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-8d %-8d %-8d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        // --- OUTPUT SECTION 2: CONSOLE SALES TOTALS FOR EACH CITY ---
        System.out.println("\n----------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");

        // Loop through the arrays to calculate and print the total sales for each city
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;

            // Sum the row
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-15s %d%n", cities[i], cityTotal);

            // Check if this city has the most sales so far
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        // --- OUTPUT SECTION 3: CITY WITH MOST SALES ---
        System.out.println("\nCITY WITH THE MOST SALES: " + topCity);
        System.out.println("----------------------------------------");
    }
}
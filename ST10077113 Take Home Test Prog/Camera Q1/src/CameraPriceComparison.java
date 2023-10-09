public class CameraPriceComparison {
    public static void main(String[] args) {
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] cameraPrices = {
            {10500, 8500},
            {9500, 7200},
            {12000, 8000}
        };

        int maxPriceDifference = -1;
        String maxPriceDifferenceManufacturer = "";

        System.out.println("Camera Technology Report:");
        System.out.println("Manufacturer\tMirrorless Price\tDSLR Price\tPrice Difference\tStars");

        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;
            String stars = "";

            if (priceDifference >= 2500) {
                stars = "***";
            }

            System.out.println(manufacturer + "\t\t" + mirrorlessPrice + "\t\t" + dslrPrice + "\t\t" + priceDifference + "\t\t" + stars);

            if (priceDifference > maxPriceDifference) {
                maxPriceDifference = priceDifference;
                maxPriceDifferenceManufacturer = manufacturer;
            }
        }

        System.out.println("\nManufacturer with the Greatest Price Difference: " + maxPriceDifferenceManufacturer);
        System.out.println("Total Price Difference: " + maxPriceDifference);
    }
}

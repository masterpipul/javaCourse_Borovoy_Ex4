public class SecondTask {
    public static void main(String[] args) {
        String city = "city";
        int population = 54327;
        float percentageOfUnemployed = 0.13F;
        System.out.printf("%s; %d; %.2f\n", city, population, percentageOfUnemployed);

        char section = 'a';
        int number = 243;
        float cost = 346.7f;
        System.out.printf("%s; %d; %.1f\n", section, number, cost);

        String name = "Sergey";
        int age = 23;
        double height = 190.5;
        System.out.printf("%s; %d; %.1f\n", name, age, height);

        char symOne = 'A';
        char symTwo = 'O';
        int carNum = (int) symOne + symTwo + symTwo + symTwo + symOne + symOne;
        double carWeight = 1925.38;
        System.out.printf("%s%s%s%s%s%s; %d; %.2f\n", symOne, symTwo, symTwo, symTwo, symOne, symOne, carNum, carWeight);

        String companyName = "I-Teco";
        int annualIncome = 948149124;
        double marketShare = 0.23;
        System.out.printf("%s; %d; %.2f\n", companyName, annualIncome, marketShare);

        char rh = '+';
        int bloodType = 3;
        float percentPerson = 0.234f;
        System.out.printf("rh: %s; bloodType: %d; percentPerson: %.3f\n", rh, bloodType, percentPerson);

        String universityName = "MGU";
        int students = 87323;
        double expelled = 0.123;
        System.out.printf("universityName: %s; students: %d; expelled: %.3f\n", universityName, students, expelled);

        char movieRating = 'A';
        int copiesSold = 123412;
        double rating = 7.3;
        System.out.printf("movieRating: %s; copiesSold: %d; rating: %.1f\n", movieRating, copiesSold, rating);

        String brandName = "Nike";
        long quantityOfGoods = 3452636322341324l;
        float salePercent = 0.87f;
        System.out.printf("brandName: %s; quantityOfGoods: %d; salePercent: %.1f\n", brandName, quantityOfGoods, salePercent);

        String product = "table";
        long barcode = 12342355464324l;
        double age30Plus = 0.4;
        System.out.printf("product: %s; barcode: %d; age30Plus: %.1f\n", product, barcode, age30Plus);

    }
}

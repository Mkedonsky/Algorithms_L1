public class info {
    public static void main(String[] args) {


        House house = new House();
        Skyscraper skyscraper = new Skyscraper();

        long lStartTime = System.nanoTime();

        house.above(10);
        skyscraper.above(1000);

        house.wider(8.67);
        skyscraper.wider(25.6);

        house.eco('A');
        skyscraper.eco('C');

        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;

        System.out.println("Время расчетов в секундах : " + output/100000);


    }
}

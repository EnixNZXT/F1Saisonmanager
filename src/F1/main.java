package F1;

public class main {
    public static void main(String[] args) {
        DRIVER[] driver = DRIVER.fahrerErstellen();

        POINTS.punktevergabe(driver);
        POINTS.ranking(driver);
    }
}

package S.O.L.I.D_excs.products;

import S.O.L.I.D_excs.Products;

public class Chocolate implements Products {

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double getAmountOfCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * grams;
    }
}

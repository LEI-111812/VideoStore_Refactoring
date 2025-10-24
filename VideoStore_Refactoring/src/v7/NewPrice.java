package v7;

public class NewPrice implements Price{
    public NewPrice() {}

    public double getRentalAmount(int duration) {
        return duration * 3;
    }
}

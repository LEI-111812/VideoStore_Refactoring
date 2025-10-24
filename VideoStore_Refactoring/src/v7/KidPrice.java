package v7;

public class KidPrice implements Price{
    public KidPrice() {}

    public double getRentalAmount(int duration) {
        if (duration > 3) {
            return (1.5+((duration-3)*1.5));
        }
        else{
            return 1.5;
        }
    }
}

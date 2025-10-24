package v7;

public class RegPrice implements Price{
    public RegPrice() {}

    public double getRentalAmount(int duration) {
        if(duration > 2){
            return (2+((duration-2)*1.5));
        }
        else{
            return 2;
        }
    }
}

/**
 * Created by owlslubic on 6/27/16.
 */
public class Car {
    String mColor;
    String mBrand;
    double mTopSpeed;

public Car(String color, String brand, double topSpeed){
    mColor = color;
    mBrand = brand;
    mTopSpeed = topSpeed;
}
    public static void go(){
        System.out.println("Hit the gas!");
    }
    public static void slow(){
        System.out.println("Slow down!");
    }
    public static void stop(){
        System.out.println("HIT THE BREAKS");
    }

    public void setColor(String color){
        mColor = color;
    }
    public String getColor(){
        return mColor;
    }

    public void setBrand(String brand){
        mBrand = brand;
    }
    public String getBrand(){
        return mBrand;
    }

    public void setTopSpeed(double topSpeed){
        mTopSpeed = topSpeed;
    }
    public double getTopSpeed(){
        return mTopSpeed;
    }

}

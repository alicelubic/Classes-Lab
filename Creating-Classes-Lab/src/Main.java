/**
 * Created by owlslubic on 6/27/16.
 */
public class Main {
    static StopLight light = new StopLight("Green");

    static Car prius = new Car("Tan", "Toyota", 100.0);

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            if(light.isGreen()){
                prius.go();
                light.setLightColor("Yellow");
            }
            if(light.isYellow()){
                prius.slow();
                light.setLightColor("Red");
            }
            if(light.isRed()){
                prius.stop();
                light.setLightColor("Green");
            }


        }
    }

}

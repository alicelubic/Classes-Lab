/**
 * Created by owlslubic on 6/27/16.
 */
public class StopLight {
    String mLightColor;

    public StopLight(String lightColor){
        mLightColor = lightColor;
    }

    public boolean isRed(){
        if (mLightColor.equals("Red")) {
        }
        return true;
    }
    public boolean isYellow(){
        if (mLightColor.equals("Yellow")) {
        }
        return true;
    }
    public boolean isGreen(){
        if (mLightColor.equals("Green")){
        }
        return true;
    }

    public void setLightColor(String lightColor){
        mLightColor = lightColor;
        //how to handle incorrect input?

    }


}

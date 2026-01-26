public class LightSwitch {
    public static void main(String[] args){
        boolean isLightOn = false; // light is off
        System.out.println("Light on: " + isLightOn);
        // turn the light on
        isLightOn = true;
        System.out.println("Light on: " + isLightOn);
        // check condition
        if (isLightOn){
            System.out.println("The room is bright.");
        }
        else {
            System.out.println("The room is dark.");
        }
    }
}

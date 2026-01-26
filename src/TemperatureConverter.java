public class TemperatureConverter {
    public static void main(String[] args){
        double celsius = 36.6; // body temperature in Celsius
        System.out.println("Temperature in Clesius: " + celsius);
        double fahrenheit = (celsius * 9/5) + 32; // conversion formula
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

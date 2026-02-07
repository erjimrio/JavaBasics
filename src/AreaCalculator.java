public class AreaCalculator {
    public static int calculateArea(int length, int width){
        return length * width; //returns the area
    }
    public static void displayResult(int  area){
        System.out.println("The area of the rectangle is: " + area);
    }
    public static void main(String[] args){
        int result = calculateArea(5, 10);
        displayResult(result);
    }
}

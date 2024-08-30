import java.util.Scanner;
public class Tempconvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius Value: ");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit", celsius, fahrenheit);
        input.close();
    }
}

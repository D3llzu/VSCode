/*[#5] Converter uma temperatura dada em Celsius para Farenheit e Kelvin. */
import java.util.Scanner;
public class exe5_INPR {
    public static void main (String [] args){
        Scanner scanf = new Scanner (System.in);

        System.out.print("Temperatura atual (°C): ");
        float Celsius = scanf.nextFloat();

        System.out.printf("\nTemperatura em Farenheit: %.2f °F", 1.8 * Celsius + 32);
        System.out.printf("\nTemperatura em Kelvin: %.2f °K", 273 + Celsius);
    }
}
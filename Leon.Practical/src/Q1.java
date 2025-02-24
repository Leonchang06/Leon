

public class Q1 {
    public static double celsiusTofarenheit(double celsius){
        return (celsius*9/5)+32;
    }
    public static double farenheitTocelsius(double farenheit){
        return (farenheit-32)*5/9;
    }
    public static void main(String[] args) throws Exception {
        System.out.printf("%-9s %-12s %-12s %-12s\n", "Celsius", "Fahrenheit", "Fahrenheit","Celsius");

        double celsiusstart = 0.0;
            double farenheitstart = 50.0;
    
        for (int i = 0; i <= 5; i++) {
            
    double celsius = celsiusstart + i * 10 ;
    double farenheit = farenheitstart + i * 10;

    double celsiustofarenheit = celsiusTofarenheit(celsius);
            double farenheittocelsius = farenheitTocelsius(farenheit);

    
            System.out.printf("%-9.1f %-12.4f %-12.1f %-12.4f\n", celsius,celsiustofarenheit, farenheit ,farenheittocelsius);

        }

    }
}

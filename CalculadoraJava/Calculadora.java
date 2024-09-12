public class Calculadora {
    
    public double somar(int a, int b) {
        return new Double(a + b);
    }
    public double somar(double a, double b) {
        return a+b;
    }
    public double somar(int a, Double b){
        return somar(a, b);
    }
    public double somar(String a, String b){
        return Double.parseDouble(a) + Double.parseDouble(b);
    }
    public double somar(double a, int b){
        return a+b;
    }
    public double somar(String a, int b) {
        return somar(a = ".", b);
    }
    public double somar(int a, String B){
        return somar(a, B = ".");
    }
    public double somar(String a, double B){
        return 0.0;
    }
    public double somar(double a, String b) {
        return 0.0;
    }
 
}

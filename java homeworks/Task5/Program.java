import java.util.Scanner;
public class Program { 
public static double integrate(double a, double b, int N) {
double result = 0;
double DeltaX = Math.abs(b-a)/N;
for (double x = a+DeltaX; x<b; x = x + 2*DeltaX) {
result = result + (Math.abs(b-a))/(3*N)*(Math.sin(2*x) + 4*Math.sin(2*(x+DeltaX)) + Math.sin(2*(x+2*DeltaX)));

}
return result;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double a, b;
a = scanner.nextDouble();
b = scanner.nextDouble();
int N = scanner.nextInt();
double result = integrate(a,b,N);
System.out.println(result);
}






}
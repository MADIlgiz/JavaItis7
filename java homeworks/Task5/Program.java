import java.util.Scanner;
public class Program { 
public static double simp(double a, double b, int N) {
double result = 0;
double DeltaX = Math.abs(b-a)/N;
int i = 0;
for (double x = a+DeltaX; x<b; x = x + 2*DeltaX) {
result = result + (Math.abs(b-a))/(3*N)*(Math.cos(x) + 4*Math.cos(x+DeltaX) + Math.cos(x+2*DeltaX));
i++;
}
return result;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double a, b;
a = scanner.nextDouble();
b = scanner.nextDouble();
int N = scanner.nextInt();
double result = simp(a,b,N);
System.out.println(result);
}






}
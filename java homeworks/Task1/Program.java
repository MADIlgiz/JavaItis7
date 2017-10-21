import java.util.Scanner;
class Program {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int a = 0;
int b=0;
int Min = 1000;
int sum = 0;
a = number;
while (number != -1) {
while (number != 0) {
sum = sum + number % 10;
number = number / 10;
}
System.out.println("сумма цифр числа " + sum);
if (sum <= Min) {
Min = sum;
}
if (sum == Min)
{ b=a;
} 
sum = 0;
number = scanner.nextInt();
a = number;
}
System.out.println("Минимальная сумма цифр - " + digitsumMin);
System.out.println("число с минимальной суммой цифр - " + b);
}

}
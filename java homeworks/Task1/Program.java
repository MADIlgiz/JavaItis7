import java.util.Scanner;
class Program {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int a = 0;
int b=0;
int digitsumMin = 1000;
int digitsum = 0;
a = number;
while (number != -1) {
while (number != 0) {
digitsum = digitsum + number % 10;
number = number / 10;
}
System.out.println("сумма цифр числа " + digitsum);
if (digitsum <= digitsumMin) {
digitsumMin = digitsum;
}
if (digitsum == digitsumMin)
{ b=a;
} 
digitsum = 0;
number = scanner.nextInt();
a = number;
}
System.out.println("Минимальная сумма цифр - " + digitsumMin);
System.out.println("число с минимальной суммой цифр - " + b);
}

}
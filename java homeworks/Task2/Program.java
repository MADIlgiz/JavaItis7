import java.util.Scanner;
class Program 
{
	public static void main(String[] args) 
{	
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum=0;
		boolean x = true;
		int y = 1;
		int a = number;
while(number != -1) 
{

while(number !=0)
{
sum = sum + number%10;
number = number/10;
}

System.out.println(""+sum);
if (sum ==1||sum ==2||sum==3){
x = true;
}
if (sum>3)
{
int i = 2;
while (i*i<=sum) {
if (sum % i == 0){ x = false;}
else {x = true;}
i = i + 1;
} 
}
if (x == true)
{System.out.println("простое");
y = y*a;}
else {System.out.println("составное");}
sum = 0;
number = scanner.nextInt();
a = number;

}System.out.println(y);
}}
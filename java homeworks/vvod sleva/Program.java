import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������� ������ �������"); 
	int aSize = scanner.nextInt();
	int a[] = new int[aSize];
	for (int i = 0; i<aSize; i++) {
		System.out.println("������� " + i + " ������� �������");
		a[aSize-1-i] = scanner.nextInt();
		}
	System.out.println("������");
	for (int i = 0; i<aSize; i++) {
		System.out.println(a[i]);
		}
	}
}
import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aSize;
		System.out.println("������� ������ �������");
		aSize = scanner.nextInt();
		int a[] = new int[aSize];
		for (int i = 0; i < aSize; i++) {
		System.out.println("������� "+ i +" ������� ������� "); 
		a[i] = scanner.nextInt();
 			}
		System.out.println("������");
		for (int i = 0; i<aSize; i++) {
		System.out.println(a[i]);
}
		
		
		int Min = a[0];
		int Max = a[0];
		int g = 0;
		int h = 0;
		
	for (int i = 0; i<aSize; i++) {
			if (a[i] <= Min) {
				Min = a[i];
			
			} else {
				Min = Min;

			}
}
		for (int i = 0; i<aSize; i++) {
		if (a[i]>Max) {

				Max = a[i];
			
			} else {
				Max = Max;

			}
		

		}
		for (int i=0; i<aSize ;i++) {
			if (Min == a[i]) {
				g = i;
				System.out.println("����� ������������ �������� "+ i + ", ����������� ������� ������� " + a[g]);
				}
			if (Max == a[i]) {
				h = i;
				System.out.println("����� ������������� �������� "+ i + ", ������������ ������� ������� " + a[h]);
}

}
                        
			int temp = a[g];
			a[g] = a[h];
			a[h] = temp;
	
			
			System.out.println("������ ����� ������������ ������������ � ������������� ��������� �������");
			for (int i=0;i<aSize;i++) {
				System.out.println(a[i]);
}
				
			

				
		}
		
	

}

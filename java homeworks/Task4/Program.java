import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������� ������ �������");
	int aSize  = 0;
	int a[] = null;
	int indexOfMax = 0;
	int Min = 0;
	int Max = 0;
	int indexOfMin = 0;
	int count = 0;
	int x[];
	int p = 0;
	while(true) {
	System.out.println("����:");
	System.out.println("0. ������ ������ �������. ");
	System.out.println("1. �������� ������� � ����� �������.");
	System.out.println("2. �������� ������� � ������ �������.");
	System.out.println("3. ���������� ������ �� �����.");
	System.out.println("4. ������������� ������");
	System.out.println("5. ����� ������. ");
	System.out.println("6. ����� ��������. ");
	System.out.println("7. ������� ������. ");
	System.out.println("8. �����. ");
	int command = scanner.nextInt();
	switch(command) { 
case 0: { System.out.println("������� ������ �������");
	aSize = scanner.nextInt();
	a = new int[aSize];
	System.out.println("������ ������");
}break;

case 1: {
if (count==aSize) {
System.out.println("������ �����");
	} else {
		int element = scanner.nextInt();
		a[count] = element;
		count++;}}

break;
case 2: {	if (count==aSize) {
System.out.println("������ �����");
	} else {
	for(int i = count; i > 0; i--) {
		a[i] = a[i - 1];
} a[0] = scanner.nextInt();
	count++;
	
	

		
}} break;
case 7: { for(int i = 0; i<count; i++) {
		System.out.print(a[i] + " ");
		}
	}break;
case 3: {
for (int i = 0; i<count/2 ; i++) {
 int temp = a[i];
 a[i] = a[aSize - 1 - i];
 a[aSize-1-i] = temp; 
}
for(int i = 0; i<count; i++) {
		System.out.print(a[i] + " ");
		
		}

}break;

case 8: {
System.exit(0);}
break;

case 5: { Min = a[0];
			for (int i = 0; i<count; i++) {
			
			if (a[i] <= Min) {
				Min = a[i];
			
			} 
				
			}System.out.println(Min);
} break;
case 6: {for(int i = 0; i<count; i++)
			{ if (a[i] >= Max) {
			 Max = a[i];
} else { Max = Max;} 
} System.out.println(Max);} break;
case 4: {System.out.println("�������� ��� ����������");
	System.out.println("1. �� �����������.");
	System.out.println("2. �� ��������");
	int command2 = scanner.nextInt();
	switch(command2) {
case 1:
{for(int i = 0; i < count; i++) {
	int min = a[i]; 
	indexOfMin = i;
	for(int j = i; j < count; j++) {
		if (min > a[j]) {
		min = a[j];
		indexOfMin = j;
}
}
int temp = a[i];
a[i] = min;
a[indexOfMin] = temp;
}
for(int i = 0; i<count; i++) {
		System.out.print(a[i] + " ");
		}System.out.println();} break;
case 2: {for(int i = 0; i < count; i++) {
	int max = a[i]; 
	indexOfMax = i;
	for(int j = i; j < count; j++) {
		if (max <= a[j]) {
		max = a[j];
		indexOfMax = j;
}
}
int temp = a[i];
a[i] = max;
a[indexOfMax] = temp;
}
for(int i = 0; i<count; i++) {
		System.out.print(a[i] + " ");
		}System.out.println();
} break;}}break;



			}
}
		}	 
	}	
	

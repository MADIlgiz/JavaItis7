import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int element = 0;
	System.out.println("введите размер массива");
	int aSize = scanner.nextInt();
	int a[] = new int[aSize];
	System.out.println("введите команду");
	int command = scanner.nextInt();
	
	switch(command) {
	case 1:{
		System.out.println("введите элемент массива "); 
		
		for (int i = aSize-1; i > 0 ; i--) { 
		a[i-1] = scanner.nextInt(); ;
		a[i] = a[i-1];
		
		} a[0] = scanner.nextInt();
	
		
	}
 			
	System.out.println("массив");
	for(int i = 0; i < aSize; i++) {
	System.out.println(a[i]);


}break;
	case 2:{
	for (int i = 0; i < aSize; i++) {
		System.out.println("введите "+ i +" элемент массива ");
		a[i] = scanner.nextInt(); 
	}
	for(int i = 0; i < aSize; i++) {
	System.out.println(a[i]);
	}
	}break;
	case 3: {System.exit(0);}
	}
	}
}


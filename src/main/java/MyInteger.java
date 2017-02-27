import java.util.Scanner;

public class MyInteger {
	
	static int iValue;
	
	public MyInteger(int value){
		iValue = value;
	}
	public static int getiValue(){
		return iValue;
	}
	
	public static boolean isEven() {
		if(iValue %2==0)
			return true;
		else
			return false;
		}
	
	public static boolean isOdd() {
		if(iValue %2 != 0)
			return true;
		else
			return false;				
		}
	
	public static boolean isPrime() {
		int i = 0;
		for(i=2; i<=iValue/2;i++)
			if(iValue %i != 0){
				return true; 
			}
			
		return false;
	}
		
	public static boolean isEven(int iValue) {
			if(iValue %2==0)
				return true;
			else
				return false;
			}
		
	public static boolean isOdd(int iValue) {
			if(iValue %2 != 0)
				return true;
			else
				return false;				
			}
		
	public static boolean isPrime(int iValue) {
			int i = 0;
			for(i=2; i<=iValue/2;)
				if(iValue %i != 0){
					return true; }
			return false;
				}
	
	public static boolean isEven1(MyInteger VariableDeclaratorId) {
		return MyInteger.isEven(iValue);
	}
			
	public static boolean isOdd1(MyInteger VariableDeclaratorId) {
		return MyInteger.isOdd(iValue);
	}
			
	public static boolean isPrime1(MyInteger VariableDeclaratorId) {
		return MyInteger.isPrime(iValue);
	}
	
	public boolean equals(int iValue){
		return iValue == getiValue();
	}
	
	public boolean equals(MyInteger VariableDeclaratorId){
		return equals(MyInteger.getiValue());
	}
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int iValue = input.nextInt(); 
		
		if(isEven(iValue)==true)
			System.out.printf("Even");
		else if(isPrime(iValue)==true)
			System.out.printf("Prime");
		else 
			System.out.printf("Odd");
	}
		}	

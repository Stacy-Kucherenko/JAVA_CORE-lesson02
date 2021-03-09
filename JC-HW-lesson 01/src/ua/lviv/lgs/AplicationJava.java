package ua.lviv.lgs;

public class AplicationJava {

	public static void main(String[] args) {
		
//		Завдання 1: Написати по одній змінній кожного типу примітивних даних.
		
//		int i = 21;
//		double d = 3.3;
//		float fl = 3.3F;
//		char ch = 102;
//		boolean b = true;
//		
//		System.out.println("int = " + i);
//		System.out.println("double = " + d);
//		System.out.println("float = " + fl);
//		System.out.println("char = " + ch);
//		System.out.println("b = " + b);
		
//		Завдання 2: Вивести на консоль мінімальне і максимальне значення типів даних.
		
//		System.out.println("Byte = " + Byte.MAX_VALUE);
//		System.out.println("Byte = " + Byte.MIN_VALUE);
//		System.out.println("Char = " + (int) Character.MAX_VALUE);
//		System.out.println("Char = " + (int) Character.MIN_VALUE);
//		System.out.println("Double = " + Double.MAX_VALUE);
//		System.out.println("Double = " + Double.MIN_VALUE);
//		System.out.println("Float = " + Float.MAX_VALUE);
//		System.out.println("Float = " + Float.MIN_VALUE);
//		System.out.println("int = " + Integer.MAX_VALUE);
//		System.out.println("int = " + Integer.MIN_VALUE);
//		System.out.println("long = " + Long.MAX_VALUE);
//		System.out.println("long = " + Long.MIN_VALUE);
//		System.out.println("short = " + Short.MAX_VALUE );
//		System.out.println("short = " + Short.MIN_VALUE );
		
//		Завдання 3: Створити масив, наповнити його 10 значеннями типу int, знайти максимальне і мінімальне значення   
		
		 int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	      int min = array [0];
	      int max = array[0];
	      
	      for (int f = 0; f < array.length; f ++ ) min = Math.min(min, array[f]);
	      System.out.println("Мінімальне значення " + min);
	       
	      for (int j = 1; j < array.length; j++) max = Math.max(max, array[j]);
	      System.out.println( "Максималне значення " + max);
		
		
	}
	
}

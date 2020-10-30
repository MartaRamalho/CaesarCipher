package caesarCipher;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static int i, size, x;
private static String text;
private static String[] listArray, alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
	System.out.println("Desea cifrar o descifrar un texto?\n"
			+ "1.Cifrar\n"
			+ "2.Descifrar");
	switch(number()) {
	case 1:
		cifrar();
		break;
	case 2:
		descifrar();
		break;
	default:
		System.out.println("Opción inválida.");
	}
	
}	
	private static void menu() {
		System.out.println("Introduzca un texto (en minúsculas):");
		text = text();
		List<String> myList = new ArrayList<String>(Arrays.asList(text.split("")));
		size = myList.size();
		listArray = new String[myList.size()];
	    listArray = myList.toArray(listArray);
	    System.out.println("Introduzca un número comprendido entre 1 y 25: ");
	    x = number();
	}
	
	private static void descifrar() {
	    menu();
		if(x<1 || x>25) {
	    	System.out.println("Número inválido.");
	    }
	    else {
	    for(i=0; i<size; i++) { 
	    	String m = listArray[i];
	    	int y = Arrays.asList(alphabet).indexOf(m);
	    	if (y<0) {
	    		System.out.print(" ");
	    	}
	    	else if ((y-x)<0) {
	    		int z = alphabet.length+(y-x);
	    	System.out.print(alphabet[z]);
	    	}
	    	else {
	    		System.out.print(alphabet[y-x]);
	    	}
	    }
	    }
	}

	
	
	private static void cifrar() {
		menu();
	    if(x<1 || x>25) {
	    	System.out.println("Número inválido.");
	    }
	    else {
	    for(i=0; i<size; i++) { 
	    	String m = listArray[i];
	    	int y = Arrays.asList(alphabet).indexOf(m);
	    	if (y<0) {
	    		System.out.print(" ");
	    	}
	    	else if ((y+x)>=alphabet.length) {
	    		int z = (y+x)-alphabet.length;
	    	System.out.print(alphabet[z]);
	    	}
	    	else {
	    		System.out.print(alphabet[y+x]);
	    	}
	    }
	    }
	}
	
	private static int number() {
		Scanner num = new Scanner(System.in);
		int num2 = num.nextInt();
		return num2;
	}


	private static String text() {
		Scanner sc = new Scanner(System.in);
		String ent = sc.nextLine();
		return ent;
	}
}
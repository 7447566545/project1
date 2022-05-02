package seleniumassignment;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();

		// Add elements to ArrayList
		languages.add("Java");
		languages.add("Python");
		languages.add("Swift");
		languages.add("Oracle");
		languages.add("C++");
		System.out.println("ArrayList: " + languages);
		String str = languages.get(1);
		// adding javascript
		System.out.print("Element at index 1: " + str);
		languages.set(2, "JavaScript");
		System.out.println("Modified ArrayList: " + languages);
		// remove elements from index 2
		String str1 = languages.remove(2);
		System.out.println("Updated ArrayList: " + languages);
		System.out.println("Removed Element: " + str);
	}
}
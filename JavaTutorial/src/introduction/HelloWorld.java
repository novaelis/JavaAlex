package introduction;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HelloWorld {
	
	private String rec="Hello World!";
	
	
	
	
	public void sayName(String name) {
		System.out.println("Name");
	}
	
	public void sayName(int name) {
		System.out.println("Broj");
	}
	
	public static void loadGrades(Scanner in, ArrayList<Integer> list) {

        int grades; // int variable
        try { // try            
            in = new Scanner(new FileReader("resources/Proj5Data.txt"));// change filename
        } catch (FileNotFoundException ex) { // catch
            System.out.println("File not found");
            System.exit(1);
        }
        while(in.hasNextInt()) {         
                grades = in.nextInt(); // var
                list.add(grades) ;// put the int in the array at the counter value            
        }
        in.close();

    }
	
	
	public static void main(String[] args) {
		
		Scanner in = null;
		//int[] list = new int[15];
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		loadGrades(in, list);
		
		System.out.println(list);
		
		String[] boje = {"aha","da","mhm"};
		System.out.println(boje[0]);
		
		
	
		
		ArrayList<String> boje2 = new ArrayList<String>();
		boje2.add("nesto");
		boje2.add("opa");
		
		System.out.println(boje2.get(0));
		System.out.println(boje2);
		
		HelloWorld hw = new HelloWorld();
		hw.rec.
		System.out.println(hw.rec.concat("A"));
		
		HashMap<String, String> nesto = new HashMap<String, String>();
		
		nesto.put("user123", "pass123");
		nesto.put("user111", "pass1!");
		nesto.put("user122", "pass11");
		
		//System.out.println(nesto.values());
		
		Iterator<String> it = nesto.values().iterator();
		
		while(it.hasNext()) {
			//System.out.println("1");
			System.out.println(it.next());
			if(it.next().equals("pass1!"))
				it.remove();

		}
		
		System.out.println(nesto);
		
	}

}

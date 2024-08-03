package ComaparabelComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private String email;
	private float height;

	public Customer() {

	}

	public Customer(int id, String name, String email, float height) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.height = height;

	}

	public void setid(int id) {
		this.id = id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setheight(float height) {
		this.height = height;
	}

	public int getid() {
		return id;
	}

	public String grtname() {
		return name;
	}

	public String getemail() {
		return email;
	}

	public float getheight() {
		return height;
	}

	public String toString() {
		return id + " " + name + " " + email + " " + height;
	}

	
	//If length of name is same its sort based on id by descending order( OR ) A
	//If short by the name.
	
	public int compareTo(Customer c2) {
		Customer c1 = this;
		if (c1.name.length() == c2.name.length()) {
			Integer i = c1.id;
			Integer j = c2.id;
			return  -1*(i.compareTo(j));
		}
		else{
			return  c1.name.compareTo(c2.name);
		}

	}

}

public class Comparabel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Customer> t = new ArrayList<Customer>();
		System.out.println("Enter how many data you will enter.");
		int input = scan.nextInt();

		System.out.println("Enter the customer details");
		for (int i = 1; i <= input; i++) {
			Customer c = new Customer();
			String s = scan.next();
			String[] arr = s.split(",");
			c.setid(Integer.parseInt(arr[0]));
			c.setname(arr[1]);
			c.setemail(arr[2]);
			c.setheight(Float.parseFloat(arr[3]));
			t.add(c);

		}
		System.out.println("----------------------------------------------------");
		Collections.sort(t);

//		for (int i = 0; i < t.size(); i++) {
//			System.out.println(t.get(i));
//		}
//		
//		for(Object o:t) {
//			System.out.println(o);
//	    }
		
		Iterator itr=t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

			
		
		
			 
				
			
		
		

	}

}

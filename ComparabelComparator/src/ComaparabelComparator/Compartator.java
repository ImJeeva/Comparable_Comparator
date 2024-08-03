package ComaparabelComparator;

import java.util.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

abstract class demo {
	int a;

	public abstract void jeeva();

	public demo(int a) {

	}

}

class Name implements Comparator<Jeeva> {
	public int compare(Jeeva a, Jeeva b) {
		String i = a.getname();
		String j = b.getname();
		return i.compareTo(j);

	}
}

class Email implements Comparator<Jeeva> {
	public int compare(Jeeva a, Jeeva b) {
		String i = a.getemail();
		String j = b.getemail();
		return i.compareTo(j);
	}
}

class Id implements Comparator<Jeeva> {
	public int compare(Jeeva a, Jeeva b) {
		Integer i = a.getid();
		Integer j = b.getid();
		return i.compareTo(j);
	}
}

class Height implements Comparator<Jeeva> {
	public int compare(Jeeva a, Jeeva b) {
		Float i = a.getheight();
		Float j = b.getheight();
		return i.compareTo(j);
	}
}

class Jeeva {
	private int id;
	private String name;
	private String email;
	private float height;

	public Jeeva() {

	}

	public Jeeva(int id, String name, String email, float height) {
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

	public String getname() {
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

}

public class Compartator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Name N = new Name();
		Email E = new Email();
		Id I = new Id();
		Height H = new Height();

		TreeSet<Jeeva> al = null;
		System.out.println("Which based you want sort\n 1-name\n 2-email\n 3-id\n 4-height");
		int option = scan.nextInt();

		switch (option) {
		case 1:
			al = new TreeSet<Jeeva>(N);
			break;
		case 2:
			al = new TreeSet<Jeeva>(E);
			break;
		case 3:
			al = new TreeSet<Jeeva>(I);
			break;
		case 4:
			al = new TreeSet<Jeeva>(H);
			break;

		}

		System.out.println("enter the how many data  you want to enter.");
		int n = scan.nextInt();
		System.out.println("enter id,name,email,height");

		for (int i = 1; i <= n; i++) {
			Jeeva j = new Jeeva();
			String s = scan.next();
			String[] o = s.split(",");
			j.setid(Integer.parseInt(o[0]));
			j.setname(o[1]);
			j.setemail(o[2]);
			j.setheight(Float.parseFloat(o[3]));
			al.add(j);

		}

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

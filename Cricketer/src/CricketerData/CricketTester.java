package CricketerData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CricketTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cricket> cricketers = new ArrayList<Cricket>(2);
		Cricket cc = new Cricket();
		boolean exit = false;
		while(!exit) {
			System.out.println("Enter your choice : 1.Add players 2.Display all players"
					+ " 3.Find by name 4.Remove player 5.Update player ratings"
					+ "6. sort by ratings"
					+ "10.exit");
			switch (sc.nextInt()) {
			case 1:
				
				System.out.println("ENTER PLAYER DETAILS : name,age,email,contact,ratings");
				Cricket c = new Cricket(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
				cricketers.add(c);
				break;
			case 2:
				for(Cricket c1 : cricketers)
					System.out.println(c1);
				break;
				
			case 3:
				System.out.println("Enter name :");
				System.out.println(Cricket.findbyname(sc.next(), cricketers));
				break;
				
			case 4:
				System.out.println("Enter name :");
				cc.deletebyname(sc.next(), cricketers);
				break;
				
			case 5:
				System.out.println("Enter name :");
				cc.updateratings(sc.next(), cricketers);
				break;
				
			case 6:
				Collections.sort(cricketers);
				for(Cricket c5 : cricketers)
					System.out.println(c5);
				break;
				
			case 10:
				System.out.println("BYEE!!!");
				break;
				

			default:
				System.out.println("Enter valid choice");
				break;
			}
		}
 
	}

}
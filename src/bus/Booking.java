package bus;
import java.util.Scanner;
public class Booking {
	String passengerName;
	int busNumber;
	Booking(){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the passenger Name");
		this.passengerName=scan.next();
		System.out.println("enter the bus Number");
		this.busNumber=scan.nextInt();
		
		
	}
	public void PassInfo() {
		System.out.println("Name :"+ passengerName+"bus No :"+busNumber);
	}

}

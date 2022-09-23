package bus;
import java.util.Scanner;
import java.util.ArrayList;
public class BusMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Bus> bus=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		bus.add(new Bus(1,20,true));
		bus.add(new Bus(2,25,false));
		for(Bus b:bus) {
			b.busDetails();
		}
		int user=1;
		while(user==1) {
			System.out.println("Press 1 Booking and press 2 Cancel");
			user=scan.nextInt();
			if(user==1) {
				System.out.println("Booking.....");
				Booking booking=new Booking();
				bookings.add(booking);
				for(Booking b:bookings) {
					b.PassInfo();
				}
				
			}
		}

	}

}

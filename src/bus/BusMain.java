package bus;

import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;

public class BusMain {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		BusDb busdb=new BusDb();
		busdb.busInfo();
		
//		ArrayList<Bus> bus = new ArrayList<Bus>();
//		ArrayList<Booking> bookings = new ArrayList<Booking>();
//		bus.add(new Bus(1, 2, true));
//		bus.add(new Bus(2, 25, false));
//		for (Bus b : bus) {
//			b.busDetails();
//		}
//		int user = 1;
//		while (user == 1) {
//			System.out.println("Press 1 Booking and press 2 Cancel");
//			user = scan.nextInt();
//			if (user == 1) {
//				System.out.println("Booking.....");
//				Booking booking = new Booking();
//				if (booking.isAvailable(bookings, bus)) {
//					bookings.add(booking);
//					System.out.println("booking successfully");
//				} else {
//					System.out.println("Sorry!.. Bus is full...try another Bus");
//				}
//
//			}
//		}

	}

}

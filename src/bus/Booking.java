package bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Booking {
	String passengerName;
	int busNumber;
	Date date;

	Booking() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the passenger Name");
		this.passengerName = scan.next();
		System.out.println("enter the bus Number");
		this.busNumber = scan.nextInt();
		System.out.println("Enter the Date(dd-mm-yyyy)");
		String dateInput = scan.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

	public void PassInfo() {
		System.out.println("Name :" + passengerName + " bus No :" + busNumber);
	}

	public boolean isAvailable() {
		BusDb busdb=new BusDb();
		BookingDb bdb=new BookingDb();
		int capacity =busdb.getCapacity(busNumber);
		
		for (Bus buses : bus) {
			if (buses.getbusNo() == busNumber) {
				capacity = buses.getcapacity();
			}

		}
		int booked = 0;
		for (Booking b : bookings) {
			if (b.busNumber == busNumber && b.date.equals(date)) {
				booked++;
			}
		}

		return booked < capacity ? true : false;
	}

}

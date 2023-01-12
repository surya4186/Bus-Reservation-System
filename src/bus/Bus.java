package bus;

public class Bus {
	public int busNo;
	private int capacity;
	private boolean ac;

	Bus(int no, int capa, boolean ac) {
		this.busNo = no;
		this.capacity = capa;
		this.ac = ac;
	}

	public void busDetails() {
		System.out.println("Bus No: " + busNo + " capacity :" + capacity + " Ac:" + ac);
	}

	public int getcapacity() {
		return capacity;
	}

	public void setcapacity(int cap) {
		capacity = cap;
	}

	public int getbusNo() {
		return busNo;
	}

	public boolean getac() {
		return ac;
	}

	public void setac(boolean ac) {
		ac = this.ac;
	}
}

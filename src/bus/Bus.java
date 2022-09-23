package bus;

public class Bus {
	private int busNo;
	private int capacity;
	private boolean ac;
	Bus(int no,int capa,boolean ac){
		this.busNo=no;
		this.capacity=capa;
		this.ac=ac;
	}
	public void busDetails(){
		System.out.println("Bus: "+busNo +" capacity :"+capacity+" Ac:"+ac);
	}
}

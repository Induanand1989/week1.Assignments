package week1.Assignments;

public class MyMobile {
	 long phoneNo=1234567892l;

	public void makeCall() {
		System.out.println("Method to make call");
		
	}
	public void sendMsg() {
		System.out.println("Method to send message");
		
	}
	private void payBill() {
		System.out.println("Method for paying bill");
		
  }
	public static void main(String[] args) {
		MyMobile phone=new MyMobile();
		System.out.println("My phone numberis "+ phone.phoneNo);
		phone.makeCall();
		phone.sendMsg();
		phone.payBill();
		

	}

}

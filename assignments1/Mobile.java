 package week1.day1.assignments1;              //week1.day1.(Assignment 1)

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Mobile {
	
	 public void makeCall() {
		 String mobileModel="Realme";
		 float mobileWeight=20.67f;
		 System.out.println("Enter the mobile model :" +mobileModel);
		 System.out.println("Enter the mobil Weight :" +mobileWeight );
		 System.out.println("Call");
	 }
	 public void sendMsg() {
		 boolean isFullCharged= true;
		 int mobileCost= 12000;
		 System.out.println("The mobile phone is fully charged :" +isFullCharged);
		 System.out.println("The Mobile phone price is :" +mobileCost);
		 System.out.println("Msg Sent");
	 }

	public static void main(String[] args) {
		
		Mobile m1=new Mobile();
		m1.makeCall();
		m1.sendMsg();
		
		
	}

}

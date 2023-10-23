package p1;

public abstract class Plan {

 protected	double rate;
 abstract void rate();
 
 public void calculateBill(int units)
{
	 System.out.println(units*rate)
	 ;}
}

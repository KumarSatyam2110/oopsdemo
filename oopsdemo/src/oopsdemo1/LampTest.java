package oopsdemo1;

class Lamp
{
	// stores the value for light
	  // true if light is on
	// false if light is off
	boolean isOn;
	
	// method to turn On the light
	void turnOn()
	{
		isOn = true;
		System.out.println("Light On? "+isOn);
		
	}
	//method to turn off the light
	void turnOff()
	{
		isOn = false;
		System.out.println("Light On? "+isOn);
		
	}
}

public class LampTest {
	
	public static void main(String[] args) {
		
		//create object LED and Halogen
		
		Lamp LED = new Lamp();
		Lamp Halogen = new Lamp();
		
		//switch on LED and Halogen
		LED.turnOn();
		Halogen.turnOn();
		
		//switch off LED and Halogen
		LED.turnOff();
		Halogen.turnOff();	
		
	}

}

package oopsdemo2;

class Honda extends Car
{
	public void hondaStart()
	{
		Engine heng= new Engine(); //Composition - Honda class fully dependent on Engine
		heng.startEngine();
	}
}
public class CompositionDemo {

	public static void main(String[] args) {
		
		Honda hondaCivic =new Honda();
		
		hondaCivic.setColor("Black");
		hondaCivic.setMax_Speed(200);
		
		System.out.println("***************Honda Car Details**************");
		System.out.println(hondaCivic.getColor() +" color");
		System.out.println(hondaCivic.getMax_Speed()+" speed");
		
		hondaCivic.hondaStart();
		
		

	}

}

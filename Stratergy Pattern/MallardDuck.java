import java.util.*;

class MallardDuck extends DuckBase
{

	public MallardDuck()
	{
		//Default constructor for default behaviour with this  Duck
		flyingBehaviour=new FlyWithWings();
		quackBehaviour=new Quacking();
	}
public void display()
{
 //	Override this method in each subclass
 super.display();
  System.out.println("Mallard Duck here");
}

}
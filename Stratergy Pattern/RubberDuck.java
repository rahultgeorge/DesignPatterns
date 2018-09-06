import java.util.*;

class RubberDuck extends DuckBase
{

	public RubberDuck()
	{
		//Default constructor for default behaviour with this  Duck
		flyingBehaviour=new FlyNoWay();
		quackBehaviour=new Squeak();
	}
public void display()
{
 //	Override this method in each subclass
 super.display();
  System.out.println("Rubber Duck here");
}

}
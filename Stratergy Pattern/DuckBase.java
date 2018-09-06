import java.util.*;

class DuckBase
{

	protected FlyingBehaviour flyingBehaviour;
	protected QuackBehavior quackBehaviour;
	
 public void display()
 {
  //	Override this method in each subclass
   System.out.println("Basic Duck here");
 }
 
 public void setFlyingBehaviour(FlyingBehaviour behaviour)
 {
	 flyingBehaviour=behaviour;
 }

 public void setQuackBehaviour(QuackBehavior behaviour)
 {
 	quackBehaviour=behaviour;
 }

 public void Fly()
 {
 	flyingBehaviour.Fly();
 }
 
 public void Quack()
	 {
	 	quackBehaviour.Quack();
	 }	 
}
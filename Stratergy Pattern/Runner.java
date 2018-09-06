//Runner class

import java.util.*;


class Runner
{

public static void main(String[] args)
{
	DuckBase duck=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to SimuDuckApp");
    System.out.println("Enter 1 for Mallard Duck.\n 2 for Rubber Duck. \n 3 for RedHeadDuck");
	int choice=sc.nextInt();
	switch(choice)
		{
			case 1:
			 duck=new MallardDuck();
			 duck.setFlyingBehaviour(new FlyWithWings());
			 break;
 			case 2:
 			 duck=new RubberDuck();
			 duck.Quack();
			 duck.setQuackBehaviour(new MuteQuack());
 			 break;			 
			
			default:
			 break;
		} 
   duck.Fly();	
   duck.Quack();
   	
}

}
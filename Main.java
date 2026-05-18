/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{

    DACArecipient person1 = new DACArecipient();

    person1.setAll("Walker" , "Marry", "12-3-456" , "Scotland" , 2456923, 2456401, 2461045 , 'F');
    
    DACArecipient person2 = new DACArecipient();
    person2.setAll("Walker" , "Marry", "12-3-456" , "Scotland" , 2456923, 2456401, 2461045 , 'F');
    
    DACArecipient person3 = new DACArecipient();
    person3.setAll("Smith" , "John", "98-7-654" , "England" , 2456923, 2456401, 2461045 , 'M'); 

    DACArecipient person4 = new DACArecipient();
    person4.setAll("Mendez" , "Javier", "56-3-445" , "El Salvador" , 2451564, 3956753, 3956840 , 'M'); 

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);
    System.out.println(person4);

    System.out.println("person1.equals(person2) => " + person1.equals(person2));
    System.out.println("person1.equals(person3) => " + person1.equals(person3));
    System.out.println("person1.equals(person4) => " + person1.equals(person4));

    System.out.println(person1.printCard());
    System.out.println(person2.printCard());
    System.out.println(person3.printCard());
    System.out.println(person4.printCard());
  }
 
  
}
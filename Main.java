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

      person1.setAll("Walker", "Marry", "12-3-456", "El Salvador", 2451564, 3956753, 3956840, 'f');
      System.out.println(person1);
    
  }
}

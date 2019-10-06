import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Phoneprices
{
  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);
    int a = input.nextInt ();

//              System.out.println(a + b);


    for (int l = 0; l < a; l++)
      {

	int b = input.nextInt ();

	Integer myInf = Integer.MAX_VALUE;
	  List < Integer > prices = new ArrayList < Integer > ();
	  prices.add (myInf);
	  prices.add (myInf);
	  prices.add (myInf);
	  prices.add (myInf);
	  prices.add (myInf);
	for (int i = 0; i < b; i++)
	  {
	    int s = input.nextInt ();
	      prices.add (s);
	  }

	System.out.println (prices);
	int counter = 0;

	for (int j = 5; j < prices.size (); j++)
	  {

	    boolean flag = false;

	    // System.out.println(prices.get(j));



	    for (int k = j - 1; k >= j - 5; k--)
	      {

		if (prices.get (k) > prices.get (j))
		  {

		    flag = true;

		  }

		else
		  {

		    flag = false;
		    break;
		  }


		// System.out.println("Inside" + prices.get(k));

	      }

	    if (flag)
	      {

		counter += 1;
		System.out.println (counter);
		System.out.println (prices.get (j));
	      }


	  }
      }


  }
}

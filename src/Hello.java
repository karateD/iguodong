
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Hello{
  public static void main(String[] args) {
	  ArrayList<String> suanshi=new ArrayList<String>();
	     String str=new String();
	  int a,b,c;
	  
	   int result;
	   
	  int sum[] = null;
	  int number = new Random().nextInt(10) + 1;  
   
    Scanner sb = new Scanner(System.in);
    
    System.out.print("ÊäÈë¸öÊı£º");  
    int m = sb.nextInt();  
      int[] numbers=new int[100];
      Random r=new Random();
      System.out.println("2015710307");
      for(int i=1;i<=100;i++){
      numbers[i-1]=i;
    }
    
     for(int i=0;i<m;i++){
    	 c = numbers[r.nextInt(4)];
    	 do {
    		 a=numbers[r.nextInt(100)];
        	 b=numbers[r.nextInt(100)];
			} while ((c == 3 && b == 0) 
					|| (c == 3 && a % b != 0)
					|| (c == 2 && a * b > 100) 
					|| (c == 1 && a < b)
					|| (c == 0 && a + b > 100));
			if (c == 0) {
				str = a + "+" + b;
				result = a + b;
			} else if (c == 1) {
				str = a + "-" + b;
				result = a - b;
			} else if (c == 2) {
				str = a + "*" + b;
				result = a * b;
			} else {
				str = a + "/" + b;
				result = a / b;
			}
			suanshi.add(str+"="+result);
    }
     for ( int i = 0; i < suanshi.size(); i++){
		  System.out.println(suanshi.get(i));
		 
		}
	WriteToFile write=new WriteToFile("result.txt",suanshi);
	
   }
   }
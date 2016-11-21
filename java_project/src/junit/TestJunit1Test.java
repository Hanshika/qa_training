package junit;

import static org.junit.Assert.assertTrue;
import junit.framework.TestCase;

public class TestJunit1Test extends TestCase {
	int a,b,c;
	public void testsetup(){
		
		 a=20;
		 b=20;
	
		 c=a+b;
		    assertEquals(40,c);
		
	}
		
		public void testteardown(){
			
		}
		}







package junit;
import static org.junit.Assert.*;
import org.junit.Test;

import com.testng.com.TestRunner;

import junit.framework.*;
public class TestJunit  extends TestRunner{
	int a,b;
public void testsetup(){
	
	 a=20;
	 b=20;
	
	}
	public void testadd(){
		double result = a + b;
		assertTrue(result == 40);
	}
	

	}



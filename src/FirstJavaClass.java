import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FirstJavaClass {


		@Test
	    public void testAddition() {
	        assertEquals(4, 2 + 2);
	    }
		
	    public void anotherTestMethod() {
	        //assertEquals(4, 2 + 2);
	    }

 
	    public static void main(String[] args) {
	        System.out.println("Hello from Java!");
	    }
	}



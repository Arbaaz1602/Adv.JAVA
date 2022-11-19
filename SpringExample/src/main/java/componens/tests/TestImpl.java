package componens.tests;

import org.springframework.stereotype.Component;

@Component("currentTest")//Assigning an ID: currentTest
public class TestImpl {

	public TestImpl() {
		System.out.println("Constructor of testImpl called");
	}
	
	public void doTest()
	{
		System.out.println("Test works");
	}

}

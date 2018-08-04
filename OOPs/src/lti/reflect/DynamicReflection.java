package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception {
		String qcn="lti.reflect.Customer";
		//Manually loading the class
		Class custClass=Class.forName(qcn);
		//Instantiating with paramaterised cunstuctor
		Constructor custConst = custClass.getConstructor(String.class);
		//instantiating with parameterized constructor
		Object obj = custConst.newInstance("Dhiren");
		System.out.println(obj);
		//Getting private method of class
		Method printMethod = custClass.getDeclaredMethod("print",null);
		//calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
		
	}
	
	
}

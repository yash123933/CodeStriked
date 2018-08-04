package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomerReflection {

	public static void main(String[] args) {
		Customer c1 = new Customer("Polo");
		System.out.println(c1);
		Class cc = c1.getClass();
		System.out.println(cc);
		System.out.println("list of constructors");
		Constructor[] constructors = cc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}
//		System.out.println("list of methods");
//		Method[] methods =cc.getMethods();
//		for(Method m:methods)
//		{
//			System.out.println(m);
//		}
		System.out.println("list of methods");
		Method[] methods =cc.getDeclaredMethods();
		for(Method m:methods)
		{
			System.out.println(m);
		}
		System.out.println("list of fields");
		Field[] fields =cc.getDeclaredFields();//is private then it will not show by getfieldd
		for(Field f:fields)
		{
			System.out.println(f);
		}
	}

}

package app;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Date;

class User {
	public int id;
}

class Employee extends User {
	
	private String name;
	private String password;
	
	private boolean setUpdated(int sequence) {
		System.out.println("setUpdated: " + sequence);
		return true;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + "]";
	}
}


public class App {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Employee> clazz = Employee.class;
		
		var nameField = clazz.getDeclaredField("name");
		
		var user = new Employee();
		
		nameField.setAccessible(true);
		
		nameField.set(user, "Poseidon");
		
		System.out.println(user);
//		
//		System.out.println(nameField);
//		
//		var setUpdatedMethod = clazz.getDeclaredMethod("setUpdated", int.class);
//		setUpdatedMethod.setAccessible(true);
//		
//		setUpdatedMethod.invoke(new Employee(), 7);
	}

}

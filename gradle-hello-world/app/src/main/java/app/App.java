/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

class User {
	
}

class Employee extends User {
	public int id;
}

public class App {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class<Employee> clazz = Employee.class;
        
        System.out.println(clazz);
        
        Class<? extends Object> clazz2 = Class.forName("app.Employee");
        
        System.out.println(clazz2);
        
        User u = new Employee();
        
        Class<? extends User> clazz3 = u.getClass();
        
        System.out.println(clazz3);
        
    }
}
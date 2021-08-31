package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import entities.User;
import repositories.UserDao;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void run(String... args) throws Exception {
//		User user1 = new User("Morpheus", "morpheus@example.com");
//		User user = userDao.save(user1);
//		
//		System.out.println(user);
//		
//		userDao.findAll().forEach(a -> System.out.println("Find all: " + a));
//		
//		Optional<User> retreivedUserOpt = userDao.findById(user.getId());
//		if(retreivedUserOpt.isPresent()) {
//			System.out.println("Find by Id: " + retreivedUserOpt.get());
//		}
		
		List<User> users = userDao.findByName("Morpheus");
		
		users.forEach(u -> System.out.println("Find by name: " + u));
	}
	
//	@Bean
//	public Greeter createGreeter() {
//		return new Greeter();
//	}

}

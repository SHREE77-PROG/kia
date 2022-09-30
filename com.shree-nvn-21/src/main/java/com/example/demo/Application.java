 package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.User;
import com.example.demo.repository.Userrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		Userrepository userrepository=context.getBean(Userrepository.class);
	//	 User user=new User();
	//	 user.setId(1001);
	//	 user.setName("shreedhar");
	//	 user.setCity("hubli");
	//	User userA =userrepository.save(user);
	//	System.out.println(userA);
	

/*	User user1=new User();
	user1.setId(1002);
	user1.setName("ranbir kapoor");
	user1.setCity("bangalore");
	
	User user2=new User();
	user2.setId(1003);
	user2.setName("chandru");
	user2.setCity("gadag");
	
	//saving singal user
	
//	User userB=userrepository.save(user2);
//	System.out.println(userB);
	List<User> users = List.of(user1,user2);
	Iterable<User> userc = userrepository.saveAll(users);
	userc.forEach(e->System.out.println(e));
	
	//update user 7
	Optional<User> optional = userrepository.findById(7);
	User user = optional.get();
	user.setName("chandru muttin");
	User userk=userrepository.save(user);
	System.out.println("userk");
	
	//how to get data
//	Iterable<User> itr = userrepository.findAll();
//	itr.forEach(e->System.out.println(e));
	*/
	//how to delete
	
//	userrepository.deleteById(30);
//	System.out.println("deleted");
	
//	userrepository.deleteAll();
//	System.out.println("deleted");
		
		Iterable<User> itr = userrepository.findAll();
		itr.forEach(e->System.out.println(e));
		
}
}
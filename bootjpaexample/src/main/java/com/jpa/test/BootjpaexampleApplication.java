package com.jpa.test;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.query.Param;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id which you want to update :");
		Integer id=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter the updated name :");
//		String name=sc.nextLine();
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
	    UserRepository userRepository=(UserRepository)context.getBean("userRepository");
	    //insert operation of users infromation in databse. 
//	    User user1=new User();
//	    user1.setName("Prince kumar");
//	    user1.setCity("Bihar");
//	    user1.setStatus("I am a java programmer");
//	    
//	    User user2=new User();
//	    user2.setName("Sakshi Singh");
//	    user2.setCity("Gorakhpur");
//	    user2.setStatus("I am a tester");
//	    
//	    
//	    //saving single user
////	    User user2=userRepository.save(user1);
////	    System.out.println(user2);
//	    
//	    // save more than one user
//	    
//	    List<User> users=List.of(user1,user2);
//	    
//	    Iterable<User> iterable= userRepository.saveAll(users);
//	    
//	    for(Object o :iterable)
//	    {
//	    	if(o instanceof User)
//	    	{
//	    		System.out.println(o);
//	    	}
//	    }
//	    
	    
	    // update paricular data in database.
	    
//	  Optional<User> op=userRepository.findById(id);
//	  User user=op.get();
//	  user.setName(name);
//      User user1=userRepository.save(user);
//      System.out.println(user1);
	    
	    // get all the data 
	    
//	  Iterable<User> iter=userRepository.findAll();
//	  iter.forEach(new Consumer<User>() {
//
//		@Override
//		public void accept(User t) {
//			System.out.println(t);
//			}
//	});
	    
	    
	    // delete particular row of the basis of id
	    
//	    userRepository.deleteById(id);
	    
	    // delete number of users
	    
//	    Iterable<User> iterable=userRepository.findAll();
//	    
//	    userRepository.deleteAll(iterable);
	    
	    
	    // by using custom finder method we have to find the data on the basis of name
	    
//	   List<User> u= userRepository.findByName("Sakshi Singh");
//	   for( User user :u)
//	   {
//		   System.out.println(user);
//	   }
	    
	    
//	  List<User> u=userRepository.findByNameAndCity("Prince kumar", "Bengal");
//	  u.forEach(user->{
//		  System.out.println(user);
//          });
	    
//	    List<User> li=  userRepository.getAllUser();
//	    li.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				
//				System.out.println(t);
//				
//			}
//	    	
//	    	
//		});
	    
//	    List<User> u=userRepository.getUserByName("Prince Kumar");
//	    u.forEach(user->{
//	    	System.out.println(user);
//	    });
	    
//	    List<User> li= userRepository.getAllUser(id);
//	    li.forEach(user->{
//	    	System.out.println(user);
//	    });
	    
//	    List<User> li=userRepository.findByIdLessThan(id);
//	    li.forEach(user->{
//	    	System.out.println(user);
//	    });
	    
	    List<User> li=userRepository.findByNameOrderByName("Prince Kumar");
	    li.forEach(user->{
	    	System.out.println(user);
	    });
	}

}

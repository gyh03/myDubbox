package main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gyh.api.UserService;
import com.gyh.dto.UserDto;

/**
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml","spring-mvc.xml"});
        context.start();
        
        UserService userService=(UserService)context.getBean("userService");
        /*for (int i = 0; i < 10; i++) {
        	List<UserDto> us = userService.getUsers();
		}*/
        
        
        List<UserDto> us = userService.getUsers();
		for (int i = 0; i < us.size(); i++) {
			System.err.println(us.get(i).toString());
		}
		System.in.read(); 
    }

}

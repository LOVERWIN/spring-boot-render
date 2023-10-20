package API;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;




@SpringBootApplication
public class PracticaApi5D1Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticaApi5D1Application.class, args);
		System.out.println("oa oa o O oaoaoaoa");}
		
		@GetMapping("count-users")
		public String getCountUsers(){
			return "Hello Reder with Spring Boot";
		}
		
	

}

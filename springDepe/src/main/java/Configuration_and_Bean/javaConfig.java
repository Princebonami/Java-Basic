package Configuration_and_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "Configuration_and_Bean")
public class javaConfig {
	@Bean("address")
	public Address getAddress()
	{
		return new Address();
	}

	@Bean("student")
	public Student getStudent()
	{
		return new Student(getAddress());
	}

}

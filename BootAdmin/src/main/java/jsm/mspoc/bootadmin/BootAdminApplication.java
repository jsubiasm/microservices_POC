package jsm.mspoc.bootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class BootAdminApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(BootAdminApplication.class, args);
	}

	@Bean
	public AlwaysSampler defaultSampler()
	{
		return new AlwaysSampler();
	}

}

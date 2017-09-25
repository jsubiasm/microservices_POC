package jsm.mspoc.netflix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(NetflixEurekaApplication.class, args);
	}

	@Bean
	public AlwaysSampler defaultSampler()
	{
		return new AlwaysSampler();
	}

}

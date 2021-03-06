package jsm.mspoc.netflix.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class NetflixHystrixApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(NetflixHystrixApplication.class, args);
	}

	@Bean
	public AlwaysSampler defaultSampler()
	{
		return new AlwaysSampler();
	}

}

package jsm.mspoc.netflix.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

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
}

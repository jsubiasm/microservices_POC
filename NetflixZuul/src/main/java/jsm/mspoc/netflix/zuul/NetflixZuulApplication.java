package jsm.mspoc.netflix.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@EnableHystrix
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class NetflixZuulApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(NetflixZuulApplication.class, args);
	}

	@Bean
	public AlwaysSampler defaultSampler()
	{
		return new AlwaysSampler();
	}

	// @Bean
	// public CorsFilter corsFilter()
	// {
	// final UrlBasedCorsConfigurationSource source = new
	// UrlBasedCorsConfigurationSource();
	// final CorsConfiguration config = new CorsConfiguration();
	// config.setAllowCredentials(true);
	// config.addAllowedOrigin("*");
	// config.addAllowedHeader("*");
	// config.addAllowedMethod("OPTIONS");
	// config.addAllowedMethod("HEAD");
	// config.addAllowedMethod("GET");
	// config.addAllowedMethod("PUT");
	// config.addAllowedMethod("POST");
	// config.addAllowedMethod("DELETE");
	// config.addAllowedMethod("PATCH");
	// source.registerCorsConfiguration("/**", config);
	// return new CorsFilter(source);
	// }

}

package jsm.mspoc.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(ZipkinServerApplication.class, args);
	}

	@Bean
	public AlwaysSampler defaultSampler()
	{
		return new AlwaysSampler();
	}

}

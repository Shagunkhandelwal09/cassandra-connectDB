package com.example.DataAPI;
 
import java.nio.file.Path;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan(basePackages = { "com.example.DataAPI.*" })
public class DataApiApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(DataApiApplication.class, args);
	}
 
	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {
 
		Path bundle = astraProperties.getSecureConnectBundle().toPath();
		return builder -> builder.withCloudSecureConnectBundle(bundle);
	}
 
}
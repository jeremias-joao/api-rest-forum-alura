package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
@EnableSwagger2
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}
	
	/**
	 * Caso queira a arquivo WAR da Apliacação
	 * Extender a classe Main para extends SpringBootServletInitializer
	 * @Override 
	 * Reescrever o metodo aseguir dentro da classe main
	 * protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
	 *	return builder.sources(ForumApplication.class);
	 *Por ultimo adicionar dependencia no POM.xml e mudar tipo de pacote para WAR
	 *<packaging>war</packaging>
	 *<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>
	}*/
	

}

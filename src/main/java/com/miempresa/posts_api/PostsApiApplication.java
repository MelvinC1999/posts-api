package com.miempresa.posts_api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API de Publicaciones", version = "1.0", description = "Documentación de API para gestionar publicaciones"))
public class PostsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostsApiApplication.class, args);
	}

}

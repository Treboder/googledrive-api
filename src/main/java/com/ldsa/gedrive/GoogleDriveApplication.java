package com.ldsa.gedrive;

import com.ldsa.gedrive.config.GoogleDriveConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;



@SpringBootApplication
@Import(GoogleDriveConfig.class)
public class GoogleDriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleDriveApplication.class, args);
	}

}

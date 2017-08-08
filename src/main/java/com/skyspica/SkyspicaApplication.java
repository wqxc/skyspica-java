package com.skyspica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.skyspica.User.Controller.SlideController;

@SpringBootApplication
public class SkyspicaApplication {

	public static void main(String[] args) {
//		SlideController slideController=new SlideController();
//		slideController.getSlideVo();
		SpringApplication.run(SkyspicaApplication.class, args);
	}
}

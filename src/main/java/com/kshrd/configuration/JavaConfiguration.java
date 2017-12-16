package com.kshrd.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.kshrd.model.Traingle;
import com.kshrd.service.Drawing;

public class JavaConfiguration {
	@Bean
	public Traingle traingle(){
		Traingle traingle = new Traingle();
		traingle.setType("Traingle");
		return traingle;
	}
	
	@Bean
	public Drawing drawing(){
		Drawing drawing = new Drawing();
		drawing.setTraingle(traingle());
		return drawing;
	}
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Drawing draw = ctx.getBean(Drawing.class);
		draw.Draw();
	}
	
}

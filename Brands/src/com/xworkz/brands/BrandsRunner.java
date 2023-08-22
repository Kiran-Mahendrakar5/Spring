package com.xworkz.brands;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.brands.app.Adidas;
import com.xworkz.brands.app.Apple;
import com.xworkz.brands.app.BrandsInterface;
import com.xworkz.brands.app.Crocs;
import com.xworkz.brands.app.Fasttract;
import com.xworkz.brands.app.Nike;
import com.xworkz.brands.app.Puma;
import com.xworkz.brands.app.Rado;
import com.xworkz.brands.app.Sonata;
import com.xworkz.brands.app.Sony;
import com.xworkz.brands.app.Wildcraft;
import com.xworkz.brands.config.AppConfig;

public class BrandsRunner {
	public static void main(String[] args) {
		
		
		ApplicationContext context =new  AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("second");
		
//		context.getBean(Adidas.class);
		
		BrandsInterface  brand =context.getBean(Adidas.class);
		brand.comfortable();
		brand.enjoyable();
		brand.goodLooking();
		
		BrandsInterface  brand1 = context.getBean(Apple.class);
		brand1.comfortable();
		brand1.enjoyable();
		brand1.goodLooking();
		
		BrandsInterface  brand2 =context.getBean(Crocs.class);
		brand2.comfortable();
		brand2.enjoyable();
		brand2.goodLooking();
		
		BrandsInterface  brand3 = context.getBean(Fasttract.class);
		brand3.comfortable();
		brand3.enjoyable();
		brand3.goodLooking();
		
		BrandsInterface  brand4 = context.getBean(Nike.class);
		brand4.comfortable();
		brand4.enjoyable();
		brand4.goodLooking();
		
		BrandsInterface  brand5 = context.getBean(Puma.class);
		brand5.comfortable();
		brand5.enjoyable();
		brand5.goodLooking();
		
		BrandsInterface  brand6 = context.getBean(Rado.class);
		brand6.comfortable();
		brand6.enjoyable();
		brand6.goodLooking();
		
		BrandsInterface  brand7 = context.getBean(Sonata.class);
		brand7.comfortable();
		brand7.enjoyable();
		brand7.goodLooking();
		
		BrandsInterface  brand8 =context.getBean(Sony.class);
		brand8.comfortable();
		brand8.enjoyable();
		brand8.goodLooking();
		
		BrandsInterface  brand9 = context.getBean(Wildcraft.class);
		brand9.comfortable();
		brand9.enjoyable();
		brand9.goodLooking();
		

	}

}

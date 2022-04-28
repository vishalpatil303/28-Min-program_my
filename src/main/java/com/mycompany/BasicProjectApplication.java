package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycompany.basic.BinarySortImp;

@SpringBootApplication
public class BasicProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac =  SpringApplication.run(BasicProjectApplication.class, args);
		BinarySortImp b = ac.getBean(BinarySortImp.class);
		BinarySortImp b1 = ac.getBean(BinarySortImp.class);
		System.out.println(b);
		System.out.println(b1);
		b.sortAlgorithmMethod(new int[] {12,13,1,4,15}, 5);
	}

}
package com.qingao.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.qingao.abc")
public class App 
{
   public static void main(String[] args) throws Exception {
	SpringApplication.run(App.class, args);
}

}

package mySpringApp.ru;

import Controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackageClasses= Controller.class)
public class App 
{
    public static void main(String[] args ) {

        SpringApplication.run(App.class, args);
    }
}

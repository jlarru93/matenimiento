package pe.com.banbif.mantenimiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,  HibernateJpaAutoConfiguration.class})
public class ApplicationMantenimiento {

    @GetMapping
    public String demo(){
        return "asdasd";
    }

    public static void main(String... args) {
        SpringApplication.run(ApplicationMantenimiento.class, args);
    }
}

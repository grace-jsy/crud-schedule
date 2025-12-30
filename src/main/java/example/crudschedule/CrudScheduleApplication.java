package example.crudschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudScheduleApplication.class, args);
    }

}

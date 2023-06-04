package ma.sir.obs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.obs.required.facade")
public class ObsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ObsApplication.class, args);
    }

}



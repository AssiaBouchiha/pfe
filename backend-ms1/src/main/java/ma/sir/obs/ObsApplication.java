package  ma.sir.obs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.sir.obs.bean.core.*;
import ma.sir.obs.service.facade.admin.*;

import ma.sir.obs.zynerator.security.common.AuthoritiesConstants;
import ma.sir.obs.zynerator.security.bean.User;
import ma.sir.obs.zynerator.security.bean.Permission;
import ma.sir.obs.zynerator.security.bean.Role;
import ma.sir.obs.zynerator.security.service.facade.UserService;
import ma.sir.obs.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.obs.required.facade")
public class ObsApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(ObsApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){



    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }




    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Animal.edit"));
        permissions.add(new Permission("Animal.list"));
        permissions.add(new Permission("Animal.view"));
        permissions.add(new Permission("Animal.add"));
        permissions.add(new Permission("Animal.delete"));
        permissions.add(new Permission("AnimalType.edit"));
        permissions.add(new Permission("AnimalType.list"));
        permissions.add(new Permission("AnimalType.view"));
        permissions.add(new Permission("AnimalType.add"));
        permissions.add(new Permission("AnimalType.delete"));
        permissions.add(new Permission("Specimen.edit"));
        permissions.add(new Permission("Specimen.list"));
        permissions.add(new Permission("Specimen.view"));
        permissions.add(new Permission("Specimen.add"));
        permissions.add(new Permission("Specimen.delete"));
        permissions.add(new Permission("Gender.edit"));
        permissions.add(new Permission("Gender.list"));
        permissions.add(new Permission("Gender.view"));
        permissions.add(new Permission("Gender.add"));
        permissions.add(new Permission("Gender.delete"));
        permissions.add(new Permission("AnimalSpecie.edit"));
        permissions.add(new Permission("AnimalSpecie.list"));
        permissions.add(new Permission("AnimalSpecie.view"));
        permissions.add(new Permission("AnimalSpecie.add"));
        permissions.add(new Permission("AnimalSpecie.delete"));
        permissions.add(new Permission("Alert.edit"));
        permissions.add(new Permission("Alert.list"));
        permissions.add(new Permission("Alert.view"));
        permissions.add(new Permission("Alert.add"));
        permissions.add(new Permission("Alert.delete"));
        permissions.add(new Permission("Food.edit"));
        permissions.add(new Permission("Food.list"));
        permissions.add(new Permission("Food.view"));
        permissions.add(new Permission("Food.add"));
        permissions.add(new Permission("Food.delete"));
        permissions.add(new Permission("Location.edit"));
        permissions.add(new Permission("Location.list"));
        permissions.add(new Permission("Location.view"));
        permissions.add(new Permission("Location.add"));
        permissions.add(new Permission("Location.delete"));
        permissions.add(new Permission("Notification.edit"));
        permissions.add(new Permission("Notification.list"));
        permissions.add(new Permission("Notification.view"));
        permissions.add(new Permission("Notification.add"));
        permissions.add(new Permission("Notification.delete"));
        permissions.add(new Permission("LocationData.edit"));
        permissions.add(new Permission("LocationData.list"));
        permissions.add(new Permission("LocationData.view"));
        permissions.add(new Permission("LocationData.add"));
        permissions.add(new Permission("LocationData.delete"));
        permissions.add(new Permission("SeroType.edit"));
        permissions.add(new Permission("SeroType.list"));
        permissions.add(new Permission("SeroType.view"));
        permissions.add(new Permission("SeroType.add"));
        permissions.add(new Permission("SeroType.delete"));
        permissions.add(new Permission("DataAnalysis.edit"));
        permissions.add(new Permission("DataAnalysis.list"));
        permissions.add(new Permission("DataAnalysis.view"));
        permissions.add(new Permission("DataAnalysis.add"));
        permissions.add(new Permission("DataAnalysis.delete"));
        permissions.add(new Permission("Reason.edit"));
        permissions.add(new Permission("Reason.list"));
        permissions.add(new Permission("Reason.view"));
        permissions.add(new Permission("Reason.add"));
        permissions.add(new Permission("Reason.delete"));
        permissions.add(new Permission("Brand.edit"));
        permissions.add(new Permission("Brand.list"));
        permissions.add(new Permission("Brand.view"));
        permissions.add(new Permission("Brand.add"));
        permissions.add(new Permission("Brand.delete"));
        permissions.add(new Permission("Plant.edit"));
        permissions.add(new Permission("Plant.list"));
        permissions.add(new Permission("Plant.view"));
        permissions.add(new Permission("Plant.add"));
        permissions.add(new Permission("Plant.delete"));
        permissions.add(new Permission("Microbiology.edit"));
        permissions.add(new Permission("Microbiology.list"));
        permissions.add(new Permission("Microbiology.view"));
        permissions.add(new Permission("Microbiology.add"));
        permissions.add(new Permission("Microbiology.delete"));
        permissions.add(new Permission("Antibiotic.edit"));
        permissions.add(new Permission("Antibiotic.list"));
        permissions.add(new Permission("Antibiotic.view"));
        permissions.add(new Permission("Antibiotic.add"));
        permissions.add(new Permission("Antibiotic.delete"));
        permissions.add(new Permission("LaboratoryAntibiotic.edit"));
        permissions.add(new Permission("LaboratoryAntibiotic.list"));
        permissions.add(new Permission("LaboratoryAntibiotic.view"));
        permissions.add(new Permission("LaboratoryAntibiotic.add"));
        permissions.add(new Permission("LaboratoryAntibiotic.delete"));
        permissions.add(new Permission("Department.edit"));
        permissions.add(new Permission("Department.list"));
        permissions.add(new Permission("Department.view"));
        permissions.add(new Permission("Department.add"));
        permissions.add(new Permission("Department.delete"));
        permissions.add(new Permission("AgeCategory.edit"));
        permissions.add(new Permission("AgeCategory.list"));
        permissions.add(new Permission("AgeCategory.view"));
        permissions.add(new Permission("AgeCategory.add"));
        permissions.add(new Permission("AgeCategory.delete"));
        permissions.add(new Permission("LocationType.edit"));
        permissions.add(new Permission("LocationType.list"));
        permissions.add(new Permission("LocationType.view"));
        permissions.add(new Permission("LocationType.add"));
        permissions.add(new Permission("LocationType.delete"));
        permissions.add(new Permission("Laboratory.edit"));
        permissions.add(new Permission("Laboratory.list"));
        permissions.add(new Permission("Laboratory.view"));
        permissions.add(new Permission("Laboratory.add"));
        permissions.add(new Permission("Laboratory.delete"));
        permissions.add(new Permission("Organism.edit"));
        permissions.add(new Permission("Organism.list"));
        permissions.add(new Permission("Organism.view"));
        permissions.add(new Permission("Organism.add"));
        permissions.add(new Permission("Organism.delete"));
        permissions.add(new Permission("Report.edit"));
        permissions.add(new Permission("Report.list"));
        permissions.add(new Permission("Report.view"));
        permissions.add(new Permission("Report.add"));
        permissions.add(new Permission("Report.delete"));
        permissions.add(new Permission("MarketCategory.edit"));
        permissions.add(new Permission("MarketCategory.list"));
        permissions.add(new Permission("MarketCategory.view"));
        permissions.add(new Permission("MarketCategory.add"));
        permissions.add(new Permission("MarketCategory.delete"));
        permissions.add(new Permission("Institution.edit"));
        permissions.add(new Permission("Institution.list"));
        permissions.add(new Permission("Institution.view"));
        permissions.add(new Permission("Institution.add"));
        permissions.add(new Permission("Institution.delete"));
        permissions.add(new Permission("Patient.edit"));
        permissions.add(new Permission("Patient.list"));
        permissions.add(new Permission("Patient.view"));
        permissions.add(new Permission("Patient.add"));
        permissions.add(new Permission("Patient.delete"));
        permissions.add(new Permission("Environment.edit"));
        permissions.add(new Permission("Environment.list"));
        permissions.add(new Permission("Environment.view"));
        permissions.add(new Permission("Environment.add"));
        permissions.add(new Permission("Environment.delete"));
        permissions.add(new Permission("DataArchive.edit"));
        permissions.add(new Permission("DataArchive.list"));
        permissions.add(new Permission("DataArchive.view"));
        permissions.add(new Permission("DataArchive.add"));
        permissions.add(new Permission("DataArchive.delete"));
    }

}



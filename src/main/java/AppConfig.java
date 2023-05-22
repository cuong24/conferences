import org.cuong24.repository.HibernateSpeakerRepositoryImpl;
import org.cuong24.repository.SpeakerRepository;
import org.cuong24.service.SpeakerService;
import org.cuong24.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"org.cuong24"})
public class AppConfig {

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
////        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getCustomerRepository());
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
////        speakerService.setRepository(getCustomerRepository());
//        return speakerService;
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getCustomerRepository() {
//        return new HibernateSpeakerRepositoryImpl();
//    }


}

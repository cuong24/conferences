import org.cuong24.repository.HibernateSpeakerRepositoryImpl;
import org.cuong24.repository.SpeakerRepository;
import org.cuong24.service.SpeakerService;
import org.cuong24.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerRepository")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerRepository getCustomerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getCustomerRepository());
//        speakerService.setRepository(getCustomerRepository());
        return speakerService;
    }

}

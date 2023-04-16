import org.cuong24.repository.HibernateSpeakerRepositoryImpl;
import org.cuong24.repository.SpeakerRepository;
import org.cuong24.service.SpeakerService;
import org.cuong24.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerRepository")
    public SpeakerRepository getCustomerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setRepository(getCustomerRepository());
        return speakerService;
    }

}

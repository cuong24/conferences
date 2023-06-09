import org.cuong24.service.SpeakerService;
import org.cuong24.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerServiceImpl.class);

        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}

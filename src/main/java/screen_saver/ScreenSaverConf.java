package screen_saver;

import lombok.SneakyThrows;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class ScreenSaverConf {


    @Bean
    public Random random(){
        System.out.println(123);
        return new Random();
    }


    @Bean
    @Scope("prototype")
    public Color color(Random random){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }


    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConf.class);
        while (true) {
            Thread.sleep(70);
            context.getBean(ColorFrame.class).moveToRandomLocation();
        }
    }
}

package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailProducer {
    @Autowired
    private MailSender mailSender;
    private Random random = new Random();
    @Autowired
    private ApplicationContext context;

    @Scheduled(fixedDelay = 1000)
    public void produceMail() {

        int size = context.getBeansOfType(MailGenerator.class).size();
        MailInfo mailInfo = new MailInfo(random.nextInt(size)+1);
        mailSender.sendMail(mailInfo);
    }
}

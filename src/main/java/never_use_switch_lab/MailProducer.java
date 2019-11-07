package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Scheduled(fixedDelay = 1000)
    public void produceMail() {

        MailInfo mailInfo = new MailInfo(random.nextInt(2)+1);
        mailSender.sendMail(mailInfo);
    }
}

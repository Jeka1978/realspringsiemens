package never_use_switch_lab;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class MailProducer {
    private MailSender mailSender;
    private Random random = new Random();

    // should work every 1 second
    public void produceMail() {

        MailInfo mailInfo = new MailInfo(String.valueOf(random.nextInt(2)));
        mailSender.sendMail(mailInfo);
    }
}

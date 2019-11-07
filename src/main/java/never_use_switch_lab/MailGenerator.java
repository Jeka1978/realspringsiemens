package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generate(MailInfo mailInfo);
    int getMyType();

    @Autowired
    default void registerMyself(MailSender mailSender) {
        mailSender.registerBean(getMyType(),this);
    }
}

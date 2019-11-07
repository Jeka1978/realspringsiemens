package never_use_switch_lab;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generate(MailInfo mailInfo) {

        // 40 lines of code
        return "Welcome!!!";
    }
}

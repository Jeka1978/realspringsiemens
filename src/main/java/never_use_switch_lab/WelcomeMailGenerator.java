package never_use_switch_lab;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generate(MailInfo mailInfo) {

        // 40 lines of code
        return "Welcome!!!";
    }

    @Override
    public int getMyType() {
        return 1;
    }
}

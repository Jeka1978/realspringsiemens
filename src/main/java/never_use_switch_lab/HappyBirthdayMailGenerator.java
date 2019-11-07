package never_use_switch_lab;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generate(MailInfo mailInfo) {
        //120 lines of code
        return "happy birthday";
    }

    @Override
    public int getMyType() {
        return 3;
    }
}

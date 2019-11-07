package never_use_switch_lab;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generate(MailInfo mailInfo);
    int getMyType();
}

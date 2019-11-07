package never_use_switch_lab;

/**
 * @author Evgeny Borisov
 */

public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        int mailType = mailInfo.getMailType();
        if (mailType == 1) {
            // 50 lines of code
            System.out.println("Welcome to Siemenc");
        }  else if (mailType == 2) {
            // 50 lines of code
            System.out.println("don't call us we call you");
        }
    }
}

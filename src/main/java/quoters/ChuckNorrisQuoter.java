package quoters;

/**
 * @author Evgeny Borisov
 */
public class ChuckNorrisQuoter implements Quoter {
//    @InjectRandomQuote
    private String message;
    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }
}

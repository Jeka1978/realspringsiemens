package quoters;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Component
@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = new ArrayList<>(asList(messages));
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PreDestroy
    public void killAll(){
        System.out.println("You are terminated...");
    }
}


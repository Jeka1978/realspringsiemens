package screen_saver;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public abstract class ColorFrame extends JFrame {

    @Autowired
    private Color color;

    @Autowired
    private Random random;

    @PostConstruct
    private void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
    }

    @SneakyThrows
    public void moveToRandomLocation(){
        setLocation(random.nextInt(1200),random.nextInt(900));
        color = getColorBean();
        getContentPane().setBackground(color);
        repaint();
    }

    @Lookup
    protected abstract Color getColorBean();


}

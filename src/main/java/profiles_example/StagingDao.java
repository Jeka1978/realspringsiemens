package profiles_example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("Staging")
public class StagingDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to temp db");
    }
}

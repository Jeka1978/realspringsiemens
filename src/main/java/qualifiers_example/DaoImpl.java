package qualifiers_example;

import org.springframework.stereotype.Repository;

import static qualifiers_example.DBType.MONGO;

/**
 * @author Evgeny Borisov
 */

@SiemensBean(MONGO)
public class DaoImpl implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to Mongo");
    }
}

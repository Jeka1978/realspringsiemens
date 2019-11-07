package qualifiers_example;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@SiemensBean(DBType.ORACLE)
public class DaoImpl2 implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to Oracle");
    }
}

package qualifiers_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {

    @SiemensBean(DBType.MONGO)
    private Dao dao;

    @SiemensBean(DBType.ORACLE)
    private Dao backupDao;


    @Scheduled(fixedDelay = 500)
    public void save() {
        dao.saveAll();
    }


    @Scheduled(fixedDelay = 1500)
    public void backup() {

        backupDao.saveAll();
    }


}

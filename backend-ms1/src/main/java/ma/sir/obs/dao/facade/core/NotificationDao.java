package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Notification;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Notification;
import java.util.List;


@Repository
public interface NotificationDao extends AbstractRepository<Notification,Long>  {
    Notification findByCode(String code);
    int deleteByCode(String code);

    List<Notification> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);

    @Query("SELECT NEW Notification(item.id,item.code) FROM Notification item")
    List<Notification> findAllOptimized();
}

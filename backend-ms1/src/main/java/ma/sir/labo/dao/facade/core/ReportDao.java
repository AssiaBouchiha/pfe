package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Report;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Report;
import java.util.List;


@Repository
public interface ReportDao extends AbstractRepository<Report,Long>  {
    Report findByCode(String code);
    int deleteByCode(String code);

    List<Report> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);

    @Query("SELECT NEW Report(item.id,item.code) FROM Report item")
    List<Report> findAllOptimized();
}

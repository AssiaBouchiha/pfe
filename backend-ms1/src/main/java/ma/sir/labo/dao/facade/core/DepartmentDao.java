package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Department;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Department;
import java.util.List;


@Repository
public interface DepartmentDao extends AbstractRepository<Department,Long>  {
    Department findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Department(item.id,item.libelle) FROM Department item")
    List<Department> findAllOptimized();
}

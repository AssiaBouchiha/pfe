package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Brand;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Brand;
import java.util.List;


@Repository
public interface BrandDao extends AbstractRepository<Brand,Long>  {
    Brand findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Brand(item.id,item.libelle) FROM Brand item")
    List<Brand> findAllOptimized();
}

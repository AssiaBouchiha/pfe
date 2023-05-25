package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Animal;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Animal;
import java.util.List;


@Repository
public interface AnimalDao extends AbstractRepository<Animal,Long>  {
    Animal findByCode(String code);
    int deleteByCode(String code);

    List<Animal> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Animal> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);
    List<Animal> findByAnimalSpecieId(Long id);
    int deleteByAnimalSpecieId(Long id);
    List<Animal> findByAnimalTypeId(Long id);
    int deleteByAnimalTypeId(Long id);
    List<Animal> findByMarketCategoryId(Long id);
    int deleteByMarketCategoryId(Long id);
    List<Animal> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);

    @Query("SELECT NEW Animal(item.id,item.name) FROM Animal item")
    List<Animal> findAllOptimized();
}

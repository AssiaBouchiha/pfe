package ma.sir.obs.dao;

import ma.sir.obs.bean.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyDao extends JpaRepository<Currency,Long> {





}

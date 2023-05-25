package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.SerotypeHistoryCriteria;
import ma.sir.labo.bean.history.SerotypeHistory;


public class SerotypeHistorySpecification extends AbstractHistorySpecification<SerotypeHistoryCriteria, SerotypeHistory> {

    public SerotypeHistorySpecification(SerotypeHistoryCriteria criteria) {
        super(criteria);
    }

    public SerotypeHistorySpecification(SerotypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

package ma.sir.labo.zynerator.service;

import ma.sir.labo.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.labo.zynerator.criteria.BaseCriteria;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import ma.sir.labo.zynerator.history.HistCriteria;
import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}
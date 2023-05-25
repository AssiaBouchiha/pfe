package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Department;
import ma.sir.labo.bean.history.DepartmentHistory;
import ma.sir.labo.dao.criteria.core.DepartmentCriteria;
import ma.sir.labo.dao.criteria.history.DepartmentHistoryCriteria;
import ma.sir.labo.dao.facade.core.DepartmentDao;
import ma.sir.labo.dao.facade.history.DepartmentHistoryDao;
import ma.sir.labo.dao.specification.core.DepartmentSpecification;
import ma.sir.labo.service.facade.admin.DepartmentAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class DepartmentAdminServiceImpl extends AbstractServiceImpl<Department,DepartmentHistory, DepartmentCriteria, DepartmentHistoryCriteria, DepartmentDao,
DepartmentHistoryDao> implements DepartmentAdminService {


    public Department findByReferenceEntity(Department t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Department.class,DepartmentHistory.class, DepartmentHistoryCriteria.class, DepartmentSpecification.class);
    }


    public DepartmentAdminServiceImpl(DepartmentDao dao, DepartmentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
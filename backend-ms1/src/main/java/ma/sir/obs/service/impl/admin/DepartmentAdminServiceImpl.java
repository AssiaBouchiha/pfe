package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Department;
import ma.sir.obs.bean.history.DepartmentHistory;
import ma.sir.obs.dao.criteria.core.DepartmentCriteria;
import ma.sir.obs.dao.criteria.history.DepartmentHistoryCriteria;
import ma.sir.obs.dao.facade.core.DepartmentDao;
import ma.sir.obs.dao.facade.history.DepartmentHistoryDao;
import ma.sir.obs.dao.specification.core.DepartmentSpecification;
import ma.sir.obs.service.facade.admin.DepartmentAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
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
package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Department;
import ma.sir.obs.dao.criteria.core.DepartmentCriteria;
import ma.sir.obs.dao.criteria.history.DepartmentHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface DepartmentAdminService extends  IService<Department,DepartmentCriteria, DepartmentHistoryCriteria>  {




}

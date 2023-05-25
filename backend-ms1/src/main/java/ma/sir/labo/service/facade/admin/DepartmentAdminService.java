package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Department;
import ma.sir.labo.dao.criteria.core.DepartmentCriteria;
import ma.sir.labo.dao.criteria.history.DepartmentHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface DepartmentAdminService extends  IService<Department,DepartmentCriteria, DepartmentHistoryCriteria>  {




}

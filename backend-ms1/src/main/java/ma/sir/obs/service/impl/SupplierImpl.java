package ma.sir.obs.service.impl;

import ma.sir.obs.bean.Supplier;
import ma.sir.obs.dao.SupplierDao;
import ma.sir.obs.service.facade.AchatService;
import ma.sir.obs.service.facade.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SupplierImpl implements SupplierService {

    @Autowired
    private SupplierDao supplierDao;

    @Autowired
    private AchatService achatService;

    @Override
    public int save(Supplier supplier) {
        if (findByReference(supplier.getReference()) != null) {
            return -1;
        }
        supplierDao.save(supplier);
        return 1;
    }

    @Override
    public int update(Supplier supplier) {

        if (findByReference(supplier.getReference()) == null) {
            return -1;
        }
        supplierDao.save(supplier);
        return 1;

    }

    @Override
    public Supplier findByReference(String reference) {

        return null;
    }

    @Override
    @Transactional
    public int deleteByReference(String reference) {
        if (findByReference(reference) == null) {
            return -1;
        }
        int res1 = 0;//supplierDao.deleteByReference(reference);
        int res2 = achatService.deleteByFournisseurReference(reference);
        return res1 + res2;

    }


    @Override
    public List<Supplier> findAll() {
        return supplierDao.findAll();
    }
}

package ma.sir.obs.service.impl;

import ma.sir.obs.bean.OrderSupplier;
import ma.sir.obs.bean.Supplier;
import ma.sir.obs.dao.OrderSupplierDao;
import ma.sir.obs.dao.SupplierDao;
import ma.sir.obs.service.facade.AchatService;
import ma.sir.obs.service.facade.OrderSupplierService;
import ma.sir.obs.service.facade.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderSupplierImpl implements OrderSupplierService {

    @Autowired
    private OrderSupplierDao orderSupplierDao;

    @Override
    public int save(OrderSupplier orderSupplier) {
        orderSupplierDao.save(orderSupplier);
        return 1;
    }

    @Override
    public int update(OrderSupplier orderSupplier) {
        return 0;
    }

    @Override
    public OrderSupplier findByReference(String reference) {
        return orderSupplierDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return orderSupplierDao.deleteByReference(reference);
    }

    @Override
    public List<OrderSupplier> findAll() {
        return orderSupplierDao.findAll();
    }
}


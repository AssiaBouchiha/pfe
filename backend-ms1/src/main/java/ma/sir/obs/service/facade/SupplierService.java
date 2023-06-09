package ma.sir.obs.service.facade;


import ma.sir.obs.bean.Supplier;

import java.util.List;

public interface SupplierService {

    int save(Supplier supplier);

    int update(Supplier supplier);

    Supplier findByReference(String reference);

    int deleteByReference(String reference);


    List<Supplier> findAll();

}


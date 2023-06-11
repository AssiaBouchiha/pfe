package ma.sir.obs.service.facade;

import ma.sir.obs.bean.OrderSupplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderSupplierService {


    int save(OrderSupplier orderSupplier);

    int update(OrderSupplier orderSupplier);

    OrderSupplier findByReference(String reference);

    int deleteByReference(String reference);

    List<OrderSupplier> findAll();
}

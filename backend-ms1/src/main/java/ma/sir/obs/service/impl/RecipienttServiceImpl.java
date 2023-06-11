package ma.sir.obs.service.impl;

import ma.sir.obs.bean.Recipient;
import ma.sir.obs.dao.RecipientDao;
import ma.sir.obs.service.facade.RecipientService;
import ma.sir.obs.service.facade.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipienttServiceImpl implements RecipientService {

    @Autowired
    private RecipientDao recipientDao;

    @Override
    public int save(Recipient recipient) {
        if (findByCode(recipient.getCode()) != null) {
            return -1;
        } else {
            recipientDao.save(recipient);
            return 1;
        }
    }

    @Override
    public Recipient findByCode(String code) {
        return recipientDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return recipientDao.deleteByCode(code);
    }

    @Override
    public List findAll() {
        return recipientDao.findAll();
    }
}

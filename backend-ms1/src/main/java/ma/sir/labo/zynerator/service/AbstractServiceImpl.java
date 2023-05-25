package ma.sir.labo.zynerator.service;

import ma.sir.labo.zynerator.audit.AuditBusinessObject;
import ma.sir.labo.zynerator.criteria.BaseCriteria;
import ma.sir.labo.zynerator.dto.AuditEntityDto;
import ma.sir.labo.zynerator.exception.EntityNotFoundException;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import ma.sir.labo.zynerator.history.HistCriteria;
import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.zynerator.security.bean.User;
import ma.sir.labo.zynerator.security.service.facade.UserService;
import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.zynerator.util.ListUtil;
import ma.sir.labo.zynerator.util.RefelexivityUtil;
import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.util.Utils;

import ma.sir.labo.zynerator.util.FileUtils;
import ma.sir.labo.zynerator.util.MD5Checksum;
import ma.sir.labo
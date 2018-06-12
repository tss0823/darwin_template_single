package ${packageName}.core.manager.impl;

import ${packageName}.common.domain.request.${upperEntityEnName}Request;
import ${packageName}.common.utils.Pager;
import ${packageName}.core.manager.${upperEntityEnName}Manager;
import ${packageName}.dal.dao.${upperEntityEnName}Dao;
import ${packageName}.dal.domain.${upperEntityEnName};
import ${packageName}.dal.mapper.${upperEntityEnName}Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}Manager实现类
 */
@Component
public class ${upperEntityEnName}MangerImpl implements ${upperEntityEnName}Manager {

    @Autowired
    private ${upperEntityEnName}Dao ${entityEnName}Dao;


}

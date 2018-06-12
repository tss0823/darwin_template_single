package ${packageName}.dal.dao.impl;

import ${packageName}.common.domain.request.${upperEntityEnName}Request;
import ${packageName}.common.utils.BeanUtils;
import ${packageName}.common.utils.Pager;
import ${packageName}.dal.dao.${upperEntityEnName}Dao;
import ${packageName}.dal.domain.${upperEntityEnName};
import ${packageName}.dal.mapper.${upperEntityEnName}Mapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}DAO实现类
 */
@Repository
public class ${upperEntityEnName}DaoImpl implements ${upperEntityEnName}Dao {

    @Autowired
    private ${upperEntityEnName}Mapper ${entityEnName}Mapper;

    @Override
    public List<${upperEntityEnName}> selectList(${upperEntityEnName}Request request) {
        Map<String, Object> queryMap = BeanUtils.beanToQueryMap(request);
        return ${entityEnName}Mapper.selectList(queryMap);
    }

    @Override
    public ${upperEntityEnName} selectOne(${upperEntityEnName}Request request) {
        List<${upperEntityEnName}> warnEventResults = this.selectList(request);
        if (CollectionUtils.isNotEmpty(warnEventResults)) {
            return warnEventResults.get(0);
        }
        return null;
    }

    @Override
    public Pager<${upperEntityEnName}> selectPage(${upperEntityEnName}Request request) {
        Map<String, Object> queryMap = BeanUtils.beanToQueryMap(request);
        int totalCount = ${entityEnName}Mapper.selectListCount(queryMap);
        Pager<${upperEntityEnName}> pager = new Pager<>(request.getPageIndex(),request.getPageSize(),totalCount);
        if (totalCount == 0) {
            return pager;
        }
        request.setPager(pager);
        List<${upperEntityEnName}> dataList = this.selectList(request);
        pager.setList(dataList);
        return pager;
    }

    @Override
    public ${upperEntityEnName} findById(Long id) {
        return ${entityEnName}Mapper.findById(id);
    }

    @Override
    public int insert(${upperEntityEnName} ${upperEntityEnName}) {
        return ${entityEnName}Mapper.insert(${upperEntityEnName});
    }

    @Override
    public int updateById(${upperEntityEnName} ${upperEntityEnName}) {
        return ${entityEnName}Mapper.updateById(${upperEntityEnName});
    }

    @Override
    public int deleteById(Long id) {
        return ${entityEnName}Mapper.deleteById(id);
    }

    @Transactional
    @Override
    public int insertBatch(List<${upperEntityEnName}> dataList) {
        return ${entityEnName}Mapper.insertBatch(dataList);
    }
}

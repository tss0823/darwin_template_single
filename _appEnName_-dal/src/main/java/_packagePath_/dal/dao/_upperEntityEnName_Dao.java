package ${packageName}.dal.dao;

import ${packageName}.common.domain.dto.${upperEntityEnName}DTO;
import ${packageName}.common.domain.request.${upperEntityEnName}Request;
import ${packageName}.common.utils.Pager;
import ${packageName}.dal.domain.${upperEntityEnName};

import java.util.List;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}DAO接口
 */
public interface ${upperEntityEnName}Dao {

    /**
     * 查询列表
     *
     * @param request
     * @return
     */
    List<${upperEntityEnName}> selectList(${upperEntityEnName}Request request);

    /**
     * 查询对象
     *
     * @param request
     * @return
     */
    ${upperEntityEnName} selectOne(${upperEntityEnName}Request request);


    /**
     * 分页查询
     *
     * @param request
     * @return
     */
    Pager<${upperEntityEnName}> selectPage(${upperEntityEnName}Request request);

    /**
     * 根据id获得对象
     *
     * @param id
     * @return
     */
    ${upperEntityEnName} findById(Long id);

    /**
     * 新增
     *
     * @param ${upperEntityEnName}
     * @return
     */
    int insert(${upperEntityEnName} ${upperEntityEnName});

    /**
     * 根据id修改
     *
     * @param ${upperEntityEnName}
     * @return
     */
    int updateById(${upperEntityEnName} ${upperEntityEnName});

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 批量新增
     * @param dataList
     * @return
     */
    int insertBatch(List<${upperEntityEnName}> dataList);

}

package ${packageName}.common.service;

import ${packageName}.common.domain.dto.${upperEntityEnName}DTO;
import ${packageName}.common.domain.request.${upperEntityEnName}Request;
import ${packageName}.common.domain.result.DarwinResult;
import ${packageName}.common.utils.Pager;

import java.util.List;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}服务接口
 */
public interface ${upperEntityEnName}Service {

    /**
     * 查询列表
     *
     * @param request
     * @return
     */
    DarwinResult<List> selectList(${upperEntityEnName}Request request);



    /**
     * 分页查询
     *
     * @param request
     * @return
     */
    DarwinResult<Pager<${upperEntityEnName}DTO>> selectPage(${upperEntityEnName}Request request);

    /**
     * 根据id获得对象
     *
     * @param id
     * @return
     */
    DarwinResult<${upperEntityEnName}DTO> findById(Long id);

    /**
     * 新增
     *
     * @param request
     * @return
     */
    DarwinResult<Integer> insert(${upperEntityEnName}Request request);

    /**
     * 批量新增
     *
     * @param dataList
     * @return
     */
    DarwinResult<Integer> insertBatch(List<${upperEntityEnName}Request> dataList);


    /**
     * 根据id修改
     *
     * @param request
     * @return
     */
    DarwinResult<Integer> updateById(${upperEntityEnName}Request request);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    DarwinResult<Integer> deleteById(Long id);

}

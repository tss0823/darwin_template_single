package ${packageName}.client.service;

import ${packageName}.common.domain.dto.${upperEntityEnName}DTO;
import ${packageName}.common.domain.request.${upperEntityEnName}Request;
import ${packageName}.common.domain.result.DarwinResult;
import ${packageName}.common.service.${upperEntityEnName}Service;
import ${packageName}.common.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}客户端服务实现类
 */
@Service
public class ${upperEntityEnName}Client implements ${upperEntityEnName}Service {

    @Autowired
    private ${upperEntityEnName}Service ${entityEnName}Service;

    @Override
    public DarwinResult<List> selectList(${upperEntityEnName}Request request) {
        return ${entityEnName}Service.selectList(request);
    }

    @Override
    public DarwinResult<Pager<${upperEntityEnName}DTO>> selectPage(${upperEntityEnName}Request request) {
        return ${entityEnName}Service.selectPage(request);
    }

    @Override
    public DarwinResult<${upperEntityEnName}DTO> findById(Long id) {
        return ${entityEnName}Service.findById(id);
    }

    @Override
    public DarwinResult<Integer> insert(${upperEntityEnName}Request request) {
        return ${entityEnName}Service.insert(request);
    }

    @Override
    public DarwinResult<Integer> insertBatch(List<${upperEntityEnName}Request> dataList) {
        return ${entityEnName}Service.insertBatch(dataList);
    }

    @Override
    public DarwinResult<Integer> updateById(${upperEntityEnName}Request request) {
        return ${entityEnName}Service.updateById(request);
    }

    @Override
    public DarwinResult<Integer> deleteById(Long id) {
        return ${entityEnName}Service.deleteById(id);
    }
}

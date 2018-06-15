package ${packageName}.core.service;

import com.meitu.meipu.commons.utils.copy.ObjectCopyFastUtils;
import ${packageName}.common.domain.dto.${upperEntityEnName}DTO;
import ${packageName}.common.domain.request.${upperEntityEnName}Request;
import ${packageName}.common.domain.result.DarwinResult;
import ${packageName}.common.service.${upperEntityEnName}Service;
import ${packageName}.common.utils.Pager;
import ${packageName}.core.manager.${upperEntityEnName}Manager;
import ${packageName}.dal.dao.${upperEntityEnName}Dao;
import ${packageName}.dal.domain.${upperEntityEnName};
import com.meitu.tardis.spring.annotations.JrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}服务实现类
 */
@Service("${entityEnName}Service")
@JrpcService
public class ${upperEntityEnName}ServiceImpl  extends AbstServic implements ${upperEntityEnName}Service {

    @Autowired
    private ${upperEntityEnName}Manager ${entityEnName}Manager;

    @Autowired
    private ${upperEntityEnName}Dao ${entityEnName}Dao;

    @Override
    public DarwinResult<List> selectList(${upperEntityEnName}Request request) {
        DarwinResult<List> result = new DarwinResult<>();
        result.setData(${entityEnName}Dao.selectList(request));
        return result;
    }

    @Override
    public DarwinResult<Pager<${upperEntityEnName}DTO>> selectPage(${upperEntityEnName}Request request) {
        Pager<${upperEntityEnName}> pager = ${entityEnName}Dao.selectPage(request);
        Pager<${upperEntityEnName}DTO> newPager = new Pager<>(request.getPageIndex(),request.getPageSize(),pager.getTotal());
        List<${upperEntityEnName}DTO> ${entityEnName}DTOS = ObjectCopyFastUtils.copyListFast(pager.getList(), ${upperEntityEnName}DTO.class);
        newPager.setList(${entityEnName}DTOS);
        DarwinResult<Pager<${upperEntityEnName}DTO>> result = new DarwinResult<>();
        result.setData(newPager);
        return result;
    }

    @Override
    public DarwinResult<${upperEntityEnName}DTO> findById(Long id) {
        DarwinResult<${upperEntityEnName}DTO> result = new DarwinResult<>();
        ${upperEntityEnName}DTO ${entityEnName}DTO = ObjectCopyFastUtils.copyFast(${entityEnName}Dao.findById(id), ${upperEntityEnName}DTO.class);
        result.setData(${entityEnName}DTO);
        return result;
    }

    @Override
    public DarwinResult<Integer> insert(${upperEntityEnName}Request request) {
        DarwinResult<Integer> result = new DarwinResult<>();
        int state = ${entityEnName}Dao.insert(ObjectCopyFastUtils.copyFast(request, ${upperEntityEnName}.class));
        result.setData(state);
        return result;
    }

    @Override
    public DarwinResult<Integer> insertBatch(List<${upperEntityEnName}Request> dataList) {
        DarwinResult<Integer> result = new DarwinResult<>();
        int state = ${entityEnName}Dao.insertBatch(ObjectCopyFastUtils.copyListFast(dataList, ${upperEntityEnName}.class));
        result.setData(state);
        return result;
    }

    @Override
    public DarwinResult<Integer> updateById(${upperEntityEnName}Request request) {
        DarwinResult<Integer> result = new DarwinResult<>();
        int state = ${entityEnName}Dao.updateById(ObjectCopyFastUtils.copyFast(request, ${upperEntityEnName}.class));
        result.setData(state);
        return result;
    }

    @Override
    public DarwinResult<Integer> deleteById(Long id) {
        DarwinResult<Integer> result = new DarwinResult<>();
        result.setData(${entityEnName}Dao.deleteById(id));
        return result;
    }
}

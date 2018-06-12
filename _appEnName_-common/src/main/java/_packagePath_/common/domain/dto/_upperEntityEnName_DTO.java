/*
 * 
 * 
 * 
 * 
 */

package ${packageName}.common.domain.dto;

import ${packageName}.common.domain.BaseDomain;

import java.util.Date;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}DTO
 */
public class ${upperEntityEnName}DTO extends BaseDomain {
    
    private static final long serialVersionUID = 1L;
    
    #foreach($item in $!bo.propList)
private $!{item.dataType} $!{item.enName};
        
    #end

    public ${upperEntityEnName}DTO(){
    }

    #foreach($item in $!bo.propList)
public void set$!{item.upperEnName}($!{item.dataType} value) {
        this.$!{item.enName} = value;
    }
    
    public $!{item.dataType} get$!{item.upperEnName}() {
        return this.$!{item.enName};
    }
    #end




}
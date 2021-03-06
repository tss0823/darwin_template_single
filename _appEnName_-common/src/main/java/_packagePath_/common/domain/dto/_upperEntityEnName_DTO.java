/*
 * 
 * 
 * 
 * 
 */

package ${packageName}.common.domain.dto;
import ${packageName}.common.constants.ModelFieldComment;
import ${packageName}.common.constants.ModelComment;
import ${packageName}.common.domain.BaseDomain;

import java.util.Date;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}DTO传输对象
 */
@ModelComment("${entityCnName}")
public class ${upperEntityEnName}DTO extends BaseDomain {
    
    private static final long serialVersionUID = 1L;
    
    #foreach($item in $!bo.propList)
@ModelFieldComment(value = "$!{item.cnName}"#if("$!item.length"!=""), maxLength = $!{item.length}#end #if("$!item.isNull"=="true"), required = false#end)
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
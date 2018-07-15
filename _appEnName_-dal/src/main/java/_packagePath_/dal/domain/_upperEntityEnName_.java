/*
 * 
 * 
 * 
 * 
 */

package ${packageName}.dal.domain;
import ${packageName}.common.constants.ModelFieldComment;
import ${packageName}.common.constants.ModelComment;

import java.io.Serializable;
import java.util.Date;

import ${packageName}.common.domain.BaseDomain;

import java.util.Date;

/**
 * @author: ${author}
 * @date: ${time}
 * ${entityCnName}实体
 */
@ModelComment("${entityCnName}实体")
public class ${upperEntityEnName} extends BaseDomain {
    
    private static final long serialVersionUID = 1L;
    
    #foreach($item in $!bo.propList)
@ModelFieldComment(value = "$!{item.cnName}"#if("$!item.length"!=""), maxLength = $!{item.length}#end #if("$!item.isNull"=="true"), required = false#end)
    private $!{item.dataType} $!{item.enName};
        
    #end

    public ${upperEntityEnName}(){
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
/*
 * 
 * 
 * 
 * 
 */

package ${packageName}.common.domain.request;

import java.util.Date;

/**
 * @date: ${time}
 * @author: ${author}
 * ${entityCnName}Request
 */
public class ${upperEntityEnName}Request extends BaseRequest  {
    
    private static final long serialVersionUID = 1L;
    
    #foreach($item in $!bo.propList)
private $!{item.dataType} $!{item.enName};
        
    #end

    public ${upperEntityEnName}Request(){
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
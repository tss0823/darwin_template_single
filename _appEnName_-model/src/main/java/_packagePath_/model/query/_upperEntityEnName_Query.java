/*
 * 
 * 
 * 
 * 
 */

package ${packageName}.model.query;

import java.io.Serializable;
import java.util.Date;

/**
 * ${entityCnName}
 * @author ${author}
 *
 * @${time}
 */
public class ${upperEntityEnName}Query extends BaseQuery {
    
    private static final long serialVersionUID = 1L;
    
    #foreach($item in $!bo.propList)
/**  $!{item.cnName} * */
    private $!{item.dataType} $!{item.enName};
        
    #end



    #foreach($item in $!bo.propList)
public void set$!{item.upperEnName}($!{item.dataType} value) {
        this.$!{item.enName} = value;
    }
    
    public $!{item.dataType} get$!{item.upperEnName}() {
        return this.$!{item.enName};
    }
    #end




}
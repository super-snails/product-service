package com.tsing.product.api.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 服务状态检查
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("demo")
public class DemoEntity extends Model<DemoEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 服务状态
     */
    private String status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

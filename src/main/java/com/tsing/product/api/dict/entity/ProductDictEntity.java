package com.tsing.product.api.dict.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 产品通用数据字典
 * </p>
 *
 * @author dong.li
 * @since 2021-08-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("product_dict")
public class ProductDictEntity extends Model<ProductDictEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 分类编码
     */
    private String categoryCode;

    /**
     * 分类说明
     */
    private String categoryDesc;

    /**
     * 编码
     */
    private String dictCode;

    /**
     * 名称
     */
    private String dictDesc;

    /**
     * 排序编号
     */
    private Integer sortNo;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 附加说明
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 乐观锁版本号
     */
    private Integer version;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

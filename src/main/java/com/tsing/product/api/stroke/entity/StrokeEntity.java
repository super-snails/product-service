package com.tsing.product.api.stroke.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 行程介绍
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("stroke")
public class StrokeEntity extends Model<StrokeEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 外键，和teambuilding表关联
     */
    private Long teambuildingId;

    /**
     * 团建特色名称
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序
     */
    private Integer sorting;

    /**
     * 逻辑删除 0 未删除 1 删除
     */
    private Boolean deleted;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 创建时间
     */
    private LocalDateTime updateAt;

    /**
     * 修改时间
     */
    private LocalDateTime createAt;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

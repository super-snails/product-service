package com.tsing.product.api.feature.entity;

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
 * 团建特色
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("feature")
public class FeatureEntity extends Model<FeatureEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 外键、团建游主键ID
     */
    private Long teambuildingId;

    /**
     * 餐饮指数
     */
    private Integer foodIndex;

    /**
     * 团建项目
     */
    private Integer teamBuildingProject;

    /**
     * 体力消耗
     */
    private Integer physicalExertion;

    /**
     * 景区风光
     */
    private Integer scenicScenery;

    /**
     * 团建描述
     */
    private String description;

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

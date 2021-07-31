package com.tsing.product.api.teambuilding.entity;

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
 * 团建表
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("teambuilding")
public class TeambuildingEntity extends Model<TeambuildingEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标题
     */
    private String name;

    /**
     * 目的地名称
     */
    private String destinationName;

    /**
     * 目的地等级
     */
    private Integer destinationGrade;

    /**
     * 目的地描述
     */
    private String destinationDesc;

    /**
     * 价格，用分来处理
     */
    private Integer price;

    /**
     * 描述
     */
    private String description;

    /**
     * 封面图
     */
    private String coverPicture;

    /**
     * 预定须知
     */
    private String tips;

    /**
     * 费用包含
     */
    private String expenseDescritionContain;

    /**
     * 费用不包含
     */
    private String expenseDescritionNotContain;

    /**
     * 温馨提示
     */
    private String bookingNotice;

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

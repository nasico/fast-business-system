package cn.linkztop.fastbusinesssystem.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author nasico
 */
@Data
public class DataEntity extends BaseEntity{
    private int createBy;
    private LocalDateTime createTime;
    private int updateBy;
    private LocalDateTime updateTime;
}

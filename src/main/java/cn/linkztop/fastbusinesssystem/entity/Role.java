package cn.linkztop.fastbusinesssystem.entity;

import lombok.Data;

/**
 * @author nasico
 */
@Data
public class Role  extends DataEntity{
    private String code;
    private String name;
    private String description;
}

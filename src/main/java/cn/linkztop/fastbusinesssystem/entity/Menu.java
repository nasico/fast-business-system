package cn.linkztop.fastbusinesssystem.entity;

import lombok.Data;

import java.util.List;

/**
 * 系统访问菜单
 * @author nasico
 */
@Data
public class Menu extends DataEntity{
    private String name;
    private String url;
    private String description;
    private List<Role> roles;
}

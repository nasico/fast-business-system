package cn.linkztop.fastbusinesssystem.service;

import cn.linkztop.fastbusinesssystem.entity.Menu;

import java.util.List;

/**
 * 目录service
 * @author nasico
 */
public interface MenuService {
    /**
     * 获取所有目录列表
     * @return
     */
    List<Menu> getAllMenu();
}

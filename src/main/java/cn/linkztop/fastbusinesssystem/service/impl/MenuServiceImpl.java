package cn.linkztop.fastbusinesssystem.service.impl;

import cn.linkztop.fastbusinesssystem.entity.Menu;
import cn.linkztop.fastbusinesssystem.mapper.MenuMapper;
import cn.linkztop.fastbusinesssystem.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nasico
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenu() {
        return menuMapper.getAllMenu();
    }
}

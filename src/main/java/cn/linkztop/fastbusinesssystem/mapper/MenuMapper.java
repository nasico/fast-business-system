package cn.linkztop.fastbusinesssystem.mapper;

import cn.linkztop.fastbusinesssystem.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nasico
 */
@Repository
public interface MenuMapper {

    /**
     * 获取所有目录
     * @return
     */
    List<Menu> getAllMenu();
}

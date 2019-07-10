package com.bee.sample.ch14.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bee.sample.ch14.entity.Menu;
import com.bee.sample.ch14.pojo.MenuNode;
import com.bee.sample.ch14.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
    Log log = LogFactory.getLog(this.getClass());

    @CacheEvict(cacheNames = {"menu", "menuTree"}, allEntries = true)
    public void addMenu(Menu menu) {

    }

    @Cacheable(cacheNames = "menu")
    public Menu getMenu(Long id) {
        log.info("call service getMenu " + id);
        // 模拟
        Menu menu = new Menu();
        menu.setCode("test");
        menu.setId(id);
        menu.setName("菜单" + id);
        menu.setParentId(1l);

        return menu;
    }

    @Cacheable("menuTree")
    public MenuNode getMenuTree() {

        log.info("call menu tree ");
        Menu root = new Menu();
        root.setCode("root");
        root.setId(1l);
        root.setName("系统管理");
        root.setParentId(null);

        Menu menu = new Menu();
        menu.setCode("menu");
        menu.setId(1l);
        menu.setName("菜单管理");
        menu.setParentId(1l);

        MenuNode tree = new MenuNode();
        tree.setMenu(root);
        tree.setParent(null);

        MenuNode menuTree = new MenuNode();
        menuTree.setMenu(menu);
        menuTree.setParent(tree);
        tree.getChildren().add(menuTree);

        return tree;

    }


}

package com.bee.sample.ch14.service;

import com.bee.sample.ch14.entity.Menu;
import com.bee.sample.ch14.pojo.MenuNode;

public interface MenuService {
    public void addMenu(Menu menu);

    public Menu getMenu(Long id);

    public MenuNode getMenuTree();
}

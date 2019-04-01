package com.bee.sample.ch14.pojo;

import java.util.ArrayList;
import java.util.List;

import com.bee.sample.ch14.entity.Menu;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class MenuNode implements java.io.Serializable {
    private Menu menu;
    private List<MenuNode> children = new ArrayList<MenuNode>();
    @JsonIgnore
    private MenuNode parent;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<MenuNode> getChildren() {
        return children;
    }

    public void setChildren(List<MenuNode> children) {
        this.children = children;
    }

    public MenuNode getParent() {
        return parent;
    }

    public void setParent(MenuNode parent) {
        this.parent = parent;
    }

}

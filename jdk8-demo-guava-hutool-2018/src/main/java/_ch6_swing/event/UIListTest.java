package _ch6_swing.event;

import java.awt.Container;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class UIListTest extends JFrame {
    private static final long serialVersionUID = 2068017287028903877L;

    public UIListTest() {
        Container cp = getContentPane();

        cp.setLayout(null);// 使用绝对布局管理?
        JList<String> jl = new JList<String>(new MyListModel());// 创建列表
        JScrollPane js = new JScrollPane(jl);// 创建滚动面板
        js.setBounds(10, 10, 100, 100);// 设置列表大小及显示位?
        cp.add(js);// 增加列表
        setTitle("在这个窗体中使用了列表框");// 设置窗体标题
        setSize(250, 150);// 设置窗体大小
        setVisible(true);// 显示窗体
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String args[]) {
        new UIListTest();
    }
}

class MyListModel extends AbstractListModel<String> {
    private static final long serialVersionUID = 4335103731940774933L;
    private String[] contents = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6"};

    @Override
    public int getSize() { // 获得列表中元素个?
        return contents.length;
    }

    @Override
    public String getElementAt(int index) {// 获得列表中指定位置元?
        return contents[index];
    }

}

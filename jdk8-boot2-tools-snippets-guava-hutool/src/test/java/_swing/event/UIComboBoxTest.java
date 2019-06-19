package _swing.event;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UIComboBoxTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 89608146836884782L;
    JComboBox<String> jc = new JComboBox<String>(new MyComboBox());// 创建下拉列表?
    JLabel jl = new JLabel("请?择证件:");// 创建标签

    public UIComboBoxTest() {
        setSize(new Dimension(250, 150));// 设置窗体大小
        setVisible(true);// 设置窗体可见
        setTitle("在窗口中设置下拉列表?");// 设置标题
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);// 单击关闭按钮时关闭窗?
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());// 设置面板布局
        cp.add(jl);// 增加标签
        cp.add(jc);// 增加下拉列表?
    }

    public static void main(String[] args) {
        new UIComboBoxTest();
    }
}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {

    /**
     *
     */
    private static final long serialVersionUID = 7419446883908139372L;
    String selecteditem = null;
    String[] test = {"身份?", "军人?", "学生?", "工作?"};

    @Override
    public int getSize() {// 获得列表项个?
        return test.length;
    }

    @Override
    public String getElementAt(int index) {// 获得指定索引的元?
        return test[index];
    }

    @Override
    public void setSelectedItem(Object anItem) {// 设置元素
        selecteditem = (String) anItem;

    }

    @Override
    public Object getSelectedItem() {// 获得选择的元?
        return selecteditem;
    }

}

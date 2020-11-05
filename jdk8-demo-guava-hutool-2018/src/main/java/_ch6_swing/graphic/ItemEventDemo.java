package _ch6_swing.graphic;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ItemEventDemo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 6236320392976508115L;

    public static void main(String args[]) {
        ItemEventDemo frame = new ItemEventDemo();
        frame.setVisible(true);
    }

    public ItemEventDemo() {
        super();
        getContentPane().setLayout(new FlowLayout());
        setTitle("选项事件示例");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> comboBox = new JComboBox<>();// 创建?个下拉菜?
        for (int i = 1; i < 6; i++) {// 通过循环添加选项
            comboBox.addItem("选项" + i);
        }
        comboBox.addItemListener(new ItemListener() {// 添加选项事件监听?
            public void itemStateChanged(ItemEvent e) {
                int stateChange = e.getStateChange();// 获得事件类型
                String item = e.getItem().toString();// 获得触发此次事件的?项
                if (stateChange == ItemEvent.SELECTED) {// 查看是否由?中选项触发
                    System.out.println("此次事件?      选中  选项?" + item + "”触发！");
                } else if (stateChange == ItemEvent.DESELECTED) {// 查看是否由取消?中选项触发
                    System.out.println("此次事件?  取消选中  选项?" + item + "”触发！");
                } else {// 由其他原因触?
                    System.out.println("此次事件由其他原因触发！");
                }
            }
        });
        getContentPane().add(comboBox);
    }

}


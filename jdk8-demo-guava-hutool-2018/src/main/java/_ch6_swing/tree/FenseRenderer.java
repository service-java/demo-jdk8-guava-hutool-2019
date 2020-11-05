package _ch6_swing.tree;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class FenseRenderer implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel renderer = (JLabel) new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 0) {// 偶数?
            renderer.setForeground(Color.WHITE); // 将文本设置成白色
            renderer.setBackground(Color.BLUE); // 将背景设置成蓝色
        } else {// 奇数?
            renderer.setForeground(Color.BLUE); // 将文本设置成蓝色
            renderer.setBackground(Color.WHITE); // 将背景设置成白色
        }
        return renderer;
    }
}

package _ch6_swing.tree;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

public class BookCellRenderer implements TreeCellRenderer {
    private JLabel titleLabel = new JLabel();// 书名标签
    private JLabel pressLabel = new JLabel();// 出版社标?
    private JLabel publicationDateLabel = new JLabel();// 出版时间标签
    private JLabel booksCategoryLabel = new JLabel(); // 丛书类别标签
    private JLabel priceLabel = new JLabel();// 定价标签
    private JPanel panel = new JPanel(new GridLayout(5, 1, 5, 5));// 使用网格布局的面?

    public BookCellRenderer() {
        titleLabel.setForeground(Color.RED);// 设置标签的文本颜?
        titleLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));// 设置标签的字?
        panel.add(titleLabel);// 在面板中增加标签
        pressLabel.setForeground(Color.GREEN);// 设置标签的文本颜?
        pressLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));// 设置标签的字?
        panel.add(pressLabel);// 在面板中增加标签
        publicationDateLabel.setForeground(Color.BLUE);// 设置标签的文本颜?
        publicationDateLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));// 设置标签的字?
        panel.add(publicationDateLabel); // 在面板中增加标签
        booksCategoryLabel.setForeground(Color.ORANGE);// 设置标签的文本颜?
        booksCategoryLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));// 设置标签的字?
        panel.add(booksCategoryLabel); // 在面板中增加标签
        priceLabel.setForeground(Color.PINK);// 设置标签的文本颜?
        priceLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));// 设置标签的字?
        panel.add(priceLabel);// 在面板中增加标签
        panel.setPreferredSize(new Dimension(350, 110));// 设置面板的大?
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        Object userObject = ((DefaultMutableTreeNode) value).getUserObject();
        if (userObject instanceof Book) {// 对于Book类型的节点使用自定义渲染?
            Book book = (Book) userObject;// 获得Book类型的对?
            titleLabel.setText("书名?" + book.getTitle()); // 设置属??
            pressLabel.setText("出版社：" + book.getPress()); // 设置属??
            publicationDateLabel.setText("出版时间?" + book.getPublicationDate());// 属??
            booksCategoryLabel.setText("丛书类别?" + book.getBooksCategory());// 设置属??
            priceLabel.setText("定价?" + book.getPrice() + "?");// 设置属??
            return panel;
        } else {// 对于其他节点使用默认的渲染器
            return new DefaultTreeCellRenderer().getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        }
    }
}


package _ch6_swing.tree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeCreationDemo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 2236425566565391978L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TreeCreationDemo frame = new TreeCreationDemo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TreeCreationDemo() {
        setTitle("为树控件增加节点");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 250);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("根节?"); // 创建根节?
        DefaultMutableTreeNode childNode1 = new DefaultMutableTreeNode("?级子节点1"); // 创建?级子节点
        DefaultMutableTreeNode childNode11 = new DefaultMutableTreeNode("二级子节?11"); // 创建二级子节?
        DefaultMutableTreeNode childNode12 = new DefaultMutableTreeNode("二级子节?12"); // 创建二级子节?
        childNode1.add(childNode11); // 为一级子节点添加二级子节?
        childNode1.add(childNode12); // 为一级子节点添加二级子节?
        DefaultMutableTreeNode childNode2 = new DefaultMutableTreeNode("?级子节点2"); // 创建?级子节点
        DefaultMutableTreeNode childNode21 = new DefaultMutableTreeNode("二级子节?21");// 创建二级子节?
        DefaultMutableTreeNode childNode22 = new DefaultMutableTreeNode("二级子节?22"); // 创建二级子节?
        childNode2.add(childNode21); // 为一级子节点添加二级子节?
        childNode2.add(childNode22); // 为一级子节点添加二级子节?
        DefaultMutableTreeNode childNode3 = new DefaultMutableTreeNode("?级子节点3"); // 创建?级子节点
        rootNode.add(childNode1); // 为根节点添加?级子节点
        rootNode.add(childNode2); // 为根节点添加?级子节点
        rootNode.add(childNode3); // 为根节点添加?级子节点
        JTree tree = new JTree(rootNode); // 创建根节点创建树
        scrollPane.setViewportView(tree);
    }

}

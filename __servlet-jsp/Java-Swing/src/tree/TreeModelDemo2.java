package tree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeModelDemo2 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -1416643860525572102L;
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
                    TreeModelDemo2 frame = new TreeModelDemo2();
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
    public TreeModelDemo2() {
        setTitle("使用树模型创建树");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("中国"); // 创建根结?
        DefaultMutableTreeNode childNode1 = new DefaultMutableTreeNode("吉林?"); // 创建?级子结点
        DefaultMutableTreeNode childNode11 = new DefaultMutableTreeNode("长春?");// 创建二级子结?
        DefaultMutableTreeNode childNode12 = new DefaultMutableTreeNode("吉林?", false);// 创建不允许有子节点的二级子结?
        DefaultMutableTreeNode childNode13 = new DefaultMutableTreeNode("四平?", true);// 创建允许有子节点的二级子结点
        childNode1.add(childNode11); // 为一级子结点添加二级子节?
        childNode1.add(childNode12); // 为一级子结点添加二级子节?
        childNode1.add(childNode13); // 为一级子结点添加二级子节?
        DefaultMutableTreeNode childNode2 = new DefaultMutableTreeNode("辽宁?");// 创建?级子结点
        DefaultMutableTreeNode childNode21 = new DefaultMutableTreeNode("沈阳?");// 创建二级子结?
        DefaultMutableTreeNode childNode22 = new DefaultMutableTreeNode("铁岭?"); // 创建二级子结?
        childNode2.add(childNode21); // 为一级子结点添加二级子节?
        childNode2.add(childNode22); // 为一级子结点添加二级子节?
        rootNode.add(childNode1); // 为根结点添加?级子结点
        rootNode.add(childNode2); // 为根结点添加?级子结点
        DefaultTreeModel treeModel = new DefaultTreeModel(rootNode); // 使用根结点创建树模型
        JTree tree = new JTree(treeModel);
        scrollPane.setViewportView(tree);
    }
}

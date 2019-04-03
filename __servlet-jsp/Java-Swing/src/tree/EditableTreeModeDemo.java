package tree;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.UIManager;

public class EditableTreeModeDemo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 546598023500487736L;
    private JPanel contentPane;
    private JTextField textField;
    private JTree tree;
    private DefaultTreeModel treeModel;

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
                    EditableTreeModeDemo frame = new EditableTreeModeDemo();
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
    public EditableTreeModeDemo() {
        setTitle("维护树结?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.SOUTH);

        textField = new JTextField();
        panel.add(textField);
        textField.setColumns(10);

        JButton button1 = new JButton("增加");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button1_actionPerformed(e);
            }
        });
        panel.add(button1);

        JButton button2 = new JButton("修改");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button2_actionPerformed(e);
            }
        });
        panel.add(button2);

        JButton button3 = new JButton("删除");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button3_actionPerformed(e);
            }
        });
        panel.add(button3);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("中国");// 创建根结?

        DefaultMutableTreeNode childNode1 = new DefaultMutableTreeNode("黑龙江省");// 创建?级子结点

        DefaultMutableTreeNode childNode11 = new DefaultMutableTreeNode("哈尔滨市"); // 创建二级子结?
        DefaultMutableTreeNode childNode12 = new DefaultMutableTreeNode("齐齐哈尔?"); // 创建二级子结?
        DefaultMutableTreeNode childNode13 = new DefaultMutableTreeNode("大庆?"); // 创建二级子结?
        childNode1.add(childNode11); // 为一级子结点添加二级子节?
        childNode1.add(childNode12); // 为一级子结点添加二级子节?
        childNode1.add(childNode13); // 为一级子结点添加二级子节?

        DefaultMutableTreeNode childNode2 = new DefaultMutableTreeNode("辽宁?"); // 创建?级子结点

        DefaultMutableTreeNode childNode21 = new DefaultMutableTreeNode("沈阳?"); // 创建二级子结?
        DefaultMutableTreeNode childNode22 = new DefaultMutableTreeNode("鞍山?");// 创建二级子结?
        childNode2.add(childNode21); // 为一级子结点添加二级子节?
        childNode2.add(childNode22); // 为一级子结点添加二级子节?
        rootNode.add(childNode1); // 为根结点添加?级子结点
        rootNode.add(childNode2); // 为根结点添加?级子结点

        treeModel = new DefaultTreeModel(rootNode);

        tree = new JTree(treeModel);
        scrollPane.setViewportView(tree);
    }

    protected void do_button1_actionPerformed(ActionEvent e) {
        // 创建欲添加节?
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(textField.getText());
        TreePath selectionPath = tree.getSelectionPath(); // 获得选中的父节点路径
        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) selectionPath.getLastPathComponent(); // 获得选中的父节点
        // 插入节点到所有子节点之后
        treeModel.insertNodeInto(node, parentNode, parentNode.getChildCount());
        // 获得新添加节点的路径
        TreePath path = selectionPath.pathByAddingChild(node);
        if (!tree.isVisible(path))
            tree.makeVisible(path); // 如果该节点不可见则令其可?
    }

    protected void do_button2_actionPerformed(ActionEvent e) {
        // 获得选中的欲修改节点的路?
        TreePath selectionPath = tree.getSelectionPath();
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) selectionPath.getLastPathComponent(); // 获得选中的欲修改节点
        node.setUserObject(textField.getText()); // 修改节点的用户标?
        treeModel.nodeChanged(node); // 通知树模型该节点已经被修?
        tree.setSelectionPath(selectionPath); // 选中被修改的节点

    }

    protected void do_button3_actionPerformed(ActionEvent e) {
        // 获得选中的欲删除节点
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        // 查看欲删除的节点是否为根节点，根节点不允许删?
        if (!node.isRoot()) {
            // 获得下一个兄弟节点，以备选中
            DefaultMutableTreeNode nextSelectedNode = node.getNextSibling();
            if (nextSelectedNode == null) // 查看是否存在兄弟节点
                // 如果不存在则选中其父节点
                nextSelectedNode = (DefaultMutableTreeNode) node.getParent();
            treeModel.removeNodeFromParent(node); // 删除节点
            // 选中节点
            tree.setSelectionPath(new TreePath(nextSelectedNode.getPath()));

        }
    }
}


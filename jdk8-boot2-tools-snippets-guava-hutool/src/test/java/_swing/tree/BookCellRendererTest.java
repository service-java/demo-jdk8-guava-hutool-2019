package _swing.tree;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.UIManager;

public class BookCellRendererTest extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 7518855659670595077L;
    private JPanel contentPane;
    private JTree tree;

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
                    BookCellRendererTest frame = new BookCellRendererTest();
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
    public BookCellRendererTest() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });
        setTitle("\u81EA\u5B9A\u4E49\u6811\u8282\u70B9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        tree = new JTree();
        tree.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        scrollPane.setViewportView(tree);
    }

    protected void do_this_windowActivated(WindowEvent e) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("从入门到精?系?");// 根节?
        Book java = new Book();// 创建Book对象并为其设置属?
        java.setTitle("《Java从入门到精?（?2版）?");
        java.setPress("清华大学出版?");
        java.setPublicationDate("2010-07-01");
        java.setBooksCategory("软件工程师入门丛?");
        java.setPrice(59.8);
        DefaultMutableTreeNode javaNode = new DefaultMutableTreeNode(java);// 创建树节?
        root.add(javaNode);// 为根节点增加节点
        Book php = new Book();// 创建Book对象并为其设置属?
        php.setTitle("《PHP从入门到精?（?2版）?");
        php.setPress("清华大学出版?");
        php.setPublicationDate("2010-07-01");
        php.setBooksCategory("软件工程师入门丛?");
        php.setPrice(69.8);
        DefaultMutableTreeNode phpNode = new DefaultMutableTreeNode(php); // 创建树节?
        root.add(phpNode);// 为根节点增加节点
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();// 获得树的模型
        model.setRoot(root); // 为模型设置根节点
        tree.setModel(model); // 使用新的模型
        tree.setCellRenderer(new BookCellRenderer());// 使用新的渲染?
    }

}

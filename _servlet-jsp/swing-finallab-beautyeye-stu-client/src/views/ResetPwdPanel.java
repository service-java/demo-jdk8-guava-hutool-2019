package views;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import components.FontHelper;
import util.LoginStatusHelper;
import util.MD5ConvertHelper;
import db.MySQLDBHelper;

//@SuppressWarnings("serial")
public class ResetPwdPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JPasswordField oldPwd, newPwd, newConfirmPwd;
    private JLabel oldPwdLabel, newPwdLabel, newPwdConfirmLabel;
    private JPanel pwdPanel;
    private JButton updateBtn;

    public ResetPwdPanel() {

        FontHelper.InitGlobalFont(new Font("微软雅黑", Font.BOLD, 14));

        pwdPanel = new JPanel();
        pwdPanel.setBounds(41, 34, 313, 194);
        pwdPanel.setBorder(BorderFactory.createTitledBorder("修改密码:"));
        pwdPanel.setLayout(null);
        pwdPanel.setPreferredSize(new Dimension(400, 300));

        oldPwdLabel = new JLabel("旧密码");
        oldPwdLabel.setBounds(44, 56, 69, 15);
        oldPwd = new JPasswordField();
        oldPwd.setBounds(119, 52, 250, 22);
        pwdPanel.add(oldPwdLabel);
        pwdPanel.add(oldPwd);

        newPwdLabel = new JLabel("新密码");
        newPwdLabel.setBounds(44, 90, 69, 15);
        newPwd = new JPasswordField();
        newPwd.setBounds(119, 86, 250, 22);
        pwdPanel.add(newPwdLabel);
        pwdPanel.add(newPwd);


        newPwdConfirmLabel = new JLabel("请确认");
        newPwdConfirmLabel.setBounds(44, 126, 69, 15);
        newConfirmPwd = new JPasswordField();
        newConfirmPwd.setBounds(119, 122, 250, 22);
        pwdPanel.add(newPwdConfirmLabel);
        pwdPanel.add(newConfirmPwd);

        updateBtn = new JButton("确认修改");
        updateBtn.setBounds(119, 162, 160, 22);
        pwdPanel.add(updateBtn);
        updateBtn.addActionListener(new UpdateBtnListener());

        add(pwdPanel);
        setVisible(true);

    }

    public class UpdateBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String pwd1 = new String(newConfirmPwd.getPassword());
            String pwd2 = new String(newPwd.getPassword());
            String pwd3 = new String(oldPwd.getPassword());
            String dbPwd = "";
            String userName = LoginStatusHelper.getUserName();
            if (pwd1.equals("") || pwd1 == null) {
                JOptionPane.showMessageDialog(null, "密码不能为空", "输入错误", JOptionPane.ERROR_MESSAGE);
            } else if (!pwd1.equals(pwd2)) {
                JOptionPane.showMessageDialog(null, "新密码输入不一致", "输入错误", JOptionPane.ERROR_MESSAGE);
            } else {

                MySQLDBHelper mysqlHelper = new MySQLDBHelper();
                mysqlHelper.queryDB("Select user_pwd From user Where user_name = '" + userName + "'");


                try {
                    dbPwd = mysqlHelper.getTableData()[0][0];

                    if (!MD5ConvertHelper.md5(userName + MD5ConvertHelper.md5(pwd3)).equals(dbPwd)) {
                        JOptionPane.showMessageDialog(null, "旧密码输入错误", "输入错误", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String pwd4 = MD5ConvertHelper.md5(userName + MD5ConvertHelper.md5(pwd1));
                        mysqlHelper.cudDB("update user set user_pwd = '" + pwd4 + "' where user_name = '" + userName + "'");

                        oldPwd.setText("");
                        newPwd.setText("");
                        newConfirmPwd.setText("");
                        JOptionPane.showMessageDialog(null, "修改成功");
                    }
                } catch (Exception e) {

                }

            }
        }
    }
}
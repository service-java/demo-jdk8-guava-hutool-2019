package _ch6_swing.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 * 调色?
 *
 * @author Luo_0412 骆金?
 */

public class PaletteApp extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final int WINDOW_WIDTH = 600;
    final int WINDOW_HEIGHT = 330; // 窗体长宽
    //	private int[][] savedColorArr = new int[12][3];
    private JButton saveColorBtn, resetBtn; // 获取颜色与重置按?
    private JFrame jf;
    private JPanel[] savedColorPanel = new JPanel[12];
    private JPanel currentColorPanel;
    private int counter = 0;
    private JSlider RSlider, GSlider, BSlider;

    public PaletteApp() {
        // 初始?
        jf = new JFrame();
        jf.setTitle("调色?");
        jf.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        jf.setResizable(false); // 不可调整宽度
        jf.setLayout(new BorderLayout());
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // 初始化各区域
        initAppTitleArea();
        initSavedColorArea();
        initCurrentColorArea();
        initRGBSliderArea();
        initOperateBtnArea();

        jf.setVisible(true);
    }

    /**
     * 初始?
     */
    public void initAppTitleArea() {
        JPanel jp = new JPanel();
        JLabel label = new JLabel("?易调色板", SwingConstants.CENTER); // 居中
        jp.add(label);
        jf.add(BorderLayout.NORTH, jp);
    }

    /**
     * 保存颜色历史?
     */
    public void initSavedColorArea() {
        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(150, 200));
        jp.setLayout(new BorderLayout());
        jp.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        JLabel savedColorTitle = new JLabel("你的选择", SwingConstants.CENTER);
        savedColorTitle.setOpaque(true);
        savedColorTitle.setForeground(Color.blue);
        savedColorTitle.setBackground(Color.yellow);


        JPanel savedColorPanels = new JPanel();
        savedColorPanels.setLayout(new GridLayout(7, 2, 2, 2));

        for (int i = 0; i < 12; i++) {
            savedColorPanel[i] = new JPanel();
//            savedColorPanel[i].setOpaque(true);
            savedColorPanel[i].setBackground(Color.white);
            savedColorPanels.add(savedColorPanel[i]);
        }

        jp.add(BorderLayout.NORTH, savedColorTitle);
        jp.add(BorderLayout.CENTER, savedColorPanels);
        jf.add(BorderLayout.WEST, jp);

    }

    ;

    /**
     * 当前颜色?
     */
    public void initCurrentColorArea() {
        currentColorPanel = new JPanel();
        currentColorPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        currentColorPanel.setPreferredSize(new Dimension(300, 200));
        currentColorPanel.setBackground(Color.white);

        jf.add(BorderLayout.CENTER, currentColorPanel);
    }

    ;

    /**
     * 滑动条区
     */
    public void initRGBSliderArea() {
        JPanel jp = new JPanel();
        LineBorder lbr = new LineBorder(Color.BLUE, 3);
        jp.setBorder(BorderFactory.createTitledBorder(lbr, "RGB模式"));

        RSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
        RSlider.setValue(255);
        RSlider.setMajorTickSpacing(51); // Major tick every 20
        RSlider.setMinorTickSpacing(5); // Minor tick every 5
        RSlider.setPaintTicks(true); // Display tick marks
        RSlider.setPaintLabels(true); // Display numbers

        GSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
        GSlider.setValue(255);
        GSlider.setMajorTickSpacing(51); // Major tick every 20
        GSlider.setMinorTickSpacing(5); // Minor tick every 5
        GSlider.setPaintTicks(true); // Display tick marks
        GSlider.setPaintLabels(true); // Display numbers

        BSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
        BSlider.setValue(255);
        BSlider.setMajorTickSpacing(51); // Major tick every 20
        BSlider.setMinorTickSpacing(5); // Minor tick every 5
        BSlider.setPaintTicks(true); // Display tick marks
        BSlider.setPaintLabels(true); // Display numbers

        RSlider.addChangeListener(new SliderListener());
        GSlider.addChangeListener(new SliderListener());
        BSlider.addChangeListener(new SliderListener());


        jp.add(BorderLayout.WEST, RSlider);
        jp.add(BorderLayout.CENTER, GSlider);
        jp.add(BorderLayout.EAST, BSlider);
        jf.add(BorderLayout.EAST, jp);
    }

    ;

    /**
     * 操作按钮?
     */
    public void initOperateBtnArea() {
        JPanel jp = new JPanel();
        saveColorBtn = new JButton("保存当前颜色");
        resetBtn = new JButton("重置调色?");

        jp.add(saveColorBtn);
        jp.add(resetBtn);

        saveColorBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        jf.add(BorderLayout.SOUTH, jp);
    }

    ;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourceObj = e.getSource();

        if (sourceObj == saveColorBtn) {
            int i = counter % 12;
            savedColorPanel[i].setBackground(new Color(RSlider.getValue()
                    , GSlider.getValue()
                    , BSlider.getValue()));
            counter++;
        } else if (sourceObj == resetBtn) {
            counter = 0;
            for (int i = 0; i < 12; i++) {
                savedColorPanel[i].setBackground(Color.white);
            }
            RSlider.setValue(255);
            GSlider.setValue(255);
            BSlider.setValue(255);
//	        currentColorPanel.setBackground(Color.white);
        }
    }

    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            currentColorPanel.setBackground(new Color(RSlider.getValue()
                    , GSlider.getValue()
                    , BSlider.getValue()));
        }
    }

    /**
     * main方法
     *
     * @param args
     */
    public static void main(String[] args) {
        new PaletteApp(); //启动?
    }


}

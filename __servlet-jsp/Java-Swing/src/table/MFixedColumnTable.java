package table;

import java.awt.BorderLayout;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

/**
 * 创建面板?
 *
 * @author zhang zhen kun
 */
public class MFixedColumnTable extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 2079247391554214988L;
    private Vector<String> columnNameV; // 表格的列名数?
    private Vector<Vector<Object>> tableValueV; // 表格的数据数?
    private int fixedColumn = 1; // 固定列的数量

    private JTable fixedColumnTable; // 固定列表格对?
    private FixedColumnTableModel fixedColumnTableModel; // 固定列表格模型对?
    private JTable floatingColumnTable; // 移动列表格对?
    private FloatingColumnTableModel floatingColumnTableModel; // 移动列表格模型对?

    /**
     * 构?方法，初始化组?
     *
     * @param columnNameV 表格列名数组
     * @param tableValueV 表格数据数组
     * @param fixedColumn 固定列数?
     */
    public MFixedColumnTable(Vector<String> columnNameV, Vector<Vector<Object>> tableValueV, int fixedColumn) {
        super();
        setLayout(new BorderLayout());
        this.columnNameV = columnNameV; // 表格列名数组
        this.tableValueV = tableValueV; // 表格数据数组
        this.fixedColumn = fixedColumn; // 固定列数?
        // 创建固定列表?
        fixedColumnTableModel = new FixedColumnTableModel(); // 创建固定列表格模型对?
        fixedColumnTable = new JTable(fixedColumnTableModel); // 创建固定列表格对?
        ListSelectionModel fixed = fixedColumnTable.getSelectionModel(); // 获得选择模型对象
        fixed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 选择模式为单?
        fixed.addListSelectionListener(new MListSelectionListener(true)); // 添加行被选中的事件监听器
        // 创建移动列表?
        floatingColumnTableModel = new FloatingColumnTableModel(); // 创建可移动列表格模型对象
        floatingColumnTable = new JTable(floatingColumnTableModel); // 创建可移动列表格对象
        floatingColumnTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // 关闭表格的自动调整功?
        ListSelectionModel floating = floatingColumnTable.getSelectionModel(); // 获得选择模型对象
        floating.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 选择模式为单?
        floating.addListSelectionListener(new MListSelectionListener(false)); // 添加行被选中的事件监听器
        // 创建滚动面板
        JScrollPane scrollPane = new JScrollPane(); // 创建?个滚动面版对?
        scrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER, fixedColumnTable.getTableHeader()); // 将固定列表格头放到滚动面版的左上?
        JViewport viewport = new JViewport(); // 创建?个用来显示基?信息的视口对?
        viewport.setView(fixedColumnTable); // 将固定列表格添加到视口中
        viewport.setPreferredSize(fixedColumnTable.getPreferredSize()); // 设置视口的首选大?
        scrollPane.setRowHeaderView(viewport); // 将视口添加到滚动面版的标题视口中
        scrollPane.setViewportView(floatingColumnTable); // 将可移动表格添加到默认视?
        add(scrollPane, BorderLayout.CENTER);
    }

    /**
     * 创建内部类，用于左侧固定列表格的模型?
     *
     * @author zhang zhen kun
     */
    private class FixedColumnTableModel extends AbstractTableModel {
        /**
         *
         */
        private static final long serialVersionUID = -9150581419899711484L;

        public int getColumnCount() { // 返回固定列的数量
            return fixedColumn;
        }

        public int getRowCount() { // 返回行数
            return tableValueV.size();
        }

        public Object getValueAt(int rowIndex, int columnIndex) { // 返回指定单元格的?
            return tableValueV.get(rowIndex).get(columnIndex);
        }

        public String getColumnName(int columnIndex) { // 返回指定列的名称
            return columnNameV.get(columnIndex);
        }
    }

    /**
     * 创建内部类，用于右侧移动列表格的模型?
     *
     * @author zhang zhen kun
     */
    private class FloatingColumnTableModel extends AbstractTableModel {
        /**
         *
         */
        private static final long serialVersionUID = 3934620115287188392L;

        public int getColumnCount() { // 返回可移动列的数?
            return columnNameV.size() - fixedColumn; // 返回去掉固定列后的数?
        }

        public int getRowCount() { // 返回行数
            return tableValueV.size();
        }

        public Object getValueAt(int rowIndex, int columnIndex) { // 返回指定单元格的?
            // 为列索引加上固定列的数量
            return tableValueV.get(rowIndex).get(columnIndex + fixedColumn);
        }

        public String getColumnName(int columnIndex) { // 返回指定列的名称
            return columnNameV.get(columnIndex + fixedColumn); // 为列索引加上固定列的数量
        }
    }

    /**
     * 创建内部类，用于同步左侧和右侧两个表格中被?中行的事件监听器类
     *
     * @author zhang zhen kun
     */
    private class MListSelectionListener implements ListSelectionListener {
        boolean isFixedColumnTable = true; // 默认由?中固定列表格中的行触发

        public MListSelectionListener(boolean isFixedColumnTable) {
            this.isFixedColumnTable = isFixedColumnTable;
        }

        public void valueChanged(ListSelectionEvent e) {
            if (isFixedColumnTable) { // 由?中固定列表格中的行触发
                int row = fixedColumnTable.getSelectedRow(); // 获得固定列表格中的?中?
                // 同时选中右侧可移动列表格中的相应?
                floatingColumnTable.setRowSelectionInterval(row, row);
            } else { // 由?中可移动列表格中的行触?
                int row = floatingColumnTable.getSelectedRow(); // 获得可移动列表格中的选中?
                // 同时选中左侧固定列表格中的相应行
                fixedColumnTable.setRowSelectionInterval(row, row);
            }
        }
    }
}

package entity;

import javax.swing.table.DefaultTableModel;

public class LocalTableModel extends DefaultTableModel {
    /**
     *
     */
    private static final long serialVersionUID = 2016990105575274231L;
    Class<?>[] types = new Class[]{java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class};
    boolean[] canEdit = new boolean[]{false, false, false, false};

    public LocalTableModel() {
        super(new Object[][]{}, new String[]{"编号", "姓名", "性别", "专业"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }
}
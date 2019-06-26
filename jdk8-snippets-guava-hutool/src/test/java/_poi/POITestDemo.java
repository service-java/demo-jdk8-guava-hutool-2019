package _poi;

import cn.hutool.core.lang.Console;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Test;

import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.Date;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-02
 * Time: 16:01
 */
public class POITestDemo {


    @Test
    public void createXls() throws IOException {
        // 1.获取桌面路径
        FileSystemView fsv = FileSystemView.getFileSystemView();
        String desktop = fsv.getHomeDirectory().getPath();
        String filePath = desktop + "/template.xls";

        // 2.创建workbook
        File file = new File(filePath);
        OutputStream outputStream = new FileOutputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Sheet1");
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("订单号");
        row.createCell(2).setCellValue("下单时间");
        row.createCell(3).setCellValue("个数");
        row.createCell(4).setCellValue("单价");
        row.createCell(5).setCellValue("订单金额");
        // 设置行的高度
        row.setHeightInPoints(30);

        // 3. 填充数据
        HSSFRow row1 = sheet.createRow(1);
        // 序号
        row1.createCell(0).setCellValue("1");
        row1.createCell(1).setCellValue("NO00001");

        // 日期格式化
        HSSFCellStyle cellStyle2 = workbook.createCellStyle();
        HSSFCreationHelper creationHelper = workbook.getCreationHelper();
        cellStyle2.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
        // 设置列的宽度
        sheet.setColumnWidth(2, 20 * 256);

        HSSFCell cell2 = row1.createCell(2);
        cell2.setCellStyle(cellStyle2);
        cell2.setCellValue(new Date());

        row1.createCell(3).setCellValue(2);

        // 保留两位小数
        HSSFCellStyle cellStyle3 = workbook.createCellStyle();
        cellStyle3.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
        HSSFCell cell4 = row1.createCell(4);
        cell4.setCellStyle(cellStyle3);
        cell4.setCellValue(29.5);

        // 货币格式化
        HSSFCellStyle cellStyle4 = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setFontName("华文行楷");
        font.setFontHeightInPoints((short) 15);
        font.setColor(HSSFColor.RED.index);
        cellStyle4.setFont(font);

        HSSFCell cell5 = row1.createCell(5);
        // 设置计算公式
        cell5.setCellFormula("D2*E2");


        // 获取计算公式的值
        HSSFFormulaEvaluator e = new HSSFFormulaEvaluator(workbook);
        cell5 = e.evaluateInCell(cell5);
        System.out.println(cell5.getNumericCellValue());

        // 设置当前sheet
        workbook.setActiveSheet(0);

        // 4. 输出excel
        workbook.write(outputStream);
        outputStream.close();
    }


    @Test
    public void readXls() throws IOException {
        // 1. 读取路径
        FileSystemView fsv = FileSystemView.getFileSystemView();
        String desktop = fsv.getHomeDirectory().getPath();
        // eg. C:\Users\luo0412\Desktop + xxx
        String filePath = desktop + "/template.xls";

        // 2. 文件流workbook
        FileInputStream fileInputStream = new FileInputStream(filePath);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        POIFSFileSystem fileSystem = new POIFSFileSystem(bufferedInputStream);
        HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        // 3. 读数据
        int lastRowIndex = sheet.getLastRowNum();
        Console.log("共{}行\n", lastRowIndex + 1);
        for (int i = 0; i <= lastRowIndex; i++) {
            HSSFRow row = sheet.getRow(i);
            if (row == null) {
                break;
            }

            short lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                HSSFCell cell = row.getCell(j);
                int cellType = cell.getCellType();

                // 类型判断
                if (HSSFCell.CELL_TYPE_NUMERIC == cellType) {
                    System.out.println(cell.getNumericCellValue());
                } else {
                    System.out.println(cell.getStringCellValue());
                }
            }
        }

        // 4. 关闭流
        bufferedInputStream.close();
    }


}

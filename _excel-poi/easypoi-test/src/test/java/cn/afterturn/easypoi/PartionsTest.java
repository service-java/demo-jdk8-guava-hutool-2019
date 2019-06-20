package cn.afterturn.easypoi;

import cn.afterturn.easypoi.csv.read.CsvDataRead;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.util.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author by jueyue on 18-9-30.
 */
public class PartionsTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CsvDataRead.class);

    public static void main(String[] args) {
        try {
            ExcelImportUtil.importExcelBySax(
                    new FileInputStream(new File("C:\\Users\\jueyue\\Desktop\\导入活动用户模板 (18).xlsx")),
                    CmsActivityUserTO.class, new ImportParams(),
                    (user) -> {
                        LOGGER.info(JSON.toJson(user));
                    });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

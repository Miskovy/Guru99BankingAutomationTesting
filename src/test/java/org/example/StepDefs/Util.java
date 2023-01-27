package org.example.StepDefs;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Util {

    public static final int WAIT_TIME = 30; // Delay time to wait the website
    // launch completely
    public static final String BASE_URL = "http://www.demo.guru99.com/";

    // Valid account for login
    public static final String USER_NAME = "mngr472694";
    public static final String PASSWD = "tAhyvEp";

    public static final String VALID = "valid";
    public static final String INVALID = "invalid";

    // Expected output
    public static final String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
    public static final String EXPECT_ERROR = "User or Password is not valid";


    // You can change the information of your data file here
    public static final String FILE_PATH = "testData.xls"; // File Path
    public static final String SHEET_NAME = "Data"; // Sheet name
    public static final String TABLE_NAME = "testData"; // Name of data table
    public String[][] testData() throws IOException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet1 = wb.getSheet("Data");

        String[][] data = new String[4][2];

        // 1st row
        data[0][0] = sheet1.getRow(1).getCell(1).getStringCellValue();
        data[0][1] = sheet1.getRow(1).getCell(2).getStringCellValue();
        //2nd row
        data[1][0] = sheet1.getRow(2).getCell(1).getStringCellValue();
        data[1][1] = sheet1.getRow(2).getCell(2).getStringCellValue();
        //3rd row
        data[2][0] = sheet1.getRow(3).getCell(1).getStringCellValue();
        data[2][1] = sheet1.getRow(3).getCell(2).getStringCellValue();
        //4th row
        data[3][0] = sheet1.getRow(4).getCell(1).getStringCellValue();
        data[3][1] = sheet1.getRow(4).getCell(2).getStringCellValue();
        return data;
    }


}






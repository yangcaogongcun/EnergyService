package com.stand.spring.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 此类暂时没有用到，后期如果客户有需求可以照2003的进行修改
 * @author yangjian
 * 上午11:16:18
 */
@Component("poiWriteExcel2007")
public class PoiWriteExcel2007 {

	public void writeToModuleExcel2007(String modulefilepath, String savefilepath, JSONArray jsonArray, String header) {

		String filename = modulefilepath;

		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook(new FileInputStream(filename));
			XSSFCellStyle style = workbook.createCellStyle();
			style.setVerticalAlignment(CellStyle.VERTICAL_CENTER); // 创建一个居中格式
			style.setAlignment(CellStyle.ALIGN_CENTER);
			// 设置单元格边框
			style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			style.setBorderRight(HSSFCellStyle.BORDER_THIN);
			style.setBorderTop(HSSFCellStyle.BORDER_THIN);
			// 按名引用excel工作表
			// HSSFSheet sheet = workbook.getSheet("JSP");
			// 也可以用以下方式来获取excel的工作表，采用工作表的索引值
			XSSFSheet sheet = workbook.getSheetAt(0);
			XSSFRow row;
			XSSFCell cell;
			row = sheet.getRow(1);
			int length = jsonArray.size();
			String flag = "";
			int j = 2;
			int count = 0;
			int num = row.getPhysicalNumberOfCells();
			System.out.println(num);
			for (int i = 0; i < length; i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				if (i == 0) {
					row = sheet.getRow(0);
					cell = row.getCell(0);
					cell.setCellValue(header);
					row = sheet.createRow(j);
					cell = row.createCell((short) 0);
					cell.setCellValue(j - 1);
					cell.setCellStyle(style);
					cell = row.createCell((short) 1);
					cell.setCellValue(jsonObject.getString("Circuitname"));
					flag = cell.getStringCellValue();
					cell.setCellStyle(style);
					cell = row.createCell((short) 2);
					cell.setCellValue(Double.parseDouble(jsonObject.getString("Value")));
					cell.setCellStyle(style);
				} else if (flag.equals(jsonArray.getJSONObject(i).getString("Circuitname"))) {
					cell = row.createCell((short) 3 + count);
					count++;
					cell.setCellValue(Double.parseDouble(jsonObject.getString("Value")));
					cell.setCellStyle(style);
				} else if (!flag.equals(jsonArray.getJSONObject(i).getString("Circuitname"))) {
					count = 0;

					for (int k = 0; k < num - 1; k++) {
						row = sheet.getRow(j);
						if (row.getCell(k) == null) {
							row.createCell(k).setCellStyle(style);
						}
						row.getCell(k).setCellStyle(style);
					}
					row.createCell(num - 1).setCellStyle(style);
					row = sheet.createRow(++j);
					cell = row.createCell((short) 0);
					cell.setCellValue(j - 1);
					cell = row.createCell((short) 1);
					cell.setCellValue(jsonObject.getString("Circuitname"));
					flag = cell.getStringCellValue();
					cell = row.createCell((short) 2);
					cell.setCellValue(Double.parseDouble(jsonObject.getString("Value")));
				}
			}
			for (int k = 0; k < num - 1; k++) {
				row = sheet.getRow(j);
				if (row.getCell(k) == null) {
					row.createCell(k).setCellStyle(style);
				}
				row.getCell(k).setCellStyle(style);
			}
			row.createCell(num - 1).setCellStyle(style);
			// 新建一输出流
			FileOutputStream fout = new FileOutputStream(
					savefilepath + Calendar.getInstance().getTimeInMillis() + ".xlsx"); // PS：filename
			// 是你另存为的路径，不处理直接写入模版文件
			// 存盘
			workbook.write(fout);
			fout.flush();
			// 结束关闭
			fout.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

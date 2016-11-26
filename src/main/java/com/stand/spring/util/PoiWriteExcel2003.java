package com.stand.spring.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * excel2003 实现
 * @author yangjian
 * 上午11:15:45
 */
@Component("poiWriteExcel2003")
public class PoiWriteExcel2003 {

	// @Autowired
	// private BuildBaseInfoMapper buildBaseInfoMapper;
	// private ApplicationContext applicationContext;
	// {
	// applicationContext = new
	// ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
	// buildBaseInfoMapper =
	// applicationContext.getBean(BuildBaseInfoMapper.class);
	// }
	//
	// public void writeExcel(String sheetname) {
	//
	// List<BuildBaseInfo> list = buildBaseInfoMapper.selectBuild_Name_Id();
	// Class clazz = buildBaseInfoMapper.getClass();
	// SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
	//
	// // 第一步，创建一个webbook，对应一个Excel文件
	// HSSFWorkbook wb = new HSSFWorkbook();
	// HSSFFont font = wb.createFont();
	// font.setFontName("黑体");
	// font.setFontHeightInPoints((short) 16);
	// // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
	// HSSFSheet sheet = wb.createSheet(sheetname);
	// sheet.setColumnWidth(0, 28 * 256);
	// sheet.setColumnWidth(1, 25 * 256);
	// System.out.println(sheet.getColumnWidthInPixels(0));
	//
	// // 第三步，创建单元格，并设置值表头 设置表头居中
	//
	// HSSFCellStyle style = wb.createCellStyle();
	// style.setVerticalAlignment(CellStyle.VERTICAL_CENTER); // 创建一个居中格式
	// style.setAlignment(CellStyle.ALIGN_CENTER);
	// // 设置单元格边框
	// style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
	// style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
	// style.setBorderRight(HSSFCellStyle.BORDER_THIN);
	// style.setBorderTop(HSSFCellStyle.BORDER_THIN);
	//
	// // 第四步，合并单元格
	// CellRangeAddress cellRangeAddress = new CellRangeAddress(0, 1, 0, 1);
	// sheet.addMergedRegion(cellRangeAddress);
	//
	// // 第四步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制int
	// HSSFRow row = sheet.createRow((int) 0);
	// HSSFCell cell = row.createCell((int) 0);
	// cell.setCellValue("建筑物基本信息");
	// cell.setCellStyle(style);
	// cell = row.createCell((int) 1);
	// cell.setCellValue("");
	// cell.setCellStyle(style);
	// row = sheet.createRow((int) 1);
	// cell = row.createCell((int) 0);
	// cell.setCellValue("");
	// cell.setCellStyle(style);
	// cell = row.createCell((int) 1);
	// cell.setCellValue("");
	// cell.setCellStyle(style);
	//
	// row = sheet.createRow((int) 2);
	// cell = row.createCell((int) 0);
	// cell.setCellValue("建筑物名称");
	// cell.setCellStyle(style);
	//
	// cell = row.createCell((int) 1);
	// cell.setCellValue("建筑物ID");
	// cell.setCellStyle(style);
	//
	// // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
	// int i = 3;
	// for (BuildBaseInfo buildBaseInfo : list) {
	// row = sheet.createRow((int) i++);
	// // 第四步，创建单元格，并设置值
	// cell = row.createCell((int) 0);
	// cell.setCellValue(buildBaseInfo.getfBuildname());
	// cell.setCellStyle(style);
	// cell = row.createCell((int) 1);
	// cell.setCellValue(buildBaseInfo.getfBuildid());
	// cell.setCellStyle(style);
	//
	// }
	// // 第六步，将文件存到指定位置
	// try {
	// OutputStream fout = new FileOutputStream("E:/build.xls");
	// wb.write(fout);
	// fout.close();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	/**
	 * 导出内容至office2003的excel中
	 * @param exportType
	 * @param jsonArray
	 * @param header
	 * @param out
	 */
	public void writeToModuleExcel2003(String exportType, JSONArray jsonArray, String header, OutputStream out) {

		String filename = "";
		try {
			filename = Thread.currentThread().getContextClassLoader().getResource("").toURI().getPath() + "\\"
					+ exportType + ".xls";

		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		HSSFWorkbook workbook;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(filename));
			HSSFCellStyle style = workbook.createCellStyle();
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
			HSSFSheet sheet = workbook.getSheetAt(0);
			HSSFRow row, row1;
			HSSFCell cell, cell1;
			row = sheet.getRow(1);
			int length = jsonArray.size();
			String flag = "";
			int j = 3;
			int num = row.getPhysicalNumberOfCells();
			double sum = 0;
			// 添加Date
			row = sheet.getRow(1);
			row1 = sheet.getRow(2);
			cell = row.createCell(num - 1);
			cell.setCellValue(header);
			int i;
			Map<String , Integer> map= new HashMap<>();
			for( i=2;i<num-1;i++){
				cell1=row1.getCell(i);
				map.put(cell1.toString(), i);
				System.out.println(cell1.toString());
				
			}
			int value=0;
			for (i = 0; i < length; i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				String point = jsonObject.getString("Date");
				// day
				if (point.length() == 13) {
					point = point.substring(11, 13);
				} else if (point.length() == 10) {
					// month
					point = point.substring(8, 10);
				} else if (point.length() == 7) {
					// year
					point = point.substring(5, 7);
				}
				if (i == 0) {
					//第一次的时候创建第一行
					flag = jsonObject.getString("Name");
					
					row=sheet.createRow(j);
					
					for(int ii=0;ii<num;ii++){
						cell=row.createCell(ii);
						cell.setCellValue("");
						cell.setCellStyle(style);
					}
					cell=row.getCell(0);
					cell.setCellValue(j-2);
					
					cell=row.getCell(1);
					cell.setCellValue(flag);
				}
				
				if(flag.equals(jsonObject.getString("Name"))){
					//获取当前日期所在的列值
					value=map.get(point);
					//插入值
					cell=row.getCell(value);
					cell.setCellValue(jsonObject.getString("Value"));

					sum+=Double.parseDouble(jsonObject.getString("Value"));
					
				}else{
					//当换行时重新创建，并初始化sum为0，j自加
					cell=row.getCell(num-1);
					cell.setCellValue(sum);
					
					sum=0;
					j++;
					
					//给flag标记重新赋值循环上述方法
					flag = jsonObject.getString("Name");
					row=sheet.createRow(j);
					for(int ii=0;ii<num;ii++){
						cell=row.createCell(ii);
						cell.setCellValue("");
						cell.setCellStyle(style);
					}
					cell=row.getCell(0);
					cell.setCellValue(j-2);

					cell=row.getCell(1);
					cell.setCellValue(flag);

					value=map.get(point);
					cell=row.getCell(value);
					
					cell.setCellValue(jsonObject.getString("Value"));

					sum+=Double.parseDouble(jsonObject.getString("Value"));
					
				}
				
				//最后将和填入最后一个cell中
				cell=row.getCell(num-1);
				cell.setCellValue(sum);
			}
			// 新建一输出流
			// 是你另存为的路径，不处理直接写入模版文件
			// 存盘
			workbook.write(out);
			out.flush();
			// 结束关闭

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

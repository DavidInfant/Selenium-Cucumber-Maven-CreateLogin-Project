package org.bas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static WebDriver foxDriver;
	public static void launchFireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		foxDriver = new FirefoxDriver();
	}
	public static WebDriver bingDriver;
	public static void launchBingBrowser() {
		WebDriverManager.edgedriver().setup();
		bingDriver = new EdgeDriver();
	}
	public static void windowMaximizer() {
		driver.manage().window().maximize();
	}
	public static void geckoWindowMaximizer() {
		foxDriver.manage().window().maximize();
	}
	public static void bingWindowMaximizer() {
		bingDriver.manage().window().maximize();
	}
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	public static void launchFireFoxUrl(String Url) {
		foxDriver.get(Url);
	}
	public static void launchBingUrl(String Url) {
		bingDriver.get(Url);
	}
	public static String pageTitle(){
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public static String pageBingTitle(){
		String title = bingDriver.getTitle();
		System.out.println(title);
		return title;
	}
	public static String pageUrl(){
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	public static String pageBingUrl(){
		String url = bingDriver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	public static void passText(String txt, WebElement ele){
		ele.sendKeys(txt);
	}
	public static void closeEntireBrowser(){
		driver.quit();
	}
	public static void closeEntireBingBrowser(){
		bingDriver.quit();
	}
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	public static void screenshot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+imgname.png");
		FileUtils.copyFile(image, f);
	}
	public static Actions a;
	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}
	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
	public static JavascriptExecutor js;
	public static void scrollThePage(WebElement targetWebElement) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", targetWebElement);
	}
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet("sheetName");
		Row r = mySheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		String value = " ";
		if (cellType == 1) {
			String value2 = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String value1 = s.format(dd);
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueOf = String.valueOf(l);
		}
	}
	public static void createNewExcelFile(int rowNum1, int cellNum1, String writeData) throws IOException {
		File f = new File("C:\\Users\\Home\\eclipse-workspace\\MavenProject\\Excel\\book4.xlsx");
		Workbook w = new XSSFWorkbook();	
		Sheet newSheet = w.createSheet("Sheet1");
		Row newRow = newSheet.createRow(rowNum1);
		Cell newCell = newRow.createCell(cellNum1);
		newCell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}
	public static void createCell(int getRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\Home\\eclipse-workspace\\MavenProject\\Excel\\book4.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("sheet1");
		Row r = s.getRow(getRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\Home\\eclipse-workspace\\MavenProject\\Excel\\book4.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void updateDateToParticularCell(int getTheRow, int getTheCell, String existingData, String writeNewData) throws IOException {
		File f = new File("Excel file location.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheetname");
		Row row = sheet.getRow(getTheRow);
		Cell cell = row.getCell(getTheCell);
		String str = cell.getStringCellValue();
		if (str.equals(existingData)) {
			cell.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
}
}
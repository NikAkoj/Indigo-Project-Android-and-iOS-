package Resource.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendreport {

	    static ExtentReports extent;

		public static ExtentReports extentReportGenerator()
		
		{

		String path = System.getProperty("user.dir")+"//reports//index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setTheme(Theme.DARK);

		reporter.config().setReportName("Indigo Test-case results");
		
		reporter.config().setDocumentTitle("Indigo Automation Test Report");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Project name", "Indigo Mobile Application");

		extent.setSystemInfo("Environment", "SIT");

		extent.setSystemInfo("Executed by", "Nayan Akojwar");

		return extent;
		
}
		
}

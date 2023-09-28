package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import constants.ConstantGlobal;

public class ExtentReportManager {

    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter(ConstantGlobal.EXTENT_REPORT_PATH);
        reporter.config().setReportName("Extent Report | Cao Nhu Thuan");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Framework Name", "Automation Testing | Cao Nhu Thuan");
        extentReports.setSystemInfo("Author", ConstantGlobal.AUTHOR);
        return extentReports;
    }

}

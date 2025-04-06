package ex_19_OOPs_inheritance.single_inheritance;

public class Testcase2 extends CommanToAll{
    void runningTC2() {
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
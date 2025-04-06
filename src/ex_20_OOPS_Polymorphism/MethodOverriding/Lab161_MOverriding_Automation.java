package ex_20_OOPS_Polymorphism.MethodOverriding;

public class Lab161_MOverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();
    }
}
class CommonToAll{

    void openBrowser(){
        System.out.println("Open the IE Browser!");
    }

}

class ChromeTC extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Chrome will open now!");
    }

    int openBrowser(int a){
        return 10;
    }

}

class Firefox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}

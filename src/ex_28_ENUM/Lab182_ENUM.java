package ex_28_ENUM;

public class Lab182_ENUM {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println(" -- ");
        System.out.println(colors.RED.getHexCode());
        System.out.println(colors.GREEN.getHexCode());

        System.out.println(" -- ");
        System.out.println(APIurls.google.getUrl());
        System.out.println(APIurls.vwo.getUrl());
        System.out.println(APIurls.katalon.getUrl()); }
}




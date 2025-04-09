package ex_28_ENUM;

public enum APIurls {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIurls(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}

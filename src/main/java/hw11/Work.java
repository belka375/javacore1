package hw11;

public class Work {
    public static void main(String[] args) {
        WebBrowsers browser1 = WebBrowsers.CHROME;
        WebBrowsers browser2 = WebBrowsers.FIREFOX;
        WebBrowsers browser3 = WebBrowsers.IE;
        WebBrowsers browser4 = WebBrowsers.SAFARI;
        printWebBrowsers(WebBrowsers.SAFARI);

        WebBrowsers[] webArray = new WebBrowsers[]{WebBrowsers.CHROME, WebBrowsers.FIREFOX, WebBrowsers.IE, WebBrowsers.SAFARI};

        printWebBrowsers(webArray[2]);
        printWebBrowser(webArray);
    }

    private static void printWebBrowsers(WebBrowsers[] webArray) {
        System.out.println(webArray);
    }

    private static void printWebBrowsers(WebBrowsers s) {
        System.out.println(s);
    }
    public static void printWebBrowser(WebBrowsers[] wb){
        for (WebBrowsers web:wb) {
            System.out.println(web);
        }
    }
}

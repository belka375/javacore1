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

        Systema pc1 = Systema.MAC;
        Systema pc2 = Systema.Windows;
        Systema pc3 = Systema.Linux;

        Systema[] sysArray = new Systema[]{Systema.MAC, Systema.Windows, Systema.Linux};
//        printSystema(sysArray[2]);
//        printSystema(sysArray);
    }

    private static void printWebBrowsers(WebBrowsers[] webArray) {
        System.out.println(webArray);
    }

    private static void printWebBrowsers(WebBrowsers s) {
        System.out.println(s);
    }

    public static void printWebBrowser(WebBrowsers[] wb) {
        for (WebBrowsers web : wb) {
            System.out.println(web);
        }
    }
//    private static void printSystema(Systema[] sysArray) {
//        System.out.println(sysArray);
//    }
//
//    private static void printSystema(Systema lin) {
//        System.out.println(lin);
//    }
//    public static void printSystema(Systema win){
//        for (Systema w:win) {
//            System.out.println(w);
//}
}

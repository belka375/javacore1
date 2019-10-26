package helpers;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class GetStringFromClipboard {

    public static String copyString() throws Exception {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result = (String) clipboard.getData(DataFlavor.stringFlavor);
        return result;
    }

}

//public class GetStringFromClipboard {
//
//    public static String copyString() throws Exception {
//
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Clipboard clipboard = toolkit.getSystemClipboard();
//        String result = (String) clipboard.getData(DataFlavor.stringFlavor);
//        return result;


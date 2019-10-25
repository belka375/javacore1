package shw10.helpers;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class GetStringFromClipboard {

    public static String ololo() throws Exception {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result = (String) clipboard.getData(DataFlavor.stringFlavor);
        //System.out.println("String from Clipboard:" + result);
        return result;
    }

}

/*public static String readClipboard(String text) throws IOException, UnsupportedFlavorException {
        return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        }
    }*/



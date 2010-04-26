package graphics;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;

public class ImageFilter extends FileFilter {

    /**Accept ONLY jpg, png and gif (
    the supported formats for saving the canvas)**/
    public boolean accept(File f) {
		String extension = getExtension(f);
        if (extension != null) {
            if (extension.equals("gif") ||
                extension.equals("jpeg") ||
                extension.equals("jpg") ||
                extension.equals("png")) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }
    @Override
    public String getDescription() {
        return "png, jpg or gif only";
    }

    /** Retrieves the extensions of a give file. **/
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');
        if(i==-1) return null;  //no extension

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
}

package org.cwsya.tlbook.util;

import org.springframework.stereotype.Component;

/**
 * @author cws
 */
@Component
public class FileUtil {
    public String getFileExtension(String fileName){
        String[] strArray = fileName.split("\\.");
        int suffixIndex = strArray.length -1;
        return strArray[suffixIndex];
    }
}

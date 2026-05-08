package org.example;

import java.io.File;

public class FileSorter {
    public String getExtension(File file) {
        String name = file.getName();
        int idx = name.lastIndexOf('.');
        if (idx > 0 && idx < name.length() - 1) {
            return name.substring(idx + 1).toUpperCase();
        }
        return "ФАЙЛЫ";
    }
}
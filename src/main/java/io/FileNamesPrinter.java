package io;

import java.io.File;

public class FileNamesPrinter {

    private static void printFileNames(File path, int current, int level, String base) {
        if (current > level) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(base).append("+--");
        sb.append(path.getName());
        if (path.isDirectory()) {
            sb.append(File.separator);
        }
        sb.append("\t");
        if (!path.isDirectory()) {
            sb.append(path.length());
        }
        System.out.println(sb.substring(3));
        if (path.canRead()) {
            File[] files = path.listFiles();
            if (files != null) {
                for (File file : files) {
                    printFileNames(file, current + 1, level, base + "|  ");
                }
            }
        }
    }

    private static void printFileNames(File path, int current, int level) {
        printFileNames(path, current, level, "");
    }

    public static void printFileNames(File path, int level) {
        printFileNames(path, 0, level);
    }

    public static void printFileNames(int level) {
        printFileNames(new File("."), level);
    }

    public static void printFileNames(File path) {
        printFileNames(path, Integer.MAX_VALUE);
    }

    public static void printFileNames() {
        printFileNames(Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        printFileNames();
    }

}

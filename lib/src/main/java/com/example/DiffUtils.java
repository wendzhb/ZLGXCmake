package com.example;

/**
 * Created by zhb on 2017/8/25.
 */

public class DiffUtils {
    static {
        System.load("F:/ZHB_VS/BSDiff/x64/Debug/BSDiff.dll");
    }
    public static native void diff(String oldApkPath,String newApkPath,String patchPath);
}

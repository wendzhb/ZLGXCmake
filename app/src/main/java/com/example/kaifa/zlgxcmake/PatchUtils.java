package com.example.kaifa.zlgxcmake;

/**
 * Created by zhb on 2017/8/23.
 */

public class PatchUtils {

    /**
     *
     * @param oldAPKPath    原来的apk  1.0
     * @param newAPKPath    合并后的新的apk路径 需要生成的2.0
     * @param patchPath     差分包路径，从服务器上下载下来的
     */
    public static native void combine(String oldAPKPath, String newAPKPath, String patchPath);
}

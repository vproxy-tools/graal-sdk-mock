package org.graalvm.nativeimage;

public final class ImageInfo {
    private ImageInfo() {
    }

    public static boolean inImageCode() {
        return false;
    }

    public static boolean inImageRuntimeCode() {
        return false;
    }

    public static boolean inImageBuildtimeCode() {
        return false;
    }

    public static boolean isExecutable() {
        return false;
    }

    public static boolean isSharedLibrary() {
        return false;
    }
}

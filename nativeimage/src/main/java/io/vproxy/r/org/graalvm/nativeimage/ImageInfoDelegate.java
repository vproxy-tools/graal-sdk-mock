package io.vproxy.r.org.graalvm.nativeimage;

import org.graalvm.nativeimage.ImageInfo;

public class ImageInfoDelegate {
    private ImageInfoDelegate() {
    }

    public static boolean inImageCode() {
        return ImageInfo.inImageCode();
    }

    public static boolean inImageRuntimeCode() {
        return ImageInfo.inImageRuntimeCode();
    }

    public static boolean inImageBuildtimeCode() {
        return ImageInfo.inImageBuildtimeCode();
    }

    public static boolean isExecutable() {
        return ImageInfo.isExecutable();
    }

    public static boolean isSharedLibrary() {
        return ImageInfo.isSharedLibrary();
    }
}

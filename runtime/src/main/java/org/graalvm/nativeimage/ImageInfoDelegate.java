package org.graalvm.nativeimage;

public class ImageInfoDelegate {
    private ImageInfoDelegate() {
    }

    private static final boolean inImageCode;
    private static final boolean inImageRuntimeCode;
    private static final boolean inImageBuildtimeCode;
    private static final boolean isExecutable;
    private static final boolean isSharedLibrary;

    static {
        boolean _inImageCode;
        boolean _inImageRuntimeCode;
        boolean _inImageBuildtimeCode;
        boolean _isExecutable;
        boolean _isSharedLibrary;
        try {
            var ImageInfo = Class.forName("org.graalvm.nativeimage.ImageInfo");
            _inImageCode = (boolean) ImageInfo.getMethod("inImageCode").invoke(null);
            _inImageRuntimeCode = (boolean) ImageInfo.getMethod("inImageRuntimeCode").invoke(null);
            _inImageBuildtimeCode = (boolean) ImageInfo.getMethod("inImageBuildtimeCode").invoke(null);
            _isExecutable = (boolean) ImageInfo.getMethod("isExecutable").invoke(null);
            _isSharedLibrary = (boolean) ImageInfo.getMethod("isSharedLibrary").invoke(null);
        } catch (Throwable t) {
            _inImageCode = false;
            _inImageRuntimeCode = false;
            _inImageBuildtimeCode = false;
            _isExecutable = false;
            _isSharedLibrary = false;
        }
        inImageCode = _inImageCode;
        inImageRuntimeCode = _inImageRuntimeCode;
        inImageBuildtimeCode = _inImageBuildtimeCode;
        isExecutable = _isExecutable;
        isSharedLibrary = _isSharedLibrary;
    }

    public static boolean inImageCode() {
        return inImageCode;
    }

    public static boolean inImageRuntimeCode() {
        return inImageRuntimeCode;
    }

    public static boolean inImageBuildtimeCode() {
        return inImageBuildtimeCode;
    }

    public static boolean isExecutable() {
        return isExecutable;
    }

    public static boolean isSharedLibrary() {
        return isSharedLibrary;
    }
}

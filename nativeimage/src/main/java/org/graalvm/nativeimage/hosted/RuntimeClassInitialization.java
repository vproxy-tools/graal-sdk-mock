package org.graalvm.nativeimage.hosted;

public final class RuntimeClassInitialization {
    public static void initializeAtBuildTime(Class<?>... classes) {
        throw new UnsupportedOperationException();
    }

    private RuntimeClassInitialization() {
    }
}

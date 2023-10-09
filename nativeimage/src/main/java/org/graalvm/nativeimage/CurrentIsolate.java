package org.graalvm.nativeimage;

public final class CurrentIsolate {
    public static IsolateThread getCurrentThread() {
        throw new UnsupportedOperationException();
    }

    private CurrentIsolate() {
    }
}

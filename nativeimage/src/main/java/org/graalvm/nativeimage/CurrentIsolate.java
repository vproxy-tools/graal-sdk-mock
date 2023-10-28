package org.graalvm.nativeimage;

public final class CurrentIsolate {
    public static IsolateThread getCurrentThread() {
        throw new UnsupportedOperationException();
    }

    public static Isolate getIsolate() {
        throw new UnsupportedOperationException();
    }

    private CurrentIsolate() {
    }
}

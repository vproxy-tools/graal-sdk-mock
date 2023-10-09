package org.graalvm.nativeimage.hosted;

public interface Feature {
    default void duringSetup(DuringSetupAccess access) {
    }

    interface DuringSetupAccess {
    }
}

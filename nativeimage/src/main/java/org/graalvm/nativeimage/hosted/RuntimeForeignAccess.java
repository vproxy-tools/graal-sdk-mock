package org.graalvm.nativeimage.hosted;

public final class RuntimeForeignAccess {
    /**
     * @param desc    {@link java.lang.foreign.FunctionDescriptor}
     * @param options {@link java.lang.foreign.Linker.Option}
     */
    public static void registerForDowncall(Object desc, Object... options) {
        throw new UnsupportedOperationException();
    }

    private RuntimeForeignAccess() {
    }
}

package org.graalvm.nativeimage.hosted;

import java.lang.invoke.MethodHandle;

public final class RuntimeForeignAccess {
    /**
     * @param desc    {@link java.lang.foreign.FunctionDescriptor}
     * @param options {@link java.lang.foreign.Linker.Option}
     */
    public static void registerForDowncall(Object desc, Object... options) {
        throw new UnsupportedOperationException();
    }

    /**
     * @param desc    {@link java.lang.foreign.FunctionDescriptor}
     * @param options {@link java.lang.foreign.Linker.Option}
     */
    public static void registerForUpcall(Object desc, Object... options) {
        throw new UnsupportedOperationException();
    }

    /**
     * @param target  {@link MethodHandle}
     * @param desc    {@link java.lang.foreign.FunctionDescriptor}
     * @param options {@link java.lang.foreign.Linker.Option}
     */
    public static void registerForDirectUpcall(MethodHandle target, Object desc, Object... options) {
        throw new UnsupportedOperationException();
    }

    private RuntimeForeignAccess() {
    }
}

package org.graalvm.nativeimage.c.function;

public final class CEntryPointLiteral<T extends CFunctionPointer> {
    private CEntryPointLiteral() {
    }

    public static <T extends CFunctionPointer> CEntryPointLiteral<T> create(Class<?> definingClass, String methodName, Class<?>... parameterTypes) {
        throw new UnsupportedOperationException();
    }

    public T getFunctionPointer() {
        throw new UnsupportedOperationException();
    }
}

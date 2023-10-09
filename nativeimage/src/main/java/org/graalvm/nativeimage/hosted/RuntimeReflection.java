package org.graalvm.nativeimage.hosted;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;

public final class RuntimeReflection {
    public static void registerAllConstructors(Class<?> declaringClass) {
        throw new UnsupportedOperationException();
    }

    public static void registerAllDeclaredConstructors(Class<?> declaringClass) {
        throw new UnsupportedOperationException();
    }

    public static void registerAllFields(Class<?> declaringClass) {
        throw new UnsupportedOperationException();
    }

    public static void registerAllDeclaredFields(Class<?> declaringClass) {
        throw new UnsupportedOperationException();
    }

    public static void registerAllMethods(Class<?> declaringClass) {
        throw new UnsupportedOperationException();
    }

    public static void registerAllDeclaredMethods(Class<?> declaringClass) {
        throw new UnsupportedOperationException();
    }

    public static void register(Class<?>... classes) {
        throw new UnsupportedOperationException();
    }

    public static void register(Executable... methods) {
        throw new UnsupportedOperationException();
    }

    public static void register(Field... fields) {
        throw new UnsupportedOperationException();
    }

    private RuntimeReflection() {
    }
}

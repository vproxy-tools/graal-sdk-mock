# graal-sdk-mock

This project can be considered as a subproject of
[Panama Native Interface](https://github.com/vproxy-tools/panama-native-interface),
but can be used independently as well.

## How to Use

For compiling:

```groovy
compileOnly 'io.vproxy:graal-sdk-mock-nativeimage:+'
```

and in your `module-info.java`

```java
requires org.graalvm.nativeimage;
```

For running:

```groovy
runtimeOnly 'io.vproxy:graal-sdk-mock-runtime:+'
```

You must not use `ImageInfo`, use `ImageInfoDelegate` instead.

## Why Mock?

### 1. Smaller

Only provides necessary types and members for `Panama Native Interface`.

### 2. Non-NativeImage Friendly

It's quite common to use the same codebase for JVM and Graal native-image,
so it's very likely that you will need to check whether the program is running in JVM or native-image.

Graal SDK provides `ImageInfo` for you to check.

However the `ImageInfo` class is placed inside module `org.graalvm.nativeimage`,
and some types in the module MUST NOT be included when building a native image.

So it would be impossible to build a native-image using a shadow (fat) jar.

With the help of `graal-sdk-mock-runtime`, you are able to run shadow (fat) jar in JVM,
and build the native-image with exactly the same shadow (fat) jar.

package com.mashibing.designpattern.asm;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import jdk.internal.org.objectweb.asm.ClassWriter;

public class ClassWriterTest {

  public static void main(String[] args) throws Exception {
    ClassWriter cw = new ClassWriter(0);
    cw.visit(V1_8, ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE,
        "pkg/Comparable", null, "java/lang/Object",
        null);
    cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "LESS", "I",
        null, new Integer(-1)).visitEnd();
    cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "EQUAL", "I",
        null, new Integer(0)).visitEnd();
    cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "GREATER", "I",
        null, new Integer(1)).visitEnd();
    cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT, "compareTo",
        "(Ljava/lang/Object;)I", null, null).visitEnd();
    cw.visitEnd();
    byte[] b = cw.toByteArray();
    Path path = Paths
        .get("com/mashibing/asm");
    Path path1 = Paths
        .get("com/mashibing/asm/Comparable.class");
    Files.createDirectories(path);
    Files.write(path1,b);
  }

}

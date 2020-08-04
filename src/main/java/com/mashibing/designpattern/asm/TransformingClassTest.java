package com.mashibing.designpattern.asm;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.MethodVisitor;

public class TransformingClassTest {

  public static void main(String[] args) throws Exception {
    InputStream stream = TransformingClassTest.class.getClassLoader()
        .getResourceAsStream("com/mashibing/designpattern/asm/Tank.class");
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    int i=0;
    while((i=stream.read())!=-1) bos.write(i);

    byte[] b1 = bos.toByteArray();

    ClassWriter cw = new ClassWriter(0);

    ClassVisitor classVisitor = new ClassVisitor(ASM4, cw) {

      @Override
      public MethodVisitor visitMethod(int i, String s, String s1, String s2, String[] strings) {
        MethodVisitor methodVisitor = cw.visitMethod(i, s, s1, s2, strings);
        return new MethodVisitor(ASM4,methodVisitor) {

          @Override
          public void visitCode() {
            visitMethodInsn(INVOKESTATIC, "com/mashibing/designpattern/asm/TimeProxy","before", "()V", false);
            super.visitCode();
          }
        };
      }
    };
    ClassReader cr = new ClassReader(b1);
    cr.accept(classVisitor, 0);
    byte[] b2 = cw.toByteArray(); // b2 represents the same class as b1

    Path path = Paths
        .get("com/mashibing/asm");
    Path path1 = Paths
        .get("com/mashibing/asm/Tank.class");
    Files.createDirectories(path);
    Files.write(path1,b2);

    //MyClassLoader myClassLoader = new MyClassLoader();
  }

}

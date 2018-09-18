package com.shzhangji.npe;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.util.StringUtils;

public class CheckerExample {

  @Nullable
  private Object returnNullable() {
    return null;
  }

  public void testReturnNullable() {
    Object obj = returnNullable();
    System.out.println(obj.toString());
  }

  private Object returnNonNull() {
    return null;
  }

  private void argumentNonNull(Object arg) {
    System.out.println(arg.toString());
  }

  public void testArgumentNonNull() {
    argumentNonNull(null);
  }

  public void testSpring() {
    StringUtils.capitalize(null);

    String filename = StringUtils.getFilename("/path/to/file");
    System.out.println(filename.length());
  }

}

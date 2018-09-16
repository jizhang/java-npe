package com.shzhangji.npe;

import org.eclipse.jdt.annotation.Nullable;

public class AnnotationExample {

  public void test() {
    Object obj = getObject();
    System.out.println(obj.toString());
  }

  @Nullable
  private Object getObject() {
    return null;
  }

}

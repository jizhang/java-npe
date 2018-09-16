package com.shzhangji.npe;

import org.checkerframework.checker.nullness.qual.Nullable;

public class CheckerExample {

  public void test() {
    Object obj = getObject();
    System.out.println(obj.toString());
  }

  @Nullable
  private Object getObject() {
    return new Object();
  }

}

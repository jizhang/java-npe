package com.shzhangji.npe;

import javax.annotation.CheckForNull;

import edu.umd.cs.findbugs.annotations.Nullable;

public class SpotBugsExample {

  public void test() {
    @Nullable
    Object obj = getObject();
    System.out.println(obj.toString());

    @CheckForNull
    Object objB = null;

  }

  @CheckForNull
  private Object getObject() {
    return null;
  }

}

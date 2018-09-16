package com.shzhangji.npe;

import java.util.Random;

import edu.umd.cs.findbugs.annotations.CheckForNull;

public class SpotBugsExample {

  public void test() {
    Object obj = getObject();
    System.out.println(obj.toString());
  }

  private Object getObject() {
    return new Random().nextBoolean() ? new Object() : null;
  }

  public void check(@CheckForNull Object arg) {
    if (arg == null) {
      throw new NullPointerException();
    }
    System.out.println(arg.toString());
  }

}

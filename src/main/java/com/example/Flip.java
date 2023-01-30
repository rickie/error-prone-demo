package com.example;

import com.google.errorprone.annotations.Var;

public class Flip {
  public void main(String[] args) {
    method(args);
  }

  public void method(String[] args) {
    String foo = "foo";
    String bar = "bar";
    @Var boolean baz = false;

    if (args.length > 0) {
      baz = true;
    }

    simple(foo, bar, baz);
  }

  void simple(String foo, String bar, boolean baz) {}
}

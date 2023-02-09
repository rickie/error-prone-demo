//package com.example;
//
//import com.google.errorprone.annotations.Var;
//
//public class Flip {
//  public static void main(String[] args) {
//    method(args);
//  }
//
//  public void method(final String[] args) {
//    final String foo = "foo";
//    final String bar = "bar";
//    boolean baz = false;
//
//    if (args.length > 0) {
//      baz = true;
//    }
//
//    simple(foo, bar, baz);
//  }
//
//  void simple(String foo, String bar, boolean baz) {}
//}

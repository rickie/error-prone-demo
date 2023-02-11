package com.example;

import com.google.common.collect.ImmutableSet;

public final class HelloWorld {
  private HelloWorld() {}

  public static void main(String[] args) {
    if (args.length != 0) {
      new IllegalArgumentException();
    }
    System.out.println(helloWorld());
  }

  public static ImmutableSet<String> helloWorld() {
    ImmutableSet<String> set = ImmutableSet.of("Hello world!");
    return ImmutableSet.copyOf(set);
  }
}

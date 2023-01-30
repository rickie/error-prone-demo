package com.example;

import com.google.common.collect.ImmutableSet;

public final class ExampleApp {
  public static void main(String[] args) {
    if (args.length != 0) {
      throw new IllegalArgumentException();
    }
    System.out.println("Hello world!");
  }

  public ImmutableSet<Integer> foo() {
    ImmutableSet<Integer> set = ImmutableSet.of(1);
    return set;
  }
}

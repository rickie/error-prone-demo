package com.example;

import com.google.common.collect.ImmutableSet;

public final class ExampleApp {
  private ExampleApp() {}

  public static ImmutableSet<String> main(String[] args) {
    if (args.length != 0) {
      new IllegalArgumentException();
    }
    return helloWorld();
  }

  public static ImmutableSet<String> helloWorld() {
    ImmutableSet<String> set = ImmutableSet.of("Hello world!");
    return ImmutableSet.copyOf(set);
  }
}

package com.example;

import com.google.common.collect.ImmutableList;
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

  public static ImmutableList<Integer> helloWorldCharacters() {
    return "Hello World!".chars().boxed().collect(ImmutableList.toImmutableList());
  }

  public static boolean isEmpty(String str) {
    return str.length() == 0;
  }
}

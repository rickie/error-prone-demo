package com.example;

import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;
import java.util.Map;

public final class Example {
  private Example() {}

  static final int number = 5;

  public static void main(String[] args) {}

  static BigDecimal getNumber() {
    return BigDecimal.valueOf(0);
  }

  public ImmutableSet<Integer> getSet() {
    Map<Integer, Integer> map = Map.of(1, 2);
    Integer integer = map.getOrDefault(1, 3);

    ImmutableSet<Integer> set = ImmutableSet.of(1);
    return ImmutableSet.copyOf(set);
  }
}

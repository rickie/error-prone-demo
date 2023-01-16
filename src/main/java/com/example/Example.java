package com.example;

import static java.util.Objects.requireNonNullElse;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;

public final class Example {
  private Example() {}

  static BigDecimal getNumber() {
    return BigDecimal.valueOf(0);
  }

  public ImmutableSet<Integer> getSet() {
    ImmutableMap<Integer, Integer> map = ImmutableMap.of(1, 2);
    requireNonNullElse(map.get(1), 2);

    ImmutableSet<Integer> set = ImmutableSet.of(1);
    return ImmutableSet.copyOf(set);
  }
}

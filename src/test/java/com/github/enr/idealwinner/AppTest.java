package com.github.enr.idealwinner;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void test() {
    assertThat("foo").as("foo").containsIgnoringWhitespaces("foo");
  }
}

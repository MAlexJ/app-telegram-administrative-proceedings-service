package com.malexj.model;

import java.util.Arrays;
import java.util.Objects;

/**
 * Link: <a href="https://core.telegram.org/bots/api#chat">chat info</a> <br>
 * Type of chat, can be either “private”, “group”, “supergroup” or “channel”
 */
public enum ChatType {
  PRIVATE("private"),
  GROUP("group"),
  SUPERGROUP("supergroup"),
  CHANNEL("channel");

  private final String type;

  ChatType(String type) {
    this.type = type;
  }

  public static ChatType findType(String type) {
    Objects.requireNonNull(type);
    return Arrays.stream(values())
        .filter(v -> v.type.equals(type))
        .findAny()
        .orElseThrow(() -> new IllegalStateException("Unexpected chat type value: " + type));
  }
}

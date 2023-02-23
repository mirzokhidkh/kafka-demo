package com.mirzokhidkh.kafkademo;

import java.time.LocalDateTime;
import java.util.Date;

public record Message(String message,
                      LocalDateTime created) {

}

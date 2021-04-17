package edu.fiipractic.tasky.utils;

import java.util.UUID;

public class IdGenerator {

    public static Integer generate() {

        return Math.abs(UUID.randomUUID().hashCode());
    }
}

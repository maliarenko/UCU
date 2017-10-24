package com.ucu.apps.maliarenko.factory;

import com.ucu.apps.maliarenko.model.*;
import com.ucu.apps.maliarenko.model.Character;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class CharacterFactory {
    @RequiredArgsConstructor
    @Getter( AccessLevel.PRIVATE)

    public enum CharacterType {

        KING( King::new ),
        KNIGHT( Knight::new ),
        ELF( Elf::new),
        HOBBIT( Hobbit::new);

        private final Supplier<Character> constructor;
    }

    private static final List<CharacterType> VALUES =
            Collections.unmodifiableList(Arrays.asList(CharacterType.values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static CharacterType randomCharacterType()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static Character createCharacter() {
        return randomCharacterType().getConstructor().get();
    }

    public static Character createCharacter( CharacterType type) {
        return type.getConstructor().get();
    }
}

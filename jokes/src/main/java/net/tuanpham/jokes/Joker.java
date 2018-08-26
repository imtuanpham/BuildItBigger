package net.tuanpham.jokes;

import java.util.Random;

public class Joker {
    private final String[] jokes = {
            "To Infinity and Beyond",
            "Q. What's the difference between ignorance and apathy? A. I don’t know and I don’t care.",
            "What is What",
            "This is totally a funny joke"
    };

    public String getJoke() {
        int idx = new Random().nextInt(jokes.length);
        return jokes[idx];
    }
}

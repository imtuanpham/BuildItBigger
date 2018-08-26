package net.tuanpham.jokes;

import java.util.Random;

public class Joker {
    public String getJoke() {
        int randomNum = new Random().nextInt(4);
        switch (randomNum) {
            case 0:
                return "To Infinity and Beyond";
            case 1:
                return "Q. What's the difference between ignorance and apathy? A. I don’t know and I don’t care.";
            case 2:
                return "What is What";
            case 3:
                return "This is totally a funny joke";
        }

        return "Bad luck joke never shows up";
    }
}

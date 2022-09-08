package com.example.JoJoLedo;

import java.util.List;

public class Standlist {
    private List<Stand> stands = List.of(
            new Stand("Star Platinum", "Super strength", 5, 5, 3, 5),
            new Stand("Hierophant Green", "Emerald Splash", 3,4, 5, 3),
            new Stand("Silver Chariot", "Sword fighting", 3,5, 3, 4),
            new Stand("Magician's Red", "Fire bending", 4,4, 3, 3),
            new Stand("Hermit Purple", "Spirit image", 2,3, 2, 2),
            new Stand("The World", "Time stop", 5,5, 3, 4)
    );

    public List<Stand> getStands() {
        return stands;
    }
}

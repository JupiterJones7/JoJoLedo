package com.example.JoJoLedo;

import java.util.List;

public class PersonList {
    private List<Person> persons = List.of(
            new Person("Jotaro", "Kujo", 17,"Cap fades with hair"),
            new Person("Noriaki", "Kakyoin", 17,"Red hair"),
            new Person("Jean-Pierre", "Polnareff", 22,"Straight hair"),
            new Person("Mohammed", "Avdol", 22,"Big Chain"),
            new Person("Joseph", "Joestar", 69,"Old man"),
            new Person("Dio", "Brando", 122,"Yellow jacket")
            );

    public List<Person> getPersons() {
        return persons;
    }
}

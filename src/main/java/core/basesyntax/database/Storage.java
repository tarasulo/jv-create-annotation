package core.basesyntax.database;

import core.basesyntax.models.Bet;
import core.basesyntax.models.Person;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public static final List<Bet> bets = new ArrayList<>();
    public static final List<Person> persons = new ArrayList<>();
}
import java.util.ArrayList;

interface Character {
    void valAan(Character doelwit);
    void krijgSchade(int schade);
    void printInformatie();
    String getNaam();
    int getHP();
}
class Speler implements Character {
    private String naam;
    private boolean gameOver = false;
    private int hp;
    private Wapen wapen;

    Speler(String naam, int hp, Wapen wapen) {
        this.naam = naam;
        this.hp = hp;
        this.wapen = wapen;
    }
    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public int getHP() {
        return hp;
    }
    private void gameOver() {
        hp = 0;
        gameOver = true;
        System.out.println("Game over voor speler " + naam);
    }

    @Override
    public void valAan(Character doelwit) {
        if (gameOver) {
            System.out.println("Deze speler kan niet aanvallen, want deze speler is al game over!");
        }
        doelwit.krijgSchade(wapen.getSchade());
    }

    @Override
    public void krijgSchade(int schade) {
        if (hp - schade <= 0) {
            gameOver();
        } else {
            hp -= schade;
            System.out.println("Speler " + naam + " heeft " + schade + " schade gekregen!");
        }

    }

    @Override
    public void printInformatie() {
        System.out.println("Speler: " + naam);
        System.out.println("Game over: " + gameOver);
        System.out.println("Hoeveelheid HP: " + hp);
    }
}
class Vijand implements Character {
    private String naam;
    private boolean verslagen = false;
    private int hp;
    private Wapen wapen;

    Vijand(String naam, int hp, Wapen wapen) {
        this.naam = naam;
        this.hp = hp;
        this.wapen = wapen;
    }

    @Override
    public String getNaam() {
        return null;
    }

    @Override
    public int getHP() {
        return 0;
    }

    private void verslagen() {
        hp = 0;
        verslagen = true;
        System.out.println("Game over voor vijand " + naam);
    }
    @Override
    public void valAan(Character doelwit) {
        if(verslagen) {
            System.out.println("Deze vijand kan niet aanvallen, want deze vijand is al verslagen.!");
        }
        else {
            doelwit.krijgSchade(wapen.getSchade());
        }
    }

    @Override
    public void krijgSchade(int schade) {
        if(hp - schade <= 0) {
            verslagen();
        }
        else {
            hp -= schade;
            System.out.println("Vijand " + naam + "heeft "+ schade + " schade gekregen!");
        }
    }
    @Override
    public void printInformatie() {
        System.out.println("Vijand: " + naam);
        System.out.println("Verslagen: " + verslagen);
        System.out.println("Hoeveelheid HP: " + hp);
    }
}
abstract class Wapen {
    protected int schade;
    Wapen(int schade) {
        this.schade = schade;
    }
    public int getSchade() {
        return schade;
    }
}

class Zwaard extends Wapen {
    private boolean extraScherp;

    Zwaard(int schade, boolean extraScherp) {
        super(schade);
        this.extraScherp = extraScherp;
    }
    @Override
    public int getSchade() {
        if(extraScherp) {
            return schade + 5;
        }
        else {
            return schade;
        }
    }
}
class Boog extends Wapen {
    private boolean vuurPijlen;
    Boog(int schade, boolean vuurPijlen) {
        super(schade);
        this.vuurPijlen = vuurPijlen;
    }
    @Override
    public int getSchade() {
        if(vuurPijlen) {
            return schade + 10;
        }
        else {
            return schade;
        }
    }
}
class Staf extends Wapen {
    private boolean zeldzaam;
    Staf(int schade, boolean zeldzaam) {
        super(schade);
        this.zeldzaam = zeldzaam;
    }
    @Override
    public int getSchade() {
        if(zeldzaam) {
            return schade + 8;
        }
        else {
            return schade;
        }
    }
}

class Level {
    private String naam;
    private ArrayList<Character> characters = new ArrayList<Character>();

    Level(String naam) {
        this.naam = naam;
    }

    public void PrintInformatieVanLevel() {
        System.out.println("Naam level: " + naam + "\n");

        for (Character character : characters) {
            character.printInformatie();
            System.out.println();
        }
    }

    public void voegCharacterToe(Character character) {
        characters.add(character);
    }

    public Character getCharacter(String naam) {
        for (Character character : characters) {
            if (character.getNaam().equals(naam)) {
                return character;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        Level level1 = new Level("Level 1");
        Speler speler1 = new Speler("Speler 1", 100, new Zwaard(10, true));
        level1.voegCharacterToe(speler1);
        Vijand vijand1 = new Vijand("Vijand 1", 100, new Boog(10, true));
        level1.voegCharacterToe(vijand1);
        level1.PrintInformatieVanLevel();
        System.out.println();
        speler1.valAan(vijand1);
        vijand1.valAan(speler1);
        level1.PrintInformatieVanLevel();
    }
}
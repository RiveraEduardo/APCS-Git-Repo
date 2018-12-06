public class Gibberish
{
    // all the words that are used to turn the words into new ones/ random words
    public static String[] determiners = {"My ", "The ", "My ", "Her ", "His ", "Our "};
    public static String[] nouns = {"Jalopy ", "Doorknob ", "Donkey ", "Squid ", "Dwarf ", "Bear "};
    public static String[] verbs = {"Slid ", "Squelched ", "Wiggled ", "Slapped ", "Juiced ", "Jumped "};
    public static String[] adjectives = {"Slimy ", "Slippery ", "Moist ", "Wet ", "Old ", "Fuzzy "};
    public static String[] adverbs = {"Quickly ", "Happily ", "Smoothly ", "Often ", "Sadly ", "Never "};
    public static String[] prepositions = {"Over ", "Near ", "Behind ", "Under ", "Next To ", "On Top Of "};
    public static String nounPhrase = "";
    public static String verbPhrase = "";
    public static String prepositionalPhrase = "";
    
    public static void loadSentences(){//Loads the sentece with a noun
        System.out.print(getNounPhrase() + getVerbPhrase() + getPrepositionalPhrase());
    }
    public static String getNounPhrase(){//Loads the sentece with a Nounphrase
        nounPhrase = getRandomDeterminer() + getRandomAdjective() + getRandomNoun();
        return nounPhrase;
    }
    public static String getVerbPhrase(){//Loads the sentece with verb
        verbPhrase = getRandomAdverb() + getRandomVerb();
        return verbPhrase;
    }
    public static String getPrepositionalPhrase(){//Loads the sentece with a prepositional phrase
        prepositionalPhrase = getRandomPreposition() + getRandomDeterminer() + getRandomAdjective() + getRandomNoun();
        return prepositionalPhrase;
    }
    public static String getRandomDeterminer(){//Loads the sentece with a determiner
        int determinerChoice = (int)((Math.random() * determiners.length));
        return determiners[determinerChoice];
    }
    public static String getRandomNoun(){//Loads the sentece with a noun
        int nounChoice = (int)((Math.random() * nouns.length));
        return nouns[nounChoice];
    }
    public static String getRandomVerb(){//Loads the sentece with a verb
        int verbChoice = (int)((Math.random() * verbs.length));
        return verbs[verbChoice];
    }
    public static String getRandomAdjective(){//Loads the sentece with a adjective
        int adjectiveChoice = (int)((Math.random() * adjectives.length));
        return adjectives[adjectiveChoice];
    }
    public static String getRandomPreposition(){//Loads the sentece with a preposition
        int prepositionChoice = (int)((Math.random() * prepositions.length));
        return prepositions[prepositionChoice];
    }
    public static String getRandomAdverb(){//Loads the sentece with a adverb
        int adverbChoice = (int)((Math.random() * adverbs.length));
        return adverbs[adverbChoice];
    }
    
    }
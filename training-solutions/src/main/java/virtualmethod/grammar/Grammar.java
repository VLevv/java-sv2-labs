package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verb = new PhrasalVerb("jár","be");
        Verb verb1 = new PhrasalVerbWithSuffix("jár","be","kál");
        Preposition preposition = new PhrasalVerb("jár","be");
        Preposition preposition1 = new PhrasalVerbWithSuffix("jár","be","kál");
        PhrasalVerb phrasalVerb = new PhrasalVerb("jár","be");
        PhrasalVerb phrasalVerb1 = new PhrasalVerbWithSuffix("jár","be","kál");
        Suffix suffix = new PhrasalVerbWithSuffix("jár","be","kál");
        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("jár","be","kál");

        System.out.println(verb.getWord());
        System.out.println(verb1.getWord());
        System.out.println(preposition.getPreposition());
        System.out.println(preposition.getWholeWord());
        System.out.println(preposition1.getPreposition());
        System.out.println(preposition1.getWholeWord());
        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getWholeWord());
        System.out.println(phrasalVerb1.getPreposition());
        System.out.println(phrasalVerb1.getWord());
        System.out.println(phrasalVerb1.getWholeWord());
        System.out.println(suffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}

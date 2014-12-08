import java.util.ArrayList;

/***
 * Rule.java
 * 
 * Represents the input and output of an inference rule
 * 
 * @author Jules Chevalier
 */
public class Rule {

    /* Code of the rule in the name map */
    private int code;
    /* List of the input and output triples */
    private ArrayList<Triple> in;
    private ArrayList<Triple> out;

    /**
     * Class constructor
     * 
     * @param code
     *            Code of the rule in the name map
     * @param in
     *            List of input triples in the following format :
     *            s p o s p o... where s p and o are integers
     * @param out
     *            List of output triples with the same format
     * @throws Exception
     *             Throws an exception if input or output
     *             are not well formatted
     */
    public Rule(final int code, final int[] in, final int[] out) throws Exception {
        super();
        this.code = code;

        /*
         * Throws an exception if in or out is not well formatted
         * (which means not int triplets)
         */
        if (in.length % 3 != 0 || out.length % 3 != 0) {
            throw new TripleFormatException("Triples must be like \"(s p o)*\"");
        }

        /* Generate input triples from the int table */
        this.in = new ArrayList<Triple>();
        for (int i = 0; i < in.length; i += 3) {
            this.in.add(new Triple(in[i], in[i + 1], in[i + 2]));
        }

        /* Generate output triples from the int table */
        this.out = new ArrayList<Triple>();
        for (int i = 0; i < out.length; i += 3) {
            this.out.add(new Triple(out[i], out[i + 1], out[i + 2]));
        }
    }

    /* *
     * GETTERS AND SETTERS
     */
    public int getCode() {
        return this.code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public ArrayList<Triple> getIn() {
        return this.in;
    }

    public void setIn(final ArrayList<Triple> in) {
        this.in = in;
    }

    public ArrayList<Triple> getOut() {
        return this.out;
    }

    public void setOut(final ArrayList<Triple> out) {
        this.out = out;
    }

    /**
     * @param concepts
     *            List of concepts used
     * @return true if this rule can be executed with this concepts
     */
    public boolean canBeExecutedWith(final int[] concepts) {
        for (final Triple triple : this.in) {
            if (!triple.isValidWith(concepts)) {
                return false;
            }
        }
        for (final Triple triple : this.out) {
            if (!triple.isValidWith(concepts)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param rule
     *            Rule to match with
     * @param acceptUniversal
     *            True if universal match are accepted, False else
     * @return true if the output of this rule match with the input of the
     *         parameter rule
     */
    public boolean matchWIth(final Rule rule, final boolean acceptUniversal) {
        for (final Triple out : this.out) {
            for (final Triple in : rule.getIn()) {
                if (!out.matchWith(in, acceptUniversal)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String r = "\t\t\t" + RulesList.rulesNames.get(this.code) + "\n";
        r += "IN:  ";
        for (final Triple triple : this.in) {
            r += triple;
        }
        r += "\n";
        r += "OUT: ";
        for (final Triple triple : this.out) {
            r += triple;
        }
        r += "\n";
        return r;
    }
}

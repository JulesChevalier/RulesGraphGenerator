import java.util.ArrayList;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;

/**
 * Contains static methods to generate the graph
 * 
 * @author Jules Chevalier
 **/
public class Generator {

    /**
     * @param rulesList
     *            List of rules used for inference
     * @param acceptUnivseral
     *            True if universal match are accepted, False else
     * @return the rules graph within the Graphiz format
     */
    public static GraphViz generateGraph(final ArrayList<Rule> rulesList, final boolean acceptUnivseral) {

        final GraphViz graph = new GraphViz();
        int edges = 0;

        // Initialise the graph
        graph.addln(graph.start_graph());

        // For each rule, if any other rul match, add an edge between these
        // rules
        for (final Rule rule1 : rulesList) {
            for (final Rule rule2 : rulesList) {
                if (rule1.matchWIth(rule2, acceptUnivseral)) {
                    edges++;
                    graph.addln("\"" + RulesList.rulesNames.get(rule1.getCode()) + "\" -> \"" + RulesList.rulesNames.get(rule2.getCode()) + "\"");
                }
            }
        }

        // Name the graph
        graph.addln("labelloc=\"b\"");
        graph.addln("label=\"" + rulesList.size() + " Rules, " + edges + " Edges" + "\";");

        return graph;
    }

    /**
     * @param rulesList
     *            List of rules used for inference
     * @param acceptUnivseral
     *            True if universal match are accepted, False else
     * @return the rules graph within the Graphiz format
     */
    public static Graph generateJungGraph(final ArrayList<Rule> rulesList, final boolean acceptUnivseral) {

        Graph<String, String> g;

        int edges = 0;

        // Initialize the graph
        g = new SparseGraph<String, String>();

        // For each rule, if any other rule match, add an edge between these
        // rules
        for (final Rule rule1 : rulesList) {
            g.addVertex(RulesList.rulesNames.get(rule1.getCode()));
            for (final Rule rule2 : rulesList) {
                if (rule1.matchWIth(rule2, acceptUnivseral)) {
                    edges++;
                    g.addEdge(RulesList.rulesNames.get(rule1.getCode()) + ":" + RulesList.rulesNames.get(rule2.getCode()),
                            RulesList.rulesNames.get(rule1.getCode()), RulesList.rulesNames.get(rule2.getCode()));
                }
            }
        }
        // graph.addln("labelloc=\"b\"");
        // graph.addln("label=\""+rulesList.size()+" Rules, "+edges+" Edges"+"\";");

        return g;
    }

    /**
     * @param concepts
     *            List of concepts' codes
     * @return List of rules applicable with this concepts
     */
    public static ArrayList<Rule> filtredRulesList(final int[] concepts) {
        final ArrayList<Rule> filtredRulesList = new ArrayList<Rule>();
        for (final Rule rule : inferenceRules()) {
            if (rule.canBeExecutedWith(concepts)) {
                filtredRulesList.add(rule);
            }
        }
        return filtredRulesList;
    }

    /**
     * @return The list of all inference rules
     */
    public static ArrayList<Rule> inferenceRules() {
        final ArrayList<Rule> rulesList = new ArrayList<Rule>();

        try {
            // rulesList.add(new Rule(RulesList.EQ_REF, new int[]
            // {RulesList.UNIVERSAL,RulesList.UNIVERSAL,RulesList.UNIVERSAL},
            // new int[]
            // {RulesList.UNIVERSAL,RulesList.OWL_SAMEAS,RulesList.UNIVERSAL}));
            rulesList.add(new Rule(RulesList.EQ_SYM, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.EQ_TRANS, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.EQ_REP_S, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.EQ_REP_P, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.EQ_REP_O, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.EQ_DIFF1, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_DIFFERENTFROM, RulesList.UNIVERSAL }, new int[] {}));
            rulesList.add(new Rule(RulesList.EQ_DIFF2, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.OWL_ALLDIFFERENT, RulesList.UNIVERSAL,
                    RulesList.OWL_MEMBERS, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_REST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }, new int[] {}));
            rulesList.add(new Rule(RulesList.EQ_DIFF3, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.OWL_ALLDIFFERENT, RulesList.UNIVERSAL,
                    RulesList.OWL_DISTINCTMEMBERS, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_REST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }, new int[] {}));
            // rulesList.add(new Rule(RulesList.PRP_AP, new int[] {}, new int[]
            // {RulesList.UNIVERSAL,RulesList.RDF_TYPE,RulesList.OWL_ANNOTATIONPROPERTY}));
            rulesList.add(new Rule(RulesList.PRP_DOM, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDFS_DOMAIN, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_RNG, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDFS_RANGE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_FP, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.OWL_FUNCTIONALPROPERTY }, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList
                    .add(new Rule(RulesList.PRP_IFP, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                            RulesList.RDF_TYPE, RulesList.OWL_INVERSEFUNCTIONALPROPERTY }, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SAMEAS,
                            RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_IRP, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.OWL_IRREFLEXIVEPROPERTY }, new int[] {}));
            rulesList.add(new Rule(RulesList.PRP_SYMP, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.OWL_SYMETRICPROPERTY }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_ASYP, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.OWL_ASYMETRICPROPERTY }, new int[] {}));
            rulesList.add(new Rule(RulesList.PRP_TRP, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.OWL_TRANSITIVEPROPERTY }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_SPO1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_SPO2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_PROPERTYCHAINAXIOM, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_REST, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_EQP1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_EQUIVALENTPROPERTY, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_EQP2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_EQUIVALENTPROPERTY, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_PDW, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_PROPERTYDISJOINTWITH, RulesList.UNIVERSAL }, new int[] {}));
            rulesList
                    .add(new Rule(RulesList.PRP_ADP, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                            RulesList.OWL_ALLDISJOINTPROPERTIES, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_MEMBERS, RulesList.UNIVERSAL,
                            RulesList.UNIVERSAL, RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_REST, RulesList.UNIVERSAL },
                            new int[] {}));
            rulesList.add(new Rule(RulesList.PRP_INV1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_INVERSEOF, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_INV2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_INVERSEOF, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_KEY, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_HASKEY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_REST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL,
                    RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.PRP_NPA1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_SOURCEINDIVIDUAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ASSERTIONPROPERTY, RulesList.UNIVERSAL,
                    RulesList.UNIVERSAL, RulesList.OWL_TARGETINDIVIDUAL, RulesList.UNIVERSAL }, new int[] {}));
            rulesList.add(new Rule(RulesList.PRP_NPA2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_SOURCEINDIVIDUAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ASSERTIONPROPERTY, RulesList.UNIVERSAL,
                    RulesList.UNIVERSAL, RulesList.OWL_TARGETVALUE, RulesList.UNIVERSAL }, new int[] {}));
            // rulesList.add(new Rule(RulesList.CLS_THING, new int[] {}, new
            // int[]
            // {RulesList.OWL_THING,RulesList.RDF_TYPE,RulesList.OWL_CLASS}));
            // rulesList.add(new Rule(RulesList.CLS_NOTHING1, new int[] {}, new
            // int[]
            // {RulesList.OWL_NOTHING,RulesList.RDF_TYPE,RulesList.OWL_CLASS}));
            rulesList.add(new Rule(RulesList.CLS_NOTHING2, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.OWL_NOTHING }, new int[] {}));
            rulesList.add(new Rule(RulesList.CLS_INT1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_INTERSECTIONOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_REST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_INT2, new int[] { RulesList.UNIVERSAL, RulesList.OWL_INTERSECTIONOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_REST, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_UNI, new int[] { RulesList.UNIVERSAL, RulesList.OWL_UNIONOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_REST, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_COM, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_COMPLEMENTOF, RulesList.UNIVERSAL }, new int[] {}));
            rulesList.add(new Rule(RulesList.CLS_SVF1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_SOMEVALUESFROM, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_SVF2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_SOMEVALUESFROM, RulesList.OWL_THING, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_AVF, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ALLVALUESFROM, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_HV1, new int[] { RulesList.UNIVERSAL, RulesList.OWL_HASVALUE, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_HV2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_HASVALUE, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_MAXC1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_MAXCARDINALITY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_MAXC2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_MAXCARDINALITY, 1, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_MAXQC1, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_MAXQUALIFIEDCARDINALITY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL,
                    RulesList.UNIVERSAL, RulesList.OWL_ONCLASS, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL },
                    new int[] {}));
            rulesList.add(new Rule(RulesList.CLS_MAXQC2, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_MAXQUALIFIEDCARDINALITY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL,
                    RulesList.UNIVERSAL, RulesList.OWL_ONCLASS, RulesList.OWL_THING, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL },
                    new int[] {}));
            rulesList.add(new Rule(RulesList.CLS_MAXQC3, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_MAXQUALIFIEDCARDINALITY, 1, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONCLASS, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_MAXQC4, new int[] { RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_MAXQUALIFIEDCARDINALITY, 1, RulesList.UNIVERSAL, RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONCLASS, RulesList.OWL_THING, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.OWL_SAMEAS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CLS_OO, new int[] { RulesList.UNIVERSAL, RulesList.OWL_ONEOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_REST, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CAX_SCO, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList
                    .add(new Rule(RulesList.CAX_EQC1, new int[] { RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTCLASS, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                            RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList
                    .add(new Rule(RulesList.CAX_EQC2, new int[] { RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTCLASS, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                            RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.CAX_DW, new int[] { RulesList.UNIVERSAL, RulesList.OWL_DISJOINTWITH, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_TYPE, RulesList.UNIVERSAL }, new int[] {}));
            rulesList
                    .add(new Rule(RulesList.CAX_ADC, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.OWL_ALLDISJOINTCLASSES,
                            RulesList.UNIVERSAL, RulesList.OWL_MEMBERS, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_FIRST, RulesList.UNIVERSAL,
                            RulesList.UNIVERSAL, RulesList.RDF_REST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.UNIVERSAL },
                            new int[] {}));
            rulesList.add(new Rule(RulesList.SCM_CLS, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.OWL_CLASS }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTCLASS,
                    RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.OWL_THING, RulesList.OWL_NOTHING, RulesList.RDFS_SUBCLASSOF,
                    RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_SCO, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_EQC1, new int[] { RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTCLASS, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_EQC2, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTCLASS, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_OP, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.OWL_OBJECTPROPERTY }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTPROPERTY,
                    RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_DP, new int[] { RulesList.UNIVERSAL, RulesList.RDF_TYPE, RulesList.RDF_DATATYPEPROPERTY }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTPROPERTY,
                    RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_SPO, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_EQP1, new int[] { RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTPROPERTY, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_EQP2, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.OWL_EQUIVALENTPROPERTY, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_DOM1, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_DOMAIN, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_DOMAIN, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_DOM2, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_DOMAIN, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_DOMAIN, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_RNG1, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_RANGE, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_RANGE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_RNG2, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_RANGE, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL, RulesList.RDFS_RANGE, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_HV, new int[] { RulesList.UNIVERSAL, RulesList.OWL_HASVALUE, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_SVF1, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SOMEVALUESFROM, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_SVF2, new int[] { RulesList.UNIVERSAL, RulesList.OWL_SOMEVALUESFROM, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_AVF1, new int[] { RulesList.UNIVERSAL, RulesList.OWL_ALLVALUESFROM, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_AVF2, new int[] { RulesList.UNIVERSAL, RulesList.OWL_ALLVALUESFROM, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.OWL_ONPROPERTY, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDFS_SUBPROPERTYOF, RulesList.UNIVERSAL }, new int[] {
                    RulesList.UNIVERSAL, RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_INT, new int[] { RulesList.UNIVERSAL, RulesList.OWL_INTERSECTIONOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_REST, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL,
                    RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));
            rulesList.add(new Rule(RulesList.SCM_UNI, new int[] { RulesList.UNIVERSAL, RulesList.OWL_UNIONOF, RulesList.UNIVERSAL, RulesList.UNIVERSAL,
                    RulesList.RDF_FIRST, RulesList.UNIVERSAL, RulesList.UNIVERSAL, RulesList.RDF_REST, RulesList.UNIVERSAL }, new int[] { RulesList.UNIVERSAL,
                    RulesList.RDFS_SUBCLASSOF, RulesList.UNIVERSAL }));

            return rulesList;
        } catch (final Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

import java.util.HashMap;

/**
 * Defines all the codes of all concepts and rules
 * Defines maps for code/name of concepts and rules
 * 
 * @author Jules Chevalier
 */
public class RulesList {

    /**************************************/
    /* CONCEPTS USED FOR INFERENCE */
    /**************************************/
    public final static int UNIVERSAL = 0;
    public final static int OWL_ALLDIFFERENT = 1;
    public final static int OWL_ALLDISJOINTCLASSES = 2;
    public final static int OWL_ALLDISJOINTPROPERTIES = 3;
    public final static int OWL_ALLVALUESFROM = 4;
    public final static int OWL_ANNOTATIONPROPERTY = 5;
    public final static int OWL_ASSERTIONPROPERTY = 6;
    public final static int OWL_ASYMETRICPROPERTY = 7;
    public final static int OWL_CLASS = 8;
    public final static int OWL_COMPLEMENTOF = 9;
    public final static int OWL_DIFFERENTFROM = 10;
    public final static int OWL_DISJOINTWITH = 11;
    public final static int OWL_DISTINCTMEMBERS = 12;
    public final static int OWL_EQUIVALENTCLASS = 13;
    public final static int OWL_EQUIVALENTPROPERTY = 14;
    public final static int OWL_FUNCTIONALPROPERTY = 15;
    public final static int OWL_HASKEY = 16;
    public final static int OWL_HASVALUE = 17;
    public final static int OWL_INTERSECTIONOF = 18;
    public final static int OWL_INVERSEFUNCTIONALPROPERTY = 19;
    public final static int OWL_INVERSEOF = 20;
    public final static int OWL_IRREFLEXIVEPROPERTY = 21;
    public final static int OWL_MAXCARDINALITY = 22;
    public final static int OWL_MAXQUALIFIEDCARDINALITY = 23;
    public final static int OWL_MEMBERS = 24;
    public final static int OWL_NOTHING = 25;
    public final static int OWL_OBJECTPROPERTY = 26;
    public final static int OWL_ONCLASS = 27;
    public final static int OWL_ONEOF = 28;
    public final static int OWL_ONPROPERTY = 29;
    public final static int OWL_PROPERTYCHAINAXIOM = 30;
    public final static int OWL_PROPERTYDISJOINTWITH = 31;
    public final static int OWL_SAMEAS = 32;
    public final static int OWL_SOMEVALUESFROM = 33;
    public final static int OWL_SOURCEINDIVIDUAL = 34;
    public final static int OWL_SYMETRICPROPERTY = 35;
    public final static int OWL_TARGETINDIVIDUAL = 36;
    public final static int OWL_TARGETVALUE = 37;
    public final static int OWL_THING = 38;
    public final static int OWL_TRANSITIVEPROPERTY = 39;
    public final static int OWL_UNIONOF = 40;
    public final static int RDFS_DOMAIN = 41;
    public final static int RDFS_RANGE = 42;
    public final static int RDFS_SUBCLASSOF = 43;
    public final static int RDFS_SUBPROPERTYOF = 44;
    public final static int RDF_DATATYPEPROPERTY = 45;
    public final static int RDF_FIRST = 46;
    public final static int RDF_REST = 47;
    public final static int RDF_TYPE = 48;
    public final static int RDF_TYPEPROPERTY = 49;

    /**************************************/
    /* MAP FOR CONCEPTS NAMES */
    /**************************************/
    public static HashMap<Integer, String> conceptsNames = new HashMap<Integer, String>();
    static {
        conceptsNames.put(UNIVERSAL, "UNIVERSAL");
        conceptsNames.put(OWL_ALLDIFFERENT, "OWL_ALLDIFFERENT");
        conceptsNames.put(OWL_ALLDISJOINTCLASSES, "OWL_ALLDISJOINTCLASSES");
        conceptsNames.put(OWL_ALLDISJOINTPROPERTIES, "OWL_ALLDISJOINTPROPERTIES");
        conceptsNames.put(OWL_ALLVALUESFROM, "OWL_ALLVALUESFROM");
        conceptsNames.put(OWL_ANNOTATIONPROPERTY, "OWL_ANNOTATIONPROPERTY");
        conceptsNames.put(OWL_ASSERTIONPROPERTY, "OWL_ASSERTIONPROPERTY");
        conceptsNames.put(OWL_ASYMETRICPROPERTY, "OWL_ASYMETRICPROPERTY");
        conceptsNames.put(OWL_CLASS, "OWL_CLASS");
        conceptsNames.put(OWL_COMPLEMENTOF, "OWL_COMPLEMENTOF");
        conceptsNames.put(OWL_DIFFERENTFROM, "OWL_DIFFERENTFROM");
        conceptsNames.put(OWL_DISJOINTWITH, "OWL_DISJOINTWITH");
        conceptsNames.put(OWL_DISTINCTMEMBERS, "OWL_DISTINCTMEMBERS");
        conceptsNames.put(OWL_EQUIVALENTCLASS, "OWL_EQUIVALENTCLASS");
        conceptsNames.put(OWL_EQUIVALENTPROPERTY, "OWL_EQUIVALENTPROPERTY");
        conceptsNames.put(OWL_FUNCTIONALPROPERTY, "OWL_FUNCTIONALPROPERTY");
        conceptsNames.put(OWL_HASKEY, "OWL_HASKEY");
        conceptsNames.put(OWL_HASVALUE, "OWL_HASVALUE");
        conceptsNames.put(OWL_INTERSECTIONOF, "OWL_INTERSECTIONOF");
        conceptsNames.put(OWL_INVERSEFUNCTIONALPROPERTY, "OWL_INVERSEFUNCTIONALPROPERTY");
        conceptsNames.put(OWL_INVERSEOF, "OWL_INVERSEOF");
        conceptsNames.put(OWL_IRREFLEXIVEPROPERTY, "OWL_IRREFLEXIVEPROPERTY");
        conceptsNames.put(OWL_MAXCARDINALITY, "OWL_MAXCARDINALITY");
        conceptsNames.put(OWL_MAXQUALIFIEDCARDINALITY, "OWL_MAXQUALIFIEDCARDINALITY");
        conceptsNames.put(OWL_MEMBERS, "OWL_MEMBERS");
        conceptsNames.put(OWL_NOTHING, "OWL_NOTHING");
        conceptsNames.put(OWL_OBJECTPROPERTY, "OWL_OBJECTPROPERTY");
        conceptsNames.put(OWL_ONCLASS, "OWL_ONCLASS");
        conceptsNames.put(OWL_ONEOF, "OWL_ONEOF");
        conceptsNames.put(OWL_ONPROPERTY, "OWL_ONPROPERTY");
        conceptsNames.put(OWL_PROPERTYCHAINAXIOM, "OWL_PROPERTYCHAINAXIOM");
        conceptsNames.put(OWL_PROPERTYDISJOINTWITH, "OWL_PROPERTYDISJOINTWITH");
        conceptsNames.put(OWL_SAMEAS, "OWL_SAMEAS");
        conceptsNames.put(OWL_SOMEVALUESFROM, "OWL_SOMEVALUESFROM");
        conceptsNames.put(OWL_SOURCEINDIVIDUAL, "OWL_SOURCEINDIVIDUAL");
        conceptsNames.put(OWL_SYMETRICPROPERTY, "OWL_SYMETRICPROPERTY");
        conceptsNames.put(OWL_TARGETINDIVIDUAL, "OWL_TARGETINDIVIDUAL");
        conceptsNames.put(OWL_TARGETVALUE, "OWL_TARGETVALUE");
        conceptsNames.put(OWL_THING, "OWL_THING");
        conceptsNames.put(OWL_TRANSITIVEPROPERTY, "OWL_TRANSITIVEPROPERTY");
        conceptsNames.put(OWL_UNIONOF, "OWL_UNIONOF");
        conceptsNames.put(RDFS_DOMAIN, "RDFS_DOMAIN");
        conceptsNames.put(RDFS_RANGE, "RDFS_RANGE");
        conceptsNames.put(RDFS_SUBCLASSOF, "RDFS_SUBCLASSOF");
        conceptsNames.put(RDFS_SUBPROPERTYOF, "RDFS_SUBPROPERTYOF");
        conceptsNames.put(RDF_DATATYPEPROPERTY, "RDF_DATATYPEPROPERTY");
        conceptsNames.put(RDF_FIRST, "RDF_FIRST");
        conceptsNames.put(RDF_REST, "RDF_REST");
        conceptsNames.put(RDF_TYPE, "RDF_TYPE");
        conceptsNames.put(RDF_TYPEPROPERTY, "RDF_TYPEPROPERTY");
    }

    /**************************************/
    /* FRAGMENTS DEFINITIONS */
    /**************************************/
    public static int[] RDF = { RDF_TYPE, RDF_TYPEPROPERTY };

    public static int[] RDFS = { RDFS_DOMAIN, RDFS_RANGE, RDFS_SUBCLASSOF, RDFS_SUBPROPERTYOF, RDF_TYPE, RDF_FIRST, RDF_REST, RDF_DATATYPEPROPERTY,
            RDF_TYPEPROPERTY };

    public static int[] RHODF = { RDFS_DOMAIN, RDFS_RANGE, RDFS_SUBCLASSOF, RDFS_SUBPROPERTYOF, RDF_TYPE };

    public static int[] OWL_HORST = { OWL_ALLVALUESFROM, OWL_CLASS, OWL_DIFFERENTFROM, OWL_DISJOINTWITH, OWL_EQUIVALENTCLASS, OWL_EQUIVALENTPROPERTY,
            OWL_FUNCTIONALPROPERTY, OWL_HASVALUE, OWL_INVERSEFUNCTIONALPROPERTY, OWL_INVERSEOF, OWL_ONPROPERTY, OWL_SAMEAS, OWL_SOMEVALUESFROM,
            OWL_SYMETRICPROPERTY, OWL_EQUIVALENTCLASS, OWL_EQUIVALENTPROPERTY, RDFS_SUBCLASSOF, RDFS_SUBPROPERTYOF, RDF_TYPE };

    public static int[] OWL_LITE = { OWL_CLASS, OWL_THING, OWL_NOTHING, OWL_EQUIVALENTCLASS, OWL_EQUIVALENTPROPERTY, OWL_SAMEAS, OWL_DIFFERENTFROM,
            OWL_ALLDIFFERENT, OWL_DISTINCTMEMBERS, OWL_INVERSEOF, OWL_TRANSITIVEPROPERTY, OWL_SYMETRICPROPERTY, OWL_FUNCTIONALPROPERTY,
            OWL_INVERSEFUNCTIONALPROPERTY, OWL_ONPROPERTY, OWL_ALLVALUESFROM, OWL_SOMEVALUESFROM, OWL_MAXCARDINALITY, OWL_INTERSECTIONOF,
            OWL_ANNOTATIONPROPERTY, RDFS_DOMAIN, RDFS_RANGE, RDFS_SUBCLASSOF, RDFS_SUBPROPERTYOF };

    public static int[] OWL_FULL = { OWL_ALLDIFFERENT, OWL_ALLDISJOINTCLASSES, OWL_ALLDISJOINTPROPERTIES, OWL_ALLVALUESFROM, OWL_ANNOTATIONPROPERTY,
            OWL_ASSERTIONPROPERTY, OWL_ASYMETRICPROPERTY, OWL_CLASS, OWL_COMPLEMENTOF, OWL_DIFFERENTFROM, OWL_DISJOINTWITH, OWL_DISTINCTMEMBERS,
            OWL_EQUIVALENTCLASS, OWL_EQUIVALENTPROPERTY, OWL_FUNCTIONALPROPERTY, OWL_HASKEY, OWL_HASVALUE, OWL_INTERSECTIONOF, OWL_INVERSEFUNCTIONALPROPERTY,
            OWL_INVERSEOF, OWL_IRREFLEXIVEPROPERTY, OWL_MAXCARDINALITY, OWL_MAXQUALIFIEDCARDINALITY, OWL_MEMBERS, OWL_NOTHING, OWL_OBJECTPROPERTY, OWL_ONCLASS,
            OWL_ONEOF, OWL_ONPROPERTY, OWL_PROPERTYCHAINAXIOM, OWL_PROPERTYDISJOINTWITH, OWL_SAMEAS, OWL_SOMEVALUESFROM, OWL_SOURCEINDIVIDUAL,
            OWL_SYMETRICPROPERTY, OWL_TARGETINDIVIDUAL, OWL_TARGETVALUE, OWL_THING, OWL_TRANSITIVEPROPERTY, OWL_UNIONOF, RDFS_DOMAIN, RDFS_RANGE,
            RDFS_SUBCLASSOF, RDFS_SUBPROPERTYOF, RDF_DATATYPEPROPERTY, RDF_FIRST, RDF_REST, RDF_TYPE, RDF_TYPEPROPERTY };

    /**************************************/
    /* RULES USED FOR INFERENCE */
    /**************************************/
    public final static int CAX_ADC = 1;
    public final static int CAX_DW = 2;
    public final static int CAX_EQC1 = 3;
    public final static int CAX_EQC2 = 4;
    public final static int CAX_SCO = 5;
    public final static int CLS_AVF = 6;
    public final static int CLS_COM = 7;
    public final static int CLS_HV1 = 8;
    public final static int CLS_HV2 = 9;
    public final static int CLS_INT1 = 10;
    public final static int CLS_INT2 = 11;
    public final static int CLS_MAXC1 = 12;
    public final static int CLS_MAXC2 = 13;
    public final static int CLS_MAXQC1 = 14;
    public final static int CLS_MAXQC2 = 15;
    public final static int CLS_MAXQC3 = 16;
    public final static int CLS_MAXQC4 = 17;
    public final static int CLS_NOTHING1 = 18;
    public final static int CLS_NOTHING2 = 19;
    public final static int CLS_OO = 20;
    public final static int CLS_SVF1 = 21;
    public final static int CLS_SVF2 = 22;
    public final static int CLS_THING = 23;
    public final static int CLS_UNI = 24;
    public final static int EQ_DIFF1 = 25;
    public final static int EQ_DIFF2 = 26;
    public final static int EQ_DIFF3 = 27;
    public final static int EQ_REP_O = 28;
    public final static int EQ_REP_P = 29;
    public final static int EQ_REP_S = 30;
    public final static int EQ_REF = 31;
    public final static int EQ_SYM = 32;
    public final static int EQ_TRANS = 33;
    public final static int PRP_ADP = 34;
    public final static int PRP_AP = 35;
    public final static int PRP_ASYP = 36;
    public final static int PRP_DOM = 37;
    public final static int PRP_EQP1 = 38;
    public final static int PRP_EQP2 = 39;
    public final static int PRP_FP = 40;
    public final static int PRP_IFP = 41;
    public final static int PRP_INV1 = 42;
    public final static int PRP_INV2 = 43;
    public final static int PRP_IRP = 44;
    public final static int PRP_KEY = 45;
    public final static int PRP_NPA1 = 46;
    public final static int PRP_NPA2 = 47;
    public final static int PRP_PDW = 48;
    public final static int PRP_RNG = 49;
    public final static int PRP_SPO1 = 50;
    public final static int PRP_SPO2 = 51;
    public final static int PRP_SYMP = 52;
    public final static int PRP_TRP = 53;
    public final static int SCM_AVF1 = 54;
    public final static int SCM_AVF2 = 55;
    public final static int SCM_CLS = 56;
    public final static int SCM_DOM1 = 57;
    public final static int SCM_DOM2 = 58;
    public final static int SCM_DP = 59;
    public final static int SCM_EQC1 = 60;
    public final static int SCM_EQC2 = 61;
    public final static int SCM_EQP1 = 62;
    public final static int SCM_EQP2 = 63;
    public final static int SCM_HV = 64;
    public final static int SCM_INT = 65;
    public final static int SCM_OP = 66;
    public final static int SCM_RNG1 = 67;
    public final static int SCM_RNG2 = 68;
    public final static int SCM_SCO = 69;
    public final static int SCM_SPO = 70;
    public final static int SCM_SVF1 = 71;
    public final static int SCM_SVF2 = 72;
    public final static int SCM_UNI = 73;

    /**************************************/
    /* MAP FOR RULES NAMES */
    /**************************************/
    public static HashMap<Integer, String> rulesNames = new HashMap<Integer, String>();
    static {
        rulesNames.put(CAX_ADC, "CAX_ADC");
        rulesNames.put(CAX_DW, "CAX_DW");
        rulesNames.put(CAX_EQC1, "CAX_EQC1");
        rulesNames.put(CAX_EQC2, "CAX_EQC2");
        rulesNames.put(CAX_SCO, "CAX_SCO");
        rulesNames.put(CLS_AVF, "CLS_AVF");
        rulesNames.put(CLS_COM, "CLS_COM");
        rulesNames.put(CLS_HV1, "CLS_HV1");
        rulesNames.put(CLS_HV2, "CLS_HV2");
        rulesNames.put(CLS_INT1, "CLS_INT1");
        rulesNames.put(CLS_INT2, "CLS_INT2");
        rulesNames.put(CLS_MAXC1, "CLS_MAXC1");
        rulesNames.put(CLS_MAXC2, "CLS_MAXC2");
        rulesNames.put(CLS_MAXQC1, "CLS_MAXQC1");
        rulesNames.put(CLS_MAXQC2, "CLS_MAXQC2");
        rulesNames.put(CLS_MAXQC3, "CLS_MAXQC3");
        rulesNames.put(CLS_MAXQC4, "CLS_MAXQC4");
        rulesNames.put(CLS_NOTHING1, "CLS_NOTHING1");
        rulesNames.put(CLS_NOTHING2, "CLS_NOTHING2");
        rulesNames.put(CLS_OO, "CLS_OO");
        rulesNames.put(CLS_SVF1, "CLS_SVF1");
        rulesNames.put(CLS_SVF2, "CLS_SVF2");
        rulesNames.put(CLS_THING, "CLS_THING");
        rulesNames.put(CLS_UNI, "CLS_UNI");
        rulesNames.put(EQ_DIFF1, "EQ_DIFF1");
        rulesNames.put(EQ_DIFF2, "EQ_DIFF2");
        rulesNames.put(EQ_DIFF3, "EQ_DIFF3");
        rulesNames.put(EQ_REP_O, "EQ_REP_O");
        rulesNames.put(EQ_REP_P, "EQ_REP_P");
        rulesNames.put(EQ_REP_S, "EQ_REP_S");
        rulesNames.put(EQ_REF, "EQ_REF");
        rulesNames.put(EQ_SYM, "EQ_SYM");
        rulesNames.put(EQ_TRANS, "EQ_TRANS");
        rulesNames.put(PRP_ADP, "PRP_ADP");
        rulesNames.put(PRP_AP, "PRP_AP");
        rulesNames.put(PRP_ASYP, "PRP_ASYP");
        rulesNames.put(PRP_DOM, "PRP_DOM");
        rulesNames.put(PRP_EQP1, "PRP_EQP1");
        rulesNames.put(PRP_EQP2, "PRP_EQP2");
        rulesNames.put(PRP_FP, "PRP_FP");
        rulesNames.put(PRP_IFP, "PRP_IFP");
        rulesNames.put(PRP_INV1, "PRP_INV1");
        rulesNames.put(PRP_INV2, "PRP_INV2");
        rulesNames.put(PRP_IRP, "PRP_IRP");
        rulesNames.put(PRP_KEY, "PRP_KEY");
        rulesNames.put(PRP_NPA1, "PRP_NPA1");
        rulesNames.put(PRP_NPA2, "PRP_NPA2");
        rulesNames.put(PRP_PDW, "PRP_PDW");
        rulesNames.put(PRP_RNG, "PRP_RNG");
        rulesNames.put(PRP_SPO1, "PRP_SPO1");
        rulesNames.put(PRP_SPO2, "PRP_SPO2");
        rulesNames.put(PRP_SYMP, "PRP_SYMP");
        rulesNames.put(PRP_TRP, "PRP_TRP");
        rulesNames.put(SCM_AVF1, "SCM_AVF1");
        rulesNames.put(SCM_AVF2, "SCM_AVF2");
        rulesNames.put(SCM_CLS, "SCM_CLS");
        rulesNames.put(SCM_DOM1, "SCM_DOM1");
        rulesNames.put(SCM_DOM2, "SCM_DOM2");
        rulesNames.put(SCM_DP, "SCM_DP");
        rulesNames.put(SCM_EQC1, "SCM_EQC1");
        rulesNames.put(SCM_EQC2, "SCM_EQC2");
        rulesNames.put(SCM_EQP1, "SCM_EQP1");
        rulesNames.put(SCM_EQP2, "SCM_EQP2");
        rulesNames.put(SCM_HV, "SCM_HV");
        rulesNames.put(SCM_INT, "SCM_INT");
        rulesNames.put(SCM_OP, "SCM_OP");
        rulesNames.put(SCM_RNG1, "SCM_RNG1");
        rulesNames.put(SCM_RNG2, "SCM_RNG2");
        rulesNames.put(SCM_SCO, "SCM_SCO");
        rulesNames.put(SCM_SPO, "SCM_SPO");
        rulesNames.put(SCM_SVF1, "SCM_SVF1");
        rulesNames.put(SCM_SVF2, "SCM_SVF2");
        rulesNames.put(SCM_UNI, "SCM_UNI");
    }

}
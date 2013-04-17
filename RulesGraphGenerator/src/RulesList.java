import java.util.HashMap;

public class RulesList {

	/**************************************/
	/*     CONCEPTS USED FOR INFERENCE    */
	/**************************************/
	public final static int UNIVERSAL                     = 0;
	public final static int OWL_ALLDIFFERENT              = 1;
	public final static int OWL_ALLDISJOINTCLASSES        = 2;
	public final static int OWL_ALLDISJOINTPROPERTIES     = 3;
	public final static int OWL_ALLVALUESFROM             = 4;
	public final static int OWL_ANNOTATIONPROPERTY        = 5;
	public final static int OWL_ASSERTIONPROPERTY         = 6;
	public final static int OWL_ASYMETRICPROPERTY         = 7;
	public final static int OWL_CLASS                     = 8;
	public final static int OWL_COMPLEMENTOF              = 9;
	public final static int OWL_DIFFERENTFROM             = 10;
	public final static int OWL_DISJOINTWITH              = 11;
	public final static int OWL_DISTINCTMEMBERS           = 12;
	public final static int OWL_EQUIVALENTCLASS           = 13;
	public final static int OWL_EQUIVALENTPROPERTY        = 14;
	public final static int OWL_FUNCTIONALPROPERTY        = 15;
	public final static int OWL_HASKEY                    = 16;
	public final static int OWL_HASVALUE                  = 17;
	public final static int OWL_INTERSECTIONOF            = 18;
	public final static int OWL_INVERSEFUNCTIONALPROPERTY = 19;
	public final static int OWL_INVERSEOF                 = 20;
	public final static int OWL_IRREFLEXIVEPROPERTY       = 21;
	public final static int OWL_MAXCARDINALITY            = 22;
	public final static int OWL_MAXQUALIFIEDCARDINALITY   = 23;
	public final static int OWL_MEMBERS                   = 24;
	public final static int OWL_NOTHING                   = 25;
	public final static int OWL_OBJECTPROPERTY            = 26;
	public final static int OWL_ONCLASS                   = 27;
	public final static int OWL_ONEOF                     = 28;
	public final static int OWL_ONPROPERTY                = 29;
	public final static int OWL_PROPERTYCHAINAXIOM        = 30;
	public final static int OWL_PROPERTYDISJOINTWITH      = 31;
	public final static int OWL_SAMEAS                    = 32;
	public final static int OWL_SOMEVALUESFROM            = 33;
	public final static int OWL_SOURCEINDIVIDUAL          = 34;
	public final static int OWL_SYMETRICPROPERTY          = 35;
	public final static int OWL_TARGETINDIVIDUAL          = 36;
	public final static int OWL_TARGETVALUE               = 37;
	public final static int OWL_THING                     = 38;
	public final static int OWL_TRANSITIVEPROPERTY        = 39;
	public final static int OWL_UNIONOF                   = 40;
	public final static int RDFS_DOMAIN                   = 41;
	public final static int RDFS_RANGE                    = 42;
	public final static int RDFS_SUBCLASSOF               = 43;
	public final static int RDFS_SUBPROPERTYOF            = 44;
	public final static int RDF_DATATYPEPROPERTY          = 45;
	public final static int RDF_FIRST                     = 46;
	public final static int RDF_REST                      = 47;
	public final static int RDF_TYPE                      = 48;
	public final static int RDF_TYPEPROPERTY              = 49;
	
	

	/**************************************/
	/*        MAP FOR CONCEPTS NAMES      */
	/**************************************/
	public static HashMap<Integer,String> conceptsNames = new HashMap<Integer,String>();
	static{
		conceptsNames.put(0,"UNIVERSAL");
		conceptsNames.put(1,"OWL:ALLDIFFERENT");
		conceptsNames.put(2,"OWL:ALLDISJOINTCLASSES");
		conceptsNames.put(3,"OWL:ALLDISJOINTPROPERTIES");
		conceptsNames.put(4,"OWL:ALLVALUESFROM");
		conceptsNames.put(5,"OWL:ANNOTATIONPROPERTY");
		conceptsNames.put(6,"OWL:ASSERTIONPROPERTY");
		conceptsNames.put(7,"OWL:ASYMETRICPROPERTY");
		conceptsNames.put(8,"OWL:CLASS");
		conceptsNames.put(9,"OWL:COMPLEMENTOF");
		conceptsNames.put(10,"OWL:DIFFERENTFROM");
		conceptsNames.put(11,"OWL:DISJOINTWITH");
		conceptsNames.put(12,"OWL:DISTINCTMEMBERS");
		conceptsNames.put(13,"OWL:EQUIVALENTCLASS");
		conceptsNames.put(14,"OWL:EQUIVALENTPROPERTY");
		conceptsNames.put(15,"OWL:FUNCTIONALPROPERTY");
		conceptsNames.put(16,"OWL:HASKEY");
		conceptsNames.put(17,"OWL:HASVALUE");
		conceptsNames.put(18,"OWL:INTERSECTIONOF");
		conceptsNames.put(19,"OWL:INVERSEFUNCTIONALPROPERTY");
		conceptsNames.put(20,"OWL:INVERSEOF");
		conceptsNames.put(21,"OWL:IRREFLEXIVEPROPERTY");
		conceptsNames.put(22,"OWL:MAXCARDINALITY");
		conceptsNames.put(23,"OWL:MAXQUALIFIEDCARDINALITY");
		conceptsNames.put(24,"OWL:MEMBERS");
		conceptsNames.put(25,"OWL:NOTHING");
		conceptsNames.put(26,"OWL:OBJECTPROPERTY");
		conceptsNames.put(27,"OWL:ONCLASS");
		conceptsNames.put(28,"OWL:ONEOF");
		conceptsNames.put(29,"OWL:ONPROPERTY");
		conceptsNames.put(30,"OWL:PROPERTYCHAINAXIOM");
		conceptsNames.put(31,"OWL:PROPERTYDISJOINTWITH");
		conceptsNames.put(32,"OWL:SAMEAS");
		conceptsNames.put(33,"OWL:SOMEVALUESFROM");
		conceptsNames.put(34,"OWL:SOURCEINDIVIDUAL");
		conceptsNames.put(35,"OWL:SYMETRICPROPERTY");
		conceptsNames.put(36,"OWL:TARGETINDIVIDUAL");
		conceptsNames.put(37,"OWL:TARGETVALUE");
		conceptsNames.put(38,"OWL:THING");
		conceptsNames.put(39,"OWL:TRANSITIVEPROPERTY");
		conceptsNames.put(40,"OWL:UNIONOF");
		conceptsNames.put(41,"RDFS:DOMAIN");
		conceptsNames.put(42,"RDFS:RANGE");
		conceptsNames.put(43,"RDFS:SUBCLASSOF");
		conceptsNames.put(44,"RDFS:SUBPROPERTYOF");
		conceptsNames.put(45,"RDF:DATATYPEPROPERTY");
		conceptsNames.put(46,"RDF:FIRST");
		conceptsNames.put(47,"RDF:REST");
		conceptsNames.put(48,"RDF:TYPE");
		conceptsNames.put(49,"RDF:TYPEPROPERTY");
	}


	/**************************************/
	/*        FRAGMENTS DEFINITIONS       */
	/**************************************/
	public static int[] RDF={
		RDF_TYPE,
		RDF_TYPEPROPERTY
	};
	
	public static int[] RDFS={
		RDFS_DOMAIN,
		RDFS_RANGE,
		RDFS_SUBCLASSOF,
		RDFS_SUBPROPERTYOF,
		RDF_TYPE,
		RDF_FIRST,
		RDF_REST,
		RDF_DATATYPEPROPERTY,
		RDF_TYPEPROPERTY
	};
	
	public static int[] OWL_FULL={OWL_ALLDIFFERENT,
		OWL_ALLDISJOINTCLASSES,
		OWL_ALLDISJOINTPROPERTIES,
		OWL_ALLVALUESFROM,
		OWL_ANNOTATIONPROPERTY,
		OWL_ASSERTIONPROPERTY,
		OWL_ASYMETRICPROPERTY,
		OWL_CLASS,
		OWL_COMPLEMENTOF,
		OWL_DIFFERENTFROM,
		OWL_DISJOINTWITH,
		OWL_DISTINCTMEMBERS,
		OWL_EQUIVALENTCLASS,
		OWL_EQUIVALENTPROPERTY,
		OWL_FUNCTIONALPROPERTY,
		OWL_HASKEY,
		OWL_HASVALUE,
		OWL_INTERSECTIONOF,
		OWL_INVERSEFUNCTIONALPROPERTY,
		OWL_INVERSEOF,
		OWL_IRREFLEXIVEPROPERTY,
		OWL_MAXCARDINALITY,
		OWL_MAXQUALIFIEDCARDINALITY,
		OWL_MEMBERS,
		OWL_NOTHING,
		OWL_OBJECTPROPERTY,
		OWL_ONCLASS,
		OWL_ONEOF,
		OWL_ONPROPERTY,
		OWL_PROPERTYCHAINAXIOM,
		OWL_PROPERTYDISJOINTWITH,
		OWL_SAMEAS,
		OWL_SOMEVALUESFROM,
		OWL_SOURCEINDIVIDUAL,
		OWL_SYMETRICPROPERTY,
		OWL_TARGETINDIVIDUAL,
		OWL_TARGETVALUE,
		OWL_THING,
		OWL_TRANSITIVEPROPERTY,
		OWL_UNIONOF,
		RDFS_DOMAIN,
		RDFS_RANGE,
		RDFS_SUBCLASSOF,
		RDFS_SUBPROPERTYOF,
		RDF_DATATYPEPROPERTY,
		RDF_FIRST,
		RDF_REST,
		RDF_TYPE,
		RDF_TYPEPROPERTY
	};

	public static int[] OWL_HORST={
		OWL_ALLVALUESFROM,
		OWL_CLASS,
		OWL_DIFFERENTFROM,
		OWL_DISJOINTWITH,
		OWL_EQUIVALENTCLASS,
		OWL_EQUIVALENTPROPERTY,
		OWL_FUNCTIONALPROPERTY,
		OWL_HASVALUE,
		OWL_INVERSEFUNCTIONALPROPERTY,
		OWL_INVERSEOF,
		OWL_ONPROPERTY,
		OWL_SAMEAS,
		OWL_SOMEVALUESFROM,
		OWL_SYMETRICPROPERTY,
		OWL_EQUIVALENTCLASS,
		OWL_EQUIVALENTPROPERTY,
		RDFS_SUBCLASSOF,
		RDFS_SUBPROPERTYOF,
		RDF_TYPE		
	};

	public static int[] OWL_LITE={
		OWL_CLASS,
		OWL_THING,
		OWL_NOTHING,
		OWL_EQUIVALENTCLASS,
		OWL_EQUIVALENTPROPERTY,
		OWL_SAMEAS,
		OWL_DIFFERENTFROM,
		OWL_ALLDIFFERENT,
		OWL_DISTINCTMEMBERS,
		OWL_INVERSEOF,
		OWL_TRANSITIVEPROPERTY,
		OWL_SYMETRICPROPERTY,
		OWL_FUNCTIONALPROPERTY,
		OWL_INVERSEFUNCTIONALPROPERTY,
		OWL_ONPROPERTY,
		OWL_ALLVALUESFROM,
		OWL_SOMEVALUESFROM,
		OWL_MAXCARDINALITY,
		OWL_INTERSECTIONOF,
		OWL_ANNOTATIONPROPERTY,
		RDFS_DOMAIN,
		RDFS_RANGE,
		RDFS_SUBCLASSOF,
		RDFS_SUBPROPERTYOF		
	};
	
	/**************************************/
	/*      RULES USED FOR INFERENCE      */
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
	//public final static int CLS_NOTHING1 = 18;
	public final static int CLS_NOTHING2 = 19;
	public final static int CLS_OO = 20;
	public final static int CLS_SVF1 = 21;
	public final static int CLS_SVF2 = 22;
	//public final static int CLS_THING = 23;
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
	/*          MAP FOR RULES NAMES       */
	/**************************************/
	public static HashMap<Integer,String> rulesNames = new HashMap<Integer,String>();
	static{
		rulesNames.put(1,"CAX_ADC");
		rulesNames.put(2,"CAX_DW");
		rulesNames.put(3,"CAX_EQC1");
		rulesNames.put(4,"CAX_EQC2");
		rulesNames.put(5,"CAX_SCO");
		rulesNames.put(6,"CLS_AVF");
		rulesNames.put(7,"CLS_COM");
		rulesNames.put(8,"CLS_HV1");
		rulesNames.put(9,"CLS_HV2");
		rulesNames.put(10,"CLS_INT1");
		rulesNames.put(11,"CLS_INT2");
		rulesNames.put(12,"CLS_MAXC1");
		rulesNames.put(13,"CLS_MAXC2");
		rulesNames.put(14,"CLS_MAXQC1");
		rulesNames.put(15,"CLS_MAXQC2");
		rulesNames.put(16,"CLS_MAXQC3");
		rulesNames.put(17,"CLS_MAXQC4");
		rulesNames.put(18,"CLS_NOTHING1");
		rulesNames.put(19,"CLS_NOTHING2");
		rulesNames.put(20,"CLS_OO");
		rulesNames.put(21,"CLS_SVF1");
		rulesNames.put(22,"CLS_SVF2");
		rulesNames.put(23,"CLS_THING");
		rulesNames.put(24,"CLS_UNI");
		rulesNames.put(25,"EQ_DIFF1");
		rulesNames.put(26,"EQ_DIFF2");
		rulesNames.put(27,"EQ_DIFF3");
		rulesNames.put(28,"EQ_REP_O");
		rulesNames.put(29,"EQ_REP_P");
		rulesNames.put(30,"EQ_REP_S");
		rulesNames.put(31,"EQ_REF");
		rulesNames.put(32,"EQ_SYM");
		rulesNames.put(33,"EQ_TRANS");
		rulesNames.put(34,"PRP_ADP");
		rulesNames.put(35,"PRP_AP");
		rulesNames.put(36,"PRP_ASYP");
		rulesNames.put(37,"PRP_DOM");
		rulesNames.put(38,"PRP_EQP1");
		rulesNames.put(39,"PRP_EQP2");
		rulesNames.put(40,"PRP_FP");
		rulesNames.put(41,"PRP_IFP");
		rulesNames.put(42,"PRP_INV1");
		rulesNames.put(43,"PRP_INV2");
		rulesNames.put(44,"PRP_IRP");
		rulesNames.put(45,"PRP_KEY");
		rulesNames.put(46,"PRP_NPA1");
		rulesNames.put(47,"PRP_NPA2");
		rulesNames.put(48,"PRP_PDW");
		rulesNames.put(49,"PRP_RNG");
		rulesNames.put(50,"PRP_SPO1");
		rulesNames.put(51,"PRP_SPO2");
		rulesNames.put(52,"PRP_SYMP");
		rulesNames.put(53,"PRP_TRP");
		rulesNames.put(54,"SCM_AVF1");
		rulesNames.put(55,"SCM_AVF2");
		rulesNames.put(56,"SCM_CLS");
		rulesNames.put(57,"SCM_DOM1");
		rulesNames.put(58,"SCM_DOM2");
		rulesNames.put(59,"SCM_DP");
		rulesNames.put(60,"SCM_EQC1");
		rulesNames.put(61,"SCM_EQC2");
		rulesNames.put(62,"SCM_EQP1");
		rulesNames.put(63,"SCM_EQP2");
		rulesNames.put(64,"SCM_HV");
		rulesNames.put(65,"SCM_INT");
		rulesNames.put(66,"SCM_OP");
		rulesNames.put(67,"SCM_RNG1");
		rulesNames.put(68,"SCM_RNG2");
		rulesNames.put(69,"SCM_SCO");
		rulesNames.put(70,"SCM_SPO");
		rulesNames.put(71,"SCM_SVF1");
		rulesNames.put(72,"SCM_SVF2");
		rulesNames.put(73,"SCM_UNI");
	}


}
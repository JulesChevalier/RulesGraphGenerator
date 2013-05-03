/**
 * Triple.java
 * 
 * Represent the concepts used by a triple.
 * 's' 'p' and 'o' respectively represent the subject,
 * the predicate, and the object. They are integers 
 * which refer to the name map. 
 * A 0(zero) represent a universal concept
 * 		for example : "x owl:sameAs y" is represented
 * 		by s=0, p=32, p=0
 * 
 * @author Jules Chevalier
 */
public class Triple {

	private int s, p, o;

	/**
	 * Class constructor
	 * 
	 * @param s Code of the subject
	 * @param p Code of the predicate
	 * @param o Code of the object
	 */
	public Triple(int s, int p, int o) {
		super();
		this.s = s;
		this.p = p;
		this.o = o;
	}
	
	/**
	 * GETTERS AND SETTERS
	 **/

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getO() {
		return o;
	}

	public void setO(int o) {
		this.o = o;
	}

	
	/**
	 * @return the number of Non-Universal concepts
	 * i.e. different from 0(zero)
	 */
	public int nonUniversalConcepts(){
		int nuc = 0;
		int uni=RulesList.UNIVERSAL;
		if(this.s!=uni) nuc++;
		if(this.p!=uni) nuc++;
		if(this.o!=uni) nuc++;
		return nuc;
	}
	
	
	/**
	 * @return true if the concept is universal 
	 * 			i.e. its predicate is 0(zero)
	 * 			false else
	 */
	public boolean isUniversal(){
		return (this.p==RulesList.UNIVERSAL);
	}
	
	/**
	 * @param concepts to be checked
	 * @return true if all concepts 
	 * 			of the list are in 
	 * 			this triple 
	 */
	public boolean isValidWith(int[] concepts){
		if(this.isUniversal())
			return true;
		int finded = 0;
		for (int concept : concepts) {
			if(s==concept || p==concept || o==concept){
				finded++;
			}
		}
		return finded==this.nonUniversalConcepts();
	}

	/**
	 * @param in Triple to be checked with
	 * @param acceptUniversal True if universal match are accepted, False else
	 * @return true if this triple is compatible with 'in'
	 */
	public boolean matchWith(Triple in, boolean acceptUniversal) {
		if(acceptUniversal && (this.isUniversal() || in.isUniversal()))
			return true;
		int s1=this.s, s2=in.s, p1=this.p, p2=in.p, o1=this.o, o2=in.o;
		int uni=RulesList.UNIVERSAL;
		if((s1==uni || s2==uni || s1==s2) &&
		    (p1==p2) &&
		    (o1==uni || o2==uni || o1==o2))
			return true;
		return false;
	}
	
	@Override
	public String toString(){
		//return "("+this.s+","+this.p+","+this.o+")";
		if(this.isUniversal())
			return "("+RulesList.conceptsNames.get(RulesList.UNIVERSAL)+")";
		return "("+RulesList.conceptsNames.get(this.s)+","+RulesList.conceptsNames.get(this.p)+","+RulesList.conceptsNames.get(this.o)+")";
	}
	
}

public class Triple {

	private int s, p, o;

	public Triple(int s, int p, int o) {
		super();
		this.s = s;
		this.p = p;
		this.o = o;
	}

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
	
	public int nonUniversalConcepts(){
		int nuc = 0;
		int uni=RulesList.UNIVERSAL;
		if(this.s!=uni) nuc++;
		if(this.p!=uni) nuc++;
		if(this.o!=uni) nuc++;
		return nuc;
	}
	
	public boolean isUniversal(){
		return (this.p==RulesList.UNIVERSAL);
	}
	
	public String toString(){
		//return "("+this.s+","+this.p+","+this.o+")";
		if(this.isUniversal())
			return "("+RulesList.conceptsNames.get(RulesList.UNIVERSAL)+")";
		return "("+RulesList.conceptsNames.get(this.s)+","+RulesList.conceptsNames.get(this.p)+","+RulesList.conceptsNames.get(this.o)+")";
	}

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
	
}

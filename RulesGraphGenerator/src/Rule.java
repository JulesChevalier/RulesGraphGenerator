import java.util.ArrayList;

public class Rule {

	private static final Exception TripleFormatException = new Exception("Triples must be like \"(s p o)*\"");
	private int code;
	private ArrayList<Triple> in;
	private ArrayList<Triple> out;
	
	public Rule(int code, int[] in, int[] out) throws Exception{
		super();
		this.code = code;
		
		if(in.length%3!=0 || out.length%3!=0){
			throw TripleFormatException;
		}
		
		this.in = new ArrayList<Triple>();
		for (int i=0; i<in.length; i+=3) {
			this.in.add(new Triple(in[i], in[i+1], in[i+2]));
		}
		
		this.out = new ArrayList<Triple>();
		for (int i=0; i<out.length; i+=3) {
			this.out.add(new Triple(out[i], out[i+1], out[i+2]));			
		}
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public ArrayList<Triple> getIn() {
		return in;
	}
	public void setIn(ArrayList<Triple> in) {
		this.in = in;
	}
	public ArrayList<Triple> getOut() {
		return out;
	}
	public void setOut(ArrayList<Triple> out) {
		this.out = out;
	}

	public boolean canBeExecutedWith(int[] concepts){
		for (Triple triple : this.in) {
			if(!triple.isValidWith(concepts))
				return false;
		}
		return true;
	}
	
	public boolean matchWIth(Rule rule, boolean acceptUniversal){
		for (Triple out : this.out) {
			for (Triple in : rule.getIn()) {
				if(!out.matchWith(in,acceptUniversal))
					return false;
			}
		}
		return true;
	}
	
	public String toString(){
		String r="\t\t\t"+RulesList.rulesNames.get(this.code)+"\n";
		r+="IN:  ";
		for (Triple triple : this.in) {
			r+=triple;
		}
		r+="\n";
		r+="OUT: ";
		for (Triple triple : this.out) {
			r+=triple;
		}
		r+="\n";
		return r;
	}
}

import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;

/**
 * Graphical interface for graph generation
 *
 * @author Jules Chevalier
 */
public class JGenerator extends javax.swing.JFrame {
	

	private static final long serialVersionUID = -2157389478824597882L;
	
	// Variables declaration          
	private javax.swing.JButton generateGraphButton;
	private javax.swing.JCheckBox rdfsCheckBox;
	private javax.swing.JCheckBox horstCheckBox;
	private javax.swing.JCheckBox liteCheckBox;
	private javax.swing.JCheckBox fullCheckBox;
	private javax.swing.JCheckBox universalCheckBox;
	private javax.swing.JComboBox<String> outputFormat;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel rulesLabel;
	private javax.swing.JList<Line> conceptsList;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea usedRules;
	// End of variables declaration 

	/**
	 * Creates new form JFrame
	 */
	public JGenerator() {
		super("Inference Graph Generator");
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		rdfsCheckBox = new javax.swing.JCheckBox();
		horstCheckBox = new javax.swing.JCheckBox();
		liteCheckBox = new javax.swing.JCheckBox();
		fullCheckBox = new javax.swing.JCheckBox();
		jLabel2 = new javax.swing.JLabel();
		universalCheckBox = new javax.swing.JCheckBox();
		jLabel3 = new javax.swing.JLabel();
		outputFormat = new javax.swing.JComboBox<String>();
		generateGraphButton = new javax.swing.JButton();
		rulesLabel = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		usedRules = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		conceptsList = new javax.swing.JList<Line>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(600, 600));
		setLocation(50, 50);

		jLabel1.setText("Predefined Fragments");
		
		/**
		 * Check boxes to choose pre defined fragments
		 */

		rdfsCheckBox.setText("RDFS");
		rdfsCheckBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdfsCheckBoxActionPerformed(evt);
			}
		});

		horstCheckBox.setText("OWL Horst");
		horstCheckBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				horstCheckBoxActionPerformed(evt);
			}
		});

		liteCheckBox.setText("OWL-Lite");
		liteCheckBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				liteCheckBoxActionPerformed(evt);
			}
		});

		fullCheckBox.setText("OWL-Full");
		fullCheckBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fullCheckBoxActionPerformed(evt);
			}
		});
		
		/**
		 * Checkbox to choose if universal matches are accepted
		 */

		jLabel2.setText("Generation options");

		universalCheckBox.setText("Accept Universals");
		universalCheckBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				universalCheckBoxActionPerformed(evt);
			}
		});
		
		/**
		 * Combobox for output format of graph
		 */

		jLabel3.setText("Output Format");

		outputFormat.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "pdf","dot","fig","gif","ps","svg","png","plain" }));

		generateGraphButton.setText("Generate Graph");
		generateGraphButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				generateGraphButtonActionPerformed(evt);
			}
		});

		rulesLabel.setText("Used rules");

		usedRules.setEditable(false);
		usedRules.setColumns(10);
		usedRules.setRows(5);
		usedRules.setMinimumSize(new java.awt.Dimension(0, 10));
		jScrollPane1.setViewportView(usedRules);
		updateUsedRules();
		
		/**
		 * List of concepts construction
		 **/
		final Line[] lines = new Line[RulesList.conceptsNames.size()];
		for (Integer i : RulesList.conceptsNames.keySet()) {
			if(i!=0)
				lines[i]=new Line(i,RulesList.conceptsNames.get(i));
		}
		conceptsList.setModel(new javax.swing.AbstractListModel() {
			Line[] l = lines;
			public int getSize() { return l.length; }
			public Object getElementAt(int i) { return l[i]; }
		});
		conceptsList.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				conceptsListClicked(e);
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		conceptsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		/**
		 * Generated stuff for GUI
		 */
		jScrollPane2.setViewportView(conceptsList);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2)
								.addComponent(jLabel1)
								.addComponent(rulesLabel)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel3Layout.createSequentialGroup()
														.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(rdfsCheckBox)
																.addComponent(horstCheckBox))
																.addGap(25, 25, 25)
																.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(liteCheckBox)
																		.addComponent(fullCheckBox)))
																		.addComponent(universalCheckBox)
																		.addGroup(jPanel3Layout.createSequentialGroup()
																				.addComponent(outputFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(jLabel3))
																				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																						.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
																						.addComponent(generateGraphButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))))
																						.addGap(18, 18, 18)
																						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(rdfsCheckBox)
												.addComponent(liteCheckBox))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(horstCheckBox)
														.addComponent(fullCheckBox))
														.addGap(23, 23, 23)
														.addComponent(jLabel2)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(universalCheckBox)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(outputFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel3))
																.addGap(14, 14, 14)
																.addComponent(rulesLabel)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(generateGraphButton))
																.addComponent(jScrollPane2))
																.addContainerGap())
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
						.addContainerGap())
				);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>                        

	/**
	 * Called when an element in the concept list is clicked
	 * @param evt
	 */
	private void conceptsListClicked(MouseEvent evt) {
		updateUsedRules();
	}

	/**
	 * Update the list of used rules depending on the selected concepts
	 */
	private void updateUsedRules() {
		/* Get the selected concepts' codes */
		int[] concepts = new int[this.conceptsList.getSelectedValuesList().size()];
		int i=0;
		for (Line line : this.conceptsList.getSelectedValuesList()) {
			concepts[i]=line.code;
			i++;
		}
		/*Get the rules used with the selected concepts*/
		ArrayList<Rule> rules = Generator.filtredRulesList(concepts);
		/*List of rules construction*/
		String list="";
		for (Rule rule : rules) {
			list+=(RulesList.rulesNames.get(rule.getCode()));
			list+="\n";
		}
		/*Print the list on the GUI*/
		this.usedRules.setText(list);
		this.rulesLabel.setText("Used rules("+rules.size()+")");
	}

	/**
	 * @param fragment Select the concepts of this fragment
	 * 			in the concepts list
	 */
	private void setFragmentTo(int[] fragment){
		this.conceptsList.setSelectedIndices(fragment);
	}

	/**
	 * Methods called when a fragment is chosen
	 * Select the fragment in the list and un check
	 * others fragments' checkbox
	 */
	private void liteCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
		if(((JCheckBox)evt.getSource()).isSelected()){
			setFragmentTo(RulesList.OWL_LITE);
			this.fullCheckBox.setSelected(false);
			this.rdfsCheckBox.setSelected(false);
			this.horstCheckBox.setSelected(false);
		}
		else
			setFragmentTo(new int[0]);
		updateUsedRules();
	}                                          

	private void rdfsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
		if(((JCheckBox)evt.getSource()).isSelected()){
			setFragmentTo(RulesList.RDFS);   
			this.fullCheckBox.setSelected(false);
			this.liteCheckBox.setSelected(false);
			this.horstCheckBox.setSelected(false);
		}
		else
			setFragmentTo(new int[0]);   
		updateUsedRules();
	}                                          

	private void horstCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {  
		if(((JCheckBox)evt.getSource()).isSelected()) { 
			setFragmentTo(RulesList.OWL_HORST);  
			this.fullCheckBox.setSelected(false);
			this.rdfsCheckBox.setSelected(false);
			this.liteCheckBox.setSelected(false);
		} 
		else
			setFragmentTo(new int[0]);
		updateUsedRules();
	}                                          

	private void fullCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {  
		if(((JCheckBox)evt.getSource()).isSelected()) {      
			setFragmentTo(RulesList.OWL_FULL);
			this.liteCheckBox.setSelected(false);
			this.rdfsCheckBox.setSelected(false);
			this.horstCheckBox.setSelected(false);
		}
		else
			setFragmentTo(new int[0]);
		updateUsedRules();
	}                                          

	private void universalCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {  
	}                                          

	/**
	 * Called when the "Generate" button is clicked
	 * Generates the graph according to selected options
	 * 
	 * @param evt
	 */
	private void generateGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {
		/*Get the codes of the selected concepts*/
		int[] concepts = new int[this.conceptsList.getSelectedValuesList().size()];
		int i=0;
		for (Line line : this.conceptsList.getSelectedValuesList()) {
			concepts[i]=line.code;i++;
		}
		/*Get the rules applicable with the selected concepts*/
		ArrayList<Rule> rules = Generator.filtredRulesList(concepts);
		/*Generate the inference graph*/
		GraphViz graph = Generator.generateGraph(rules, this.universalCheckBox.isSelected());
		/*Write the graph in a temporary file and open it*/
		try {
			File outGraphFile = File.createTempFile("JGenerator_graph", "."+(String)this.outputFormat.getSelectedItem());
			System.out.println("Write graph in "+outGraphFile.getAbsolutePath());
			graph.writeGraphToFile( graph.getGraph( graph.getDotSource(), (String)this.outputFormat.getSelectedItem() ), outGraphFile.getAbsolutePath() );
		    Desktop.getDesktop().open(outGraphFile);
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}                                        

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JGenerator().setVisible(true);
			}
		});
	}
	
	
	/**
	 * Easier way to store the concepts with their code
	 * in the list
	 * 
	 * @author jules
	 */
	private class Line{
		public int code;
		public String name;
		public Line(int c, String n){
			this.code=c;
			this.name=n;
		}
		public String toString(){
			return this.name;
		}
	}
	
}

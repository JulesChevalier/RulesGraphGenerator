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
        this.initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        this.jPanel3 = new javax.swing.JPanel();
        this.jLabel1 = new javax.swing.JLabel();
        this.rdfsCheckBox = new javax.swing.JCheckBox();
        this.horstCheckBox = new javax.swing.JCheckBox();
        this.liteCheckBox = new javax.swing.JCheckBox();
        this.fullCheckBox = new javax.swing.JCheckBox();
        this.jLabel2 = new javax.swing.JLabel();
        this.universalCheckBox = new javax.swing.JCheckBox();
        this.jLabel3 = new javax.swing.JLabel();
        this.outputFormat = new javax.swing.JComboBox<String>();
        this.generateGraphButton = new javax.swing.JButton();
        this.rulesLabel = new javax.swing.JLabel();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.usedRules = new javax.swing.JTextArea();
        this.jScrollPane2 = new javax.swing.JScrollPane();
        this.conceptsList = new javax.swing.JList<Line>();

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new java.awt.Dimension(600, 600));
        this.setLocation(100, 100);

        this.jLabel1.setText("Predefined Fragments");

        /**
         * Check boxes to choose pre defined fragments
         */

        this.rdfsCheckBox.setText("RDFS");
        this.rdfsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                JGenerator.this.rdfsCheckBoxActionPerformed(evt);
            }
        });

        this.horstCheckBox.setText("OWL Horst");
        this.horstCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                JGenerator.this.horstCheckBoxActionPerformed(evt);
            }
        });

        this.liteCheckBox.setText("OWL-Lite");
        this.liteCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                JGenerator.this.liteCheckBoxActionPerformed(evt);
            }
        });

        this.fullCheckBox.setText("OWL-Full");
        this.fullCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                JGenerator.this.fullCheckBoxActionPerformed(evt);
            }
        });

        /**
         * Checkbox to choose if universal matches are accepted
         */

        this.jLabel2.setText("Generation options");

        this.universalCheckBox.setText("Accept Universals");
        this.universalCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                JGenerator.this.universalCheckBoxActionPerformed(evt);
            }
        });

        /**
         * Combobox for output format of graph
         */

        this.jLabel3.setText("Output Format");

        this.outputFormat.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "pdf", "dot", "fig", "gif", "ps", "svg", "png", "plain" }));

        this.generateGraphButton.setText("Generate Graph");
        this.generateGraphButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                JGenerator.this.generateGraphButtonActionPerformed(evt);
            }
        });

        this.rulesLabel.setText("Used rules");

        this.usedRules.setEditable(false);
        this.usedRules.setColumns(10);
        this.usedRules.setRows(5);
        this.usedRules.setMinimumSize(new java.awt.Dimension(0, 10));
        this.jScrollPane1.setViewportView(this.usedRules);
        this.updateUsedRules();

        /**
         * List of concepts construction
         **/
        final Line[] lines = new Line[RulesList.conceptsNames.size()];
        for (final Integer i : RulesList.conceptsNames.keySet()) {
            if (i != 0) {
                lines[i] = new Line(i, RulesList.conceptsNames.get(i));
            }
        }
        this.conceptsList.setModel(new javax.swing.AbstractListModel() {
            private static final long serialVersionUID = 754542574013300229L;
            Line[] l = lines;

            @Override
            public int getSize() {
                return this.l.length;
            }

            @Override
            public Object getElementAt(final int i) {
                return this.l[i];
            }
        });
        this.conceptsList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                JGenerator.this.conceptsListClicked(e);
            }

            @Override
            public void mousePressed(final MouseEvent e) {
            }

            @Override
            public void mouseReleased(final MouseEvent e) {
            }

            @Override
            public void mouseEntered(final MouseEvent e) {
            }

            @Override
            public void mouseExited(final MouseEvent e) {
            }
        });
        this.conceptsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        /**
         * Generated stuff for GUI
         */
        this.jScrollPane2.setViewportView(this.conceptsList);

        final javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                jPanel3Layout
                        .createSequentialGroup()
                        .addGroup(
                                jPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(this.jLabel2)
                                        .addComponent(this.jLabel1)
                                        .addComponent(this.rulesLabel)
                                        .addGroup(
                                                jPanel3Layout
                                                        .createSequentialGroup()
                                                        .addContainerGap()
                                                        .addGroup(
                                                                jPanel3Layout
                                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(
                                                                                jPanel3Layout
                                                                                        .createSequentialGroup()
                                                                                        .addGroup(
                                                                                                jPanel3Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(this.rdfsCheckBox)
                                                                                                        .addComponent(this.horstCheckBox))
                                                                                        .addGap(25, 25, 25)
                                                                                        .addGroup(
                                                                                                jPanel3Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(this.liteCheckBox)
                                                                                                        .addComponent(this.fullCheckBox)))
                                                                        .addComponent(this.universalCheckBox)
                                                                        .addGroup(
                                                                                jPanel3Layout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(this.outputFormat,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(this.jLabel3))
                                                                        .addGroup(
                                                                                jPanel3Layout
                                                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(this.jScrollPane1,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                                        .addComponent(this.generateGraphButton,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18).addComponent(this.jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                jPanel3Layout
                        .createSequentialGroup()
                        .addGroup(
                                jPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel3Layout
                                                        .createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(this.jLabel1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(
                                                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(this.rdfsCheckBox).addComponent(this.liteCheckBox))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(
                                                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(this.horstCheckBox).addComponent(this.fullCheckBox))
                                                        .addGap(23, 23, 23)
                                                        .addComponent(this.jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(this.universalCheckBox)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(
                                                                jPanel3Layout
                                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(this.outputFormat, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(this.jLabel3)).addGap(14, 14, 14).addComponent(this.rulesLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(this.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(this.generateGraphButton)).addComponent(this.jScrollPane2)).addContainerGap()));

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE).addContainerGap()));
        this.getContentPane().setLayout(layout);

        this.pack();
    }// </editor-fold>

    /**
     * Called when an element in the concept list is clicked
     * 
     * @param evt
     */
    private void conceptsListClicked(final MouseEvent evt) {
        this.updateUsedRules();
    }

    /**
     * Update the list of used rules depending on the selected concepts
     */
    private void updateUsedRules() {
        /* Get the selected concepts' codes */
        final int[] concepts = new int[this.conceptsList.getSelectedValuesList().size()];
        int i = 0;
        for (final Line line : this.conceptsList.getSelectedValuesList()) {
            concepts[i] = line.code;
            i++;
        }
        /* Get the rules used with the selected concepts */
        final ArrayList<Rule> rules = Generator.filtredRulesList(concepts);
        /* List of rules construction */
        String list = "";
        for (final Rule rule : rules) {
            list += RulesList.rulesNames.get(rule.getCode());
            list += "\n";
        }
        /* Print the list on the GUI */
        this.usedRules.setText(list);
        this.rulesLabel.setText("Used rules(" + rules.size() + ")");
    }

    /**
     * @param fragment
     *            Select the concepts of this fragment
     *            in the concepts list
     */
    private void setFragmentTo(final int[] fragment) {
        this.conceptsList.setSelectedIndices(fragment);
    }

    /**
     * Methods called when a fragment is chosen
     * Select the fragment in the list and un check
     * others fragments' checkbox
     */
    private void liteCheckBoxActionPerformed(final java.awt.event.ActionEvent evt) {
        if (((JCheckBox) evt.getSource()).isSelected()) {
            this.setFragmentTo(RulesList.OWL_LITE);
            this.fullCheckBox.setSelected(false);
            this.rdfsCheckBox.setSelected(false);
            this.horstCheckBox.setSelected(false);
        } else {
            this.setFragmentTo(new int[0]);
        }
        this.updateUsedRules();
    }

    private void rdfsCheckBoxActionPerformed(final java.awt.event.ActionEvent evt) {
        if (((JCheckBox) evt.getSource()).isSelected()) {
            this.setFragmentTo(RulesList.RDFS);
            this.fullCheckBox.setSelected(false);
            this.liteCheckBox.setSelected(false);
            this.horstCheckBox.setSelected(false);
        } else {
            this.setFragmentTo(new int[0]);
        }
        this.updateUsedRules();
    }

    private void horstCheckBoxActionPerformed(final java.awt.event.ActionEvent evt) {
        if (((JCheckBox) evt.getSource()).isSelected()) {
            this.setFragmentTo(RulesList.OWL_HORST);
            this.fullCheckBox.setSelected(false);
            this.rdfsCheckBox.setSelected(false);
            this.liteCheckBox.setSelected(false);
        } else {
            this.setFragmentTo(new int[0]);
        }
        this.updateUsedRules();
    }

    private void fullCheckBoxActionPerformed(final java.awt.event.ActionEvent evt) {
        if (((JCheckBox) evt.getSource()).isSelected()) {
            this.setFragmentTo(RulesList.OWL_FULL);
            this.liteCheckBox.setSelected(false);
            this.rdfsCheckBox.setSelected(false);
            this.horstCheckBox.setSelected(false);
        } else {
            this.setFragmentTo(new int[0]);
        }
        this.updateUsedRules();
    }

    private void universalCheckBoxActionPerformed(final java.awt.event.ActionEvent evt) {
    }

    /**
     * Called when the "Generate" button is clicked
     * Generates the graph according to selected options
     * 
     * @param evt
     */
    private void generateGraphButtonActionPerformed(final java.awt.event.ActionEvent evt) {
        /* Get the codes of the selected concepts */
        final int[] concepts = new int[this.conceptsList.getSelectedValuesList().size()];
        int i = 0;
        for (final Line line : this.conceptsList.getSelectedValuesList()) {
            concepts[i] = line.code;
            i++;
        }
        /* Get the rules applicable with the selected concepts */
        final ArrayList<Rule> rules = Generator.filtredRulesList(concepts);

        // /*Generate the inference graph with Graphviz*/
        final GraphViz graph = Generator.generateGraph(rules, this.universalCheckBox.isSelected());
        /* Write the graph in a temporary file and open it */
        try {
            final File outGraphFile = File.createTempFile("JGenerator_graph", "." + (String) this.outputFormat.getSelectedItem());
            System.out.println("Write graph in " + outGraphFile.getAbsolutePath());
            graph.writeGraphToFile(graph.getGraph(graph.getDotSource(), (String) this.outputFormat.getSelectedItem()), outGraphFile.getAbsolutePath());
            Desktop.getDesktop().open(outGraphFile);
        } catch (final IOException ex) {
            ex.printStackTrace();
        }

        /* Generate the inference graph with Jung */
        // JunGererator.printGraph(Generator.generateJungGraph(rules, this.universalCheckBox.isSelected()));

    }

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(final String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed"
        // desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel
         * /plaf.html
         */
        try {
            for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final InstantiationException ex) {
            java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
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
    private class Line {
        public int code;
        public String name;

        public Line(final int c, final String n) {
            this.code = c;
            this.name = n;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

}

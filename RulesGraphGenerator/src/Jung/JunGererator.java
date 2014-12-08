/*
 * SimpleGraphView.java
 *
 * Created on March 8, 2007, 7:49 PM
 *
 * Copyright March 8, 2007 Grotto Networking
 */

package Jung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;

/**
 * 
 * @author Dr. Greg M. Bernstein
 */
public class JunGererator {

    /**
     * @param args
     *            the command line arguments
     */
    public static void printGraph(final Graph<String, String> graph) {

        // Layout<V, E>, VisualizationComponent<V,E>
        final Layout<String, String> layout = new KKLayout<>(graph);
        layout.setSize(new Dimension(300, 300));
        final VisualizationViewer<String, String> vv = new VisualizationViewer<String, String>(layout);
        vv.setPreferredSize(new Dimension(350, 350));
        // Setup up a new vertex to paint transformer...
        final Transformer<String, Paint> vertexPaint = new Transformer<String, Paint>() {
            @Override
            public Paint transform(final String i) {
                return Color.GREEN;
            }
        };
        // // Set up a new stroke Transformer for the edges
        // float dash[] = { 10.0f };
        // final Stroke edgeStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
        // BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f);
        // Transformer<String, Stroke> edgeStrokeTransformer = new
        // Transformer<String, Stroke>() {
        // public Stroke transform(String s) {
        // return edgeStroke;
        // }
        // };
        vv.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
        // vv.getRenderContext().setEdgeStrokeTransformer(edgeStrokeTransformer);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new Transformer<String, String>() {
            @Override
            public String transform(final String arg0) {
                return "";
            }
        });
        vv.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
        final DefaultModalGraphMouse gm = new DefaultModalGraphMouse();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        vv.setGraphMouse(gm);

        final JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }

}

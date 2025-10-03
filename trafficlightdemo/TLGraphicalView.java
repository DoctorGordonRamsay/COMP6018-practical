package trafficlightdemo;
/**
 *
 * @author 19214806
 */
import java.awt.PopupMenu;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;

public class TLGraphicalView implements Observer {

    private final TLModel model;
    
    public TLGraphicalView(TLModel model){
        this.model = model;
        JFrame frame = new JFrame("MVC Lights");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PopupMenu pane;
        frame.getContentPane().add(pane);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        model.addObserver(this);
        update(model,null);
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        pane.repaint();
    }
    
}

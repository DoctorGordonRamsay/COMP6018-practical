package trafficlightdemo;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author 19214806
 */
public class ColorPanel extends JPanel {
    private TLModel model;
    private static final Dimension COLOR_PANEL_SIZE = new Dimension(60,200);
    
    public ColorPanel(TLModel model){
        this.model = model;
    }
    
    @Override
    public Dimension getPreferredSize(){
        return COLOR_PANEL_SIZE;
    }
    
    @Override
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
    
    @Override
    public Dimension getMaximumSize() {
        return getPreferredSize();
    }

}

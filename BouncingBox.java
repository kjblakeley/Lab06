import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {
		for (BouncingFigure f : figures) {
			f.draw(g); f.move();
			
			if(f.lowerBorderCollision(getHeight())){
				f.setTrajectory(f.getTrajectory()+90);
			}
			if(f.rightBorderCollision(getWidth())){
				f.setTrajectory(f.getTrajectory()+90);
			}
			if(f.leftBorderCollision()){
				f.setTrajectory(f.getTrajectory()+90);
			}
			if(f.upperBorderCollision()){
				f.setTrajectory(f.getTrajectory()+90);
			}
			// Add code here for Lab Q5
			//
		}
	}
}

import javax.swing.JFrame;



public class BouncingFiguresTester {



	/**

	 * @param args

	 * @throws InterruptedException

	 */

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub



		
		JFrame frame= new JFrame();

		frame.setTitle("Mr Fresh Window");

		frame.setSize(600, 620);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		// Create a box to put all objects in

		BouncingBox box = new BouncingBox();


		// Add all the components to the box

		BouncingFigure figure1 = new BouncingRectangle(0, 0, 10, 10, -45.0, 150);

		box.add(figure1);

		BouncingFigure figure2 = new BouncingRectangle(0, 400, 10, 10, 45.0, 150);

		box.add(figure2);

		BouncingFigure figure3 = new BouncingRectangle(400, 0, 10, 10, 225, 150);

		box.add(figure3);

		BouncingFigure figure4 = new BouncingRectangle(400, 400, 10, 10, 135.0, 150);

		box.add(figure4);
		
		BouncingFigure figure5 = new BouncingCircle(100, 100, 20, 20, 45.0, 150);

		box.add(figure5);

		BouncingFigure figure6 = new BouncingCircle(500, 100, 15, 15, 135.0, 125);

		box.add(figure6);
		
		BouncingFigure figure7 = new BouncingCircle(400, 250, 10, 10, 170.0, 180);

		box.add(figure7);

		frame.add(box);


		// Make the frame visible

		frame.setVisible(true);


		// Continuously update the frame since some components will change position

		while(true) {

			try{

				Thread.sleep(100); // Wait for 0.1 second = 100 milliseconds

			}

			catch(InterruptedException e){}


			frame.repaint();


		} // end while



	}//end main



}//end class




/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:37 PM
 */
public class SE300RobotProject extends Class1 {

	public Flyers m_Flyers;
	public Audio m_Audio;
	public PathAlgorithm m_PathAlgorithm;
	public Room m_Room;
	public Robot m_Robot;

	public SE300RobotProject(){
		
		//here we create all of the panes for the gui 
		
		//panes for the home menu
		//this is the container pane that will pull in all the other panes for the home menu
		VBox homemenu = new VBox() ; 
		//this is the pane that will hold the title 
		VBox homemenu_titles = new VBox() ; 
		//this is the pane that will hold the buttons that will let the user choose which sim they run 
		HBox homemenu_simButtons = new HBox() ; 
		//this is the pane that holds the about button and the questions/how to button 
		HBox homemenu_information = new HBox() ; 
		
		//panes for the lehman atrium sim 
		//this is the container pane that will pull in all the other panes for the lehman atrium sim 
		VBox lehmanAtriumSim = new VBox() ;
		//This is the pane that will hold the titles 
		VBox lehmanAtriumSim_titles = new VBox() ; 
		//this is the pane that will hold lehmanAtriumSim_simulation and lehmanAtriumSim_userInput 
		HBox lehmanAtriumSim_content = new HBox() ; 
		//This is the pane that will hold the actual simulation that the user will watch 
		VBox lehmanAtriumSim_simulation = new VBox() ; 
		//this is the pane that will hold the user inputs and the run button 
		VBox lehmanAtriumSim_userInput = new VBox() ; 
		//this is the pane that will hold the back button, the about button, and the how to button
		HBox lehmanAtriumSim_information = new HBox() ; 
		
		//panes for the ecsse hallway sim
		//this is the container pane that will pull in all the other panes for the ecsse hallway sim
		VBox ecsseHallwaySim = new VBox() ;
		//This is the pane that will hold the titles 
		VBox ecsseHallwaySim_titles = new VBox() ; 
		//this is the pane that will hold ecsseHallwaySim_simulation and ecsseHallwaySim_userInput 
		HBox ecsseHallwaySim_content = new HBox() ; 
		//This is the pane that will hold the actual simulation that the user will watch 
		VBox ecsseHallwaySim_simulation = new VBox() ; 
		//this is the pane that will hold the user inputs and the run button 
		VBox ecsseHallwaySim_userInput = new VBox() ; 
		//this is the pane that will hold the back button, the about button, and the how to button
		HBox ecsseHallwaySim_information = new HBox() ; 
		
		//panes for the cob room sim 
		//this is the container pane that will pull in all the other panes for the cob room sim 
		VBox cob125Sim = new VBox() ;
		//This is the pane that will hold the titles 
		VBox cob125Sim_titles = new VBox() ; 
		//this is the pane that will hold lehmanAtriumSim_simulation and lehmanAtriumSim_userInput 
		HBox cob125Sim_content = new HBox() ; 
		//This is the pane that will hold the actual simulation that the user will watch 
		VBox cob125Sim_simulation = new VBox() ; 
		//this is the pane that will hold the user inputs and the run button 
		VBox cob125Sim_userInput = new VBox() ; 
		//this is the pane that will hold the back button, the about button, and the how to button
		HBox cob125Sim_information = new HBox() ; 
		
		
		//create all of the text for the gui 
		
		//text for the home menu
		//this is the title for the home menu 
		Text homemenu_title = new Text("ECSSE Robot Simulation") ;
		//this is the  subtitle for the home menu
		Text homemenu_subtitle = new Text("SE300 Fall 2015 Project")
		
		//text for the lehman atrium
		//this text is the title for the lehman atrium simulation 
		Text lehmanAtriumSim_title = new Text("Lehman Atrium Simulation") ; 
		
		//text for ecsse hallways 
		Text ecsseHallwaySim_title = new Text("ECSSE Hallway Simulation") ; 
		
		//this is the text that is for the cob simulation 
		Text cob125Sim_title = new Text("COB Room 125 Simulation") ; 
		
		
		//create all the buttons for the gui
		
		//buttons for the lehman atrium
		//this button will take you to the screen for the lehman atrium simulation from the home menu 
		Button lehmanAtriumSim_button = new Button("Lehman Atrium Simulation") ; 
		
		//this button will take you to the screen for the ECSSE Hallway simulation from the home menu
		Button ecsseHallwaySim_button = new Button("ECSSE Hallway Simulation") ; 
		
		//this is the button that will talk you to the cob simulation from the home menu
		Button cob125Sim_button = new Text("COB Room 125 Simulation") ; 
		
		
		
		
		

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end SE300RobotProject

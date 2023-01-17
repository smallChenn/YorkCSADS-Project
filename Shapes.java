//import all packages
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

public class Shapes extends Application {
	
	@Override
	public void start(Stage stage) {
		
		// create a Shapelabel hint
		Label shapeLabel = new Label("Enter an integer between 5 and 8.");
		
		// create a TextField for users to input
		TextField shapeField = new TextField();

		// set a proper width of TextField to make it looks tidy 
		shapeField.setMaxWidth(300);	

		// create a button for submitting
		Button shapeButton = new Button();	
		shapeButton.setText(" Generate a shape with input sides");
		
		
		// create a vertical container to hold the button box 
		VBox root = new VBox(50);
		root.setAlignment(Pos.CENTER);
		
		//add all displayed to the container
		root.getChildren().addAll(shapeLabel, shapeField, shapeButton);

		// create and configure a circle scene 
		Scene scene = new Scene(root, 500, 500);
		
		// add the scene to the stage, then set the title
		stage.setScene(scene);
		stage.setTitle("Cretae Your Shapes");
		
		// show the stage
		stage.show();

		// execute the code when the shapeButton is pressed
		shapeButton.setOnAction(e -> {
	        try {
	            
	            int num = Integer.parseInt(shapeField.getText());
	           
	            if (num ==5) 
	            {
	                  // Create a an object for Polygon and sets five coordinates to make a pentagon 
	                  Polygon pentagon = new Polygon();
	                  pentagon.getPoints().addAll(new Double[] {100.0, 0.0,200.0, 100.0,150.0, 200.0,50.0, 200.0,0.0, 100.0});
	                
	                  
	                // Using if/else conditions to fill with required color.
		                 if (num % 2 == 0) {                        
		                      pentagon.setFill(Color.RED);
		                  }
		                  else {
		                      pentagon.setFill(Color.BLACK);
		                  }             
		                 // display the shape
		                   root.getChildren().add(pentagon);	                  

	                 // remove text field and button so that the main screen only display one active shape at a time.
	                   root.getChildren().removeAll(shapeLabel, shapeField, shapeButton);
	           
	                   
	                // create a rotatelabel hint
	   				Label rotateLabel = new Label("Please rotate this shape");
	   				
	   			   // create a TextField for users to input
	   				TextField rotateField = new TextField();
	   				
	   			   // set a same width of rotateField as ShapeField
	   				rotateField.setMaxWidth(300);
	   				
	   				// create a button for submitting
	   				Button rotateButton = new Button();
	   				rotateButton.setText("Rotate this shape");
	   				
	   			   //add all displayed to the container
	   				root.getChildren().addAll(rotateLabel, rotateField, rotateButton);
	   				
	   			   // execute the code when the shapeButton is pressed
	   				rotateButton.setOnAction(e1 -> {
	   					
	   				// if-else statement to give proper respond 	
	   						if (rotateField.getText().equals("rotate the shape by 30 degrees")) {
		   						pentagon.getTransforms().add(new Rotate(45,100,100));
		   					} else if (rotateField.getText().equals("rotate the shape by 90 degrees")) {
		   						pentagon.getTransforms().add(new Rotate(90,100,100));
		   					} else if (rotateField.getText().equals("rotate the shape by minus 45 degrees")) {
		   						pentagon.getTransforms().add(new Rotate(-45,100,100));
		   					}
	   				//identify invalid input	
		   					else {
		   						Alert errorAlert = new Alert(AlertType.ERROR);
		   						errorAlert.setHeaderText("Invalid Entering");
		   						errorAlert.setContentText("This program only accept following input:rotate the shape by 30 degrees, rotate the shape by 90 degrees and rotate the shape by minus 45 degrees.");
		   						errorAlert.showAndWait();
		   					}
		   				 
	   					     
	   				});
	   				    
	   						
	   					}
	   					
	             
	            else if (num == 6) 
                {
                     // Create a an object for Polygon and set six coordinates to make a Hexagon.
                     
                     Polygon hexagon = new Polygon();
                     hexagon.getPoints().addAll(new Double[] {50.0, 0.0,150.0, 0.0,200.0, 100.0,150.0, 200.0,50.0, 200.0,0.0, 100.0 });
                     
                     
                   // Using if/else conditions set the fill colour.
                    if (num % 2 == 0) {                        
                         hexagon.setFill(Color.RED);
                     }
                     else {
                         hexagon.setFill(Color.BLACK);
                     }             
                    // display the shape
                      root.getChildren().add(hexagon);
                   // remove text field and button so that the main screen only display one active shape at a time.
	                  root.getChildren().removeAll(shapeLabel, shapeField, shapeButton);
	           
	                  
		                // create a rotatelabel hint
		   				Label rotateLabel = new Label("Please rotate this shape");
		   				
		   			   // create a TextField for users to input
		   				TextField rotateField = new TextField();
		   				
		   			   // set a same width of rotateField as ShapeField
		   				rotateField.setMaxWidth(300);
		   				
		   				// create a button for submitting
		   				Button rotateButton = new Button();
		   				rotateButton.setText("Rotate this shape");
		   				
		   			   //add all displayed to the container
		   				root.getChildren().addAll(rotateLabel, rotateField, rotateButton);
		   				
		   			   // execute the code when the shapeButton is pressed
		   				rotateButton.setOnAction(e1 -> {
		   				// if-else statement to give proper respond 		   				
		   						if (rotateField.getText().equals("rotate the shape by 30 degrees")) {
		   							hexagon.getTransforms().add(new Rotate(45,100,100));
			   					} else if (rotateField.getText().equals("rotate the shape by 90 degrees")) {
			   						hexagon.getTransforms().add(new Rotate(90,100,100));
			   					} else if (rotateField.getText().equals("rotate the shape by minus 45 degrees")) {
			   						hexagon.getTransforms().add(new Rotate(-45,100,100));
			   					}
		   				//identify invalid input
			   					else {
			   						Alert errorAlert = new Alert(AlertType.ERROR);
			   						errorAlert.setHeaderText("Invalid Entering");
			   						errorAlert.setContentText("This program only accept following input:rotate the shape by 30 degrees, rotate the shape by 90 degrees and rotate the shape by minus 45 degrees.");
			   						errorAlert.showAndWait();
			   					}
			   				 
		   					        
		   				});
		   				    
		   						
		   					}

               
	            else if (num == 7) 
                {
                     // Create a an object for Polygon and set seven coordinates to make a heptagon..
                     
                     Polygon heptagon = new Polygon();
                     heptagon.getPoints().addAll(new Double[] {50.0, 0.0, 150.0, 0.0, 200.0, 50.0, 200.0,150.0, 100.0,200.0, 0.0,150.0, 0.0,50.0});
                    
                     
                   //  Using if/else conditions to fill with required color.
                    if (num % 2 == 0) {                        
                         heptagon.setFill(Color.RED);
                     }
                     else {
                         heptagon.setFill(Color.BLACK);
                     }             
                    // display the shape
                      root.getChildren().add(heptagon);
                   // remove text field and button so that the main screen only display one active shape at a time.
	                  root.getChildren().removeAll(shapeLabel, shapeField, shapeButton);
	
		                // create a rotatelabel hint
		   				Label rotateLabel = new Label("Please rotate this shape");
		   				
		   			   // create a TextField for users to input
		   				TextField rotateField = new TextField();
		   				
		   			   // set a same width of rotateField as ShapeField
		   				rotateField.setMaxWidth(300);
		   				
		   				// create a button for submitting
		   				Button rotateButton = new Button();
		   				rotateButton.setText("Rotate this shape");
		   				
		   			   //add all displayed to the container
		   				root.getChildren().addAll(rotateLabel, rotateField, rotateButton);
		   				
		   			   // execute the code when the shapeButton is pressed
		   				rotateButton.setOnAction(e1 -> {
		   					
		   				// if-else statement to give proper respond 
		   						if (rotateField.getText().equals("rotate the shape by 30 degrees")) {
		   							heptagon.getTransforms().add(new Rotate(45,100,100));
			   					} else if (rotateField.getText().equals("rotate the shape by 90 degrees")) {
			   						heptagon.getTransforms().add(new Rotate(90,100,100));
			   					} else if (rotateField.getText().equals("rotate the shape by minus 45 degrees")) {
			   						heptagon.getTransforms().add(new Rotate(-45,100,100));
			   					}
		   				//identify invalid input
			   					else {
			   						Alert errorAlert = new Alert(AlertType.ERROR);
			   						errorAlert.setHeaderText("Invalid Entering");
			   						errorAlert.setContentText("This program only accept following input:rotate the shape by 30 degrees, rotate the shape by 90 degrees and rotate the shape by minus 45 degrees.");
			   						errorAlert.showAndWait();
			   					}
			   				 
		   					        
		   				});

                 
                 }
	            
	            else if (num == 8) 
                {
                     // Create a an object for Polygon and sets eight coordinates to make an octagon.
                     
                     Polygon octagon = new Polygon();
                     octagon.getPoints().addAll(new Double[] {100.0, 0.0,170.0, 30.0,200.0, 100.0,170.0,170.0,100.0, 200.0, 30.0,170.0, 0.0,100.0, 30.0,30.0});
                		    
                     
                  // Using if/else conditions to fill with required color.
                    if (num % 2 == 0) {                        
                         octagon.setFill(Color.RED);
                     }
                     else {
                         octagon.setFill(Color.BLACK);
                     }
                 // display the shape
                    root.getChildren().add(octagon);
                 // remove text field and button so that the main screen only display one active shape at a time.
	                root.getChildren().removeAll(shapeLabel, shapeField, shapeButton);
	               
	                // create a rotatelabel hint
	   				Label rotateLabel = new Label("Please rotate this shape");
	   				
	   			   // create a TextField for users to input
	   				TextField rotateField = new TextField();
	   				
	   			   // set a same width of rotateField as ShapeField
	   				rotateField.setMaxWidth(300);
	   				
	   				// create a button for submitting
	   				Button rotateButton = new Button();
	   				rotateButton.setText("Rotate this shape");
	   				
	   			   //add all displayed to the container
	   				root.getChildren().addAll(rotateLabel, rotateField, rotateButton);
	   				
	   			   // execute the code when the shapeButton is pressed
	   				rotateButton.setOnAction(e1 -> {
	   					// if-else statement to give proper respond 
		   						if (rotateField.getText().equals("rotate the shape by 30 degrees")) {
		   							octagon.getTransforms().add(new Rotate(45,100,100));
			   					} else if (rotateField.getText().equals("rotate the shape by 90 degrees")) {
			   						octagon.getTransforms().add(new Rotate(90,100,100));
			   					} else if (rotateField.getText().equals("rotate the shape by minus 45 degrees")) {
			   						octagon.getTransforms().add(new Rotate(-45,100,100));
			   					}
		   				//identify invalid input
			   					else {
			   						Alert errorAlert = new Alert(AlertType.ERROR);
			   						errorAlert.setHeaderText("Invalid Entering");
			   						errorAlert.setContentText("This program only accept following input:rotate the shape by 30 degrees, rotate the shape by 90 degrees and rotate the shape by minus 45 degrees.");
			   						errorAlert.showAndWait();
			   					}
				                
		   					        
		   				});

               }
                 
	            // showing error when user enter integer but not between 5 and 8.
	            else {
                    Alert error = new Alert(AlertType.ERROR);
                    error.setHeaderText("Input Integer Out of Range ");
                    error.setContentText("Please enter an integer between 5 and 8 inclusive");
                    error.showAndWait();                              
                                
              }           
          
          }
	     // showing error when user enter integer not enter integer.
	          catch (NumberFormatException error) {
	          
	                Alert alert = new Alert(AlertType.ERROR);
	                alert.setHeaderText("Invalid Input");
	                alert.setContentText("Please enter an integer between 5 and 8 inclusive");
	                alert.showAndWait();
	        }  			
 	            
		});
			
	}

	public static void main(String[] args) {

		launch(args);

	}
}
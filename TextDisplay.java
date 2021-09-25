package com.mv.diffUtil;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TextDisplay extends Application
{
	@Override
	public void start(Stage stage)
	{
		Text text1 = new Text();
		Text text2 = new Text();
		
		text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
		text1.setText("File1:::\n" + new FileReader().readFile("C:\\Users\\Vishy\\Desktop\\SampleFile2.txt"));
		text1.setX(0);
		text1.setY(50);
		
		text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
		text2.setText("File2:::\n" + new FileReader().readFile("C:\\Users\\Vishy\\Desktop\\SampleFile1.txt"));
		text2.setX(450);
		text2.setY(50);
		
		Group root = new Group(text1, text2);
		Scene scene = new Scene(root, 700, 400);
		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}

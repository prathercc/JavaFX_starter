package com.example.JavaFX_starter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxLauncher extends Application {
	private static final Logger logger = LoggerFactory.getLogger(FxLauncher.class);
	public static Parent rootNode;

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/welcome.fxml"));
		fxmlLoader.setControllerFactory(Main.springContext::getBean);
		rootNode = fxmlLoader.load();
		stage.setTitle("Sample JavaFX project");
		stage.setScene(new Scene(rootNode));
		stage.setResizable(false);
		stage.show();
	}
	@Override
	public void stop() {
		logger.warn("All JavaFx windows are now closed! Stopping Spring Boot...");
		Main.springContext.close();
		logger.info("Spring Boot has been shutdown.");
	}
	@Override
	public void init() throws IOException {
		//Where you will set up controller factory
	}
	public static void startFxApplication(String[] args) {
		launch();
	}
	

}

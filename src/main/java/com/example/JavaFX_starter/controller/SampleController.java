package com.example.JavaFX_starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.JavaFX_starter.service.SampleService;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

@Component
public class SampleController {
	
	@Autowired
	SampleService service;
	
	@FXML
	private Button debugTextButton;

	@FXML
	private Label sampleLabel;

	public void debugText() {
		var labelText = sampleLabel.getText();
		System.out.println(labelText);
	}
}

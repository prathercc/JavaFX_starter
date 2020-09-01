package com.example.JavaFX_starter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.JavaFX_starter.domain.Sample;

@Service
public class SampleService {
	private List<Sample> sampleList;
	
	public SampleService(List<Sample> val) {
		sampleList = val;
	}
	
	public void addSample(Sample val) {
		sampleList.add(val);
	}
	
	public void setSamples(List<Sample> val) {
		sampleList = val;
	}
	
	public void removeSample(Sample val) {
		sampleList.remove(val);
	}
	
	public List<Sample> getSamples() {
		return sampleList;
	}
}

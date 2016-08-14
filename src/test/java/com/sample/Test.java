package com.sample;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String... args) throws IOException {
		
		/* Initiate and shuffle data */
		List<KNNNode> nodes = CSVUtil.convertCsvToKNNNode("iris.csv", 4);
		Collections.shuffle(nodes);
		
		/* Divide samples(70%) and tests(30%) */
		int splitPoint = (int) Math.round(nodes.size() * 0.7);
		List<KNNNode> sampleNodes = nodes.subList(0, splitPoint);
		List<KNNNode> testNodes = nodes.subList(splitPoint + 1, nodes.size() - 1);
		
		/* Validation */
		double count = testNodes
				.stream()
				.filter(node -> KNNAlgo.classify(sampleNodes, node.getCharacters(), 
						KNNAlgo.euclideanDistanceFunc) == node.getLabel()).count();

		System.out.println(count / testNodes.size());
	}
	
}

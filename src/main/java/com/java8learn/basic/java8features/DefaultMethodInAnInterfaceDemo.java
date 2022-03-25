package com.java8learn.basic.java8features;

/**
 * Providing a Default Method Implementation in an Interface. You want to add a
 * new method to an existing interface without breaking backward compatibility
 * with other code.
 *
 */
public class DefaultMethodInAnInterfaceDemo implements Volume{

	public static void main(String[] args) {

	}
	
	/* Even if DEFAULT method of Volume Interface is not implemented, there is
	 * no compilation error.
	 * @Override public double calculateVolume(Double[] depthValues, Double[]
	 * measurementValues) { // TODO Auto-generated method stub return
	 * Volume.super.calculateVolume(depthValues, measurementValues); }
	 */

}

/**
 * Develop a default method (a.k.a. defender method) within the interface so
 * that any classes implementing the interface are not required to provide an
 * implementation of the new method. To do so, add the new default keyword to
 * the interface declaration and provide a method implementation. The following
 * interface Volume includes a default method implementation for the
 * calculateVolume method:
 *
 */
interface Volume {
	/**
	 * Calculate pool volume given depth values and measurement values. For a pool
	 * with variable depth, the minDepth should be depthValues[0], and the maxDepth
	 * should be passed as depthValues[1].
	 *
	 * This interface can accept multiple measurement values, but it expects
	 * measurementValues[0] == length, or measurementValues[0] == radius
	 * measurementValues[1] == width
	 * 
	 * @param depthValues
	 * @param measurementValues
	 * @return
	 */
	default double calculateVolume(Double[] depthValues, Double[] measurementValues) {
		/*
		 * Any class implementing this interface can now use this default method
		 * implementation or provide its own implementation, much like an abstract
		 * class.
		 */
		double length, width, radius, minDepth, maxDepth, avgDepth = 0;

		if (depthValues.length > 1) {
			minDepth = depthValues[0];
			maxDepth = depthValues[1];
			avgDepth = (minDepth + maxDepth) / 2;
		} else if (depthValues.length == 1) {
			avgDepth = depthValues[0];
		}

		if (measurementValues.length > 1) {
			length = measurementValues[0];
			width = measurementValues[1];
			radius = 0;
		} else {
			length = 0;
			width = 0;
			radius = measurementValues[0];
		}
		if (radius == 0) {
			return length * width * avgDepth;
		} else {
			return (radius * radius) * 3.14 * avgDepth;
		}
	};
}

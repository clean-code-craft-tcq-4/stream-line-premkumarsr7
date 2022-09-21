/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.tdd.sender.vitals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MSP5COB
 */
public class BatteryParamsSimulator {

  /**
   * @param startValue startValue
   * @param endValue endValue
   * @param interval interval
   * @return List<Double>
   */
  private List<Double> generateSequence(final double startValue, final double endValue, final double interval) {
    List<Double> sequenceList = new ArrayList<>();
    for (double i = startValue; i <= endValue; i = i + interval) {
      sequenceList.add(i);
    }
    return sequenceList;
  }

  /**
   * @return List<Double>
   */
  public List<Double> generateTemparatureSequence() {
    return generateSequence(20.0, 80.0, 1.0);
  }

  /**
   * @return List<Double>
   */
  public List<Double> generateChargeRateSequence() {
    return generateSequence(1.0, 9.0, 0.2);
  }

  /**
   * @param message message
   * @param sequenceList sequenceList
   */
  public void printSequenceInConsole(final String message, final List<Double> sequenceList) {
    System.out.println(message + " - " + sequenceList);
  }


}

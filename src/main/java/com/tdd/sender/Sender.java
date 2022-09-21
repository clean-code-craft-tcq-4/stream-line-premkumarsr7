/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.tdd.sender;

import java.util.List;

import com.tdd.sender.vitals.BatteryParamsSimulator;

/**
 * @author MSP5COB
 */
public class Sender {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    BatteryParamsSimulator batteryParamsSimulator = new BatteryParamsSimulator();

    List<Double> temperatureValues = batteryParamsSimulator.generateTemparatureSequence();
    batteryParamsSimulator.printSequenceInConsole("Temperature Sequence", temperatureValues);

    List<Double> chargeRateValues = batteryParamsSimulator.generateChargeRateSequence();
    batteryParamsSimulator.printSequenceInConsole("Charge Rate Sequence", chargeRateValues);

  }

}

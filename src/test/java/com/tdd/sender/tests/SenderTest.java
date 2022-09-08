package com.tdd.sender.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.tdd.sender.vitals.BatteryParamsSimulator;

/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */

/**
 * @author MSP5COB
 */
public class SenderTest {

  @Test
  public void testTemperatureSequence() {
    BatteryParamsSimulator batteryParamsSimulator = new BatteryParamsSimulator();
    List<Double> temperatureValues = batteryParamsSimulator.generateTemparatureSequence();
    assertNotNull("Output should not be null", temperatureValues);
    assertEquals((Double) 20.0, temperatureValues.get(0));
    assertEquals((Double) 21.0, temperatureValues.get(1));
    assertEquals((Double) 80.0, temperatureValues.get(temperatureValues.size() - 1));
    assertEquals((Double) 79.0, temperatureValues.get(temperatureValues.size() - 2));
  }

  @Test
  public void testChargeRateSequence() {
    BatteryParamsSimulator batteryParamsSimulator = new BatteryParamsSimulator();
    List<Double> chargeRateValues = batteryParamsSimulator.generateChargeRateSequence();
    assertNotNull("Output should not be null", chargeRateValues);
    assertEquals((Double) 1.0, chargeRateValues.get(0));
    assertEquals((Double) 1.2, chargeRateValues.get(1));
    assertEquals((Double) 9.0, chargeRateValues.get(chargeRateValues.size() - 1));
    assertEquals((Double) 8.8, chargeRateValues.get(chargeRateValues.size() - 2));
  }

}

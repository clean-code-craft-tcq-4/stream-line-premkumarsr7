#define CATCH_CONFIG_MAIN
#include "catch.hpp"

#include <bits/stdc++.h>
#include <cstdlib>
#include <iostream>
#include <vector>
#include <string>
#include <sstream>
#include "../receiver/receiver.h"

using namespace std;

Sensor sensorData;
int maxTemperatureValue;
int minTemperatureValue;
int maxStateOfChargeValue;
int minStateOfChargeValue;

TEST_CASE("Test 1 : Read 0 lines from console, negative test case")
{
    cout << "Test to read 0 lines from console" << endl;
    sensorData = receiveAndSplitDataFromConsole(0);
    REQUIRE(sensorData.temperatureList.size() == 0);
    REQUIRE(sensorData.stateOfChargeList.size() == 0);
    maxTemperatureValue = findMaximumValue(sensorData.temperatureList);
    minTemperatureValue = findMinimumValue(sensorData.temperatureList);
    REQUIRE(maxTemperatureValue == 0);
    REQUIRE(minTemperatureValue == 0);
    maxStateOfChargeValue = findMaximumValue(sensorData.stateOfChargeList);
    minStateOfChargeValue = findMinimumValue(sensorData.stateOfChargeList);
    REQUIRE(maxStateOfChargeValue == 0);
    REQUIRE(minStateOfChargeValue == 0);
}

TEST_CASE("Test 2 : Read 50 lines from console, positive test case")
{
    cout << "Test to read 50 lines from console" << endl;
    sensorData = receiveAndSplitDataFromConsole(50);
    REQUIRE(sensorData.temperatureList.size() == 50);
    REQUIRE(sensorData.stateOfChargeList.size() == 50);
    maxTemperatureValue = findMaximumValue(sensorData.temperatureList);
    minTemperatureValue = findMinimumValue(sensorData.temperatureList);
    cout << "maxTemperatureValue = " << maxTemperatureValue << endl;
    cout << "minTemperatureValue = " << minTemperatureValue << endl;
    maxStateOfChargeValue = findMaximumValue(sensorData.stateOfChargeList);
    minStateOfChargeValue = findMinimumValue(sensorData.stateOfChargeList);
    cout << "maxStateOfChargeValue = " << maxStateOfChargeValue << endl;
    cout << "minStateOfChargeValue = " << minStateOfChargeValue << endl;
    float temperatureSMA = simpleMovingAverage(sensorData.temperatureList, 45, 49);
    cout << "temperatureSMA is : " << temperatureSMA << endl;
    float stateOfChargeSMA = simpleMovingAverage(sensorData.stateOfChargeList, 45, 49);
    cout << "stateOfChargeSMA is : " << stateOfChargeSMA << endl;
}
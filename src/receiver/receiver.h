#ifndef RECEIVER_H
#define RECEIVER_H

#include <bits/stdc++.h>
#include <cstdlib>
#include <iostream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;

struct Sensor
{
    vector<int> temperatureList;
    vector<int> stateOfChargeList;
};

vector<int> convertCsvStringToInteger(string stringToConvert);
Sensor receiveAndSplitDataFromConsole(int numberOfLinesToRead);
int findMaximumValue(vector<int> arryToFindMaxValue);
int findMinimumValue(vector<int> arryToFindMinValue);
float simpleMovingAverage(vector<int> listToTest, int startIndex, int endIndex);

#endif // RECEIVER_H
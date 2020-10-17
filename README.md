# lists-intersection -  a programming assessment

## Description

Small Java application which consists of a user interface and some business logic to demonstrate the following: for calculating an intersection between two lists, the smaller list should be put into a HashSet for better performance.

## Requirements

The application should provide a user interface which can be used to enter the following parameters:

- Size of list A
- Size of list B
- Choose which list is put into a HashSet, which one is iterated over
- A Run-button to start the computation
- An output fields to show the size of the result-set
- A second output field to show the time it took to run the intersection algorithm

If the Run-button is pressed, the two lists are populated with random numbers. Based on the user input, one of the lists is put into a HashSet, the other one is iterated over to test for each element if it is contained in the HashSet. Matching elements are put into the result set.
Please use JavaFX or Swing for the UI and Gradle or Maven as build tool.

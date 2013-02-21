Narrative:
In order to allow fluent and safe traffic at a crosswalk
As a traffic planner
I want to have traffic lights



Scenario: Initially shows red for pedestrians and green for cars


Given a crosswalk with traffic lights
When the traffic lights are switched on
Then red is shown for pedestrians
And green is shown for cars



Scenario: 29 seconds after green for cars still shows green for cars

Given a crosswalk with traffic lights
When lights are set green for cars
And 29 seconds pass
Then red is shown for pedestrians
And green is shown for cars



Scenario: 30 seconds after green for cars shows yellow for cars

Given a crosswalk with traffic lights
When lights are set green for cars
And 30 seconds pass
Then red is shown for pedestrians
And yellow is shown for cars



Scenario: 2 seconds after yellow for cars still shows yellow for cars

Given a crosswalk with traffic lights
When lights are set yellow for cars
And 2 seconds pass
Then red is shown for pedestrians
And yellow is shown for cars



Scenario: 3 seconds after yellow for cars shows red for cars and green for pedestrians

Given a crosswalk with traffic lights
When lights are set yellow for cars
And 3 seconds pass
Then green is shown for pedestrians
And red is shown for cars



Scenario: 9 seconds after red for cars still shows red for cars

Given a crosswalk with traffic lights
When lights are set red for cars
And 9 seconds pass
Then green is shown for pedestrians
And red is shown for cars



Scenario: 10 seconds after red for cars shows red-yellow for cars and red for pedestrians

Given a crosswalk with traffic lights
When lights are set red for cars
And 10 seconds pass
Then red is shown for pedestrians
And red-yellow is shown for cars



Scenario: 2 seconds after red-yellow for cars still shows red-yellow for cars

Given a crosswalk with traffic lights
When lights are set red-yellow for cars
And 2 seconds pass
Then red is shown for pedestrians
And red-yellow is shown for cars



Scenario: 3 seconds after red-yellow for cars shows green for cars and red for pedestrians

Given a crosswalk with traffic lights
When lights are set red-yellow for cars
And 3 seconds pass
Then red is shown for pedestrians
And green is shown for cars
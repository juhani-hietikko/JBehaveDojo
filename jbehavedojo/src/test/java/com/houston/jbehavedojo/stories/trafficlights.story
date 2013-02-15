
Scenario: Initially shows red for pedestrians and green for cars

Given a crosswalk with traffic lights
When the traffic lights are switched on
Then red is shown for pedestrians
And green is shown for cars



Scenario: After 30 seconds green for cars shows yellow for cars

Given a crosswalk with traffic lights
When lights are set green for cars
And 30 seconds passes
Then red is shown for pedestrians
And yellow is shown for cars



Scenario: After 3 seconds yellow for cars shows red for cars and green for pedestrians

Given a crosswalk with traffic lights
When lights are set yellow for cars
And 3 seconds passes
Then green is shown for pedestrians
And red is shown for cars



Scenario: After 10 seconds red for cars shows red-yellow for cars and red for pedestrians

Given a crosswalk with traffic lights
When lights are set red for cars
And 10 seconds passes
Then red is shown for pedestrians
And red-yellow is shown for cars



Scenario: After 3 seconds red-yellow for cars shows green for cars and red for pedestrians

Given a crosswalk with traffic lights
When lights are set red-yellow for cars
And 3 seconds passes
Then red is shown for pedestrians
And green is shown for cars
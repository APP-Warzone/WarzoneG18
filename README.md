# 🎮 Warzone Game 

A Warzone game setup represents a world map, where two or more players can play by placing armies on countries they own, from which they can attack adjacent countries to conquer them. The objective of the game is to conquer all countries on the map.

## 🔑 Key Points

- *Map*: Represented as a connected graph, where each node is a country and each edge signifies adjacency between countries. Continents are defined subgraphs, with control values determining the number of armies given to a player who controls an entire continent.
  
- *Game*: The game starts with the startup phase, where the number of players is determined, and then all the territories are randomly assigned to the players. Then the turn-based main play phase begins, in which all players create orders (deployment, advance, and special orders) that are executed to conquer.

- *Issuing Orders*: Each player, in round-robin turn order, gives one of their orders. Once all the players have signified that they don’t have any more orders for this turn, the game engine executes all the orders. At the beginning of every turn, the players are given a number of armies.

- *Executing Orders*: When executing a deploy order, a number of army units is added to a territory. A move is simply moving army units from one territory to the other.

## 📌 Features
The implemented program is expected to offer the following functionalities:
- Create and play on any connected graph defined by the user and saved as a text file representation.
- Manage territories, armies, and continent control values.
- Implement different types of orders: deployment, advancing armies, special orders (bomb, blockade, airlift, negotiate).
- Simulate battles and apply rules for conquering territories.
- Card-based actions influencing the game (bomb, reinforcement, blockade, airlift, diplomacy).
- Different Game Modes to play from (Single Game Mode, Tournament Mode) and Ability to save and load the game from the last stage.

## 💻 Implementation
- *Languages:* Java
- *Tools:* IntelliJ Idea IDE, Junit, Javadocs
- *Structure:* MVC Architecture

## 📁 Usage
    Clone the Repository:
    - git clone https://github.com/your-username/risk-game.git
    Navigate to the Project Directory:
    - cd warzone/service/
    Compile the Java Code:
    - javac GameEngine.java
    Run the Game:
    - java GameEngine

## 📑 References

- [Warzone](https://www.warzone.com/)
- [Domination game maps](https://domination.sourceforge.io/getmaps.shtml)

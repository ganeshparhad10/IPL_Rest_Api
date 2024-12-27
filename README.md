# IPL Management System

## Introduction

The IPL (Indian Premier League) Management System is a simplified project designed for practice and learning purposes. It enables users to manage IPL teams, players, and matches while performing CRUD (Create, Read, Update, Delete) operations on in-memory data using `ArrayList`. This project is built with Spring Boot and does not utilize a database for data storage.

## Features

### For Teams:

- Add a new team
- View all teams
- View a specific team by ID
- Update a team's details
- Delete a team

### For Players:

- Add a new player
- View all players
- View a specific player by ID
- Update a player's details
- Delete a player

### For Matches:

- Add a new match
- View all matches
- View a specific match by ID
- Update a match's details
- Delete a match

## Entities and Attributes

### Team Entity

- **teamId**: Integer (Unique identifier for each team)
- **name**: String (Name of the team)
- **city**: String (City the team belongs to)
- **coach**: String (Name of the team's coach)

### Player Entity

- **playerId**: Integer (Unique identifier for each player)
- **name**: String (Name of the player)
- **age**: Integer (Age of the player)
- **teamId**: Integer (ID of the team the player belongs to)
- **role**: String (Player's role, e.g., batsman, bowler, all-rounder)

### Match Entity

- **matchId**: Integer (Unique identifier for each match)
- **team1**: Integer (ID of the first team in the match)
- **team2**: Integer (ID of the second team in the match)
- **date**: String (Match date in yyyy-MM-dd format)
- **venue**: String (Venue of the match)
- **result**: String (Result of the match, e.g., 'Team1 won', 'Team2 won', 'Draw')

## API Endpoints

### Teams Endpoints

1. **Add a New Team**

   - URL: `POST /api/teams`
   - Request Body:
     ```json
     {
       "teamId": 1,
       "name": "Mumbai Indians",
       "city": "Mumbai",
       "coach": "Mahela Jayawardene"
     }
     ```

2. **Get All Teams**

   - URL: `GET /api/teams`

3. **Get a Team by ID**

   - URL: `GET /api/teams/{id}`

4. **Update a Team**

   - URL: `PUT /api/teams/{id}`
   - Request Body:
     ```json
     {
       "teamId": 1,
       "name": "Mumbai Indians",
       "city": "Mumbai",
       "coach": "Ricky Ponting"
     }
     ```

5. **Delete a Team**

   - URL: `DELETE /api/teams/{id}`

### Players Endpoints

1. **Add a New Player**

   - URL: `POST /api/players`
   - Request Body:
     ```json
     {
       "playerId": 1,
       "name": "Rohit Sharma",
       "age": 33,
       "teamId": 1,
       "role": "Batsman"
     }
     ```

2. **Get All Players**

   - URL: `GET /api/players`

3. **Get a Player by ID**

   - URL: `GET /api/players/{id}`

4. **Update a Player**

   - URL: `PUT /api/players/{id}`
   - Request Body:
     ```json
     {
       "playerId": 1,
       "name": "Rohit Sharma",
       "age": 34,
       "teamId": 1,
       "role": "Opening Batsman"
     }
     ```

5. **Delete a Player**

   - URL: `DELETE /api/players/{id}`

### Matches Endpoints

1. **Add a New Match**

   - URL: `POST /api/matches`
   - Request Body:
     ```json
     {
       "matchId": 1,
       "team1": 1,
       "team2": 2,
       "date": "2024-05-01",
       "venue": "Wankhede Stadium",
       "result": "Mumbai Indians won"
     }
     ```

2. **Get All Matches**

   - URL: `GET /api/matches`

3. **Get a Match by ID**

   - URL: `GET /api/matches/{id}`

4. **Update a Match**

   - URL: `PUT /api/matches/{id}`
   - Request Body:
     ```json
     {
       "matchId": 1,
       "team1": 1,
       "team2": 2,
       "date": "2024-05-01",
       "venue": "Wankhede Stadium",
       "result": "Match Drawn"
     }
     ```

5. **Delete a Match**

   - URL: `DELETE /api/matches/{id}`

## Workflow

1. **Run the Application**: Start the application on `localhost:8080` .
2. **Use Postman for API Testing**: Open Postman and create requests for the APIs listed above.
3. **Perform CRUD Operations**:
   - Use `POST` to create new teams, players, or matches.
   - Use `GET` to retrieve teams, players, or matches.
   - Use `PUT` to update details.
   - Use `DELETE` to remove entries.
4. **Test API Responses**: Verify the JSON responses and ensure data accuracy.

## Conclusion

The IPL Management System project provides a hands-on understanding of RESTful API development with Spring Boot. It allows users to practice CRUD operations and in-memory data handling, along with learning RESTful design principles and API testing using Postman.




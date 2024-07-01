## Citizen API Usage

### Endpoint Base URL
- Base URL: [http://localhost:8000](http://localhost:8000)

### Endpoints

#### Get Citizen by ID
- **URL:** `/citizen/{id}`
    - Example: [http://localhost:8000/citizen/{id}](http://localhost:8000/citizen/{id})
    - **Method:** GET
    - **Description:** Retrieve a citizen by their ID.

#### Get All Citizens
- **URL:** `/citizen`
    - Example: [http://localhost:8000/citizen](http://localhost:8000/citizen)
    - **Method:** GET
    - **Description:** Retrieve all citizens.

#### Create Citizen
- **URL:** `/citizen`
    - Example: [http://localhost:8000/citizen](http://localhost:8000/citizen)
    - **Method:** POST
    - **Description:** Create a new citizen.
    - **Request Body:** JSON object representing the citizen to be created.

#### Update Citizen
- **URL:** `/citizen/{id}`
    - Example: [http://localhost:8000/citizen/{id}](http://localhost:8000/citizen/{id})
    - **Method:** PUT
    - **Description:** Update an existing citizen by their ID.
    - **Request Body:** JSON object representing the updated citizen data.

#### Delete Citizen
- **URL:** `/citizen/{id}`
    - Example: [http://localhost:8000/citizen/{id}](http://localhost:8000/citizen/{id})
    - **Method:** DELETE
    - **Description:** Delete a citizen by their ID.

### Database Configuration
- **JDBC URL:** `jdbc:postgresql://localhost:5432/postgres`
- **Username:** `postgres`
- **Password:** `postgres`
- **Driver Class Name:** `org.postgresql.Driver`

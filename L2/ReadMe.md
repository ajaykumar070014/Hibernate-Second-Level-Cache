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


## Configuration

Ensure to configure your PostgreSQL database connection in `application.properties`:

```properties
spring.application.name=L2cache
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
server.port=8000
spring.jpa.properties.hibernate.generate_statistics=true


# Second level cache
spring.jpa.properties.hibernate.cache.use_second_level_cache=true
spring.jpa.properties.hibernate.cache.region.factory_class=org.hibernate.cache.ehcache.EhCacheRegionFactory

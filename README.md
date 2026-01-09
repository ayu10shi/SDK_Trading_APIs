# Trading Backend Application

## Introduction
This project is a **Trading Backend Application** developed using **Spring Boot**.  
It simulates a basic stock trading system where a user can view tradable instruments, place buy/sell orders, view executed trades, and check portfolio holdings.

---

## Technologies Used
- Java 17
- Spring Boot
- Maven
- Swagger UI (for API testing)
- In-memory data storage (no database)

---

## Project Folder Structure
trading-backend
├── pom.xml
├── README.md
└── src
└── main
└── java
└── com
└── example
└── trading
├── controller
├── service
├── model
└── TradingApplication.java


---

## Application Overview (How It Works)
1. The user first fetches available tradable instruments.
2. Based on the instrument, the user places a buy or sell order.
3. Market orders are executed immediately.
4. Executed orders generate trades.
5. Portfolio is calculated from executed trades.

---

## How to Run the Application

### Prerequisites
- Java 17 or higher installed
- Maven installed
- IntelliJ IDEA (recommended)

### Steps
1. Open the project in IntelliJ IDEA.
2. Make sure Java 17 is set as the Project SDK.
3. Run the main class:
   TradingApplication.java

4. The application will start on:
   http://localhost:8080


---

## API Testing using Swagger UI
Swagger UI is used to test and explore all APIs without Postman.

Open the following URL in your browser:
http://localhost:8080/swagger-ui.html

---

## API Endpoints

### 1. Get Instruments
Fetches all tradable instruments.

GET /api/v1/instruments

---

### 2. Place Order
Places a buy or sell order.

POST /api/v1/orders

Sample Request Body:
```json
{
  "symbol": "TCS",
  "orderType": "BUY",
  "orderStyle": "MARKET",
  "quantity": 5,
  "price": 3500
}
```
3. Get Order by ID,
Fetches order details using order ID.

* bash:
GET /api/v1/orders/{id}

4. Get Trades,
Fetches all executed trades.

* bash:
GET /api/v1/trades

5. Get Portfolio,
Fetches current portfolio holdings.

* bash:
GET /api/v1/portfolio

## Design Explanation
- REST API design principles are followed.

- Controller layer handles HTTP requests.

- Service layer contains business logic.

- Model layer represents data objects.

- Data is stored in memory using collections.

- Portfolio is calculated dynamically from trades.

## Assumptions
- Single user system.

- No authentication required.

- Market orders execute immediately.

- Data is reset when the application restarts.

- No real stock exchange integration.

## Future Enhancements
- Database integration

- User authentication

- Limit order execution logic

- Multiple user support

- Real-time price updates

## Conclusion
This project demonstrates a basic backend trading system using Spring Boot with clean architecture and REST APIs.
It provides a clear understanding of API design, request handling, and service-based architecture.

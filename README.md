# API Bridge: XML ↔ JSON Conversion

Just a small proof of concept developed in java Spring Boot to simulate an integration scenario for digital transformation projects.

## Objective
The only purpose of this API is to act as a two-way translator between modern and legacy systems.

## Tech Stack
- Java 17
- Spring Boot 3
- Jackson Dataformat XML
- Maven

## Endpoints

### JSON → XML
Simulates receiving a request from a modern client.
**POST** `/api/bridge/send-to-legacy`
**Consumes:** `application/json`
**Produces:** `application/xml`

### XML → JSON
Simulates receiving a request from a legacy client.
**POST** `/api/bridge/receive-from-legacy`
**Consumes:** `application/xml`
**Produces:** `application/json`

## Quick Test (cURL)

You can easily test the **JSON to XML** transformation by running the following command in your terminal:

```bash
curl -u admin:123 -X POST http://localhost:8080/api/bridge/send-to-legacy -H "Content-Type: application/json" -d "{\"id\":\"123\", \"name\":\"Jose Christian Cervera Oliva\", \"accountType\":\"Premium\"}"
```

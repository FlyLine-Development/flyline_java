# Flyline-Java

Java Bindings for the Flyline API (https://flyline.io/api-ref).

The whole available Flyline API is defined in the `FlylineApiService` interface.

Check the Junit test classes for examples of more use cases. Every API endpoint has at
least one integration test against the sandbox environment.

Uses [Retrofit](https://github.com/square/retrofit) and [OkHttp](https://github.com/square/okhttp) under
the hood. You may want to take a look at those libraries if you need to do anything out of the ordinary.

### Installation

Flyline-java is available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cflyline-java)

```xml

<dependency>
  <groupId>com.flyline</groupId>
  <artifactId>flyline</artifactId>
  <version>1.0</version>
</dependency>
```

### How to use

```java

// Use builder to create a client
FlylineClient flylineClient = new FlylineClient("test_***")

// SET the request params for Airfare
// SET the cabin_class as the Strucuture parameter

JSONObject jsonObj = {
    "cabin_class": "economy",
    "slices": [
        {
            "departure": {
                "code": "DFW",
                "date": "{{departureDate}}"
            },
            "arrival": {
                "code": "LAX"
            }
        }
    ],
    "passengers": [
        {
            "age": 27
        }
    ]
};

String response = flylineClient.get_airfares(jsonObj.Stringify());

```
EndPoints: 
```
flylineClient.get_airfares(JsonString data);
flylineClient.get_airattributes_by_flight_number(JsonString data);
flylineClient.get_airattributes_by_route(JsonString data);
flylineClient.get_schedules_by_flight_number(JsonString data);
flylineClient.get_schedules_by_route(JsonString data);
flylineClient.get_seat_map(JsonString data);
flylineClient.get_aircrafts();
flylineClient.get_aircraft(String iata_code);
flylineClient.get_airlines();
flylineClient.get_airline(String iata_code);
flylineClient.get_airports();
flylineClient.get_airport(String iata_code);
flylineClient.get_aiports_by_city(String iata_code);
flylineClient.get_cities(String iata_code);
flylineClient.get_city(String iata_code);
flylineClient.get_cabin_class_mapping(String carrier, String cabin_class);
flylineClient.get_seat_types();
flylineClient.get_seat_layouts();
flylineClient.get_foods();
flylineClient.get_beverages();
flylineClient.get_entertainments();
flylineClient.get_wifis();
flylineClient.get_powers();
```
### Legacy API

If you're looking for a Java client that works with the legacy Flyline API, use
versions of `flyline`. The API and client are not backwards-compatible.

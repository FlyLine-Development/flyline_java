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
FlylineClient flylineClient = FlylineClient.newBuilder()
  .build();

// SET the request params for Airfare
// SET the cabin_class as the Strucuture parameter
GetAirfareRequest request = new GetAirfareRequest("economy");


// Set the Slices of the Airfare Request
// Set the departure and arrival of Slices.
Place departure = new Place();
departure.setCode("DFW");
departure.setDate("2021-06-14");

Place arrival = new Place();
arrival.setCode("LAX");

Slice slice = new Slice();
List<Slice> slices = new List<Slice>();
slices.add(slice);



// Set the Passengers of the Reqeust
Passenger passenger = new Passenger();
passenger.setAge("27");
List<Passenger> passengers = new List<Passenger>();
passengers.add(passenger);

request = request.withOneWay(slices, passengers);

Response<AirfareResponse> response = flylineClient.service()
    .getAirfareWithParams(f_token, request).execute();

if (response.isSuccessful()) {
  accessToken = response.body().getAccessToken();
}


// Asynchronously do the same thing. Useful for potentially long-lived calls.
flyClient.service()
    .getAirfareWithParams(f_toke, request)
    .enqueue(new Callback<AirfareResponse>() {
        @Override
        public void onResponse(Call<AirfareResponse> call, Response<AirfareResponse> response) {
          if (response.isSuccessful()) {
            accessToken = response.body.getAccessToken();
          }
        }

        @Override
        public void onFailure(Call<AirfareResponse> call, Throwable t) {
          // handle the failure as needed
        }
    });

```

### Legacy API

If you're looking for a Java client that works with the legacy Flyline API, use
versions of `flyline`. The API and client are not backwards-compatible.

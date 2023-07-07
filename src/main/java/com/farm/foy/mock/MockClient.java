package com.farm.foy.mock;

import java.util.concurrent.TimeUnit;

public class MockClient {
//    private static final String HOST = "125.6.38.129";  // IP address of the server
    // private static final String HOST = "211.203.134.186";
     private static final String HOST = "localhost";
    private static final int PORT = 8080;               // Port number of the server
    private static final String PUMP_STATE_ON = "Y";
    private static final String PUMP_STATE_OFF = "N";

    public static void main(String[] args) throws InterruptedException {
        connectToWiFi();

        while (true) {
            float temperature = readTemperature();
            System.out.println("temp= " + temperature);

            String request = "/control/pump/state?temperature=" + temperature + "&pump=" + getPumpState();
            String response = sendHttpRequest(request);
            System.out.println("response = " + response);

            if (response.equals(PUMP_STATE_ON)) {
                System.out.println("pump on");
                setPumpState(PUMP_STATE_ON);
                // Perform corresponding system output or other operations for turning the pump on
                TimeUnit.SECONDS.sleep(60);  // Wait for 1 minute
            } else {
                setPumpState(PUMP_STATE_OFF);
                System.out.println("pump off");
                // Perform corresponding system output or other operations for turning the pump off
            }

            TimeUnit.SECONDS.sleep(10);  // Wait for 10 seconds
        }
    }

    private static void connectToWiFi() {
        // Perform Wi-Fi connection logic
        System.out.println("Connected to WiFi");
    }

    private static float readTemperature() {
        // Perform temperature reading logic
        return 25.0f;  // Return a mock temperature value
    }

    private static String sendHttpRequest(String request) {
        // Perform HTTP request and receive response logic
        // Replace with your own logic to send the request and receive the response from the server
        return "Y";  // Return a mock response
    }

    // Methods to handle the pump state
    private static String getPumpState() {
        // Replace with your own logic to retrieve the current pump state
        return PUMP_STATE_OFF;  // Return a mock pump state
    }

    private static void setPumpState(String state) {
        // Replace with your own logic to set the pump state
        // Perform necessary actions based on the state, e.g., turning the pump on/off
    }
}


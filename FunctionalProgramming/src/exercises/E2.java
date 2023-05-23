package exercises;

// Print all courses individually
// List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")

import java.util.Collections;
import java.util.List;

public class E2 {
    public static void main(String[] args) {

        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .forEach(System.out::println);

    }

}
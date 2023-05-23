package exercises;

import java.util.List;

// Print courses containing the word "Spring"
// List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

public class E3 {
    public static void main(String[] args) {

        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

    }
}

package project;

import java.util.*;
import java.util.regex.*;

public class customer_feedback_analyzer {
    static List<String> feedbackList = new ArrayList<>();

    // 1. Add Feedback
    public static void addFeedback(String feedback) {
        feedbackList.add(feedback);
        System.out.println("Feedback added successfully.");
    }

    // 2. View All Feedback
    public static void viewFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            for (int i = 0; i < feedbackList.size(); i++) {
                System.out.println((i + 1) + ". " + feedbackList.get(i));
            }
        }
    }

    // 3. Clean Feedback Text
    public static String cleanFeedback(String feedback) {
        return feedback.replaceAll("[^a-zA-Z0-9@.\\s]", "").trim();
    }

    // 4. Mask Emails and Phone Numbers
    public static String maskSensitiveInfo(String feedback) {
        String masked = feedback;
        masked = masked.replaceAll("\\b[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}\\b", "[EMAIL]");
        masked = masked.replaceAll("\\b\\d{10}\\b", "[PHONE]");
        return masked;
    }

    // 5. Keyword Occurrence Count (case-insensitive)
    public static int countKeyword(String keyword) {
        int count = 0;
        for (String fb : feedbackList) {
            Matcher matcher = Pattern.compile("\\b" + Pattern.quote(keyword) + "\\b", Pattern.CASE_INSENSITIVE).matcher(fb);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }

    // 6. Feedback Summary Report
    public static void generateSummaryReport() {
        int total = feedbackList.size();
        int max = 0, min = Integer.MAX_VALUE, sum = 0;

        for (String fb : feedbackList) {
            int wordCount = fb.split("\\s+").length;
            sum += wordCount;
            if (wordCount > max) max = wordCount;
            if (wordCount < min) min = wordCount;
        }

        double avg = (total == 0) ? 0 : (double) sum / total;
        min = (total == 0) ? 0 : min;
        max = (total == 0) ? 0 : max;

        System.out.println("Total Feedbacks: " + total);
        System.out.println("Average Words: " + avg);
        System.out.println("Max Words: " + max);
        System.out.println("Min Words: " + min);
    }

    // Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n📋 MENU:");
            System.out.println("1. Add Feedback");
            System.out.println("2. View All Feedback");
            System.out.println("3. Clean & Mask Feedback");
            System.out.println("4. Count Keyword");
            System.out.println("5. Generate Summary Report");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();  // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter feedback: ");
                        addFeedback(sc.nextLine());
                        break;
                    case 2:
                        viewFeedback();
                        break;
                    case 3:
                        for (int i = 0; i < feedbackList.size(); i++) {
                            String cleaned = cleanFeedback(feedbackList.get(i));
                            String masked = maskSensitiveInfo(cleaned);
                            feedbackList.set(i, masked);
                        }
                        System.out.println("All feedback cleaned and masked.");
                        break;
                    case 4:
                        System.out.print("Enter keyword: ");
                        String keyword = sc.nextLine();
                        int count = countKeyword(keyword);
                        System.out.println("Keyword \"" + keyword + "\" found: " + count + " time(s).");
                        break;
                    case 5:
                        generateSummaryReport();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // clear invalid input
            }
        }
    }
}
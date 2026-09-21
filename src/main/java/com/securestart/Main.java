package com.securestart;

import com.securestart.model.BusinessProfile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Print Welcome Message
        System.out.println("========================================");
        System.out.println("  Welcome to SecureStart Assessor!");
        System.out.println("  Cybersecurity Risk Assessment Tool");
        System.out.println("========================================\n");

        // 2. Gather Basic Business Information
        System.out.print("Enter your Business Name: ");
        String businessName = scanner.nextLine();

        System.out.print("Enter your Industry (e.g., Retail, Consulting): ");
        String industry = scanner.nextLine();

        // 3. Create the Business Profile Model
        BusinessProfile profile = new BusinessProfile(businessName, industry);

        // 4. Confirmation Output
        System.out.println("\n✅ Profile created successfully!");
        System.out.println("Business: " + profile.getBusinessName());
        System.out.println("Industry: " + profile.getIndustry());

        System.out.println("\n--- End of Day 1 Setup ---");
        System.out.println("(Risk assessment logic will be connected in the next step.)");

        // Clean up resources
        scanner.close();
    }
}
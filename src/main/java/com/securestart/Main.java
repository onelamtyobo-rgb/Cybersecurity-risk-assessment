package com.securestart;

import com.securestart.model.BusinessProfile;
import com.securestart.core.PolicyGenerator;
import com.securestart.core.RiskAssessor;
import com.securestart.utils.FileExporter;

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

        RiskAssessor assessor = new RiskAssessor(scanner);
        assessor.performAssessment(profile);

        PolicyGenerator generator = new PolicyGenerator();
        String finalReport = generator.generatePolicy(profile);

        System.out.println("\n" + finalReport);

        String safeFilename = businessName.replaceAll("[^a-zA-Z0-9]", "_") + "_Security_Report.txt";
        FileExporter.saveReport(safeFilename, finalReport);


        scanner.close();
        System.out.println("\nThank you for using SecureStart. Goodbye!");

    }
}
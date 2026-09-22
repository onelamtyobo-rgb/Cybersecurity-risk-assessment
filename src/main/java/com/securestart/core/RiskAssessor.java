package com.securestart.core;

import com.securestart.model.BusinessProfile;
import java.util.Scanner;

public class RiskAssessor {
    private final Scanner scanner;

    // Each question has a prompt and a specific "weakness" label if answered 'No'
    private final String[][] questions = {
            {"Do you use Multi-Factor Authentication (MFA) on all business accounts?", "No MFA implemented"},
            {"Are your critical files backed up regularly to an offsite/cloud location?", "No reliable backups"},
            {"Do you use a Password Manager to generate and store unique passwords?", "Weak/reused passwords"},
            {"Is your business Wi-Fi network separated from the guest network?", "Unsecured network"},
            {"Do you have basic antivirus/anti-malware software installed on all devices?", "No endpoint protection"},
            {"Have you trained your employees on how to spot phishing emails?", "No security training"}
    };

    public RiskAssessor(Scanner scanner) {
        this.scanner = scanner;
    }

    public void performAssessment(BusinessProfile profile) {
        System.out.println("\n--- Starting Risk Assessment ---");
        System.out.println("Please answer with 'y' for Yes or 'n' for No.\n");

        int totalScore = 0;

        for (String[] q : questions) {
            System.out.print("Q: " + q[0] + " (y/n): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            // If they answer 'No', they have a vulnerability. Add 20 points to risk score.
            if (answer.equals("n")) {
                totalScore += 20;
                profile.addWeakness(q[1]);
            }
        }

        // Cap the score at 100
        if (totalScore > 100) totalScore = 100;

        profile.setRiskScore(totalScore);
        System.out.println("\nAssessment complete. Calculating risk level...");
    }
}
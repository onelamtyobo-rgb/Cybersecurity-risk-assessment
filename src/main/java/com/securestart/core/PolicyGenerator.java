package com.securestart.core;

import com.securestart.model.BusinessProfile;

public class PolicyGenerator {

    public String generatePolicy(BusinessProfile profile) {
        StringBuilder policy = new StringBuilder();

        policy.append("=================================================================\n");
        policy.append("       CYBERSECURITY POLICY & RECOMMENDATIONS REPORT\n");
        policy.append("=================================================================\n");
        policy.append("Prepared for: ").append(profile.getBusinessName()).append("\n");
        policy.append("Industry: ").append(profile.getIndustry()).append("\n");
        policy.append("Overall Risk Level: ").append(profile.getRiskLevel().getLabel()).append("\n");
        policy.append("Risk Score: ").append(profile.getRiskScore()).append("/100\n");
        policy.append("=================================================================\n\n");

        policy.append("EXECUTIVE SUMMARY:\n");
        policy.append(profile.getRiskLevel().getDescription()).append("\n\n");

        policy.append("IDENTIFIED WEAKNESSES & ACTIONABLE POLICIES:\n");
        policy.append("-----------------------------------------------------------------\n");

        if (profile.getIdentifiedWeaknesses().isEmpty()) {
            policy.append("Great job! No critical weaknesses were identified in this basic assessment.\n");
            policy.append("Continue to maintain your current security practices.\n");
        } else {
            for (String weakness : profile.getIdentifiedWeaknesses()) {
                policy.append("[!] Issue: ").append(weakness).append("\n");
                policy.append("    Policy Action: Implement immediate controls to address this gap.\n");
                policy.append("    - Assign an owner to resolve this within 14 days.\n");
                policy.append("    - Review progress in the next monthly security meeting.\n\n");
            }
        }

        policy.append("=================================================================\n");
        policy.append("End of Report. Stay Secure!\n");
        policy.append("=================================================================\n");

        return policy.toString();
    }
}
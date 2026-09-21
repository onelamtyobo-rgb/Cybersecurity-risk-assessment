package com.securestart.model;

import java.util.ArrayList;
import java.util.List;

public class BusinessProfile {
    private final String businessName;
    private final String industry;
    private int riskScore;
    private RiskScore riskLevel;
    private final List<String> identifiedWeaknesses;

    public BusinessProfile(String businessName, String industry) {
        this.businessName = businessName;
        this.industry = industry;
        this.identifiedWeaknesses = new ArrayList<>();
    }

    // Getters and Setters
    public String getBusinessName() { return businessName; }
    public String getIndustry() { return industry; }
    public int getRiskScore() { return riskScore; }
    public void setRiskScore(int riskScore) {
        this.riskScore = riskScore;
        this.riskLevel = RiskScore.getRiskLevel(riskScore);
    }
    public RiskScore getRiskLevel() { return riskLevel; }
    public List<String> getIdentifiedWeaknesses() { return identifiedWeaknesses; }
    public void addWeakness(String weakness) { this.identifiedWeaknesses.add(weakness); }
}
package com.securestart.model;

public enum RiskScore {
    LOW(0, 30, "Low Risk", "Your business has a solid foundation."),
    MEDIUM(31, 60, "Medium Risk", "There are some gaps that need attention."),
    HIGH(61, 80, "High Risk", "Your business is vulnerable to common attacks."),
    CRITICAL(81, 100, "Critical Risk", "Immediate action is required to protect your business.");

    private final int min;
    private final int max;
    private final String label;
    private final String description;

    RiskScore(int min, int max, String label, String description) {
        this.min = min;
        this.max = max;
        this.label = label;
        this.description = description;
    }

    public static RiskScore getRiskLevel(int score) {
        for (RiskScore level : values()) {
            if (score >= level.min && score <= level.max) {
                return level;
            }
        }
        return CRITICAL; // Fallback
    }

    public String getLabel() { return label; }
    public String getDescription() { return description; }
}
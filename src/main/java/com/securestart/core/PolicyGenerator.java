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

        policy.append("IDENTIFIED WEAKNESSES & ACTIONABLE RECOMMENDATIONS:\n");
        policy.append("-----------------------------------------------------------------\n\n");

        if (profile.getIdentifiedWeaknesses().isEmpty()) {
            policy.append(" Excellent! No critical weaknesses were identified.\n");
            policy.append("Continue maintaining your current security practices.\n\n");
        } else {
            for (String weakness : profile.getIdentifiedWeaknesses()) {
                policy.append(generateSpecificRecommendation(weakness));
                policy.append("\n");
            }
        }

        policy.append("=================================================================\n");
        policy.append("PRIORITY ACTION PLAN (First 30 Days):\n");
        policy.append("-----------------------------------------------------------------\n");
        policy.append("Week 1: Enable MFA on all accounts (email, banking, social media)\n");
        policy.append("Week 2: Set up automatic cloud backups (Google Drive/OneDrive)\n");
        policy.append("Week 3: Install a password manager (Bitwarden/1Password)\n");
        policy.append("Week 4: Update router firmware and change default passwords\n");
        policy.append("=================================================================\n\n");
        policy.append("End of Report. Stay Secure!\n");

        return policy.toString();
    }

    private String generateSpecificRecommendation(String weakness) {
        StringBuilder recommendation = new StringBuilder();

        switch (weakness) {
            case "No MFA implemented":
                recommendation.append("[!] Issue: No Multi-Factor Authentication (MFA)\n");
                recommendation.append("    RISK: Hackers can easily access your accounts with just a password.\n\n");
                recommendation.append("    ✅ SOLUTION: Enable MFA/2FA on ALL business accounts\n");
                recommendation.append("    Steps:\n");
                recommendation.append("    1. Go to your email settings (Gmail/Outlook) → Security → 2-Step Verification\n");
                recommendation.append("    2. Download Google Authenticator or Microsoft Authenticator app\n");
                recommendation.append("    3. Enable MFA on banking, social media, and cloud storage accounts\n");
                recommendation.append("    \n");
                recommendation.append("    🛠️ TOOLS: Google Authenticator (Free), Microsoft Authenticator (Free)\n");
                recommendation.append("    ⏱️ TIME: 30 minutes to set up all accounts\n");
                recommendation.append("    💰 COST: Free");
                break;

            case "No reliable backups":
                recommendation.append("[!] Issue: No Reliable Backups\n");
                recommendation.append("    RISK: Ransomware or hardware failure could delete all your business data.\n\n");
                recommendation.append("    ✅ SOLUTION: Implement the 3-2-1 Backup Rule\n");
                recommendation.append("    Steps:\n");
                recommendation.append("    1. Use Google Drive, OneDrive, or Dropbox for automatic file syncing\n");
                recommendation.append("    2. Buy an external USB hard drive ($50-80) for weekly manual backups\n");
                recommendation.append("    3. Enable 'Version History' in your cloud storage to recover old files\n");
                recommendation.append("    \n");
                recommendation.append("    🛠️ TOOLS: Google Drive (15GB Free), OneDrive (5GB Free), Backblaze ($7/month)\n");
                recommendation.append("    ⏱️ TIME: 1 hour initial setup, then automatic\n");
                recommendation.append("    💰 COST: Free to $10/month");
                break;

            case "Weak/reused passwords":
                recommendation.append("[!] Issue: Weak or Reused Passwords\n");
                recommendation.append("    RISK: If one account is breached, ALL your accounts are vulnerable.\n\n");
                recommendation.append("    ✅ SOLUTION: Use a Password Manager\n");
                recommendation.append("    Steps:\n");
                recommendation.append("    1. Download Bitwarden (free) or 1Password (paid)\n");
                recommendation.append("    2. Create a strong master password (12+ characters)\n");
                recommendation.append("    3. Use the password generator to create unique passwords for each account\n");
                recommendation.append("    4. Update your most important accounts first (email, banking)\n");
                recommendation.append("    \n");
                recommendation.append("    🛠️ TOOLS: Bitwarden (Free), 1Password ($3/month), LastPass (Free tier)\n");
                recommendation.append("    ⏱️ TIME: 2 hours to migrate all passwords\n");
                recommendation.append("    💰 COST: Free to $5/month");
                break;

            case "Unsecured network":
                recommendation.append("[!] Issue: Unsecured Wi-Fi Network\n");
                recommendation.append("    RISK: Hackers can intercept data or access your devices on the network.\n\n");
                recommendation.append("    ✅ SOLUTION: Secure Your Business Router\n");
                recommendation.append("    Steps:\n");
                recommendation.append("    1. Change the default router admin password (usually 'admin/admin')\n");
                recommendation.append("    2. Update router firmware to the latest version\n");
                recommendation.append("    3. Enable WPA3 or WPA2 encryption (NOT WEP)\n");
                recommendation.append("    4. Create a separate 'Guest' network for customers/visitors\n");
                recommendation.append("    5. Hide your network name (SSID) if possible\n");
                recommendation.append("    \n");
                recommendation.append("    🛠️ TOOLS: Router admin panel (usually 192.168.1.1)\n");
                recommendation.append("    ⏱️ TIME: 45 minutes\n");
                recommendation.append("    💰 COST: Free");
                break;

            case "No endpoint protection":
                recommendation.append("[!] Issue: No Antivirus/Malware Protection\n");
                recommendation.append("    RISK: Viruses and malware can steal data or lock your files.\n\n");
                recommendation.append("    ✅ SOLUTION: Install Antivirus Software\n");
                recommendation.append("    Steps:\n");
                recommendation.append("    1. Windows: Enable Windows Defender (built-in, already good!)\n");
                recommendation.append("    2. Mac: Install Malwarebytes or use built-in XProtect\n");
                recommendation.append("    3. Enable automatic scans weekly\n");
                recommendation.append("    4. Keep your operating system updated (enable auto-updates)\n");
                recommendation.append("    \n");
                recommendation.append("    🛠️ TOOLS: Windows Defender (Free), Malwarebytes (Free), Avast (Free)\n");
                recommendation.append("    ⏱️ TIME: 20 minutes\n");
                recommendation.append("    💰 COST: Free");
                break;

            case "No security training":
                recommendation.append("[!] Issue: No Employee Security Awareness\n");
                recommendation.append("    RISK: Employees may click phishing links or fall for scams.\n\n");
                recommendation.append("    ✅ SOLUTION: Basic Security Training\n");
                recommendation.append("    Steps:\n");
                recommendation.append("    1. Watch Google's 'Phishing Quiz' together (15 mins)\n");
                recommendation.append("    2. Teach the '3 Rules': Don't click suspicious links, verify requests,\n");
                recommendation.append("       report strange emails immediately\n");
                recommendation.append("    3. Create a simple 1-page 'Security Cheat Sheet' for your office\n");
                recommendation.append("    4. Review security tips in monthly team meetings\n");
                recommendation.append("    \n");
                recommendation.append("    🛠️ RESOURCES: Google Phishing Quiz (Free), FTC Cybersecurity Tips\n");
                recommendation.append("    ⏱️ TIME: 1 hour initial training, 15 mins monthly refreshers\n");
                recommendation.append("    💰 COST: Free");
                break;

            default:
                recommendation.append("[!] Issue: ").append(weakness).append("\n");
                recommendation.append("    Review your security practices and implement industry best practices.\n");
                recommendation.append("    Consider consulting with an IT security professional.\n");
        }

        return recommendation.toString();
    }
}
# 🔐 SecureStart Assessor

> A Java-based CLI tool that helps new and small businesses run a foundational cybersecurity risk assessment and automatically generates an actionable, low-cost security policy.
---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Tech Stack](#️-tech-stack)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Usage Example](#-usage-example)
- [Sample Output](#-sample-output)
- [Testing](#-testing)
- [Roadmap](#-roadmap)
- [Author](#-author)
- [License](#-license)

---

## 🎯 Overview

Small and new businesses are increasingly targeted by cyberattacks, yet most lack the budget or technical expertise to implement enterprise-level security solutions.

**SecureStart Assessor** bridges that gap. It's a lightweight Command Line Interface (CLI) application that guides non-technical business owners through a structured risk assessment. Based on their answers, the tool calculates a risk score and dynamically generates a customized, step-by-step security policy with specific, low-cost recommendations — no consultant required.

---

## ✨ Features

| Feature | Description |
|---|---|
| 🗣️ **Interactive Risk Assessment** | Asks 6 targeted Yes/No questions covering MFA, backups, passwords, network security, antivirus, and staff training. |
| 📊 **Dynamic Risk Scoring** | Calculates a real-time risk score (0–100) and categorizes it as Low, Medium, High, or Critical. |
| 📝 **Actionable Policy Generation** | Produces specific remediation steps — not generic advice — including recommended free/low-cost tools and time estimates. |
| 💾 **Automated Report Export** | Saves the final assessment and policy as a clean `.txt` file to an `output/` directory. |
| ✅ **Automated Testing** | Built with JUnit 5 to verify the reliability of the scoring and generation logic. |

---

## 🛠️ Tech Stack

- **Language:** Java 17
- **Build Tool:** Apache Maven
- **Testing Framework:** JUnit 5
- **Architecture:** Modular, object-oriented design (MVC-inspired)

---

## 📂 Project Structure

```text
SecureStart-Assessor/
├── pom.xml                            # Maven configuration and dependencies
├── README.md                          # Project documentation
├── src/
│   ├── main/java/com/securestart/
│   │   ├── Main.java                  # Application entry point
│   │   ├── core/
│   │   │   ├── RiskAssessor.java      # Logic for asking questions and scoring
│   │   │   └── PolicyGenerator.java   # Logic for generating the text report
│   │   ├── model/
│   │   │   ├── BusinessProfile.java   # Data model for the business
│   │   │   └── RiskScore.java         # Enum for risk levels
│   │   └── utils/
│   │       └── FileExporter.java      # Utility to save reports to disk
│   └── test/java/com/securestart/
│       ├── RiskScoreTest.java
│       ├── BusinessProfileTest.java
│       └── PolicyGeneratorTest.java
└── output/                            # Auto-generated folder for saved reports
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or later
- Apache Maven 3.8+

### Installation

```bash
git clone https://github.com/<your-username>/SecureStart-Assessor.git
cd SecureStart-Assessor
```

### Run the Application

```bash
mvn clean compile exec:java
```

---

## 💻 Usage Example

```text
Welcome to SecureStart Assessor!
Let's evaluate your business's cybersecurity posture.

1. Does your business use Multi-Factor Authentication (MFA)? (y/n): n
2. Do you have automated, regular data backups?          (y/n): y
3. Do employees use unique, strong passwords?             (y/n): n
4. Is your business network protected by a firewall?      (y/n): y
5. Is antivirus/endpoint protection installed on devices?  (y/n): y
6. Have staff received basic security awareness training? (y/n): n

Calculating risk score...
```

---

## 📄 Sample Output

```text
============================================
   SecureStart Assessor — Security Report
============================================
Risk Score: 62/100
Risk Level: HIGH

Recommended Actions:
1. Enable MFA on all accounts
   → Tool: Microsoft Authenticator (free) | Est. time: 30 min
2. Enforce strong, unique passwords
   → Tool: Bitwarden (free tier) | Est. time: 1 hour
3. Deliver basic security awareness training
   → Tool: KnowBe4 free training modules | Est. time: 2 hours

Report saved to: output/SecureStart_Report_2026-09-25.txt
============================================
```

---

## 🧪 Testing

This project includes automated unit tests to verify the core scoring and report-generation logic.

```bash
mvn test
```

Test coverage includes:
- `RiskScoreTest` — validates score-to-category boundaries
- `BusinessProfileTest` — validates the business data model
- `PolicyGeneratorTest` — validates that generated policies match the assessed risk level

---

## 🗺️ Roadmap

- [ ] Add PDF export alongside `.txt` reports
- [ ] Support multi-business/session history
- [ ] Add a scoring weight configuration file
- [ ] Optional web-based front end

---

## 👩‍💻 Author

**Onela Zandile Mtyobo**
Institution: WeThinkCode_

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

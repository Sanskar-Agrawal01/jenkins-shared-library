# 🚀 Jenkins Shared Library

A reusable **Jenkins Shared Library** built using **Groovy** to standardize CI/CD pipelines, reduce duplication, and enforce best practices across Jenkins pipelines.

This repository contains reusable pipeline steps, utilities, and pipeline templates that can be shared across multiple Jenkins projects.

---

## 📌 Overview

Jenkins Shared Libraries allow you to:

- ✅ Reuse pipeline code across repositories
- ✅ Maintain centralized CI/CD logic
- ✅ Reduce Jenkinsfile complexity
- ✅ Enforce organization standards
- ✅ Improve pipeline maintainability

This library provides common pipeline functions implemented using **Groovy DSL**.

---

## 🏗 Repository Structure


jenkins-shared-library/
│
├── vars/ # Global pipeline variables (entry points)
│ ├── buildApp.groovy
│ ├── deployApp.groovy
│ └── notify.groovy
│
├── src/ # Reusable Groovy classes
│ └── com/company/utils/
│ ├── DockerUtils.groovy
│ └── GitUtils.groovy
│
├── resources/ # Static resources (configs/templates)
│ └── config.yaml
│
└── README.md


---

## 📂 Folder Explanation

| Folder | Purpose |
|--------|---------|
| `vars/` | Global pipeline steps callable directly in Jenkinsfile |
| `src/` | Groovy classes organized by package |
| `resources/` | Files accessible using `libraryResource` |
| `README.md` | Documentation |

---

## ⚙️ Prerequisites

- Jenkins installed (2.x+ recommended)
- Jenkins Pipeline Plugin installed
- Basic Groovy knowledge
- Jenkins Shared Library configured

---

## 🔧 Configure Shared Library in Jenkins

### Step 1 — Open Jenkins Settings


Manage Jenkins → Configure System


### Step 2 — Add Global Pipeline Library

Under **Global Pipeline Libraries**, configure:

| Field | Value |
|------|------|
| Name | `shared-lib` |
| Default Version | `main` |
| Retrieval Method | Modern SCM |
| SCM | Git |
| Repository URL | `<your-repo-url>` |

Click **Save**.

---

## 🧩 Using the Library in Jenkinsfile

### Import Library

```groovy
@Library('shared-lib') _
Example Usage
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                buildApp()
            }
        }

        stage('Deploy') {
            steps {
                deployApp(env: "dev")
            }
        }
    }
}

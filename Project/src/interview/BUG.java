

/*


1. What is a bug in software testing?
💡 Answer: A bug is a flaw, error, or defect in a software application that causes it to produce incorrect or unexpected results or behave in unintended ways. Bugs occur due to mistakes in code, misconfigurations, or other technical issues.


 
2. What is the difference between a bug, a defect, and an error?
💡 Answer:
Error: A mistake made by a developer during coding.
Defect: A flaw found during testing before release.
Bug: A defect that is identified after the software is deployed in production.



3. What are the different types of bugs in software testing?
💡 Answer:

Functional Bugs – Issues related to incorrect functionality.
Performance Bugs – Slow response time, memory leaks, or high CPU usage.
Usability Bugs – Poor UI/UX experience.
Security Bugs – Vulnerabilities like SQL injection or XSS.
Compatibility Bugs – Issues in different browsers, devices, or OS.
Logical Bugs – Incorrect calculations or business logic errors.



4. What are the different severity levels of bugs?
💡 Answer:

Critical – System crashes, data loss, security issues.
High – Major functionality failure, but no complete system crash.
Medium – Non-critical functionality not working as expected.
Low – Minor UI issues, spelling mistakes, etc.


5. What are the different priority levels of bugs?
💡 Answer:

High Priority – Needs immediate fix as it affects business operations.
Medium Priority – Important but can be fixed in the next release.
Low Priority – Can be fixed later without immediate impact.




6. How do you log a bug in a bug tracking tool?
💡 Answer:
A bug report should have the following details:

Title: Short, descriptive title of the issue.
Description: Detailed explanation of the issue.
Steps to Reproduce: Step-by-step instructions to reproduce the bug.
Expected Result: What should happen.
Actual Result: What is happening instead.
Severity & Priority: Classification of the bug.
Environment: OS, Browser, Device details.
Attachments: Screenshots, logs, or videos as proof.
Example bug report in JIRA:

vbnet
Copy
Edit
Title: "Login button not working in Chrome"
Description: Clicking the login button does not navigate the user to the dashboard.
Steps to Reproduce:  
1. Open Chrome browser.  
2. Navigate to "https://example.com/login".  
3. Enter valid credentials and click "Login".  
4. Nothing happens; the user is not redirected.  
Expected Result: User should be redirected to the dashboard after login.  
Actual Result: No action occurs after clicking the login button.  
Severity: High  
Priority: High  
Environment: Windows 10, Chrome v112.0  
Attachments: Screenshot attached.  




7. How do you differentiate between a reproducible and a non-reproducible bug?
💡 Answer:

Reproducible Bug: Can be consistently replicated by following the same steps.
Non-Reproducible Bug: Occurs randomly and is hard to duplicate.
If a bug is non-reproducible, testers can:

Try different test environments.
Check system logs for errors.
Capture network requests using tools like Postman or Charles Proxy.





8. What is a regression bug?
💡 Answer:
A regression bug occurs when a previously working functionality breaks due to code changes in an update. These bugs are caught during regression testing to ensure that new changes haven't negatively affected existing features.

Example:

A developer fixes a payment gateway issue.
After deployment, the checkout button stops working.



9. What is the difference between a blocker bug and a showstopper bug?
💡 Answer:

Blocker Bug: Prevents further testing of a specific feature (e.g., login page crashes).
Showstopper Bug: Makes the entire application unusable (e.g., app does not launch).






10. What steps do you take when a developer rejects your bug?
💡 Answer:

Reproduce the Bug – Ensure the bug is valid by rechecking.
Provide Evidence – Attach screenshots, logs, or screen recordings.
Check Requirement Documents – Prove why the issue is incorrect.
Discuss with Developers – Communicate to understand their perspective.
Involve the Test Lead – If necessary, escalate the issue.




11. How do you handle a high-priority bug reported in production?
💡 Answer:

Analyze the Impact – Assess how critical the issue is.
Reproduce the Bug – Try replicating it in a test environment.
Notify Stakeholders – Inform developers and the product team.
Provide a Hotfix – Suggest a temporary or permanent fix.
Perform Regression Testing – Ensure the fix doesn’t break other functionalities.




12. What tools do you use for bug tracking?
💡 Answer:

JIRA – Most popular for Agile teams.
Bugzilla – Open-source bug tracking tool.
Trello – For small teams and simple bug tracking.
Redmine – Project management & bug tracking.
Mantis – Lightweight bug tracking.




13. Can you explain the bug life cycle?
💡 Answer:
Bug Life Cycle Stages:

New → Bug is logged.
Assigned → Assigned to a developer.
Open → Developer starts working on the fix.
Fixed → Developer fixes the bug.
Retest → Tester verifies the fix.
Closed → Bug is fixed and verified.
Reopened → If the issue still exists after the fix.




14. What is a Heisenbug?
💡 Answer:
A Heisenbug is a bug that disappears or changes its behavior when someone tries to debug or isolate it.

Example:

A crash occurs randomly but doesn’t happen when a debugger is attached.





15. What is the difference between bug leakage and bug release?
💡 Answer:

Bug Leakage: A bug missed in testing but found by users after release.
Bug Release: A known bug is released because it has a minor impact and can be fixed later.



*/
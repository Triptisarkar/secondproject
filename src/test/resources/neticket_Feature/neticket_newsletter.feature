Feature: This is newsletter feature

Scenario: Verify subscribe to newsletter is in the homepage footer
Given Launch<"URL"> netapp
Then Scroll down till subscribe to newsletter
Then Verify subscribe to newsletter is in the homepage footer




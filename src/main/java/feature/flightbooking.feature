Feature: NSW News website Tests

	@Regression
	Scenario: Verify that user is able to select topics and retrieve results on the NSW News page
	Given user is on NSW Website
	Then verify if user is able to select the desired option 
	| newsItem |
	| Business and Economy |
	And then user is able to Reset the news items
	
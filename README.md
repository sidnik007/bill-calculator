This application is being developed to calculate the mobile bill based on the plan and number of connections by the user.

## Task 1: Calculate A Simple Mobile Bill

**Calculate A Simple Mobile Bill**

For a single account with one main connection and any optional "additional connections", calculate a monthly mobile
bill based on

- Plan type - Platinum, Gold or Silver
- Additional connections rate

**Plan Rates**

Here are the rates for each plan type:

| Plan     | Basic Monthly Rate | Rate per Additional Connection |
|----------|--------------------|--------------------------------|
| Platinum | 999                | 199                            |
| Gold     | 799                | 299                            |
| Silver   | 599                | 399                            |

Examples:

| Plan     | Number of Connections | Expected Bill          |
|----------|-----------------------|------------------------|
| Platinum | 1                     | 999                    |
| Platinum | 4                     | 999 + (3 * 199) = 1596 |
| Gold     | 1                     | 799                    |
| Gold     | 2                     | 799 + (1 * 299) = 1098 |
| Silver   | 1                     | 599                    |
| Silver   | 3                     | 599 + (2 * 399) = 1397 |

## Task 2: Calculate Additional Charges for Excess Minutes

**Calculate Additional Charges for Excess Minutes**

For a single account, calculate a monthly mobile bill, including excess minutes based on
- Plan Type — Platinum, Gold or Silver
- Number of Connections
- Excess Minutes — minutes used in excess of the included minutes

**Plan Rates**

Here are excess minutes rates for each plan type:

| Plan     | Basic Monthly Rate | Included Minutes | Rate per Excess Minute |
|----------|--------------------|------------------|------------------------|
| Platinum | 999                | 1500             | 1.30                   |
| Gold     | 799                | 1000             | 2.45                   |
| Silver   | 599                | 500              | 3.60                   |

Examples:

| Plan     | Minutes Used | Number of Connections | Exceeded Bill             |
|----------|--------------|-----------------------|---------------------------|
| Platinum | 1499         | 1                     | 999                       |
| Platinum | 1500         | 1                     | 999                       |
| Platinum | 1530         | 1                     | 999 + (30 * 1.30) = 1038  |
| Gold     | 999          | 1                     | 799                       |
| Gold     | 1000         | 1                     | 799                       |
| Gold     | 1010         | 1                     | 799 + (10 * 2.45) = 823.5 |
| Silver   | 499          | 1                     | 599                       |
| Silver   | 500          | 1                     | 599                       |
| Silver   | 520          | 1                     | 599 + (20 * 0.54) = 671   |

## Task 3: Calculate Family Plan

**Calculate Family Plan**

Families that more than 3 connections are eligible for "family discount."

All the additional connections above the third one will cost 99 per connection, irrespective of the plan.

Please calculate a monthly mobile bill for families that qualify or don't qualify for the family discount.

Examples:

| Plan     | Minutes Used | Number of Connections | Exceeded Bill                     |
|----------|--------------|-----------------------|-----------------------------------|
| Platinum | < 1500       | 3                     | 999 + (2 * 199) = 1397            |
| Platinum | < 1500       | 4                     | 999 + (2 * 199) + 99 = 1496       |
| Gold     | < 1000       | 3                     | 799 + (2 * 299) = 1397            |
| Gold     | < 1000       | 6                     | 799 + (2 * 299 + (3 * 99)) = 1993 |
| Silver   | < 500        | 3                     | 599 + (2 * 399) = 1397            |
| Silver   | < 500        | 5                     | 599 + (2 * 399 + (2 * 99)) = 1595 |


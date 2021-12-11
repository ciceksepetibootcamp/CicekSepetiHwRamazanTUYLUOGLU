# Behavior Driven Development

What is BDD?

Behavior-driven development (BDD) is a methodology in [Agile software development](https://www.agilealliance.org/agile101/) that aims to narrow the communication gaps between team members. In this method, the collaboration between developers, QA and non-technical or business analysts in a software project is encouraged. It encourages teams to use conversation and real-world examples to foster a better and shared understanding of how the application should behave. BDD’s business-focused perspective on application behavior allows teams to create living documentation that is easy to maintain and can be consumed by all team members, including testers, developers, and product owners.

With BDD, tests are created using the [gherkin](https://specflow.org/learn/gherkin/) Given-When-Then language. 

- given (some context)
- when (something happens)
- then (outcome)

For example:

- Given I am signing up for a free trial
- When I submit the required details
- Then I receive a link to the download

## Morhipo BDD Test Cases

This project was made according to Behavior Driven Development.

![image-20211206213042499](https://github.com/ciceksepetibootcamp/Ramazan_TUYLUOGLU_Homework/blob/main/week3/MorhipoCpBDDTest/image-20211206213042499.png)

>

#### Pom.xml configuration:

I set the dependencies needed for the project. 

​	

```
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java8</artifactId>
        <version>7.0.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.0.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.0.3</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-api</artifactId>
        <version>3.141.59</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-support</artifactId>
        <version>3.141.59</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-chrome-driver</artifactId>
        <version>3.141.59</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.1.0</version>
        <scope>test</scope>
    </dependency>

</dependencies>
```

>
>
>

I used to Page Object Model in this project. So I set my functions,Constant variables and Tests different folders.

![image-20211206211858659]"(https://github.com/ciceksepetibootcamp/Ramazan_TUYLUOGLU_Homework/blob/main/week3/MorhipoCpBDDTest/image-20211206211858659.png)

>
>
>

#### Scenario-1

------

- [x] Open chrome and launch webiste
- [x] Click login button
- [x] Enter email and password
- [x] See "Siparişlerim" on Homepage

```
Given I open chrome and launch website
When  I click login button
And   I enter "tuyluoglu.ramazan@gmail.com" and "Ramazan123."
Then  I should see "Siparişlerim"
```

>
>
>

#### Scenario-2

- [x] Open chrome and launch webiste
- [x] Click  searchbox
- [x] Enter email product name and search
- [x] See the productListVisibleName on current page

```
Given I open chrome and launch website
When I click searchbox
And I enter <product> and search
Then I should see <data> on the page
Examples:
  | product    | data                |
  | "Ayakkabı" | "Ayakkabi Modelleri" |
  | "Çanta"    | "canta Modelleri"    |
  | "Saat"     | "saat Modelleri"     |
```

>
>
>

#### Scenario-3

- [x] Open chrome and launch webiste
- [x] Click login button
- [x] Enter email and password
- [x] Click  searchbox
- [x] Enter email product name and search
- [x] Add products my favorites
- [x] Go to my favorites page
- [x] See the Product on my favorites page

------

```
Given I open chrome and launch website
When I click login button
And I enter <userName> and <password>
And I click searchbox
And I enter <product> and search
And I add products my favorites
And I go to my favorites page
Then I see product on  my favorites page
Examples:
  | userName                      | password      | product    |
  | "tuyluoglu.ramazan@gmail.com" | "Ramazan123." | "Ayakkabı" |
  | "tuyluoglu.ramazan@gmail.com" | "Ramazan123." | "Çanta"    |
  | "tuyluoglu.ramazan@gmail.com" | "Ramazan123." | "Saat"     |
```

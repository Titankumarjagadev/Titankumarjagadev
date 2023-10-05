# NIT-730AM-Jul2023

OOP(Object-Oriented Programming) Concepts are as follows:

`class` - A Template for everything that we would like to do with our program.

Contains variables, constructors, Methods & blocks.

Without a class, we cannot write a Java Program.

`Object` - Also called as instance of the Class. A way to access the contents of a Class. They are stored in the `heap` memory by the reference variables.

`Polymorphism` - Best example would be method overloading which would require methods to have same names but different parameters.

`Inheritance` - Acquiring the methods, variables, constructors of a Parent Class by the Child Class is Inheritance.

`Abstraction`- It is hiding essential details. It can be achieved by abstract classes & interfaces.

`Encapsulation` - It means the 4 Access modifiers in Java namely `public`, `private`, `default` & `protected`.


**Data Type** : A Data type is used for classification of variables based on the value & the various operations (mathematical, logical or relational) that can be performed on it.

**Java is a Strongly Typed Language** . It means that we need to provide a data type for every variable we declare in a class.

There are 2 kinds of Data Types: **Primitive** and **Non-Primitive**

**Non-Primitive** : `class`, `interface`, `array`, `String`

**Primitive** : Integers, Decimals, Characters & Boolean.

**Integers** : `byte`, `short`, `int`, `long`

`byte` : Size of byte is 2 power 8. There will be 256 values. Range is -128 to -1 & 0 to 127.

`short` : Size of short is 2 power 16. There will be 65536 values. Range is -32768 to -1 & 1 to 32767.

`int` : Size of int is 2 power 32.

`long` : Size of long is 2 power 64.

**Decimals** : `float` & `double`.

`float` : Size of float is 2 power 32.

`double` : Size of double is 2 power 64.

`char` : Size of char is 2 power 16.

Refer to the following link for the various characters defined in Java:

https://www.ssec.wisc.edu/~tomw/java/unicode.html

`boolean` : It accepts only true or false.

`dataType identifier = value;`

Identifier is the name of the variable.

`int x = 100;`

This is called Declaration of int variable x & initialising with value 100.


**Type Casting**: We can always assign `int` to `long` automatically but not the other way.

Below represents the type casting in Java:

                       Narrowing Type Casting---------------->

------------>----------->------------->------------->-------------->------------>

`double` ---> `float` ---> `long` ---> `int` ---> `short` ---> `byte`

<-----------<-----------<-------------<-------------<--------------<------------<---

                        <--------------Widening Type Casting


To execute a program on command line, type `javac <fileName>.java`. This generates a `.class` file which has the `bytecode` which is platform independant.

Executing the `.class` file using `java <fileName>` command would give us the output. The `.class` file is executed by the **JVM (Java Virtual Machine)**.

**Java Keywords**:

![keywords](https://user-images.githubusercontent.com/120766338/213348376-58d05d57-3d0f-4f23-8db7-f366a4caa4ad.png)

**Arrays**:
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

We can access elements in an Array using Index of the Array.

Array Indexes start rom Zero (0) and the highest index is always Array Size minus 1.

To execute a program on command line, type `javac <fileName>.java`. This generates a `.class` file which has the `bytecode` which is platform independant.

Executing the `.class` file using `java <fileName>` command would give us the output. The `.class` file is executed by the **JVM (Java Virtual Machine)**.

**Object** - Also called as instance of the Class. A way to access the contents of a Class. They are stored in the `heap` memory by the reference variables.

Example: A TV Remote. 1 remote for all the functions/features of a TV. A Class can have multiple objects also.

Use a ' . ' operator to access the variables and methods inside a class.

**Constructors**: Code which executes just before the creation of an Object.

Constructors have the same name of that of the class.

Construcotrs do not have return types but can have one of the 4 access modifiers.

Constructors should be called inside the method (during object creation).

**finalize()**: A method that is used to perform cleanup activity before destroying any object. It is called by Garbage collector before destroying the object from memory.

**Wrapper Classes**: Mechanism to convert Primitive Datatype to Object and Object to Primitive Datatype.

**Polymorphism** - Best example would be method overloading which would require methods to have same names but different parameters.

**Method Overloading**: Two or more methods having same method name but different parameters. Method Overloading is not dependant upon the return types.

Also, called as **Compile Time Polymorphism**.

We can overload `constructors` also.

Also, requires understanding of methods, return types & constructors.

`static` **Keyword**: `static` keyword is mainly used for memory management.

We can have `static` variables, methods, blocks and classes.

If a variable/method is declared as `static`, we do not need an object to access them inside the main method.

We cannot create a `static` variable inside main method or any other method.

We can overload `static` methods as well.

`static` blocks are defined outside the main method and also not inside any method.

We cannot define a class as `static` just like that. Only nested classes can be `static`. However, we cannot write static methods inside a nested Class as of Java 8. We can write static methods inside a nested Static Class.

**Inheritance**- Acquiring the methods, variables, constructors of a Parent Class by the Child Class is Inheritance.

We can inherit everything from a Parent/Super class except for those declared as `private` using the `extends` keyword.

We can update the contents of an extended method in the sub-class/child class by overriding the parent class methods.

We cannot override `static` methods.

Overriding is **Run Time Polymorphism**.

**Types of inheritance**:

**Single Level Inheritance**:

`A -> B`

The above means that `class B extends A`.

**Multi Level Inheritance**:

`A -> B -> C`

The above means that we have 3 classes as follows:  `class A`, `class B extends A`, `class C extends B`.

**Hierarchical Inheritance**:

We have 4 classes as follows: `class A`, `class B extends A`, `class C extends A`, `class D extends A`.

**Java does not support Multiple Inheritance. Meaning that a class cannot extend more than one class. Inheriting multiple classes would give rise to Deadly Diamond of Death.**

`this` **Keyword**: Used to refer to the current class variables, methods & constructors.

`super` **Keyword**: Used to refer to the Parent class variables, methods & constructors.

`final` **Keyword**: There are certain implementations for this.

If a class is declared `final`, it cannot be extended/inherited.

If a variable is declared `final`, it's value cannot be changed again. `static final` is used to declare constants.

If a method is declared `final`, it cannot be overridden.

`Abstraction`- It is hiding essential details. It can be achieved by abstract classes & interfaces.

Requires understanding of `abstract classes`, `interfaces`, inheritance & types of inheritances,`multiple inheritance` & `implements` keyword.

`abstract` **class**: We can declare an `abstract` class using the `abstract` keyword.

`abstract` can have concrete as well as`abstract` methods.

We cannot instantiate/create an object for an `abstract` class. They need to be inherited.

`abstract` **methods**: Methods declared using the `abstract` keyword. They do not have any method body/implementation.

Syntax: `public abstract void a();`

`concrete` **methods**: Methods which have method body.

`abstract` classes need to be inherited and the first class which inherits the abstract class will have to override the `abstract` method and write a method body for it.

**Concrete Classes can have only concrete methods.**

**Syntax**: `public abstract class <className>`.

We cannot achieve 100% abstraction using an abstract class.

To achieve 100% abstraction, we need to use `interface`.

Syntax for interfaces in Java:

```
interface <interfaceName>
{
void a();
}
```

We cannot write method body/implementation in an interface.

However, we can have static methods with body/implementation.

We cannot instantiate objects for an interface.

We can inherit an interface using `implements` keyword.

**We can inherit multiple interfaces at once. Interfaces are used to implement Multiple Inheritance in Java.**

All the variables declared in an interface are `public static final` by default.

Interfaces can also extend other interfaces.

All methods declared inside an interface are public abstract by default.

`Encapsulation` - It means the 4 Access modifiers in Java namely `public`, `private`, `default` & `protected`.

![image](https://user-images.githubusercontent.com/107314328/185479678-0efff636-241b-42d9-b064-2c20091bcbe6.png)

**Exception Handling in Java**:

We use try/catch block to handle exceptions in Java.

```
try
{
//code which might cause an exception
}catch(Exception e)
{
System.out.println(e);
}
```

**Checked Exceptions**: Handled during compile time and it gives the compilation error if it is not caught and handled during compile time.

Ex: IOException, FileNotFoundException.

**Unchecked Exceptions**: Compiler does not mandate to handle. The compiler ignores during compile time.

Ex: ArithmeticException, ArrayIndexOutOfBoundsException.

We can have **multiple** `catch` blocks for a single `try` block.

Care should be taken that the `catch` block with generic exception `(Exception e)` should be placed as the last `catch` block in case all the above catch blocks fail.

Using the `catch` block with generic `(Exception e)` as the first block right after the `try` block will make the other `catch` blocks unreachable.

Each `try` block should contain at least 1 `catch` block or `finally` block.

**finally**:

Any code included inside the `finally` block will be executed irrespective of the error at the `try` block.

**throw**: Used to throw an exception explicitly in the code, inside the function or the block of code. It is used in a method.

**throws**: Used in the method signature(beside method name) to declare an exception which might be thrown by the function while the execution of the code.

**Other Important Java Concepts:**

* Operators

* if, else if, else & switch conditions

* `arrays` (Single and Multi Dimensional)

* `break`

* `continue`

* `for`, `for-each`(enhanced for loop), `while`, `do while` loops

* `local`, `instance` & `static` variables. Scope of variables.

* nested Classes & nested Interfaces

* Scanner class

* Singleton Class - A class with which we can create only 1 object.

* Packages

* Strings, String Builder & String Buffer

* Exception Handling - `try`, `catch` & `finally`. `throw` & `throws` keywords.
  Checked & Un-checked exceptions.

* Collections - `ArrayList`, `HashMap`, `HashSet` & `TreeSet`.

![image](https://user-images.githubusercontent.com/107314328/186238291-550d1253-24ef-48cc-9bb4-c9f14a2155e9.png)

We use Wrapper Classes in place of Primitive Data Types when using Collections.

Wrapper Classes provide a way to convert Primitive data type to Object & Object to a Primitive Data type.

**ArrayList**:

       * Maintains insertion order.
       
       * Can contain duplicates.
       
       * It is basically a dynamic array.

**HashSet**:

       * Stores elements by a process called `hashing`.
       
       * Stores only unique elements.
       
       * Does not follow insertion order.
       
       * Allows `null` value.

**TreeSet**:

       * Stores only unique elements.
       
       * Does not allow `null` values.
       
       * Inserts elements in Ascending Order.

**HashMap**:

       * Contains key value pairs.
       
       * Allows only unique keys.
       
       * Allows 1 `null` key & multiple `null` values.
       
       * Does not follow insertion order.

**Iterator**:Iterator is an interface that is used in order to iterate over a collection of Java object components entirety one by one.

**Basic GIT Commands**

To Clone the Repository(Repo) to your local machine, go to the folder you want the Project to be in and open Git Bash & type:

`git clone <URL from the GitHub Repo>`.

Always do your work on a local branch created from a master branch. To create a local branch for your work, use the command:

`git checkout -b "<branchName>"`

After doing some work in the project/repo, to know the list of files we have changed/added/deleted we can simply use:
`git status`
This command shows the list of "Modified", "Untracked" (Newly Added files) and "Deleted" files.

To push/submit your code changes to the repo always start first by adding your files in git by using the command:
`git add "<fileName>"`

To add all the files you have worked at once, you can use the command:
`git add -A`

After you are done adding your files, then type the command:
`git commit -m "<Commit Message>"`

After committing, you have to take a pull from the repo using the command:
`git pull origin master` or simply `git pull`

After pulling the latest changes to your local project, you need to push your changes to the remote repo using the command:
`git push origin "<LocalbranchName>"`

To know your current branch, use the command:

`git branch`

**Basics of Maven:**

To check if Maven is installed, type `mvn` in cmd.

Once `pom.xml` is updated, always "Load Maven Changes" by clicking the reload maven changes button in Maven at the right hand side of your IntelliJ IDE.

**Maven Commands:**

`mvn compile` - This command generates .class files for all the Java Source code in our project under the "target" folder in our project directory.

`mvn clean` - This command cleans up all the .class files generated by "mvn compile" in the target folder.

`mvn test` - This command runs all the Java files with the "@Test" Annotation under the "`src/test/...`" folder.

To pass Parameters in Maven, use the following command:

` mvn clean test -DsuiteFile={name of the suite file} -DParameterName=ParameterValue`

**Selenium**:

Selenium is a library for Browser Automation.

We need to download chromedriver.exe or geckodriver.exe (Firefox) or any other webdriver of our choice.

To set the path for chromedriver on our machine, we need to use:

`System.setProperty("webdriver.chrome.driver", "C:\\directory-to-chromedriver\\chromedriver.exe");`

**Some Selenium methods**:

`driver.get(URL as String);` - Used to navigate particular URL(website) and wait till page load.

`driver.navigate().to();` - Used to navigate to particular URL and does not wait to page load. It maintains browser history or cookies to navigate back or forward.

`driver.navigate().back();` - To go back to the previous page.

`driver.navigate().forward();` - To move to next page (this should have been navigated already).

`driver.navigate().refersh();` - To refresh the page.

`driver.manage().window().maximize();` - Maximizes the Browser Screen.

`driver.manage().window().fullscreen();` - Browser in Full Screen mode.

`driver.getTitle();` - Returns the Title of the current page as a String.

`driver.getCurrentURL();` - Returns the URL of the current page as a String.

`driver.getAttribute();` - Returns the value of the value of the attribute as a String.

`driver.quit();` - Closes all the associated windows.

`driver.close();` - Closes the currently focused window, quitting the driver if the current window is the only open window.

`sendKeys()` : To send our input values to the input elements.

`clear()` - To clear the input field and make it blank.

`isDisplayed()` - Checks if the Element is displayed or not on the page. Returns a boolean value.

`isSelected()` - Checks that if an element is selected on the web page or not. It returns a boolean value (true) if selected, else false for deselected. It can be executed only on a radio button, checkbox, and so on.

**Select**: This is used to select values from drop downs.

Methods used are:

`selectByValue()` , `selectByVisisbleText()`, `selectByIndex`.

We can similarly deselect them by `deselectByValue()` etc.,

The `isMultiple()` method will return a boolean which will let us know if we can select Multiple options from the drop down.

**iFrames**: We can switch to an iFrame in 3 ways:

```driver.switchTo().frame(0);``` - Using the Index of the iFrame.

```driver.switchTo().frame("iFrame")``` - Using the name attribute & its value of the iFrame.

```driver.switchTo().frame(driver.findElement(By.id("iFrame")))``` - Using the locator logic of the required iFrame.

```driver.switchTo().defaultContent()``` - Switches control to the main web page irrespective of the number of iFrames.

```driver.switchTo().parentFrame()``` - Switches control to the parent frame.

There are 8 Locator logics to locate elements on a web page.

They are:

* **Tag Name**

* **ID**

* **Name**

* **Class Name**

* **Link Text** - We must give the exact link text (including case sensitivity) to avoid exceptions.

* **Partial Link Text** - We can give a partial text of the hyperlink.

* **CSS Locator**

* **XPath**

* **For All the locators mentioned above, case-sensitivity is very important. If we have multiple elements with the same locator information, then Selenium always interacts with the first element.**

**Alerts**:

We can interact with an alert using : ```driver.switchTo().alert();```

```driver.switchTo().alert().accept()``` - To click 'OK' or accept the Alert.

```driver.switchTo().alert().dismiss()```  - To click 'Cancel' or dismiss the Alert.

```driver.switchTo().alert().sendKeys("xyz")```  - To send some text to the Prompt Alert.

```driver.switchTo().alert().getText()```  - Returns a String value with the contents of the Alert.


**CSS Path Logic:**

    Interacting with element using Css Selector for attribute 'ID'
        $$("<tagName>#<ValueForIdAttribute>") - on browser console

        Interacting with element using Css Selector for attribute 'Class'
        $$("<tagName>.<ValueForClassAttribute>") - on browser console

        Combining multiple CSS Path logics
        $$("<tagName>#<ValueForIdAttribute>.<ValueForClassAttribute>") - on browser console

**XPath Logic:**

2 types of Xpaths: Absolute & Relative XPath.

Absolute XPath logic for YouTube Search button on Chrome: `/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input`

Relative XPath logic for YouTube Search button on Chrome: `$x("//input[@id='search']")`

Syntax for XPath:

`$x("//div//input[@id='twotabsearchtextbox']")` - Using multiple tags to locate an element.

**Basic XPath:** `$x("//<tagName>[@attribute='value']")`. We can also use '*' in place of <tagName> in the XPath. This means we are searching in all the tags in the page.

**Contains:** `$x("//<tagName>[contains(@attribute,'value')]")`. The value need not be exact. We can pass Partial Text also.

`$x("//a[contains(@href,'nav_orders')]")` - Returns & Orders button on Amazon.com

**And & Or**: `$x("//a[contains(@href,'nav_orders') and @id='nav-orders']")` -  Returns & Orders button on Amazon.com using 'and'

`$x("//<tagName>[@attribute='value' or @attribute='value']")` - XPath using 'or'

**Text():** Here we need exact text. `$x("//a[text()='Sell']")` - XPath for 'Sell' on Amazon.com

**Starts-With:** `$x("//*[starts-with(@href, '/gift-cards')]")` - XPath for 'Gift Cards' on Amazon.com

**Following:** `$x("//div[@id='nav-xshop']//following::a[@href='/gp/goldbox?ref_=nav_cs_gb']")` - Selects all the elements from the current node

**Ancestor:** `$x("//div[@id='nav-xshop']//ancestor::div")` - Selects all the Ancestor Elements from the current node

**Child:** `$x("//div[@id='nav-xshop']//child::a")` - Selects all the Child elements from the current node

**Following-Sibling:** `$x("//div[@id='nav-xshop']//following-sibling::a")` - Selects all the sibling elements which are on the same level of the current node.

**Preceding:**` $x("//div[@id='nav-xshop']//preceding::div")` - Selects all the preceding nodes from the current node.
`$x("//div[@id='nav-xshop']//preceding::div[1]")` - Use this to select the immediate preceding node.

**Parent:**` $x("//div[@id='nav-xshop']//parent::div")` - Selects the Parent of the current node.

**If there is no html tag to write XPath, then we can use something like this:**

`$x("//h1[contains(text(),'Hi!!')]//following::text()[1]").`

Please refer to the `test.html` file for the DOM.

**Waits in Selenium**:

* Implicit Wait: Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception. Once this time is set, WebDriver will wait     for the element before the exception occurs.

  **Syntax**: ```driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);```

* Explicit Wait: Here the WebDriver is directed to wait until a certain condition occurs before proceeding with executing the code.

  Setting Explicit Wait is important in cases where there are certain elements that naturally take more time to load.

  In order to declare explicit wait, one has to use “ExpectedConditions”. The following Expected Conditions can be used in Explicit Wait.

  * alertIsPresent()

  * elementSelectionStateToBe()

  * elementToBeClickable()

  * elementToBeSelected()

  * frameToBeAvaliableAndSwitchToIt()

  * invisibilityOfTheElementLocated()

  * invisibilityOfElementWithText()

  * presenceOfAllElementsLocatedBy()

  * presenceOfElementLocated()

  * textToBePresentInElement()

  * textToBePresentInElementLocated()

  * textToBePresentInElementValue()

  * titleIs()

  * titleContains()

  * visibilityOf()

  * visibilityOfAllElements()

  * visibilityOfAllElementsLocatedBy()

  * visibilityOfElementLocated()

  **Syntax**:

 ```
        WebDriverWait wait = new WebDriverWait(driver,10);
          
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
 ```

* Fluent Wait: Fluent Wait looks for a web element repeatedly at regular intervals until timeout happens or until the object is found.

  **Syntax**:

   ```
    Wait wait = new FluentWait(WebDriver reference)

   .withTimeout(timeout, SECONDS)

   .pollingEvery(timeout, SECONDS)

   .ignoring(Exception.class);

    WebElement foo=wait.until(new Function<WebDriver, WebElement>() {

                      public WebElement find(WebDriver driver) {

                          return driver.findElement(By.id("pass"));

                                          } }); ```

**Synchronous and Asynchronous Scripts**:

Synchronous means scripts are loaded sequentially, one after another, starting with the <head> tag.

Asynchronous means some scripts can be loaded simultaneously.

**Common Selenium Exceptions**:

* **NoSuchWindowException** : Occurs when the current list of windows is not updated. The previous window does not exist, and we can’t switch to it.

  To handle this exception, use webdriver method `driver.getWindowHandles()`.

* **StaleElementReferenceException** : Occurs when the web element is no longer part of the web page. The element may have been part of the source code, but it is no longer       part of the window. There can be multiple reasons for this exception. It can occur either from a switch to a different page, the element is no longer part of DOM or due to
  frame/window switch.

  To handle this exception, you can either use Dynamic Xpath for handling DOM operations or try to use the Page Factory Model or try to access the element in loops before
  throwing the exception.

* **ElementNotVisibleException** : Occurs when the WebDriver tries to find an element that is hidden or invisible. To handle this exception, it is essential that the exact         reason is identified, which can be due to nested web elements or overlapping web elements.

  If the element is hidden, we should try to locate and correct the specific locator strategy.

  If the element is not visible, then we can use an Explicit Wait.

* **NoSuchFrameException** : Occurs when switching between multiple frames is not possible.

  Use `driver.getWindowHandles()`.

* **NoSuchElementException** : Occurs when locators are unable to find or access elements on the web page or application. Ideally, the exception occurs due to the use of           incorrect element locators in the findElement(By, by) method.

  To handle this exception, use the wait command. In case waits don't work use try/catch.

* **InvalidSelectorException** : Occurs due to an incorrect selector. Check if the selector syntax is correct.

  To avoid this, first check the locator syntax. If it is incorrect, make sure the locator syntax is correct.

* **NoAlertPresentException** : Occurs when the user is trying to switch to an alert which is not present. It means that the test is too quick and is trying to find an alert       that has not yet been opened by the browser.

  To handle this, use explicit or fluent wait in all events where an alert is expected.

* **ElementNotSelectableException** : Same as as InvalidElementStateException. In such exceptions, the element is present on the web page, but the element cannot be selected.

  Use waits to avoid this exception.

* **NoSuchSessionException** :  Occurs if a method is called post the browser is closed. Other reasons for this exception include a browser crash.

  Make sure all the operations are performed before the browser is closed.

* **TimeoutException** : Occurs when the command did not execute or complete within wait time. Waits are used to avoid NoSuchElementException.

  However, TimeoutException will be thrown after the page components fail to load within wait time.

  Adjust the wait time accordingly to avoid this exception.

* **WebDriverException**: Occurs when the WebDriver is performing the action right after you close the browser.

**Selenium Grid** : It is a smart proxy server that makes it easy to run tests in parallel on multiple machines.

     * Hub: A Hub is a central point or a local machine that receives all the test requests and distributes them to the right nodes. There can be only one hub in a selenium          grid.
      
     * Node: Nodes are the selenium instances which will execute the test cases that you loaded on the hub. Nodes can be launched on multiple machines with different platforms        and browsers.
     
     *Commands to start hub and node:
      Firstly, we need to download the "selenium-server-standalone" jar file.
 
      In our case, it is **selenium-server-standalone-3.141.59.jar**.
 
      To start the hub, type the below command in the CMD:
 
      `java -jar selenium-server-standalone-3.141.59.jar -role hub`
 
      To start the node, type the below command in another CMD: 
 
      `java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register -port 1`
 
      Now we can start executing our Scripts using the Desired Capabilities & options.


```

@FindAll - Finds an element which has either attribute 'text' or 'text2'
@FindAll({
        @FindBy(name = "text"),
        @FindBy(id = "text")
})

@FindBys - Finds an element which has either attribute 'text' and 'text2'
@FindBys({
        @FindBy(name = "text2"),
        @FindBy(id = "text2")
})

```

**TestNG**:

    We do not use a main method in TestNG. We use Annotations instead. All the programs are executed with the help of testng.xml file.

Adding **Classes and Methods** to testng.xml:

```
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Default suite">
  <test verbose="2" name="Default test">
    <classes>
      <class name="package.className">
      <methods>
      <include name="a">
       </include>
       <exclude name="b"></exclude>
        <include name="c"></include>
      </methods>
      </class>
    </classes>
  </test> <!-- Default test -->
</suite>
 ```
In the above xml, we are adding a class & including/excluding particular methods.

Adding **Packages** to testng.xml:

 ```
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Selenium suite">
    <test verbose="2" name="Selenium Package test">
        <packages>
            <package name="packageName"></package>
        </packages>
    </test>
</suite> <!-- Default suite -->
```

Adding **Multiple XML** files:

 ```
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Multiple suites">
  <suite-files>
      <suite-file path="testng1.xml"></suite-file>
      <suite-file path="testng.xml"></suite-file>
      </suite-files>
</suite>
 ```

We can enable or disable tests in TestNG with the help of the `@Test` annotation or the testng.xml file.

Using `@Test(enabled=true)` or `@Test(enabled=false)` .

Groups: Using `groups` we can group our Test Cases into various categories (like Regression, Sanity & Smoke).

Syntax for groups:

`@Test(groups={"Regression"})` - This will execute all the Test Cases which have `groups` = Regression.

`@Test(groups={"Regression,Sanity"})` - This will execute all the Test Cases which have both the `groups` = Regression & Sanity.

`@Test(groups={"Regression","Sanity"})` - This will execute all the Test Cases which have either `groups` = Regression or Sanity.

To run the Test Case with groups, we need to update the testng.xml file as follows:

 ```
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Groups">
<test name="Groups">
    <groups>
        <run>
            <include name="Sanity"/>
        </run>
    </groups>
    <classes>
        <class name="packageName.className">
        </class>
    </classes>
</test>
</suite>
```

List of attributes used in @Test Annotation:


**alwaysRun** - Takes a true or false (default) value. If set to true this method will always run even if it's depending method/depending group fails. Even if there is no       dependant method & if it is set to true, it will work.

**dataProvider** - The name of the data provider, which will provide data for data-driven testing to this method.

**dataProviderClass** - The class where TestNG should look for the data-provider method mentioned in the dataProvider attribute. By default it's the
current class or its base classes.

**dependsOnGroups** - Specifies the list of groups this method depends on.

**dependsOnMethods** - Specifies the list of methods this method depends on.

**description** - The description of this method.

**enabled** - Sets whether the said method or the methods inside the said class should be enabled for execution or not. By default its value is true.

**expectedExceptions** - This attribute is used for exception testing. This attribute specifies the list of exceptions this method is expected to throw.

**groups** - List of groups the said method or class belongs to.

**timeOut** - This attribute is used for a time out test and specifies the time (in millisecs) this method should take to execute. If time-out is updated in both testng.xml       and the java file, the Java file will have high priority.

**invocationCount** - By providing a numerical value 'n' to this attribute, we can run a particular test 'n' number of times.


**Assertions**: Assertion helps you to check or verify the success of conditions in your test.

There are 2 types of Assertions: **Hard** (a normal Assertion where the program stops if the condition fails) & **Soft** (This is from the JUnit Library. Does not fail even if the condition fails).

Syntax for Asserts:

`Assert.assertTrue(condition, message)` - Checks the condition is true or not. If the condition is false then it fails and prints the message. Here the message is         optional.

`Assert.assertFalse(condition, message)` - Checks the condition is false or not.If the condition is true then it fails and prints the message. Here the message is         optional.

`Assert.assertNotNull(object, message)` - Checks the object is NOT Null or not. If the object is null then it fails and prints the message. Here the message is          optional.

`Assert.assertNull(object, message)` - Checks the object is Null or not. If the object is NOT Null then it fails and prints the message. Here the message is optional.

`Assert.assertEquals(actual, expected,message)` - Checks the actual and expected or Equal or not. If both are NOT Equal then it fails and prints the message. Here the message is optional.

`Assert.assertNotEquals(actual, expected,message)` - Checks the actual and expected or NOT Equal or not. If both are Equal then it fails and prints the message. Here the message is optional.

Soft Asserts can be created using the below syntax:

```SoftAssert s= new SoftAssert();```

* **Annotations**:

  **@Parameters** - Used to pass parameters to a test method. These parameter values are provided using the testng.xml configuration file at run time.

  **@DataProvider** - Marks a method as a data providing method for a test method. The said method has to return an Object double array (Object[ ][ ]) as data.

  **@Test** - Marks a class or a method as a test method. If used at class level, all the public methods of a class will be considered as a test method.

  **@BeforeTest** - Executed Before test section declared inside the TestNG suite(testng.xml file).

  **@BeforeClass** - Executed Before any of the test method of a test class.

  **@BeforeMethod** - Executed Before each test method.

  **@BeforeSuite** - Executed Before any tests declared inside the TestNG suite.

  **@BeforeGroups** - Executed Before any of the test method belongs to specified group.

  **@AfterTest** - Executed After test section declared inside the TestNG suite(testng.xml file).

  **@AfterClass** - Executed After any of the test method of a test class.

  **@AfterMethod** - Executed After each test method.

  **@AfterSuite** - Executed After any tests declared inside the TestNG suite.

  **@AfterGroups** - Executed After any of the test method belongs to specified group.


    Order of execution of the above Before and After Annotations is as follows: 
       
        BeforeSuite
 
        BeforeTest
 
        BeforeClass
 
        BeforeGroup
 
        BeforeMethod
 
        AfterMethod
 
        AfterGroup
 
        AfterClass
 
        AfterTest
 
        AfterSuite

**Syntax for Parallel Execution of Classes**:

 ```
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Default suite" parallel="classes" thread-count="2" >
  <test name="Executing Parallel Classes" >
    <classes>
      <class name="TestNG.sample"/>
      <class name="TestNG.other">
      </class>
    </classes>
  </test>
</suite> <!-- Default suite -->
```

`thread-count` will limit the number of methods/classes running at a time parallelly.

**Syntax for Parallel Execution of Methods**:

 ```
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Default suite" parallel="methods" >
  <test name="Executing Parallel Methods" >
    <classes>
      <class name="TestNG.sample"/>
      <class name="TestNG.other">
      </class>
    </classes>
  </test>
</suite> <!-- Default suite -->
```

**Prioritizing Tests in TestNG**:

* If we don't set any priority, then all the tests would have 0 (zero) priority by default and would be executed in alphabetical order.

* If we set priority, then the ones with the lowest number as priority will be executed first.

* If 2 tests have the same priority, then they will be executed in alphabetical order.

* `dependsOnMethods` followed by `dependsOnGroups` will execute first & then the priority follows.

 ```
 
To execute failed Test Cases only in TestNG, use testng-failed.xml file. We can find it in the test-output folder.

 ```

**Cucumber Concepts**:

In Cucumber, we write our requirements in plain English like Language, **Gherkin**.

**Feature**:
In Cucumber, Feature files contain business requirements.

Every feature file has to start with the keyword: `Feature`.

**Scenario**:
Scenarios are like test cases and start with the Scenario keyword in a new line.

Every Scenario is like a test case. We use the keyword:`Scenario`.

**Steps**:

Scenarios contain Steps which are equivalent to test Steps and use the following keywords to denote them: `Given`,`When`,`Then`,`But`, and `And` (case sensitive).

* **Given**: Preconditions are mentioned in the Given keyword. The Steps of the Given keyword put the system in to a known state, which is necessary for the user action.

  Avoid talking about user interaction in Given Steps.

* **When**: The purpose of the When Steps is to describe the user action.

* **Then**: The purpose of Then Steps is to observe the expected output. The observations should be related to the business value/benefit of your Feature description.

* **And**: This is used for statements that are an addition to the previous Steps and represent positives statements.

* **But**: This is used for statements that are an addition to previous Steps and represent negative statements.

* **Background**:

  All the Steps mentioned in the Background keyword will be executed before each Scenario or Scenario Outline in a Feature file.

* There can be only one Background in one Feature file and it allows us to set a precondition for all Scenarios in a Feature file.

* A Background is like a Scenario, containing a number of Steps.

* Background is run before each Scenario, but after the BeforeScenario Hooks.

* The title and multiline description / intent of Background are optional.

* Since the Steps mentioned in Background will be run for all Scenarios in a Feature file, we need to be careful when adding the Steps to Background. For example, we
  should not add a Step that is not common to all Scenarios.


* **Scenario Outline**:

* Scenario outline basically replaces variable/keywords with the value from the table. Each row in the table is considered to be a scenario.

* A Scenario Outline is a template that is never directly run. It uses placeholders, which are contained within < > in the Scenario Outline's Steps.

* The Scenario Outline itself is useless without an Examples table, which Lists the rows of values to be substituted for each placeholder.

* **Step Definitions**:

  * When Cucumber starts execution, it looks for all classes on the Classpath that are in a specified glue package (or descendant).

  * A Step Definitions is a small piece of code with a pattern attached to it. The pattern is used to link the Step Definitions to all the matching Steps, and the code is          what Cucumber will execute when it sees a Gherkin Step.

  * We use Cucumber annotations, such as @Given, @When, and @Then to create Step Definitions.

**Tags**: We can use the Tags (just like groups in TestNG) to categorize Scenarios.

    Tags can be placed at Feature level, Scenario Level, Scenario Outline Level & also for Examples in the Scenario Outline.
 
    {"@Regression, @Sanity"} - Test Cases marked as Regression **AND** Sanity would execute.
 
    {"@Regression", "@Sanity"} - Test Cases marked as Regression **OR** Sanity would execute. 
 
    {"@Regression", "~@Sanity"} - Test Cases marked as Regression only would run & Sanity would be ignored.

**Hooks**: Cucumber allows us to run a piece of code at certain points in test case execution. This is implemented via Hooks. The real-life use of this involves initializing
browsers before execution and closing the browser after execution. The Hooks code is generally kept in a file called Hooks.java, but this is not mandatory.

* @Before: The Before Hook is run before all the Scenarios of a feature file, including the background. If there are multiple Before Hooks, then they will be run in the
  order they are written.

* @After: The After Hook is run after all Scenarios of a feature file. If there are multiple After Hooks, then they will be run in the order they are written.

* @BeforeStep: The code inside this would execute before every the execution of every step mentioned in the Feature file.

* @AfterStep: The code inside this would execute after every the execution of every step mentioned in the Feature file.


```
The following is the order of execution:
 
           1. Before Hook
           2. Background
           3. Scenario
           4. After Hook
```

Tagged Hooks :

```
@Before({"@sanity","@regression,@smoke"}) - To run the Hooks code for Scenarios tagged with "sanity" OR "regression AND smoke".

``` 


* **Test Runner**:

 ```
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Cucumber",glue="Cucumber.framework",tags="@Regression", plugin={"html:target/Report.html"}
        ,monochrome = true)

//plugin={"html:target/Reports"}
public class testRunner {
}
```


**dryRun** - true (skips the execution of Glue Code) - Default is FALSE.

**strict** - true (will fail execution if there are undefined or pending steps) - Default is FALSE

**features** - These are the paths to the Feature(s) - {}

**glue** - This declares where to look for Glue Code (Stepdefs and hooks) - {}

**Tags** - This is which Tags in the Features should be executed - {}

**monochrome** - This is whether or not to use monochrome output. Default is FALSE

**plugin** - This declares what formatter(s) to use and also miscellaneous options {}
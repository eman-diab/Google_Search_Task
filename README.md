# Google Search 
I use Selenium Framwork with POM, DDT, Java, Maven, TestNG for test search function of google website https://www.google.com/ 

## The Project Components and How it Work?
I start Maven project that gives the structure, then add all dependencies need in the project like Selenium, TestNG and POI Apache.

I use POM as design pattern that consider each web page of website as a class file. each class file will contain only corresponding web page elements.Using these elements,
can perform operations on the website under test.

I also use DDT to get test data as input data for test cases. I use 2 properties files to put configration data and test data, then create java class to read from 
the 2 properties files. 

## Features
1- POM help with easy maintenance of code and readability and reliability of script.
2- DDT allow to test the website with multiple sets of data values or with large volumes of random data.
3- TestNG can grouped and prioritize test cases more easily and gives the ability to produce HTML Reports.

## Limitations
1- the resources file have browser drivers for Mac OS, if you use another OS you need to download browser drivers for your OS.

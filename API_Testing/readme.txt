Rest Assured Assessment

1- Download IntelliJ Edition 2022.2.2
2- JAVA Version 8.0.2510.8
3- Put the following dependencies in the pom xml file
      

     <dependencies>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.6.1</version>
            <scope>test</scope>
        </dependency>


        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.3.1</version>
            <scope>test</scope>
        </dependency>



        <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20220320</version>
            <scope>test</scope>
        </dependency>


        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.5</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>json-schema-validator</artifactId>
            <version>5.3.1</version>
            <scope>test</scope>
        </dependency>


        <dependency>
            <groupId>com.github.scribejava</groupId>
            <artifactId>scribejava-apis</artifactId>
            <version>8.3.1</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

4- please note that the server is down and it gives me different status code each time I run the code
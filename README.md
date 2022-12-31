swagger-maven-plugin
============================

A Maven plugin to support the [swagger](http://swagger.io) code generation project
This project aims to define and explain the utility of swagger-maven-plugin and demonstrate how it can quickly generate a swagger.json/swagger.yml file and use it instead of using a bench of Java objects as models.
As you can see here, it's a maven project that contains some models (which I want to transform to a swagger API, so when I have something to update I will always return to the Swagger) this package swagger-maven-plugin/src/main/java/com/ecom/ber/api/models/

Usage
============================
Add to your maven project pom.xml file these dependencies :

```xml
<dependencies>
        <dependency>
            <groupId>io.swagger</groupId>
            <artifactId>swagger-annotations</artifactId>
            <version>1.6.9</version>
        </dependency>
        <dependency>
            <groupId>io.openapitools.swagger</groupId>
            <artifactId>swagger-maven-plugin</artifactId>
            <version>2.1.6</version>
        </dependency>
        <dependency>
            <groupId>io.swagger</groupId>
            <artifactId>swagger-jaxrs</artifactId>
            <version>1.6.9</version>
        </dependency>
</dependencies>
```

Add to your build->plugins section :
```xml
<build>
        <plugins>
            <plugin>
                <groupId>com.github.kongchen</groupId>
                <artifactId>swagger-maven-plugin</artifactId>
                <version>3.1.8</version>
                <configuration>
                    <apiSources>
                        <apiSource>
                            <springmvc>false</springmvc>
                            <locations>
                                <location>com.ecom.ber.api</location>
                            </locations>
                            <outputFormats>yaml</outputFormats>
                            <swaggerDirectory>generated/swagger-ui</swaggerDirectory>
                            <swaggerFileName>openapi</swaggerFileName>
                            <schemes>
                                <scheme>https</scheme>
                            </schemes>
                            <basePath>/</basePath>
                            <info>
                                <title>NCS-RATING Bazaar API v1.0.0</title>
                                <version>1.0.0</version>
                                <description>Bazaarvoice client API used for POC market to improve ratings and reviews
                                    capture for Nespresso products a new R and R provider.
                                </description>
                                <contact>
                                    <email>test@gmail.com</email>
                                    <name>Geek's Team</name>
                                    <url>
                                        https://github.com/Yahya-Berbeche/swagger-maven-plugin
                                    </url>
                                </contact>
                            </info>
                        </apiSource>
                    </apiSources>
                </configuration>
                <executions>
                    <execution>
                        <phase>compile</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```
N.B :
In order to generate the Swagger file you should add this informations to the build :

- groupId : *<groupId>com.github.kongchen</groupId>* <br />
- artifactId : *<artifactId>swagger-maven-plugin</artifactId>* <br />
- version : *<version>3.1.8</version>*

Then we go to the apiSources tag, this tag handle some informations such as *locations*, *outputFormats*, *swaggerDirectory*, *swaggerFileName*, etc...
this is about guiding maven to choose exactly the right directory, path, and your API location that should be token into consideration.

Followed by:
```xml
<executions>
    <execution>
        <phase>compile</phase>
        <goals>
            <goal>generate</goal>
        </goals>
    </execution>
</executions>
```

And finally :

```
mvn clean compile
```
### Sample configuration

- Please see [an example configuration](https://github.com/Yahya-Berbeche/swagger-maven-plugin/blob/master/generated/swagger-ui/openapi.yaml) for using the plugin
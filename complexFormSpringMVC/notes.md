
<h1>Spring MVC - Static Pages Example</h1>

The following example shows how to write a simple web based application using Spring MVC Framework, which can access static pages along with dynamic pages with the help of a <mvc:resources> tag.

To begin with, let us have a working Eclipse IDE in place and adhere to the following steps to develop a Dynamic Form based Web Application using the Spring Web Framework.

**Step	Description**
1	Create a project with a name HelloWeb under a package com.tutorialspoint as explained in the Spring MVC - Hello World chapter.
2	Create a Java class WebController under the com.tutorialspoint package.
3	Create a static file final.htm under jsp sub-folder.
4	Update the Spring configuration file HelloWeb-servlet.xml under the WebContent/WEB-INF folder as shown below.
5	The final step is to create the content of the source and configuration files and export the application, which is explained below.

**WebController.java**
```
WebController.java
package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public String index() {
	   return "index";
   }
   
   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
   public String redirect() {
     
      return "redirect:/pages/final.htm";
   }
}

```

**HelloWeb-servlet.xml**
```

<?xml version = "1.0" encoding = "UTF-8"?>
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "  http://www.w3.org/2001/XMLSchema-instance" 
   xmlns:context = "http://www.springframework.org/schema/context"
   xmlns:mvc = "http://www.springframework.org/schema/mvc"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
   http://www.springframework.org/schema/mvc
   http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context-3.0.xsd">
 
   <context:component-scan base-package = "com.tutorialspoint" />
     
   <bean id = "viewResolver" class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
   
      <property name = "prefix" value = "/WEB-INF/jsp/" />
      <property name = "suffix" value = ".jsp" />
   </bean>
   <mvc:resources mapping = "/pages/**" location = "/WEB-INF/pages/" />
   <mvc:annotation-driven/>
</beans>
```
Here, the <mvc:resources..../> tag is being used to map static pages. The mapping attribute must be an Ant pattern that specifies the URL pattern of an http requests. The location attribute must specify one or more valid resource directory locations having static pages including images, stylesheets, JavaScript, and other static content. Multiple resource locations may be specified using a comma-separated list of values.

Following is the content of Spring view file WEB-INF/jsp/index.jsp. This will be a landing page; this page will send a request to access the staticPage service method, which will redirect this request to a static page available in WEB-INF/pages folder.

**index.jsp**

```
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring Landing Page</title>
   </head>
   <body>
      <h2>Spring Landing Pag</h2>
      <p>Click below button to get a simple HTML page</p>
      <form:form method = "GET" action = "/HelloWeb/staticPage">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Get HTML Page"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>
```
**final.htm**
```
<html>
   <head>
      <title>Spring Static Page</title>
   </head>
   <body>
      <h2>A simple HTML page</h2>
   </body>
</html>
```

SuperSimpleWeb
--------------

A very simple web framework.

I' going to use  Stripes framework as my web MVC. Simply because its a light weight, 
and i don't have to create a configuration file, and of course i like its UrlRewrite integration approach, 
sounds cleaner and natural.

For dependency Injection, I going to use Goole Guice because of its simplicity annotations, and i don't need a confiuration too so i can focus mainly on just looking at java classes.

<h3>Dev environment setup:</h3>
<h4>How to debug with Tomcat</h4>
1. $ export JPDA_ADDRESS=8000
2. $ apache-tomcat-7.0.26/bin/catalina.sh jpda run

<h3>Items TODO:</h3>
1. add a user login interface.
2. interface to upload a csv file then display the content in tabular form.

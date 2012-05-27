SuperSimpleWeb
==============

A very simple web framework.

I' going to use  Stripes framework as my web MVC. Simply because its a light weight, 
and i don't have to create a configuration file, and of course i like its UrlRewrite integration approach, 
sounds cleaner and natural.

For dependency Injection, I going to using Goole Guice because it uses annotation, again there is no
configuration file so i can focus mainly on just looking at java classes.

TODO:
====
1. add a user login interface.
2. interface to upload a csv file then display the content in tabular form.

How to enable debug using Tomcat
================================
Default 
$ export JPDA_ADDRESS=8000.
$ apache-tomcat-7.0.26/bin/catalina.sh jpda run.

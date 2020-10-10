Hello World XML
================


- Run `mkdir -p mods\helloworldxml`

- Run 

```
javac --module-path lib -d mods\helloworldxml src\main\java\module-info.java src\main\java\com\packt\HelloWorldXml.java
```

- Run

```
java --module-path lib;mods -m helloworldxml/com.packt.HelloWorldXml
```
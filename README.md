#GwtSpringBoot


Simple example  SPRING BOOT + GWT 

No web.xml  , only java

1. Create maven gwt archetype 
   https://gwt-maven-plugin.github.io/gwt-maven-plugin/user-guide/archetype.html

   put Main.gwt.xml to correct folder in resource

2. pom.xml add gwt config  , set webappDirectory  (no war dir)

3. in Main.gwt.xml add
    module rename-to="gwtjs" dist name
    set-property name="user.agent" value="safari" only google chrome 

4. put index.html to static 

5. TODO debug gwt

6. Rest API and GWT|GXT GUI 
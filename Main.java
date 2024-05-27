<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        double d = 12900000;
        double f = 19961127;
        double o = 78945612; 
        System.out.println(d); // 1.29E7
    }
}
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-shade-plugin</artifactId>
<configuration>
<minimizeJar>true</minimizeJar>
<filters>
<filter>
<artifact>*:*</artifact>
<excludes>
<exclude>META-INF/**</exclude>
 </excludes>
 </filter>
 </filters>
 </configuration>
 <executions>
 <execution>
 <phase>package</phase>
 <goals>
 <goal>shade</goal>
 </goals>
 </execution>
 </executions>
 </plugin>

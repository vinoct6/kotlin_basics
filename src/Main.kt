fun main(args: Array<String>) {
    val message = "Hello from IDEA"
    println(message)
}

//There are top-level functions in Kotlin.No need of a class or anything
// main is not to match the file name , but is a special function which is the entry file
//There is no package information as well.  It is interpreted as default package.


/**
 * $ java MainKt
Exception in thread "main" java.lang.NoClassDefFoundError: kotlin/jvm/internal/Intrinsics
at MainKt.main(Main.kt)
Caused by: java.lang.ClassNotFoundException: kotlin.jvm.internal.Intrinsics
at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335)
at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
... 1 more

This error can be fixed by including kotlin run time
 */


/*
Create a JAR file with kotlin compiler

$  kotlinc Main.kt -include-runtime -d hello.jar
$ java -jar hello.jar

*/

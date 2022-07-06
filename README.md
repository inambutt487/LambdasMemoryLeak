# LambdasMemoryLeak

When using Kotlin and Java, memory leaks can occur in combination with Java Lambdas. Example: a listener is created in Kotlin, 
which is then registered with a Java class and allegedly unregistered again:

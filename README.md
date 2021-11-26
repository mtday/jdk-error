# jdk-error

Check java version:

```
java -version
```

Output:

```
openjdk version "17.0.1" 2021-10-19
OpenJDK Runtime Environment Temurin-17.0.1+12 (build 17.0.1+12)
OpenJDK 64-Bit Server VM Temurin-17.0.1+12 (build 17.0.1+12, mixed mode, sharing)
```

Check maven version:

```
mvn -version
```

Output:

```
Apache Maven 3.8.4 (9b656c72d54e5bacbed989b64718c159fe39b537)
Maven home: /usr/local/Cellar/maven/3.8.4/libexec
Java version: 17.0.1, vendor: Eclipse Adoptium, runtime: /Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.16", arch: "x86_64", family: "mac"
```

Build project:

```
mvn clean install
```

Output:

```
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------------------< jdk-error:test >---------------------------
[INFO] Building test 1.0.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ test ---
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ test ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /Users/apiburn/Source/jdk-error/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ test ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/apiburn/Source/jdk-error/target/classes
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ test ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ test ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/apiburn/Source/jdk-error/target/test-classes
An exception has occurred in the compiler (17.0.1). Please file a bug against the Java compiler via the Java bug reporting page (http://bugreport.java.com) after checking the Bug Database (http://bugs.java.com) for duplicates. Include your program, the following diagnostic, and the parameters passed to the Java compiler in your report. Thank you.
java.lang.NullPointerException: Cannot invoke "com.sun.tools.javac.code.Type.getThrownTypes()" because "tree.meth.type" is null
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitApply(Flow.java:1439)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodInvocation.accept(JCTree.java:1797)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:444)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:57)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitApply(Flow.java:1438)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodInvocation.accept(JCTree.java:1797)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:444)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.visitExec(TreeScanner.java:219)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCExpressionStatement.accept(JCTree.java:1584)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:444)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:57)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitBlock(Flow.java:1188)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCBlock.accept(JCTree.java:1091)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:444)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitMethodDef(Flow.java:1154)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodDecl.accept(JCTree.java:921)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:444)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitClassDef(Flow.java:1117)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCClassDecl.accept(JCTree.java:819)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:444)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.analyzeTree(Flow.java:1532)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.analyzeTree(Flow.java:1522)
	at jdk.compiler/com.sun.tools.javac.comp.Flow.analyzeTree(Flow.java:222)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.flow(JavaCompiler.java:1377)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.flow(JavaCompiler.java:1351)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:946)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.lambda$doCall$0(JavacTaskImpl.java:104)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.invocationHelper(JavacTaskImpl.java:152)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.doCall(JavacTaskImpl.java:100)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.call(JavacTaskImpl.java:94)
	at org.codehaus.plexus.compiler.javac.JavaxToolsCompiler.compileInProcess(JavaxToolsCompiler.java:126)
  1 target
	at org.codehaus.plexus.compiler.javac.JavacCompiler.performCompile(JavacCompiler.java:174)
	at org.apache.maven.plugin.compiler.AbstractCompilerMojo.execute(AbstractCompilerMojo.java:1134)
	at org.apache.maven.plugin.compiler.TestCompilerMojo.execute(TestCompilerMojo.java:180)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:972)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:293)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:196)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:282)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:225)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:406)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:347)
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] An unknown compilation problem occurred
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.045 s
[INFO] Finished at: 2021-11-26T13:39:52-06:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project test: Compilation failure
[ERROR] An unknown compilation problem occurred
[ERROR]
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

This problem is caused by `src/test/java/test/GetAllTodoListsResourceIT.java` line 29:

```
Assertions.assertEquals(lists, response.readEntity(new GenericType<>() {}));
```

Providing the type fixes the problem:

```
Assertions.assertEquals(lists, response.readEntity(new GenericType<List<TodoList>>() {}));
```

Saving the entity response as a list first also fixes the problem:

```
List<TodoList> results = response.readEntity(new GenericType<>() {});
Assertions.assertEquals(lists, results);
```


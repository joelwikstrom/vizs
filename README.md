# Skeleton for using Graphviz clientside from Scala

This is an example of how [Graphviz](http://www.graphviz.org/) can be used 
clien side from Scala by using [Vis.js](https://github.com/mdaines/viz.js/). It's not complete facade but just the bare minimum to call viz.js from scala.

I started from [scala-js-example-app](https://github.com/sjrd/scala-js-example-app). I cleaned it a bit and then:
1. Added the following lines to build.sbt:
```
    scalaJSUseMainModuleInitializer := true
    jsDependencies += "org.webjars.npm" % "viz.js" % "1.7.0" / "1.7.0/viz.js"
```
2. Created the Viz.scala

3. Created Main.scala and called the Viz function from it

4. Added links to the generated javascript in: 
- index-fastopt.html:
```
<script type="text/javascript" src="./target/scala-2.12/vizs-jsdeps.js"></script>
<script type="text/javascript" src="./target/scala-2.12/vizs-fastopt.js"></script>
```
- index.html:
```
<script type="text/javascript" src="./target/scala-2.12/vizs-jsdeps.min.js"></script>
<script type="text/javascript" src="./target/scala-2.12/vizs-opt.js"></script>
```

##### Screen shot of working example
![broken link](https://github.com/joelwikstrom/vizs/blob/master/VizsIndexScreenShot.png "Vizs - index screen shot")


The browser warns that: [Invalid asm.js: Function definition doesn't match use](https://github.com/mdaines/viz.js/issues/96).
I haven't looked into that.
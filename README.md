This is a fork of Twitter's [Chill's](https://github.com/twitter/chill)
chill-scala to support Scala 2.11. It will be removed when Chill adds support
for Scala 2.11.

Chill is controlled by Twitter and they're still using Scala 2.9. It may take a
long time for them to support Scala 2.11.

## Usage

In your Scala 2.11 SBT project:

```
libraryDependencies += "tv.cntt" %% "chill-scala-2-11" % "1.0"
```

## Source code

Basically, the source code comes from Chill with minor modifications:

```
src
  main
   java  -> chill/chill-java/src/main/java
   scala -> chill/chill-scala/src/main/scala
```

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

Example:

```scala
import java.io.{ByteArrayInputStream, ByteArrayOutputStream}

import scala.util.control.NonFatal

import com.esotericsoftware.kryo.Kryo
import com.esotericsoftware.kryo.io.{Input, Output}
import com.twitter.chill.KryoSerializer

object SeriDeseri {
  private val kryo = {
    val a = KryoSerializer.registerAll
    val k = new Kryo
    a(k)
    k
  }

  def toBytes(any: Any): Array[Byte] = {
    val b = new ByteArrayOutputStream
    val o = new Output(b)
    kryo.writeObject(o, any)
    o.close()
    b.toByteArray
  }

  def fromBytes[T](bytes: Array[Byte])(implicit m: Manifest[T]): Option[T] = {
    val i = new Input(bytes)
    try {
      val t = kryo.readObject(i, m.runtimeClass.asInstanceOf[Class[T]])
      Option(t)
    } catch {
      case NonFatal(e) => None
    } finally {
      i.close()
    }
  }
}
```

## Source code

Basically, the source code comes from Chill with minor modifications:

```
src
  main
   java  -> chill/chill-java/src/main/java
   scala -> chill/chill-scala/src/main/scala
```

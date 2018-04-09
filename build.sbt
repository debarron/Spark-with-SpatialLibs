organization  := "umkc"

name := "spark-with-spatiallibs"

version       := "0.1"
scalaVersion  := "2.11.7"


resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/",
  "jai imageio" 	  at "https://mvnrepository.com/artifact/com.github.jai-imageio/jai-imageio-core",
  "Apache Development Snapshot Repository" at "https://repository.apache.org/content/repositories/snapshots/"
)

//libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.10.0"
//libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.10.0"

libraryDependencies ++= {
  val sparkV =  "2.1.0"
  val hadoopV = "2.7.3"
  Seq(
        "com.wealthfront" % "magellan" % "1.0.0",
        "me.simin" % "spatial-spark_2.11" % "1.1.1", 
        "org.datasyslab" % "geospark" % "1.1.0",
        "org.datasyslab" % "geospark-sql_2.1" % "1.1.0",
        "org.datasyslab" % "geospark-viz" % "1.1.0",       
        "com.ning" % "compress-lzf" % "1.0.3",
        "joda-time" % "joda-time" % "2.9.4",
        "org.apache.hadoop" % "hadoop-common" % hadoopV,
        "org.apache.spark" %%  "spark-core" %  sparkV % "provided",
        "org.apache.spark" %%  "spark-sql" %  sparkV % "provided",
        "org.apache.spark" %%  "spark-hive" %  sparkV % "provided",
        "org.datanucleus" % "datanucleus-api-jdo" % "3.2.6" % "provided",
        "org.datanucleus" % "datanucleus-rdbms" % "3.2.9" % "provided",
        "org.datanucleus" % "datanucleus-core" % "3.2.10" % "provided",
  )
}







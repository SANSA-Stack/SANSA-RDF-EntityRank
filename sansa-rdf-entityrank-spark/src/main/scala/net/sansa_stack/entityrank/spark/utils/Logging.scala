package net.sansa_stack.entityrank.spark.utils
import org.slf4j.LoggerFactory

trait Logging {
  protected val logger = LoggerFactory.getLogger(getClass.getName)
}
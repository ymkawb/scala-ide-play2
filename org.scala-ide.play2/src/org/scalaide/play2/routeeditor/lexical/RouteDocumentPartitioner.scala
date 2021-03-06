package org.scalaide.play2.routeeditor.lexical

import org.scalaide.play2.lexical.PlayDocumentPartitioner

import RoutePartitions.ROUTE_ACTION
import RoutePartitions.ROUTE_COMMENT
import RoutePartitions.ROUTE_DEFAULT
import RoutePartitions.ROUTE_URI

class RouteDocumentPartitioner(conservative: Boolean = false) extends PlayDocumentPartitioner(RoutePartitionTokeniser, ROUTE_DEFAULT, conservative) {

  import RouteDocumentPartitioner._

  def getLegalContentTypes = LEGAL_CONTENT_TYPES

}

object RouteDocumentPartitioner {

  private val LEGAL_CONTENT_TYPES = Array[String](
    ROUTE_DEFAULT, ROUTE_URI, ROUTE_ACTION, ROUTE_COMMENT)

  val NO_PARTITION_AT_ALL = "__no_partition_at_all"

  final val EOF = '\u001A'

}


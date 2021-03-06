package com.tinkerpop.blueprints.pgm.impls.neo4jbatch;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class Neo4jBatchTokens {

    public static final String TYPE = "type";
    public static final String EXACT = "exact";
    public static final String ID = "_id";
    public static final String DELETE_OPERATION_MESSAGE = "Delete operations are not supported";

    public static final String BLUEPRINTS_TYPE = "_blueprints:type";
    public static final String BLUEPRINTS_AUTOKEYS = "_blueprints:autokeys";
    public static final String KEY_SEPARATOR = "!=!";
    public static final String QUERY_HEADER = "%query%";
}

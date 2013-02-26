package org.uva.sea.ql.ast.types;

public interface IVisitableType {

	<T> T accept(IVisitorType<T> visitor) throws Exception;
}
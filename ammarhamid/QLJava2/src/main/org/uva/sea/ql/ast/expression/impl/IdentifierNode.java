package org.uva.sea.ql.ast.expression.impl;

import org.uva.sea.ql.ast.VariableScope;
import org.uva.sea.ql.ast.value.ValueNode;

public class IdentifierNode extends ValueNode<String> implements Comparable<IdentifierNode>
{
	public final String value;
	public final VariableScope variableScope;

	public IdentifierNode(final String value, final VariableScope variableScope)
	{
		this.value = value;
        this.variableScope = variableScope;
	}

    public IdentifierNode(final String value)
    {
        this.value = value;
        this.variableScope = new VariableScope();
    }

    @Override
    public String getValue()
    {
        return this.value;
    }

    @Override
    public ValueNode evaluate()
    {
        final ValueNode valueNode = this.variableScope.resolve(this.value);
        if(valueNode == null)
        {
            throw new RuntimeException("No such variable: " +this.value);
        }

        return valueNode;
    }

    @Override
    public int compareTo(IdentifierNode o)
    {
        return this.value.compareTo(o.getValue());
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }

        IdentifierNode that = (IdentifierNode) o;
        return !(value != null ? !value.equals(that.value) : that.value != null);
    }

    @Override
    public int hashCode()
    {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return this.value;
    }
}

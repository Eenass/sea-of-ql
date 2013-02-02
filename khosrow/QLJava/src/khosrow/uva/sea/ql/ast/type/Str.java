package khosrow.uva.sea.ql.ast.type;

public class Str extends Type {

	@Override
	public boolean isCompatibleTo(Type t) {		
		return t.isCompatibleToStr();
	}
	
	@Override
	public boolean isCompatibleToStr() {
		return true;
	}
}
